-- insert data

USE testing_system_2;
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
(1,		N'Trưởng phòng'),
(2,		N'Thư kí'),
(3,		N'Nhân viên'),
(4,		N'Tổng giám đốc'),
(5,		N'Giám đốc điều hành'),
(6,		N'Giám đốc tài chính'),
(7,		N'Giám đốc marketing'),
(8,		N'Giám đốc công nghệ'),
(9,		N'Giám đốc sản suất'),
(10,	N'Phó Giám đốc');

-- INSERT INTO TABLE USER
INSERT INTO Account1(AccountID,Email,Username,FullName,DepartmentID,PositionID,CreateDate)
VALUES
(1,		N'@@longvt_vti.edu.vn',	'longvt',		N'Vũ Tiến Long',			 1,2, '2021-10-05'),
(2,		N'@@thieunk_vti.edu.vn','thieunk',		N'Nguyễn Khắc Thiệu',		 2,3, '2019-11-05'),
(3,		N'@@khanhld_vti.edu.vn','khanhld',		N'Lê Duy Khánh',			 3,5, '2018-10-11'),
(4,		N'@@hieuvm_vti.edu.vn',	'hieuvm',		N'Vũ Minh Hiếu',			 1,1, '2021-10-01'),
(5,		N'@@sangpt_vti.edu.vn',	'sangpt',		N'Phạm Trọng Sang',        	 6,8, '2018-10-05'),
(6,		N'@@hoangvh_vti.edu.vn','hoangvh',		N'Vũ Huy Hoàng',	    	 9,10, '2021-10-05'),
(7,		N'@@tiennm_vti.edu.vn',	'tiennm',		N'Nguyễn Minh Tiến',		 5,7, '2019-01-01'),
(8,		N'@@hoamp_vti.edu.vn',	'hoamp',		N'Phan Minh Hòa',			 5,5, '2019-10-05'),
(9,		N'@@hieubm_vti.edu.vn',	'hieubm',		N'Bùi Minh Hiếu',			 9,9, '2021-02-05'),
(10,	N'@@hoanglm_vti.edu.vn','hoanglm',		N'Lò Minh Hoàng',			 1,9, '2020-10-05');

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
INSERT INTO GroupAccount(GroupAccountID,GroupID,AccountID,JoinDate)
VALUES
(1,		2,	7,	'2021-11-01'),
(2,		9,	3,	'2021-12-01'),
(3,		2,	5,	'2020-12-11'),
(4,		3,	1,	'2019-01-15'),
(5,		4,	2,	'2018-12-14'),
(6,		6,	8,	'2021-05-21'),
(7,		1,	1,	'2018-03-13'),
(8,		2,	9,	'2019-02-13'),
(9,		3,	6,	'2020-01-12'),
(10,	3,	9,	'2021-11-11');

-- INSERT INTO TABLE loại câu hỏi
INSERT INTO TypeQuestion(TypeID,TypeName)
VALUES

(1,			'Type1'),
(2,			'Type2'),
(3,			'Type3'),
(4,			'Type4'),
(5,			'Type5'),
(6,			'Type6'),
(7,			'Type7'),
(8,			'Type8'),
(9,			'Type9'),
(10,		'Type10');



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
INSERT INTO Question(QuestionID,Content,CategoryID,TypeID,CreatorID,CreateDate)
VALUES

(1,			N'Dễ',				1,	2,	1,	'2021-01-21'),
(2,			N'Khó',				2,	3,	2,	'2020-01-21'),
(3,			N'Rất khó',			3,	7,	1,	'2019-01-21'),
(4,			N'Đơn giản',		4,	8,	3,	'2018-01-21'),
(5,			N'Cơ bản',			1,	9,	5,	'2021-02-21'),
(6,			N'Cơ bản 2',		2,	5,	6,	'2021-01-22'),
(7,			N'Cơ bản 3',		8,	2,	8,	'2021-11-21'),
(8,			N'Cơ bản 4',		9,	4,	9,	'2018-12-21'),
(9,			N'Cơ bản 5',		10,	3,	10,	'2019-09-21'),
(10,		N'Cơ bản 6',		5,	1,	7,	'2020-10-21');


