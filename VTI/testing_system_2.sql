drop database if exists testing_system_2;
create database testing_system_2;
use testing_system_2;

-- tạo bảng phòng ban--
CREATE TABLE Department (
	DepartmentID TINYINT UNSIGNED PRIMARY KEY,
    DepartmentName VARCHAR(40) CHECK(LENGTH(DepartmentName) >= 7)
);
-- tạo bảng chức vụ
create table Position1 (
	PositionID 		TINYINT UNSIGNED PRIMARY KEY,
    PositionName 	VARCHAR(30) UNIQUE KEY CHECK(LENGTH(PositionName) >= 2)
    
);
-- tạo bảng user
create table Account1 (
	AccountID 		TINYINT UNSIGNED 	PRIMARY KEY,
    Email 			VARCHAR(50)			UNIQUE KEY,
    Username  		VARCHAR(30) 		UNIQUE KEY 	CHECK(LENGTH(Username) >= 6),
    FullName 		VARCHAR(30) 					CHECK(LENGTH(Fullname) >= 5),
    DepartmentID 	TINYINT UNSIGNED,
    PositionID 		TINYINT UNSIGNED,
    CreateDate 		DATETIME,
    
    -- THÊM KHÓA PHỤ PHÒNG BAN VÀ CHỨC VỤ --
    FOREIGN KEY (DepartmentID) 	REFERENCES Department(DepartmentID),
	FOREIGN KEY (PositionID) 	REFERENCES Position1(PositionID)
    
);

-- tạo bảng nhóm
create table Group1 (
	GroupID		TINYINT UNSIGNED 	PRIMARY KEY,
    GroupName	VARCHAR(30) 		UNIQUE KEY ,
    CreatorID	TINYINT UNSIGNED 	UNIQUE KEY,
    CreateDate	date

);

-- tạo bảng GroupAccount
create table GroupAccount(
	GroupID 	TINYINT UNSIGNED,
    AccountID 	TINYINT UNSIGNED,
    JoinDate 	date ,
    -- TẠO KHÓA PHỤ NHÓM VÀ Account
    FOREIGN KEY (GroupID) REFERENCES Group1(GroupID),
    FOREIGN KEY (AccountID) REFERENCES Account1(AccountID)
);

-- tạo bảng loại câu hỏi
create table TypeQuestion(
	TypeID TINYINT UNSIGNED 	PRIMARY KEY,
    TypeName VARCHAR(30) 		UNIQUE KEY 
    
);
-- tạo bảng chủ đề câu hỏi
create table CategoryQuestion(
	CategoryID 		TINYINT UNSIGNED 	PRIMARY KEY,
    CategoryName 	VARCHAR(30) 		UNIQUE KEY 
   
);
-- tạo bảng câu hỏi
create table Question(
	QuestionID 	TINYINT UNSIGNED 		PRIMARY KEY,
	Content	 	VARCHAR(30) 			UNIQUE KEY,
	CategoryID 	TINYINT UNSIGNED,
	TypeID 		TINYINT UNSIGNED,
	CreatorID 	TINYINT UNSIGNED,
	CreateDate 	date,
    
    -- TẠO KHÓA PHỤ CategoryID VÀ TypeID
    FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
	FOREIGN KEY (TypeID) REFERENCES TypeQuestion(TypeID)
   
);

-- tạo bảng câu trả lời
create table Answer(
	AnswerID TINYINT UNSIGNED 	PRIMARY KEY,
    Content VARCHAR(30) 		UNIQUE KEY,
   QuestionID TINYINT UNSIGNED 	,
   isCorrect ENUM('YES','NO'),
   
  -- TẠO KHÓA PHỤ QuestionID
  FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

-- tạo bảng đề thi
create table Exam(
	ExamID 		TINYINT UNSIGNED 	PRIMARY KEY,
    code1 		VARCHAR(30)			UNIQUE KEY NOT NULL,
   Title 		VARCHAR(30)			UNIQUE KEY NOT NULL,
  CategoryID  TINYINT UNSIGNED,
  Duration 		DATETIME,
  CreatorID		TINYINT UNSIGNED,
  CreateDate 	date				NOT NULL,
  -- TẠO KHÓA PHỤ CategoryID
	FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID)

);

-- tạo bảng câu hỏi thi
create table ExamQuestion(
	ExamID 		TINYINT UNSIGNED,
   QuestionID TINYINT UNSIGNED,
   
   -- TẠO KHÓA PHỤ CategoryID
   FOREIGN KEY (ExamID) REFERENCES Exam(ExamID),
    FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

