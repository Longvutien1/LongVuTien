USE testing_system_1;
DROP TRIGGER IF EXISTS  not_enter_the_previous_year;
DELIMITER $$
CREATE TRIGGER not_enter_the_previous_year 
BEFORE INSERT ON group1
FOR EACH ROW
	BEGIN
		IF	NEW.CreateDate <= DATE_SUB(CURDATE() , INTERVAL 1 YEAR)  THEN
        SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'field CreateDate must be larger than now';
        END IF;
    END$$
DELIMITER ;

INSERT INTO group1 (GroupID,GroupName,CreatorID,CreateDate)
VALUES 				(11,	'Long',		11,		'2019-01-01');
SELECT * FROM group1;
SELECT DATE_SUB(CURDATE() , INTERVAL 1 YEAR);
SELECT CURDATE();

-- 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào  department "Sale" nữa, 
	-- khi thêm thì hiện ra thông báo "Department "Sale" cannot add more user"
    SELECT * FROM department
    SELECT * FROM account1
DROP TRIGGER IF EXISTS not_user_add_dpartment_sale
DELIMITER $$
CREATE TRIGGER not_user_add_dpartment_sale
BEFORE INSERT ON account1
FOR EACH ROW
	BEGIN
		IF	NEW.DepartmentID = 2 THEN
         SIGNAL SQLSTATE '45000'
         SET MESSAGE_TEXT =  "Department Sale cannot add more user";
		END IF;
    END $$
DELIMITER ;

INSERT INTO account1(AccountID,	Email,						Username,	FullName,		DepartmentID,PositionID,CreateDate)
VALUES				(11,		'@@newPeople_vti.edu.vn',	'newpp',	'New People',	1			,	3,		NOW());


--  3: Cấu hình 1 group có nhiều nhất là 5 user
DROP TRIGGER IF EXISTS groupHas5Member;
DELIMITER $$
CREATE TRIGGER groupHas5Member 
BEFORE INSERT  ON  groupaccount
FOR EACH ROW
	BEGIN
		IF	NEW.GroupID IN (SELECT GroupID FROM (SELECT GroupID,COUNT(AccountID) AS 'Số user'
											 FROM groupaccount
											 GROUP BY GroupID
                                             HAVING COUNT(AccountID) > 2) AS itemp) THEN
			 SIGNAL SQLSTATE '12345'
			 SET MESSAGE_TEXT =  "Max is two users in each group";
		END IF;
    END$$
DELIMITER ;
INSERT INTO GroupAccount(GroupID,AccountID,	JoinDate)
VALUES                 (1,			7,		NOW());

SELECT GroupID,COUNT(AccountID) AS 'Số user'
 FROM groupaccount
GROUP BY GroupID
HAVING COUNT(AccountID) > 2 ;
SELECT* FROM groupaccount;

-- 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question
SELECT ExamID,COUNT(QuestionID) AS 'Số question' FROM examquestion
GROUP BY ExamID;

DROP TRIGGER IF EXISTS up_to_10_questions_in_1_test;
DELIMITER $$
CREATE TRIGGER up_to_10_questions_in_1_test
	BEFORE INSERT ON examquestion
    FOR EACH ROW
		BEGIN 
			IF	 NEW.ExamID IN (SELECT ExamID FROM (SELECT ExamID,COUNT(QuestionID) AS 'Số question' 
														FROM examquestion
														GROUP BY ExamID
                                                        HAVING COUNT(QuestionID) > 3) AS itemp) THEN
					SIGNAL SQLSTATE '45000'
                    SET MESSAGE_TEXT= 'Max is three users in each group';
			END IF;
        END $$
DELIMITER ;
INSERT INTO ExamQuestion	(ExamID,QuestionID)
VALUES						(1		,2);


-- 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là 
 -- admin@gmail.com (đây là tài khoản admin, không cho phép user xóa), 
 -- còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông 
 -- tin liên quan tới user đó
 DROP TRIGGER IF EXISTS canNot_delete_account_admin;
 DELIMITER $$
CREATE TRIGGER canNot_delete_account_admin
BEFORE DELETE ON Account1
FOR EACH ROW
	BEGIN
		DECLARE v_account_id INT;
			SELECT AccountID INTO v_account_id
            FROM Account1
			WHERE Email = OLD.Email;
                
			IF	OLD.Email = '@@admin_vti.edu.vn' THEN
				SIGNAL SQLSTATE '12345'
				SET MESSAGE_TEXT = 'Can not delede account admin';
			ELSE
				DELETE FROM groupaccount WHERE AccountID = v_account_id;
                UPDATE  group1 	SET CreatorID = NULL WHERE  CreatorID = v_account_id;
				UPDATE  exam 	SET CreatorID = NULL WHERE  CreatorID = v_account_id;
                UPDATE  question SET CreatorID = NULL WHERE  CreatorID = v_account_id;   
		END IF;
	END$$