-- INSERT INTO TABLE câu trả lời
INSERT INTO Answer(AnswerID,Content,QuestionID,isCorrect)
VALUES

(1,			N'A',			1,	'YES'),
(2,			N'B',			2,	'NO'),
(3,			N'A',			5,	'YES'),
(4,			N'C',			6,	'NO'),
(5,			N'D',			1,	'NO'),
(6,			N'B',			2,	'YES'),
(7,			N'D',			9,	'YES'),
(8,			N'A',			8,	'YES'),
(9,			N'C',			7,	'NO'),
(10,		N'B',			3,	'YES');


-- INSERT INTO TABLE đề thi
INSERT INTO Exam(ExamID,code1,Title,CategoryID,Duration,CreatorID,CreateDate)
VALUES

(1,			N'1',			N'Đề thi THPT Quốc Gia',		1,	70,	1,	'2021-01-01'),
(2,			N'2',			N'Đề thi THPT Quốc Gia',		2,	0,	1,	'2020-02-01'),
(3,			N'3',			N'Đề thi THPT Quốc Gia',		3,	90,	3,	'2021-09-12'),
(4,			N'4',			N'Đề thi THPT Quốc Gia',		4,	60,	5,	'2018-06-12'),
(5,			N'5',			N'Đề thi THPT Quốc Gia',		5,	40,	2,	'2018-06-08'),
(6,			N'6',			N'Đề thi THPT Quốc Gia',		2,	'45',	9,	'2019-05-09'),
(7,			N'7',			N'Đề thi THPT Quốc Gia',		9,	45,	8,	'2019-1-06'),
(8,			N'8',			N'Đề thi THPT Quốc Gia',		7,	45,	7,	'2020-11-05'),
(9,			N'9',			N'Đề thi THPT Quốc Gia',		2,	90,	7,	'2020-12-12'),
(10,		N'10',			N'Đề thi THPT Quốc Gia',		4,	120,	2,	'2021-12-11');


-------------------------------------------- SELECT----------------------------------------------
-- LẤY RA TẤT CẢ CÁC PHÒNG BAN
SELECT * FROM Department;

-- LẤY RA ID CỦA PHÒNG BAN SALE
SELECT DepartmentID FROM Department
WHERE DepartmentName LIKE 'SALE';

-- Lấy ra thông tin account có full name dài nhất
SELECT * FROM Account1
WHERE LENGTH(FullName) = (SELECT MAX(LENGTH(FullName)) FROM Account1);

-- Lấy ra thông tin account có fullname dài nhất và thuộc phòng ban có id  = 3
SELECT * FROM Account1
WHERE LENGTH(FullName) = (SELECT MAX(LENGTH(FullName)) FROM Account1) AND DepartmentID = 4;

-- Lấy ra tên group đã tham gia trước ngày 20/12/2019
SELECT GroupName FROM Group1
WHERE CreateDate < '2019-12-20';

-- Lấy ra ID của question có >= 4 câu trả lời
SELECT QuestionID,COUNT(QuestionID) FROM Answer
GROUP BY QuestionID
HAVING COUNT(QuestionID) >=4;

--  Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày  20/12/2019
SELECT * FROM Exam
WHERE Duration >= 60 AND CreateDate < '2019-12-20';

 -- Lấy ra 5 group được tạo gần đây nhất
 
 SELECT  * FROM Group1
 ORDER BY CreateDate DESC LIMIT 5;

-- : Đếm số nhân viên thuộc department có id = 2
SELECT COUNT(DepartmentID) AS 'SỐ NHÂN VIÊN' FROM Account1
where DepartmentID = 2;

-- Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o"
SELECT * FROM Account1
WHERE FullName like 'V%g';

-- Xóa tất cả các exam được tạo trước ngày 20/12/2019
DELETE FROM Exam
WHERE Exam.CreateDate < '2019-12-20';











