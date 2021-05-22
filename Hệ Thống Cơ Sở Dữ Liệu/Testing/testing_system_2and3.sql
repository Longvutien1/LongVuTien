-- insert data

USE testing_system_1;
-- INSERT BẢNG PHÒNG BAN
INSERT INTO Department(DepartmentID, DepartmentName)
VALUES
(1,		N'Marketing'),
(2,		N'Sale'),
(3,		N'Bảo vệ'),
(4,		N'Nhân sự'),
(5,		N'Kỹ thuật'),
(6,		N'Tài chính'),
(7,		N'Phó giám đốc'),
(8,		N'Giám đốc'),
(9,		N'Thư kí'),
(10,	N'Bán hàng');


-- INSERT INTO TABLE CHỨC VỤ
INSERT INTO Position1(PositionID,PositionName)
VALUES
(1,		N'developer'),
(2,		N'test'),
(3,		N'scrum master'),
(4,		N'PM'),
(5,		N'Giám đốc điều hành'),
(6,		N'Giám đốc tài chính'),
(7,		N'Giám đốc marketing'),
(8,		N'Giám đốc công nghệ'),
(9,		N'Giám đốc sản suất'),
(10,	N'Tổng giám đốc');

-- INSERT INTO TABLE USER
INSERT INTO Account1(AccountID,Email,Username,FullName,DepartmentID,PositionID,CreateDate)
VALUES
(1,		N'@@longvt_vti.edu.vn',	'longvt',		N'Vũ Tiến Long',			 1,2, '2021-10-05'),
(2,		N'@@thieunk_vti.edu.vn','thieunk',		N'Nguyễn Khắc Thiệu',		 2,3, '2019-11-05'),
(3,		N'@@khanhld_vti.edu.vn','khanhld',		N'Lê Duy Khánh',			 3,5, '2018-10-11'),
(4,		N'@@hieuvm_vti.edu.vn',	'hieuvm',		N'Vũ Minh Hiếu',			 1,1, '2021-10-01'),
(5,		N'@@sangpt_vti.edu.vn',	'sangpt',		N'Phạm Trọng Sang',        	 6,8, '2018-10-05'),
(6,		N'@@hoangvh_vti.edu.vn','hoangvh',		N'Vũ Huy Hoàng',	    	 9,10, '2021-10-05'),
(7,		N'@@tiennm_vti.edu.vn',	'tiennm',		N'Nguyễn Minh Tiến',		 5,1, '2019-01-01'),
(8,		N'@@hoamp_vti.edu.vn',	'hoamp',		N'Phan Minh Hòa',			 5,2, '2019-10-05'),
(9,		N'@@hieubm_vti.edu.vn',	'hieubm',		N'Bùi Minh Hiếu',			 9,3, '2021-02-05'),
(10,	N'@@hoanglm_vti.edu.vn','hoanglm',		N'Lò Minh Hoàng',			 1,1, '2020-10-05'),
(11,	N'@@admin_vti.edu.vn','admin',			N'admin',				 	 1,1, '2020-10-05');

-- INSERT INTO TABLE nhóm
INSERT INTO Group1(GroupID,GroupName,CreatorID,CreateDate)
VALUES
(1,		N'Nhóm 1',	1,	'2021-01-21'),
(2,		N'Nhóm 2',	2,	'2021-01-22'),
(3,		N'Nhóm 3',	3,	'2021-12-21'),
(4,		N'Nhóm 4',	4,	'2020-01-21'),
(5,		N'Nhóm 5',	5,	'2018-12-12'),
(6,		N'Nhóm 6',	6,	'2019-01-21'),
(7,		N'Nhóm 7',	7,	'2020-01-01'),
(8,		N'Nhóm 8',	8,	'2020-01-12'),
(9,		N'Nhóm 9',	9,	'2020-06-21'),
(10,	N'Nhóm 10',	10,	'2019-01-21');


-- INSERT INTO TABLE GroupAccount
INSERT INTO GroupAccount(GroupID,AccountID,JoinDate)
VALUES
(		2,	7,	'2021-11-01'),
(		9,	NULL,	'2021-12-01'),
(		2,	5,	'2020-12-11'),
(		3,	1,	'2019-01-15'),
(		4,	1,	'2018-12-14'),
(		6,	7,	'2021-05-21'),
(		1,	3,	'2018-03-13'),
(		2,	9,	'2019-02-13'),
(		3,	6,	'2020-01-12'),
(		3,	9,	'2021-11-11');

-- INSERT INTO TABLE loại câu hỏi
INSERT INTO TypeQuestion(TypeID,TypeName)
VALUES

(1,			'Essay'),
(2,			'Multiple-Choice');




-- INSERT INTO TABLE loại câu hỏi
INSERT INTO CategoryQuestion(CategoryID,CategoryName)
VALUES

(1,			N'Loại 1'),
(2,			N'Loại 2'),
(3,			N'Loại 3'),
(4,			N'Loại 4'),
(5,			N'Loại 5'),
(6,			N'Loại 6'),
(7,			N'Loại 7'),
(8,			N'Loại 8'),
(9,			N'Loại 9'),
(10,		N'Loại 10');