DELIMITER ;
 DELETE FROM Account1
 WHERE Email = '@@longvt_vti.edu.vn';
 
SELECT * FROM Account1;
SELECT * FROM groupaccount;

--  6: Không sử dụng cấu hình default cho field DepartmentID của table Account,
 --  hãy tạo trigger cho phép người dùng khi tạo account không điền 
 -- vào departmentID thì sẽ được phân vào phòng ban "waiting Department"
	
DROP TRIGGER IF EXISTS before_accounts_insert;
DELIMITER $$
CREATE TRIGGER before_accounts_insert
BEFORE INSERT ON Account1
FOR EACH ROW
	BEGIN
		DECLARE v_department_id INT;
			SELECT DepartmentID INTO v_department_id
            FROM department
            WHERE DepartmentName = 'waiting Department';
            
           IF NEW.DepartmentID IS NULL THEN
				SET NEW.DepartmentID = v_department_id;
			END IF;
    END $$
DELIMITER ;

INSERT INTO Account1(AccountID,Email,Username,FullName,PositionID,CreateDate)
VALUES
(12,		N'@@longvt11_vti.edu.vn',	'longvt22',		N'Vũ Tiến Long12'		 ,2, '2021-10-05');

SELECT * FROM department;
 SELECT * FROM Account1;

 -- 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi question, trong đó có tối đa 2 đáp án đúng.
SELECT QuestionID, COUNT(AnswerID) AS 'số answer' ,isCorrect, COUNT(isCorrect) AS 'Số câu tl đúng' FROM answer
WHERE isCorrect LIKE 'TRUE'
GROUP BY QuestionID,isCorrect;


DROP TRIGGER IF EXISTS question_has_4_answers_and_2_answersTrue;
DELIMITER $$
CREATE TRIGGER question_has_4_answers_and_2_answersTrue
BEFORE INSERT ON answer
FOR EACH ROW
	BEGIN
		DECLARE v_number_of_answer INT;
        DECLARE v_number_of_answerTrue INT;
 -- select bảng answer gán số lượng answer cho   v_number_of_answer
			SELECT COUNT(A.AnswerID) AS 'Số câu tl' INTO v_number_of_answer
			FROM answer A 
			JOIN question B ON A.QuestionID = B.QuestionID
			WHERE A.QuestionID = NEW.QuestionID;
  -- select bảng answer gán số lượng câu tl đúng cho   v_number_of_answerTrue       
			 SELECT COUNT(isCorrect)AS 'Sl câu tl đúng' INTO v_number_of_answerTrue
             FROM answer A
             JOIN question B ON B.QuestionID = A.QuestionID
             WHERE  A.QuestionID = NEW.QuestionID AND A.isCorrect LIKE 'TRUE';
		IF  v_number_of_answer > 4 THEN
			SIGNAL SQLSTATE '45000'
			SET MESSAGE_TEXT = 'Up to 1 question with 4 answers and 2 correct answers';
        END IF;
        	IF v_number_of_answer = 2  THEN
			SIGNAL SQLSTATE '45000'
			SET MESSAGE_TEXT = 'Up to 1 question with 2 correct answers';
        END IF;
    END $$
    
DELIMITER ;
INSERT INTO Answer(AnswerID,Content,QuestionID,isCorrect)
VALUES
(15,			'A',			5,	'FALSE');
SELECT * FROM answer;
 
    
SELECT QuestionID, COUNT(AnswerID) as'Số câu tl', COUNT(isCorrect) FROM answer
GROUP BY QuestionID;


-- 8: Viết trigger sửa lại dữ liệu cho đúng: 
 -- Nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định 
-- Thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database
  ALTER TABLE Account1
    ADD COLUMN gender VARCHAR(20);

DROP TRIGGER IF EXISTS gender_of_account;
DELIMITER $$
CREATE TRIGGER gender_of_account
BEFORE INSERT ON Account1
FOR EACH ROW
	BEGIN
  
		IF NEW.gender = 'Male' THEN
			SET NEW.gender = 'M';
		ELSEIF NEW.gender = 'Female' THEN
			SET NEW.gender = 'F';
		ELSEIF NEW.gender = 'Unknown' THEN
			SET NEW.gender = 'U';
		END IF;
    END $$
    
