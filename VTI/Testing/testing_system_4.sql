USE testing_system_1;
-- 1 Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT * FROM Account1 A
INNER JOIN Department B ON A.DepartmentID = B.DepartmentID;

SELECT * FROM testing_system_1.account1;
SELECT *  FROM department;

-- 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010
SELECT * FROM Account1
WHERE CreateDate > '2010-12-20';

-- 3 Viết lệnh để lấy ra tất cả các developer
SELECT * FROM position1;

SELECT * FROM Account1 A
INNER JOIN position1 B ON A.PositionID = B.PositionID
where PositionName like 'developer';


-- 4 Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT B.DepartmentName,COUNT(B.DepartmentID) AS 'Nhân Viên' FROM Account1 A
INNER JOIN department B ON B.DepartmentID = A.DepartmentID
GROUP BY A.DepartmentID
HAVING COUNT(B.DepartmentID) >=3;

-- 5 Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
SELECT * FROM testing_system_1.examquestion;
SELECT * FROM question;

SELECT B.content ,COUNT(A.questionID) FROM examquestion A
inner join question B ON B.questionID = A.questionID
group by A.questionID
ORDER BY COUNT(A.questionID) DESC
LIMIT 1;

-- 6 Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT B.CategoryName, count(A.CategoryID) AS 'Số câu hỏi' FROM question A
inner join categoryquestion B ON B.CategoryID = A.CategoryID
group by A.CategoryID;

SELECT * FROM testing_system_1.categoryquestion;
-- 7 Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT * FROM question;
SELECT  * FROM examquestion;

SELECT  A.ExamID,COUNT(A.QuestionID) AS 'Số câu hỏi' from examquestion A
inner join question B ON B.QuestionID = A.QuestionID
GROUP BY A.ExamID;

-- 8 Lấy ra Question có nhiều câu trả lời nhất
SELECT A.AnswerID,COUNT(B.QuestionID) AS 'Số câu hỏi' FROM answer A
inner join question B ON B.QuestionID = A.QuestionID
GROUP BY B.QuestionID
limit 3;

select * from answer;

-- 9 Thống kê số lượng account trong mỗi group
SELECT A.GroupID,COUNT(A.AccountID) AS 'Số lượng người' FROM groupaccount A
inner join account1 B ON B.AccountID = A.AccountID
GROUP BY A.GroupID 
order by A.GroupID asc;

-- 10 Tìm chức vụ có ít người nhất
select * from position1;
select B.PositionName,COUNT(A.PositionID) as 'Số người' from account1 A
INNER JOIN position1 B ON B.PositionID = A.PositionID
group by A.PositionID
order by COUNT(A.PositionID) asc;

-- 11 Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
SELECT B.DepartmentName as 'Phòng ban',C.PositionName,COUNT(A.PositionID) as'Số nhân viên' FROM account1 A
INNER JOIN department B ON B.DepartmentID = A.DepartmentID
INNER JOIN position1 C ON C.PositionID = A.PositionID
group by B.DepartmentName;


-- 12 Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, …
SELECT A.Content AS 'Loại câu hỏi',B.typeName AS 'Tên câu hỏi',	A.CreatorID AS 'Mã tg',	C.Content as 'Câu trả lời' ,isCorrect as 'Kiểm tra'FROM question A
INNER JOIN typequestion B ON B.TypeID = A.TypeID
INNER JOIN answer C ON C.QuestionID = A.QuestionID;

-- 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
SELECT A.TypeID 'Mã Loại câu hỏi', COUNT(B.TypeName) as 'Số câu',B.TypeName FROM question A
INNER JOIN typequestion B ON B.TypeID = A.TypeID
GROUP BY A.TypeID;

SELECT * FROM typequestion;

-- 14 Lấy ra group không có account nào
SELECT B.*,COUNT(A.AccountID) AS 'Số lượng Account' FROM groupaccount A
INNER JOIN group1 B ON B.GroupID = A.GroupID
GROUP BY A.GroupID
HAVING COUNT(A.AccountID) = 0;

-- 16 Lấy ra question không có answer nào
SELECT B.*,COUNT(A.AnswerID) AS 'Số câu trả lời'  FROM answer A
RIGHT JOIN question B ON A.QuestionID = B.QuestionID
GROUP BY A.AnswerID
HAVING COUNT(A.AnswerID) = 0;

-- 17: 
	-- a) Lấy các account thuộc nhóm thứ 1
	-- b) Lấy các account thuộc nhóm thứ 2
	-- c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau

-- a	
	SELECT B.*,A.GroupID AS 'Nhóm' FROM groupaccount A
	RIGHT JOIN Account1 B  ON B.AccountID = A.AccountID
	WHERE A.GroupID = 1;
-- b
	SELECT B.*,A.GroupID AS 'Nhóm' FROM groupaccount A
	RIGHT JOIN Account1 B  ON B.AccountID = A.AccountID
	WHERE A.GroupID = 2;
    
-- c
	SELECT B.*,A.GroupID AS 'Nhóm' FROM groupaccount A
	RIGHT JOIN Account1 B  ON B.AccountID = A.AccountID
	WHERE A.GroupID = 1
UNION
	SELECT B.*,A.GroupID AS 'Nhóm' FROM groupaccount A
	RIGHT JOIN Account1 B  ON B.AccountID = A.AccountID
	WHERE A.GroupID = 2;
    
-- 18: 
	-- a) Lấy các group có lớn hơn 5 thành viên
	-- b) Lấy các group có nhỏ hơn 7 thành viên
	-- c) Ghép 2 kết quả từ câu a) và câu b)
    
-- a
SELECT B.*,COUNT(A.AccountID) AS'Số thành viên' FROM groupaccount A
RIGHT JOIN group1 B ON A.GroupID = B.GroupID
GROUP BY A.AccountID
HAVING COUNT(A.AccountID) >=1;

-- b
SELECT B.*,COUNT(A.AccountID) AS'Số thành viên' FROM groupaccount A
RIGHT JOIN group1 B ON A.GroupID = B.GroupID
GROUP BY A.AccountID
HAVING COUNT(A.AccountID) <2;

-- c
SELECT B.*,COUNT(A.AccountID) AS'Số thành viên' FROM groupaccount A
RIGHT JOIN group1 B ON A.GroupID = B.GroupID
GROUP BY A.AccountID
HAVING COUNT(A.AccountID) >=1
UNION ALL
SELECT B.*,COUNT(A.AccountID) AS'Số thành viên' FROM groupaccount A
RIGHT JOIN group1 B ON A.GroupID = B.GroupID
GROUP BY A.AccountID
HAVING COUNT(A.AccountID) <2























