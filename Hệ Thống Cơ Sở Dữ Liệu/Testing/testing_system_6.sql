 -- 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó
 USE testing_system_1;
 DROP PROCEDURE IF EXISTS getQuestionInputAccount;
 DELIMITER $$
 CREATE PROCEDURE getQuestionInputAccount(IN in_department_name NVARCHAR(100))
	BEGIN
		 SELECT	A.* FROM account1 A 
		 INNER JOIN department B ON B.DepartmentID = A.DepartmentID
		 WHERE B.DepartmentName = in_department_name;
	END$$
 DELIMITER ;
 CALL getQuestionInputAccount('Marketing');
 SELECT * FROM department;
 
 --  2: Tạo store để in ra số lượng account trong mỗi group
  DROP PROCEDURE IF EXISTS getGroupAccountInput;
 DELIMITER $$
CREATE PROCEDURE getGroupAccountInput(IN in_groupID INT, OUT out_groupID INT,OUT out_soLuongAccount INT)
	BEGIN
		SELECT B.GroupID , COUNT(A.AccountID) AS 'Số lượng account' INTO  out_groupID, out_soLuongAccount
        FROM groupaccount A
		INNER JOIN group1 B on B.GroupID = A.GroupID
        WHERE B.GroupID = in_groupID
		GROUP BY A.GroupID;
	END$$
DELIMITER ;
SET @v_out_groupID = 0;
SET @v_out_soLuongAccount = 0;
CALL getGroupAccountInput(3,@v_out_groupID,@v_out_soLuongAccount);
SELECT @v_out_groupID,@v_out_soLuongAccount;


SELECT * FROM groupaccount;
SELECT * FROM group1;

-- 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo  trong tháng hiện tại
DROP PROCEDURE IF EXISTS GetNumBerOfQuesionsOfEachTypeQuestion;
DELIMITER $$
CREATE PROCEDURE GetNumBerOfQuesionsOfEachTypeQuestion(IN in_typeID INT)
BEGIN
	SELECT B.TypeID, Count(A.QuestionID) AS 'Số lượng Câu Hỏi', A.CreateDate FROM question A
	INNER JOIN typequestion B ON B.TypeID = A.TypeID
	WHERE 	MONTH(A.CreateDate) = MONTH(NOW()) AND YEAR(A.CreateDate) = YEAR(NOW())
			AND B.TypeID = in_typeID
	GROUP BY A.TypeID;
END $$
DELIMITER ;

CALL GetNumBerOfQuesionsOfEachTypeQuestion(3);

SELECT* FROM question;

-- 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
DROP PROCEDURE IF EXISTS id_of_function_the_most_questions;
DELIMITER $$
CREATE PROCEDURE id_of_function_the_most_questions(OUT id_theMost_question INT)  
BEGIN
	SELECT TypeID INTO id_theMost_question
    FROM question
	GROUP BY TypeID
	HAVING  COUNT(QuestionID) = (SELECT COUNT(QuestionID) FROM question GROUP BY TypeID ORDER BY COUNT(QuestionID) DESC LIMIT 1);
END$$
DELIMITER ;
SET @id_theMost_question2 = 0;
CALL id_of_function_the_most_questions(@id_theMost_question2);
SELECT @id_theMost_question2;

-- 5: Sử dụng store ở question 4 để tìm ra tên của type question
DROP FUNCTION IF EXISTS name_typeQuestion ;
DELIMITER $$
CREATE FUNCTION name_typeQuestion() RETURNS NVARCHAR(100)
READS SQL DATA
DETERMINISTIC
BEGIN
    DECLARE v_name NVARCHAR(100);
	SELECT TypeName  INTO v_name
    FROM typequestion
	WHERE TypeID = @id_theMost_question2;
    RETURN v_name;
END$$
DELIMITER ;

SELECT name_typeQuestion();

--  6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên chứa chuỗi của người dùng nhập vào 
-- hoặc trả về user có username chứa chuỗi của người dùng nhập vào
DROP PROCEDURE IF EXISTS find_groupName_and_userName;
DELIMITER $$
CREATE PROCEDURE find_groupName_and_userName(IN in_nameGroup NVARCHAR(100),OUT out_nameGroup NVARCHAR(100), IN in_user NVARCHAR(100), OUT out_user NVARCHAR(100))
BEGIN
	SELECT GroupName INTO out_nameGroup
	FROM group1
    WHERE GroupName = in_nameGroup;
    
    SELECT FullName INTO out_user
    FROM account1
    WHERE Username = in_user;
