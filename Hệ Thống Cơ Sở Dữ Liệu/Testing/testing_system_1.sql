	drop database if exists testing_system_1;
	create database testing_system_1;
	use testing_system_1;

	-- tạo bảng phòng ban--
	CREATE TABLE Department (
		DepartmentID 	TINYINT UNSIGNED PRIMARY KEY,
		DepartmentName 	VARCHAR(40) CHECK(LENGTH(DepartmentName) >= 3)
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
		Username  		VARCHAR(30) 		UNIQUE KEY 	CHECK(LENGTH(Username) >= 5),
		FullName 		VARCHAR(30) 					CHECK(LENGTH(Fullname) >= 5),
		DepartmentID 	TINYINT UNSIGNED,
		PositionID 		TINYINT UNSIGNED,
		CreateDate 		DATE,
		
		-- THÊM KHÓA PHỤ PHÒNG BAN VÀ CHỨC VỤ --
		FOREIGN KEY (DepartmentID) 	REFERENCES Department(DepartmentID),
		FOREIGN KEY (PositionID) 	REFERENCES Position1(PositionID)
		
	);

	-- tạo bảng nhóm
	create table Group1 (
		GroupID		TINYINT UNSIGNED 	PRIMARY KEY,
		GroupName	VARCHAR(30) 		UNIQUE KEY ,
		CreatorID	TINYINT UNSIGNED 	UNIQUE KEY ,
		CreateDate	DATE,
		
		 FOREIGN KEY (CreatorID) REFERENCES Account1(AccountID)
	);

	-- tạo bảng GroupAccount
	create table GroupAccount(
		GroupID 	TINYINT UNSIGNED,
		AccountID 	TINYINT UNSIGNED,
		JoinDate 	DATE ,
		-- TẠO KHÓA PHỤ NHÓM VÀ Account
		FOREIGN KEY (GroupID) REFERENCES Group1(GroupID),
		FOREIGN KEY (AccountID) REFERENCES Account1(AccountID)
	);

	-- tạo bảng loại câu hỏi
	create table TypeQuestion(
		TypeID 		TINYINT UNSIGNED 	PRIMARY KEY,
		TypeName 	ENUM('Essay','Multiple-Choice')
		
	);
	-- tạo bảng chủ đề câu hỏi
	create table CategoryQuestion(
		CategoryID 		TINYINT UNSIGNED 	PRIMARY KEY,
		CategoryName 	VARCHAR(30) 		UNIQUE KEY 
	   
	);
	-- tạo bảng câu hỏi
	create table Question(
		QuestionID 	TINYINT UNSIGNED 		PRIMARY KEY,
		Content	 	VARCHAR(400) 			UNIQUE KEY,
		CategoryID 	TINYINT UNSIGNED,
		TypeID 		TINYINT UNSIGNED,
		CreatorID	TINYINT UNSIGNED 	 UNIQUE KEY,
		CreateDate 	DATE,
		
		-- TẠO KHÓA PHỤ CategoryID VÀ TypeID
		FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
		FOREIGN KEY (TypeID) REFERENCES TypeQuestion(TypeID),
		FOREIGN KEY (CreatorID) REFERENCES Account1(AccountID)
	   
	);

	-- tạo bảng câu trả lời
	create table Answer(
		AnswerID 	TINYINT UNSIGNED 	PRIMARY KEY,
		Content 	VARCHAR(30) 		,
	   QuestionID 	TINYINT UNSIGNED 	,
	   isCorrect 	ENUM('TRUE','FALSE'),
	   
	  -- TẠO KHÓA PHỤ QuestionID
	  FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
	);

	-- tạo bảng đề thi
	create table Exam(
		ExamID 			TINYINT UNSIGNED 	PRIMARY KEY,
		code1 			VARCHAR(30)			UNIQUE KEY NOT NULL,
		Title 			VARCHAR(30)			  NOT NULL,
		CategoryID  	TINYINT UNSIGNED,
		Duration 		INT,
		 CreatorID	TINYINT UNSIGNED UNIQUE KEY,
		CreateDate 		DATE	NOT NULL,
	  -- TẠO KHÓA PHỤ CategoryID
		FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
		FOREIGN KEY (CreatorID) REFERENCES Account1(AccountID)
	);

	-- tạo bảng câu hỏi thi
	create table ExamQuestion(
		ExamID 		TINYINT UNSIGNED,
	   QuestionID 	TINYINT UNSIGNED,
	   
	   -- TẠO KHÓA PHỤ CategoryID
		FOREIGN KEY (ExamID) REFERENCES Exam(ExamID),
		FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
	);

