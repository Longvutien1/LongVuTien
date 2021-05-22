USE Asm6;

-- b
DROP PROCEDURE IF EXISTS remove_information_completed_after_3_months;
DELIMITER $$
CREATE PROCEDURE remove_information_completed_after_3_months()
BEGIN
	DECLARE remove_project INT;
    DECLARE remove_project_modules INT;
    DECLARE remove_work_done INT;
    -- gán số lượng bản ghi  bảng Project cho remove_project
			SELECT COUNT(*) AS 'Số lượng bản ghi cần xóa'  INTO remove_project
			FROM Project
			WHERE ProjectCompletedOn < SYSDATE() - INTERVAL 3 MONTH	;
        
     --    gán số lượng bản ghi  bảng Project_Modules cho remove_project_modules
			 SELECT COUNT(*) AS 'Số lượng bản ghi cần xóa' INTO remove_project_modules
			 FROM Project_Modules A
			 INNER JOIN Project B ON B.ProjectID = A.ProjectID
			 WHERE	B.ProjectCompletedOn < SYSDATE() - INTERVAL 3 MONTH;
         
     --    gán số lượng bản ghi  bảng Work_Done cho remove_work_done  
			 SELECT COUNT(*) AS 'Số lượng bản ghi cần xóa'  INTO remove_work_done
			 FROM Work_Done A
			 INNER JOIN Project_Modules B ON B.ModuleID = A.ModuleID
			 WHERE A.ModuleID 	IN (SELECT C.ModuleID FROM Project_Modules C 
								 INNER JOIN Project D ON D.ProjectID = C.ProjectID
								 WHERE	D.ProjectCompletedOn < SYSDATE() - INTERVAL 3 MONTH);  
-- delete table work_done
		DELETE  FROM Work_Done  
		WHERE ModuleID IN 	(SELECT A.ModuleID FROM Project_Modules A
										INNER JOIN Project_Modules B ON B.ModuleID = A.ModuleID
										WHERE A.ModuleID 	IN (SELECT C.ModuleID FROM Project_Modules C 
																INNER JOIN Project D ON D.ProjectID = C.ProjectID
																WHERE	D.ProjectCompletedOn < SYSDATE() - INTERVAL 3 MONTH));
-- delete table Project_Modules
		DELETE FROM Project_Modules 
		WHERE ProjectID IN (SELECT ProjectID FROM Project
							WHERE ProjectCompletedOn < SYSDATE() - INTERVAL 3 MONTH);
-- delete table Project
		DELETE   FROM Project
		WHERE ProjectCompletedOn < SYSDATE() - INTERVAL 3 MONTH ;
        
	 -- In kết quả số lượng bản ghi được xóa.
			SELECT 'Số lượng bản ghi bị xóa trong work_done', remove_work_done
            UNION
			SELECT 'Số lượng bản ghi bị xóa trong Project_Modules', remove_project_modules
            UNION
			SELECT 'Số lượng bản ghi bị xóa trong Project', remove_project;
END$$
DELIMITER ;            
CALL remove_information_completed_after_3_months();
SELECT * FROM project;
 
                    
 -- c Viết stored procedure (có parameter) để in ra các module đang được thực hiện)
 DROP PROCEDURE IF EXISTS module_in_action;
 DELIMITER $$
 CREATE PROCEDURE module_in_action(IN in_projectID INT)
 BEGIN
			SELECT * FROM Project_Modules A
			INNER JOIN Work_Done B ON B.ModuleID = A.ModuleID
			WHERE B.WorkDoneStatus = '0' AND A.ProjectID = in_projectID;
 END$$
DELIMITER ;
CALL module_in_action(1);


-- d: Viết hàm (có parameter) trả về thông tin 1 nhân viên đã tham gia làm mặc 
--    dù không ai giao việc cho nhân viên đó (trong bảng Works)
DROP FUNCTION IF EXISTS employee_works_noOne_delivering;
DELIMITER $$ 
CREATE FUNCTION	employee_works_noOne_delivering() RETURNS INT
READS SQL DATA
DETERMINISTIC
BEGIN
	DECLARE thongTinNhanVien INT;
		SELECT  A.EmployeeID  INTO thongTinNhanVien 
        FROM Employee A
		LEFT JOIN Work_Done B ON B.EmployeeID = A.EmployeeID
		WHERE A.EmployeeID NOT IN (SELECT EmployeeID FROM Work_Done) AND SupervisorID IS NULL
        GROUP BY EmployeeID
        LIMIT 1;
		RETURN thongTinNhanVien;
 END $$
 DELIMITER ;
  SELECT employee_works_noOne_delivering();
 SELECT * FROM Employee
 WHERE EmployeeID = employee_works_noOne_delivering()