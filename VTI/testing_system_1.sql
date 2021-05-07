drop database if exists Testing_System_1;
create database Testing_System_1;
use Testing_System_1;

create table Department(
	DepartmentID int ,
    DepartmentName nvarchar(50)
    
);

create table Position (
	PositionID int,
    PositionName nvarchar(30)
    
);

create table Account1 (
	AccountID int,
    Email nvarchar(50),
    Username  nvarchar(30),
    FullName nvarchar(50),
    DepartmentID int,
    PositionID int,
    CreateDate date
    
);

create table Group1 (
	GroupID		int,
    GroupName	nvarchar(30),
    CreatorID	int,
    CreateDate	date
);

create table GroupAccount(
	GroupID int,
    AccountID int,
    JoinDate date
);

create table TypeQuestion(
	TypeID int,
    TypeName nvarchar(30)
   
);

create table CategoryQuestion(
	CategoryID int,
    CategoryName nvarchar(30)
   
);

create table Question(
	QuestionID int,
    Content nvarchar(30),
   CategoryID int,
   TypeID int,
   CreatorID int,
   CreateDate date
);

create table Answer(
	AnswerID int,
    Content nvarchar(30),
   QuestionID int,
   isCorrect int
  
);

create table Exam(
	ExamID int,
    Code nvarchar(30),
   CategoryID int,
   isCorrect int,
  Duration date,
  CreatorID	int,
  CreateDate date
);

create table ExamQuestion(
	ExamID int,
    Code nvarchar(30),
   QuestionID int
);

