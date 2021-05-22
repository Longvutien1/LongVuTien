DROP DATABASE IF EXISTS Asm6;
CREATE DATABASE   Asm6;
USE Asm6;
-- bảng nhân viên
CREATE TABLE Employee(
	EmployeeID				INT UNSIGNED PRIMARY KEY,
    EmployeeLastName		NVARCHAR(100),
    EmployeeFirstName		NVARCHAR(100),
    EmployeeHireDate		DATETIME,						-- Ngày thuê nhân viên		
    EmployeeStatus			NVARCHAR(100),					-- tình trạng nhân viên		
    SupervisorID			INT UNSIGNED , 					-- id người giám sát nv
    SocialSecurityNumber	INT UNSIGNED UNIQUE KEY			-- SỐ CMND
);

-- bảng dự án
CREATE TABLE Project(
	ProjectID				INT UNSIGNED PRIMARY KEY,
	ManagerID				INT UNSIGNED UNIQUE KEY, 		-- Nguoi quan li
    ProjectName				NVARCHAR(200),
    ProjectStartDate		DATETIME,
    ProjectDescription		NVARCHAR(200),					-- mo tả dự án
    ProjectDetailt			NVARCHAR(200),					-- chi tiết dự án
    ProjectCompletedOn		DATETIME						-- ngày thực tế nhân viên hoàn thành
    
);
-- bảng mô đun dự án
CREATE TABLE Project_Modules(
	 ModuleID						INT UNSIGNED PRIMARY KEY,
     ProjectID						INT UNSIGNED,
     ProjectModulesDate 			DATETIME,                -- ngày nhân viên hoàn thành module (theo kế hoạch).
     ProjectModulesCompledOn   	  	DATETIME,               --  ngày thực tế nhân viên hoàn thành module.
     ProjectModulesDescription		NVARCHAR(255),			-- mô tả dự án module
     FOREIGN KEY (ProjectID) REFERENCES Project(ProjectID)
    
);

-- bảng công việc hoàn thành
CREATE TABLE Work_Done(
	WorkDoneID				INT UNSIGNED PRIMARY KEY,
    EmployeeID				INT UNSIGNED,
    ModuleID				INT UNSIGNED,
    WorkDoneDate 			DATETIME,					-- Ngày hoàn thành công việc
    WorkDoneDescription		NVARCHAR(100),		-- Mô tả Công việc Hoàn thành
    WorkDoneStatus	 		ENUM('0','1'),			-- Trạng thái Hoàn thành Công việc
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID),
    FOREIGN KEY (ModuleID) REFERENCES Project_Modules(ModuleID)
);



INSERT INTO Employee(EmployeeID,	EmployeeLastName, EmployeeFirstName,	EmployeeHireDate,	EmployeeStatus,	SupervisorID,	SocialSecurityNumber)
VALUES				(1,				'Vũ',			 'Tiến Long',			'2021-10-05',		'Tốt',			NULL,			001202021560),
					(2,				'Hà',			 'Viết Học',			'2021-01-05',		'Tốt',			2,				001202021561),
					(3,				'Vũ',			 'Văn Hưng',			'2021-02-12',		'Tốt',			1,				001202021562),
                    (4,				'Lưu',			 'Mạnh Cường',			'2021-01-05',		'Tốt',			NULL,			001202021563),
                    (5,				'Nguyễn',		 'Văn An',				'2021-01-05',		'Tốt',			NULL,				001202021564),
                    (6,				'Nguyễn',		 'Vĩnh Ninh',			'2021-01-05',		'Tốt',			2,				001202021565);
                    
INSERT INTO Project(ProjectID,	ManagerID, ProjectName,							ProjectStartDate,	ProjectDescription,									ProjectDetailt,										ProjectCompletedOn)
VALUES				(1,				1,		'Ứng dụng năng lượng sạch',			'2020-10-05',		'Tiết kiệm năng lượng-bảo vệ môi trường..',			'Ứng dụng nl sạch vào đời sông thực tiễn',			Null),
					(2,				2,		'Nhận diện khuôn mặt',				'2019-01-05',		'Nhân diện-kiểm soát-bảo vệ',						'Nhận diên khuôn mặt ',							    NULL),
					(3,				3,		'Thiết kế webside',					'2019-02-12',		'Thiết kế',											'Tạo ra 1 trang web',								'2021-02-01'),
					(4,				4,		'Thiết kế webside',					'2019-02-12',		'Thiết kế',											'Tạo ra 1 trang web',								'2021-03-01') ,     
					(5,				5,		'Thiết kế webside',					'2019-02-12',		'Thiết kế',											'Tạo ra 1 trang web',								'2021-01-01'),      
					(6,				6,		'Thiết kế webside',					'2019-02-12',		'Thiết kế',											'Tạo ra 1 trang web',								'2021-05-01');      

INSERT INTO Project_Modules(ModuleID,	ProjectID, 	ProjectModulesDate,	ProjectModulesCompledOn,	ProjectModulesDescription	)
VALUES				(1,					1,			'2021-01-05',		NULL,						'Tiết kiệm năng lượng-bảo vệ môi trường..'),
					(2,					1,			'2021-01-05',		'2021-03-05',						'Nhân diện-kiểm soát-bảo vệ'),
					(3,					2,			'2021-01-05',		'2021-05-05',						'Thiết kế'),
                    (4,					2,			'2021-01-05',		NULL,						'Thiết kế'),
                    (5,					2,			'2021-01-05',		'2021-03-05',						'Thiết kế'),
                    (6,					2,			'2021-01-05',		NULL,						'Thiết kế');   

INSERT INTO Work_Done(WorkDoneID,	EmployeeID, ModuleID,		WorkDoneDate,	WorkDoneDescription,			WorkDoneStatus	)
VALUES				(1,					3,			 2,			'2021-05-15',	'Ứng dụng năng lượng sạch',		'1'),
					(2,					1,			 1,			Null,			'Nhận diện khuôn mặt',			'0'),
					(3,					2,			 3,			'2021-04-15',	'Thiết kế webside',				'1'),
					(4,					1,			 4,			Null,			'Thiết kế webside',				'0'),
					(5,					1,			 5,			'2021-03-05',			'Ứng dụng phần mềm',	'1'),
					(6,					1,			 6,			Null,			'Giao diện',					'0');