END$$
DELIMITER ;

SET @v_nameGroup = '',@v_user = '';
CALL find_groupName_and_userName('Nhóm 2',@v_nameGroup,'',@v_user);
SELECT @v_nameGroup;
CALL find_groupName_and_userName('',@v_nameGroup,'longvt',@v_user);
SELECT @v_user;

-- 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và trong store sẽ tự động gán:
	-- username sẽ giống email nhưng bỏ phần @..mail đi
	-- positionID: sẽ có default là developer
	-- departmentID: sẽ được cho vào 1 phòng chờ
	--  Sau đó in ra kết quả tạo thành công
DROP PROCEDURE IF EXISTS	in_email_fullmane_and_assign;
DELIMITER $$
 CREATE PROCEDURE in_email_fullmane_and_assign(IN in_fullname NVARCHAR(100), IN in_email NVARCHAR(50))   
 BEGIN
		DECLARE v_departmentid INT UNSIGNED DEFAULT 0;
        DECLARE v_positionid   INT UNSIGNED DEFAULT 0;
        
        SELECT DepartmentID   INTO v_departmentid
        FROM department
        WHERE departmentName = 'Sale';
        
        SELECT PositionID INTO v_positionid
        FROM Position1
        WHERE PositionName = 'developer';
        
        INSERT INTO account1(AccountID,	Email,				Username,							FullName,		DepartmentID,	PositionID,		CreateDate) 
        VALUES				(11,		in_email,			SUBSTRING_INDEX(in_email, '@', 1 ),	in_fullname,	v_departmentid,	v_positionid,	NOW());
        
        IF	ROW_COUNT() > 0 THEN
			SELECT 'You create record successfully';
		ELSE
			SELECT 'You did not create record  successfully';
        END IF;
 END $$   	
 DELIMITER ;
CALL in_email_fullmane_and_assign('Vũ Tiến Long','longvt123aa@fpt');
SELECT * FROM Account1;

       DELETE FROM  Account1
       WHERE AccountID = 11;

-- 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất

DROP PROCEDURE  IF EXISTS in_Essay_or_MultipleChoice;
DELIMITER $$
CREATE PROCEDURE in_Essay_or_MultipleChoice (IN in_gioiTinh VARCHAR(20))
	BEGIN
				SELECT *,CHAR_LENGTH(CONTENT) FROM question 
            WHERE TypeID IN (SELECT TypeID FROM typequestion
							 WHERE TypeName = in_gioiTinh)
			
            ORDER BY CHAR_LENGTH(CONTENT) DESC
            LIMIT 1;
            
	END $$
DELIMITER ;

CALL in_Essay_or_MultipleChoice('Multiple-Choice');

-- 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID
DROP PROCEDURE IF EXISTS drop_Exam;
DELIMITER $$
CREATE PROCEDURE drop_Exam (IN in_ID INT)
	BEGIN
     DELETE FROM examquestion
        WHERE ExamID = (SELECT ExamID FROM Exam 
						   WHERE ExamID = in_ID );
                           
		DELETE FROM Exam
        WHERE ExamID = in_ID;
        
       
        
	END $$
DELIMITER ;
CALL drop_Exam(1);

SELECT * FROM exam;

 -- 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử dụng store ở câu 9 để xóa)
 --     Sau đó in số lượng record đã remove từ các table liên quan trong khi removing

