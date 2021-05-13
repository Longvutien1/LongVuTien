
DROP DATABASE IF EXISTS Asm4;
CREATE DATABASE Asm4;
USE Asm4;
-- table phòng ban
CREATE TABLE Department(
	Department_Number	INT PRIMARY KEY AUTO_INCREMENT,
    Department_Name		NVARCHAR(100)
);

-- table nhân viên
CREATE TABLE Employee_Table(
	Employee_Number		INT PRIMARY KEY AUTO_INCREMENT,
    Employee_Name		NVARCHAR(100),
    Department_Number	INT
);

-- table kĩ năng nhân viên
CREATE TABLE Employee_Skill_Table(
	Employee_Number		INT,
    Skill_Code			NVARCHAR(50),
    Date_Registered		DATETIME
);

-- insert
INSERT INTO Department(Department_Name) 
VALUES	(N'Marketing'),
		(N'Sale'),
		(N'Bảo vệ'),
		(N'Nhân sự'),
		(N'Tài chính'),
		(N'Phó giám đốc'),
		(N'Giám đốc'),
		(N'Thư kí'),
		(N'Bán hàng'),
		(N'Quản lí ');
        
INSERT INTO Employee_Table(Employee_Name,Department_Number)
VALUES	('Vũ Tiến Long',		1),
		('Mai Thành Đức',		3),
		('Vũ Minh Hiếu',		2),
		('PhạmTrọng Sang',		4),
		('Lê Hữu Thọ',			9),
		('Nguyễn Văn Đức',		4),
		('Bùi Thanh Hải',		3),
		('Nguyễn Khắc Thiệu',	5),
		('Lê Duy Khánh',		5),
		('Nguyễn Văn Hùng',		7);   
        
INSERT INTO Employee_Skill_Table(Employee_Number,	Skill_Code,	Date_Registered)
VALUES			(1,		'Java',				NOW()),
				(2,		'C#',				NOW()),
				(3,		'Java',				NOW()),
				(4,		'C',				NOW()),
				(2,		'JavaSCRIPT',		NOW()),
				(9,		'PHP',				NOW()),
				(3,		'C#',				NOW()),
				(4,		'Java',				NOW()),
				(1,		'JavaSCRIPT',		NOW()),
				(2,		'Java',				NOW());
                
--- select
-- 3: Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java      Hướng dẫn: sử dụng UNION
SELECT Employee_Name,Skill_Code FROM Employee_Table A
INNER JOIN Employee_Skill_Table B ON B.Employee_Number =  A.Employee_Number
WHERE	Skill_Code LIKE 'Java';

-- 4 Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT A.*,COUNT(B.Department_Number) as 'Số nhân viên' FROM Department A
INNER JOIN  	Employee_Table B ON B.Department_Number = A.Department_Number
GROUP BY 	    Department_Number
HAVING			COUNT(B.Department_Number) >=2;

-- 5: Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban.   Hướng dẫn: sử dụng GROUP BY
SELECT A.*,Department_Name FROM Employee_Table A
RIGHT JOIN		Department B ON B.Department_Number = A.Department_Number;

-- 6 Viết lệnh để lấy ra danh sách nhân viên có > 1 skills.  Hướng dẫn: sử dụng DISTINCT
SELECT  DISTINCT A.*,COUNT(B.Employee_Number) AS 'Số skills'  FROM Employee_Table A
INNER JOIN Employee_Skill_Table B ON B.Employee_Number = A.Employee_Number
GROUP BY Employee_Number
HAVING COUNT(B.Employee_Number) >1