DELIMITER ;
INSERT INTO Account1(AccountID,Email,Username,FullName,DepartmentID,PositionID,		CreateDate, gender)
VALUES
(12,		N'@@lacc1_vti.edu.vn1',	'laccq112',		N'Vũ Tiến Longac',			 1,1, 	'2020-10-05', 'Male'),
(13,		N'@@lacc2_vti.edu.vn1',	'laccq111',			N'Vũ Tiến Longac',			 1,1, 	'2020-10-05', 'Female'),
(14,		N'@@lacc3_vti.edu.vn1',	'laccq1122',		N'Vũ Tiến Longac',			 1,1, 	'2020-10-05', 'Unknown');
UPDATE Account1
SET gender = 'Male'
WHERE AccountID = 1;
 SELECT * FROM account1;
 
 -- 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày
 SELECT * FROM exam;
 DROP TRIGGER IF EXISTS cant_delede_exam_createDate_2_days;
 DELIMITER $$
 CREATE TRIGGER cant_delede_exam_createDate_2_days
 BEFORE DELETE ON exam
 FOR EACH ROW
	BEGIN
		IF OLD.ExamID  IN (SELECT ExamID FROM exam WHERE DAY(NOW())- DAY(CreateDate) = 2) THEN
			SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'Can not delete exam create last 2 day ';
		END IF;
    END $$
 DELIMITER ;
 DELETE FROM exam
 WHERE ExamID = 11;
 
 
 --  10: Viết trigger chỉ cho phép người dùng chỉ được update, delete các question khi question đó chưa nằm trong exam nào

SELECT B.QuestionID,COUNT(A.ExamID) AS 'Số lượng EXAM',A.ExamID FROM examquestion A
RIGHT JOIN question B ON B.QuestionID = A.QuestionID
GROUP BY B.QuestionID;
SELECT * FROM answer;
 -- đk update
DROP TRIGGER IF EXISTS allow_update_when_the_question_is_not_in_any_exam;
DELIMITER $$
CREATE TRIGGER allow_deletion_when_the_question_is_not_in_any_exam
BEFORE UPDATE ON question
FOR EACH ROW
	BEGIN
		IF OLD.QuestionID IN (SELECT DISTINCT QuestionID FROM examquestion)
        OR	OLD.QuestionID IN (SELECT DISTINCT QuestionID FROM answer) THEN
			SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Can not update when the question is in examquestion or answer';
		END IF;
    END$$
DELIMITER ;
UPDATE question
SET QuestionID = 100
WHERE QuestionID = 9
SELECT * FROM question

-- đk xóa
DROP TRIGGER IF EXISTS allow_delete_when_the_question_is_not_in_any_exam;
DELIMITER $$
CREATE TRIGGER allow_delete_when_the_question_is_not_in_any_exam
BEFORE DELETE ON question
FOR EACH ROW
	BEGIN
		IF OLD.QuestionID IN (SELECT DISTINCT QuestionID FROM examquestion)
        OR	OLD.QuestionID IN (SELECT DISTINCT QuestionID FROM answer) THEN
			SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Can not delete when the question is in examquestion or answer';
		END IF;
    END$$
DELIMITER ;
DELETE FROM question
WHERE QuestionID = 1;


-- 12: Lấy ra thông tin exam trong đó:
-- Duration <= 30 thì sẽ đổi thành giá trị "Short time"
-- 30 < Duration <= 60 thì sẽ đổi thành giá trị "Medium time"
-- Duration > 60 thì sẽ đổi thành giá trị "Long time"

SELECT 	*,
	CASE
		WHEN Duration < 30 THEN  'Duration'
        WHEN 30 < Duration <= 60 THEN "Medium time"
        WHEN Duration > 60 THEN   "Long time"
	END AS itemp
	
	FROM exam;

-- 13: Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên là the_number_user_amount và mang giá trị được quy định như sau:
-- Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few
-- Nếu số lượng user trong group <= 20 và > 5 thì sẽ có giá trị là normal
-- Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher

SELECT B.GroupID,	COUNT(A.AccountID) AS 'Số account',
		CASE 
				WHEN COUNT(A.AccountID) <=0 THEN 'few'
				WHEN  0 < COUNT(A.AccountID) AND  COUNT(A.AccountID) <3  THEN 'normal'
				WHEN COUNT(A.AccountID) >= 3 THEN 'higher' 
		END AS itemp
	
FROM groupaccount A
RIGHT JOIN group1 B ON B.GroupID = A.GroupID
GROUP BY B.GroupID;

--  14: Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nào không có user thì sẽ thay đổi giá trị 0 thành "Không có User"
SELECT B.DepartmentID, COUNT(A.AccountID) AS 'Số user' ,
	CASE 
    WHEN COUNT(A.AccountID) = 0 THEN 'Không có user'
    END  AS Itemp
FROM Account1 A
RIGHT JOIN department B ON B.DepartmentID = A.DepartmentID
GROUP BY B.DepartmentID