-- INSERT INTO TABLE câu hỏi
INSERT INTO Question(QuestionID,	Content,				CategoryID,	TypeID,CreatorID,CreateDate)
VALUES

					(1,			N'Câu hỏi về Java',				1,		1,		1,		'2021-01-21'),
					(2,			N'Câu hỏi về C#',				2,		1,		2,		'2020-01-21'),
					(3,			N'Câu hỏi về PHP',				3,		2,		3,		'2019-01-21'),
					(4,			N'Hỏi về SQL',					4,		2,		4,		'2018-01-21'),
					(5,			N'Hỏi về MySQL',				1,		2,		5,		'2021-02-21'),
					(6,			N'Hỏi về Js',					2,		1,		6,		'2021-01-22'),
					(7,			N'Hỏi về PYthon',				8,		2,		7,		'2021-11-21'),
					(8,			N'Hỏi về PostMan',				9,		1,		8,		'2018-12-21'),
					(9,			N'Hỏi về APS.MAN',				10,		2,		9,		'2019-09-21'),
					(10,		N'Hỏi về Ruby',					5,		1,		10,		'2020-10-21');


-- INSERT INTO TABLE câu trả lời
INSERT INTO Answer(AnswerID,Content,QuestionID,isCorrect)
VALUES

(1,			'A',			1,	'TRUE'),
(2,			'B',			2,	'FALSE'),
(3,			'A',			5,	'TRUE'),
(4,			'C',			6,	'TRUE'),
(5,			'D',			1,	'TRUE'),
(6,			'B',			2,	'FALSE'),
(7,			'D',			9,	'FALSE'),
(8,			'A',			8,	'TRUE'),
(9,			'C',			7,	'FALSE'),
(10,		'B',			3,	'FALSE');


-- INSERT INTO TABLE đề thi
INSERT INTO Exam(ExamID,	code1,			Title,						CategoryID,	Duration,CreatorID,CreateDate)
VALUES

				(1,			N'1',			N'Đề thi THPT Quốc Gia',		1,		70,			1,	'2021-01-01'),
				(2,			N'2',			N'Đề thi THPT Quốc Gia',		2,		0,			2,	'2020-02-01'),
				(3,			N'3',			N'Đề thi THPT Quốc Gia',		3,		90,			3,	'2021-09-12'),
				(4,			N'4',			N'Đề thi THPT Quốc Gia',		4,		60,			4,	'2018-06-12'),
				(5,			N'5',			N'Đề thi THPT Quốc Gia',		5,		40,			5,	'2018-06-08'),
				(6,			N'6',			N'Đề thi THPT Quốc Gia',		2,		45,			6,	'2019-05-09'),
				(7,			N'7',			N'Đề thi THPT Quốc Gia',		9,		45,			7,	'2019-1-06'),
				(8,			N'8',			N'Đề thi THPT Quốc Gia',		7,		45,			8,	'2020-11-05'),
				(9,			N'9',			N'Đề thi THPT Quốc Gia',		2,		90,			9,	'2020-12-12'),
				(10,		N'10',			N'Đề thi THPT Quốc Gia',		4,		120,		10,	'2021-12-11');

-- INSERT INTO TABLE ExamQuestion
INSERT INTO ExamQuestion	(ExamID,QuestionID)
VALUES						(1		,2),
							(2		,1),
							(3		,3),
							(4		,8),
							(1		,7),
							(7		,2),
							(8		,3),
							(4		,5),
							(2		,5),
							(10		,1);

-------------------------------------------- SELECT----------------------------------------------
--  2 LẤY RA TẤT CẢ CÁC PHÒNG BAN
USE testing_system_1;
SELECT * FROM Department;

-- 3 LẤY RA ID CỦA PHÒNG BAN SALE
SELECT DepartmentID FROM Department
WHERE DepartmentName LIKE 'SALE';

-- 4 Lấy ra thông tin account có full name dài nhất
SELECT * FROM Account1
WHERE char_length(FullName) = (SELECT MAX(char_length(FullName)) FROM Account1);

-- 5 Lấy ra thông tin account có fullname dài nhất và thuộc phòng ban có id  = 3
SELECT * FROM Account1
WHERE char_length(FullName) = (SELECT MAX(char_length(FullName)) FROM Account1) AND DepartmentID = 2;

-- 6 Lấy ra tên group đã tham gia trước ngày 20/12/2019
SELECT GroupName FROM Group1
WHERE CreateDate < '2019-12-20';

-- 7 Lấy ra ID của question có >= 4 câu trả lời
SELECT QuestionID,COUNT(QuestionID) as 'Câu trả lời' FROM Answer
GROUP BY QuestionID
HAVING COUNT(QuestionID) >=2;

--  8 Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày  20/12/2019
SELECT * FROM Exam
WHERE Duration >= 60 AND CreateDate < '2019-12-20';

 -- 9 Lấy ra 5 group được tạo gần đây nhất
 
 SELECT  * FROM Group1
 ORDER BY CreateDate DESC LIMIT 5;

-- 10: Đếm số nhân viên thuộc department có id = 2
SELECT COUNT(DepartmentID) AS 'SỐ NHÂN VIÊN' FROM Account1
where DepartmentID = 2
GROUP BY (DepartmentID);

-- 11 Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o"
SELECT * FROM Account1
WHERE FullName like 'V%g';

-- 12 Xóa tất cả các exam được tạo trước ngày 20/12/2019
DELETE FROM Exam
WHERE Exam.CreateDate < '2019-12-20';

-- 13 Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi"
SELECT * from question;
DELETE FROM question
WHERE content like 'Câu hỏi%';

-- 14 Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn
SELECT * FROM Account1;

UPDATE Account1
SET FullName = N'Nguyễn Bá Lộc' , Email = 'loc.nguyenba@vti.com.vn'
WHERE AccountID = 5;

-- 15: update account có id = 5 sẽ thuộc group có id = 4
UPDATE Account1
SET DepartmentID = 4
WHERE AccountID = 5;













