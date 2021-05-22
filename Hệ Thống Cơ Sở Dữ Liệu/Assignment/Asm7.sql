 USE Asm6;
 
 -- Exercise 1: Tiếp tục với Database ở buổi 6
-- Viết triggers để tránh trường hợp người dùng nhập thông tin module Project không hợp lệ 
-- (Project_Modules.ProjectModulesDate < Projects.ProjectStartDate,
-- Project_Modules.ProjectModulesCompletedOn > Projects.ProjectCompletedOn)

DROP TRIGGER IF EXISTS invalid_import;
DELIMITER $$
CREATE TRIGGER invalid_import
BEFORE INSERT ON project_modules
FOR EACH ROW
	BEGIN
		DECLARE  in_projectStartDate DATE;
        DECLARE in_projectCompletedOn DATE;
        
        SELECT ProjectStartDate , ProjectCompletedOn  INTO in_projectStartDate,in_projectCompletedOn
        FROM project 
        WHERE ProjectID IN (SELECT	ProjectID FROM project_modules WHERE  ProjectID = NEW.ProjectID);
        
        IF	NEW.ProjectModulesDate < in_projectStartDate THEN
			SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'ProjectModulesDate không hợp lệ ';
		END IF;
		IF	NEW.ProjectModulesCompledOn > in_projectCompletedOn THEN
			SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'ProjectModulesCompledOn hợp lệ ';
		END IF;
        
    END $$
 DELIMITER ;
 
INSERT INTO Project_Modules(ModuleID,	ProjectID, 	ProjectModulesDate,	ProjectModulesCompledOn,	ProjectModulesDescription	)
VALUES				(14,					4,			'2023-01-02',		'2019-01-02',						'Tiết kiệm năng lượng-bảo vệ môi g..');

SELECT * FROM project_modules;


USE assignment1;
-- Exercise 2: View
 -- Trong database phần Assignment 3, Tạo 1 VIEW để lấy ra tất cả các thực tập sinh là 
-- ET, 1 ET thực tập sinh là những người đã vượt qua bài test đầu vào và thỏa mãn số điểm như sau:
--  ET_IQ + ET_Gmath>=20
--  ET_IQ>=8
--  ET_Gmath>=8
--  ET_English>=18
DROP VIEW IF EXISTS Trainee_pass_the_test;
CREATE VIEW Trainee_pass_the_test AS
SELECT *
 FROM Traineeid
 WHERE ET_IQ + ET_Gmath > 18 AND ET_IQ >8 AND 	ET_Gmath >=8 AND ET_English>=18
 
 
 
 
 
 