DROP PROCEDURE IF EXISTS drop_Exam;
DELIMITER $$
CREATE PROCEDURE drop_Exam()
	BEGIN
		DECLARE v_soLuongExam INT;
        DECLARE v_soLuongExamQuestion INT;
	
	-- đếm số lượng exam sẽ xóa
		SELECT COUNT(ExamID)  INTO v_soLuongExam
        FROM exam 
        WHERE ExamID IN (SELECT ExamID FROM exam WHERE CreateDate < SYSDATE() - INTERVAL 2 YEAR);
	-- đếm số lượng examquetion sẽ xóa 
		SELECT COUNT(ExamID) INTO v_soLuongExamQuestion
		FROM examquestion
		WHERE ExamID IN (SELECT ExamID FROM exam WHERE CreateDate < SYSDATE() - INTERVAL 2 YEAR);

     -- xóa    
		DELETE FROM examquestion 
        WHERE ExamID IN (SELECT ExamID FROM exam WHERE CreateDate < SYSDATE() - INTERVAL 2 YEAR);
                           
		DELETE FROM exam
        WHERE   CreateDate < SYSDATE() - INTERVAL 2 YEAR;
   -- in số lượng exam and examquesstion ra màn hình     
        SELECT 'Số lượng exam đã xóa',v_soLuongExam
        UNION
        SELECT 'Số lượng examqueston đã xóa', v_soLuongExamQuestion;
	END $$
DELIMITER ;

CALL drop_Exam();

-- 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được 
 -- chuyển về phòng ban default là phòng ban chờ việc
 DROP PROCEDURE IF EXISTS delete_department;
 DELIMITER $$
 CREATE PROCEDURE delete_department(IN in_departmentName NVARCHAR(100))
	BEGIN
		UPDATE Account1
        SET DepartmentID = 11
        WHERE DepartmentID IN (SELECT DepartmentID FROM department WHERE DepartmentName = in_departmentName);
        
        DELETE FROM department
        WHERE DepartmentName = in_departmentName;
    END$$
 DELIMITER ;
 CALL delete_department('Bảo vệ');
 
SELECT * FROM department;
SELECT * FROM Account1;

 --  12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm  nay
 DROP PROCEDURE IF EXISTS number_of_questions_generated_during_the_year;
 DELIMITER $$
 CREATE PROCEDURE number_of_questions_generated_during_the_year()
	BEGIN
		SELECT monthInYear.MONTH AS 'Tháng', COUNT(QuestionID) AS 'Số câu hỏi được tạo trong tháng'
	FROM (	SELECT 1 AS MONTH
			UNION SELECT 2 AS MONTH
            UNION SELECT 3 AS MONTH
            UNION SELECT 4 AS MONTH
            UNION SELECT 5 AS MONTH
            UNION SELECT 6 AS MONTH
            UNION SELECT 7 AS MONTH
            UNION SELECT 8 AS MONTH
            UNION SELECT 9 AS MONTH
            UNION SELECT 10 AS MONTH
            UNION SELECT 11 AS MONTH
            UNION SELECT 12 AS MONTH
           ) AS monthInYear 
	LEFT JOIN question  ON  monthInYear.MONTH = MONTH(CreateDate)
    GROUP BY monthInYear.MONTH;
    END $$
 DELIMITER ;
 
 CALL number_of_questions_generated_during_the_year();
 
 SELECT * FROM question;
 
 -- 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất
-- (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng")
DROP PROCEDURE IF EXISTS number_of_questions_generated_in_6_months ;
DELIMITER $$
CREATE PROCEDURE number_of_questions_generated_in_6_months()
BEGIN
		SELECT In6month.MONTH, COUNT(QuestionID) AS 'Số lượng câu hỏi được tạo',
				CASE
					WHEN COUNT(QuestionID) = 0 THEN 'Không có câu hỏi nào trong tháng' END AS temp
				
		FROM  (SELECT MONTH(SYSDATE() - INTERVAL 0 MONTH) AS MONTH
				UNION SELECT MONTH( SYSDATE() - INTERVAL 1 MONTH) AS MONTH
				UNION SELECT MONTH( SYSDATE() - INTERVAL 2 MONTH) AS MONTH
				UNION SELECT MONTH( SYSDATE() - INTERVAL 3 MONTH) AS MONTH
				UNION SELECT MONTH( SYSDATE() - INTERVAL 4 MONTH) AS MONTH) AS In6month
		LEFT JOIN question ON In6month.MONTH = MONTH(CreateDate)
		GROUP BY In6month.MONTH 
		ORDER BY In6month.MONTH DESC;
END $$
DELIMITER ;

CALL number_of_questions_generated_in_6_months();





