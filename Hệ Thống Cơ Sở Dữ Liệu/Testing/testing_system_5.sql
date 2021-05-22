

-- 1 Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
USE testing_system_1;
DROP VIEW IF EXISTS view_list_account;
CREATE VIEW	view_list_account AS
	SELECT A.AccountID,A.Email,A.Username,A.FullName, B.DepartmentName
	FROM account1 A
	INNER JOIN department B ON B.DepartmentID = A.DepartmentID
    WHERE A.DepartmentID IN (SELECT DepartmentID FROM department WHERE DepartmentName LIKE 'Sale');

select * from view_list_account;

--  2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
DROP VIEW IF EXISTS view_accountInGroup;
CREATE VIEW view_accountInGroup AS
	SELECT A.AccountID,B.FullName,	B.Username,	B.Email	,COUNT(A.GroupID) AS 'Số group tham gia' 
	FROM groupaccount A
	INNER JOIN account1 B ON B.AccountID = A.AccountID
	GROUP BY A.AccountID 
	HAVING  COUNT(A.GroupID) = (SELECT COUNT(GroupID) FROM groupaccount GROUP BY AccountID ORDER BY AccountID DESC LIMIT 1);
 
SELECT * FROM view_accountInGroup;

-- 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ  được coi là quá dài) và xóa nó đi
INSERT INTO question VALUES(11,'Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ 
 được coi là quá dài) và xóa nó đi',2,3,1,NOW());
 
CREATE VIEW view_contentLong AS
	SELECT *,CHAR_LENGTH(Content) AS 'Số kí tự của content' FROM question
	WHERE CHAR_LENGTH(content) >100;
	SELECT * FROM view_contentLong;

DROP VIEW IF EXISTS view_contentLong;

-- 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
CREATE VIEW	view_multilpeEmployee_department AS
	SELECT DISTINCT A.*,	COUNT(B.DepartmentID) AS So_Nhan_Vien FROM department A
	INNER JOIN account1 B ON B.DepartmentID = A.DepartmentID
	GROUP BY DepartmentID
	HAVING COUNT(B.DepartmentID) = (SELECT COUNT(DepartmentID) FROM account1 GROUP BY DepartmentID ORDER BY COUNT(DepartmentID) DESC LIMIT 1);
    
SELECT * FROM view_multilpeEmployee_department;

-- 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
DROP VIEW IF EXISTS view_questionUser;
CREATE VIEW view_questionUser AS
SELECT A.*, B.FullName FROM question A
LEFT JOIN account1 B ON B.AccountID = A.AccountID
WHERE A.AccountID  IN (SELECT AccountID FROM account1 WHERE FullName LIKE 'Nguyễn%');

SELECT * FROM view_questionUser;