USE adventureworks;
--  1: Viết 1 query lấy thông tin "Name" từ bảng Production.Product có name của ProductSubcategory là 'Saddles'.	
SELECT
	 A.ProductID,
	 A.`Name`,
	 B.ProductSubcategoryID,	
	 B.`Name` 
 FROM Product A
INNER JOIN ProductSubcategory B ON B.ProductSubcategoryID = A.ProductSubcategoryID
WHERE A.ProductSubcategoryID  = (SELECT ProductSubcategoryID FROM ProductSubcategory WHERE `Name` LIKE 'Saddles');
 
 SELECT * FROM	ProductSubcategory;

-- 2 Thay đổi câu Query 1 để lấy được kết quả sau. In this exercise you can change the previous query to deliver the following result set. 
SELECT
 A.ProductID,A.`Name`,B.ProductSubcategoryID,	B.`Name` FROM Product A
INNER JOIN ProductSubcategory B ON B.ProductSubcategoryID = A.ProductSubcategoryID
WHERE A.ProductSubcategoryID = ANY (SELECT ProductSubcategoryID FROM ProductSubcategory WHERE `Name` LIKE 'Bo%');

-- 3 Viết câu query trả về tất cả các sản phẩm có giá rẻ nhất (lowest ListPrice) và Touring Bike (nghĩa là ProductSubcategoryID = 3);
SELECT
	A.ProductID,	A.`Name`,	A.ProductNumber,	A.Color,	A.ListPrice,	A.Size,	A.ProductSubcategoryID,	B.`Name`	FROM product A
    INNER JOIN ProductSubcategory B ON B.ProductSubcategoryID = A.ProductSubcategoryID 
	WHERE	A.ProductSubcategoryID	IN ( SELECT ProductSubcategoryID FROM ProductSubcategory WHERE ProductSubcategoryID = 3) 
			AND A.ListPrice 		IN( SELECT MIN(A.ListPrice) FROM product A
										INNER JOIN ProductSubcategory B ON B.ProductSubcategoryID = A.ProductSubcategoryID 
										WHERE	A.ProductSubcategoryID	IN ( SELECT ProductSubcategoryID FROM ProductSubcategory WHERE ProductSubcategoryID = 3) 										
										ORDER BY	A.ListPrice ASC)
	ORDER BY	A.ListPrice ASC;

-- Bài 2
-- 1: Viết query lấy danh sách tên country và province được lưu trong AdventureWorks2008sample database. 
	SELECT B.StateProvinceID,A.`Name`,B.`Name` FROM countryregion A
    INNER JOIN	stateprovince B ON B.CountryRegionCode = A.CountryRegionCode;
    
    
-- 2 2: Tiếp tục với câu query trước và thêm điều kiện là chỉ lấy country Germany và Canada 

SELECT B.StateProvinceID,A.`Name`,B.`Name` FROM countryregion A
INNER JOIN stateprovince	B ON B.CountryRegionCode = A.CountryRegionCode
WHERE A.`Name` LIKE 'Germany' OR A.`Name` LIKE 'Canada';

-- 3 SalesOrderID, OrderDate and SalesPersonID. Từ bảng SalesPerson, chúng ta lấy cột 
-- BusinessEntityID (là định danh của người sales), Bonus and the SalesYTD (là đã sale 
-- được bao nhiêu người trong năm nay)

SELECT * FROM Salesperson;
DROP VIEW IF EXISTS	Salesorderheader_Salesperson;
CREATE VIEW Salesorderheader_Salesperson AS
SELECT 
	SalesorderID,
	OrderDate,
	A.SalesPersonID,
    B.Bonus,
    B.SalesYTD
    
 FROM Salesorderheader A
 INNER JOIN Salesperson B ON B.SalesPersonID = A.SalesPersonID;
 
 
 -- 4 Sử dụng câu query, thêm cột JobTitle and xóa cột SalesPersonID và BusinessEntityID
SELECT * FROM Salesperson;
SELECT * FROM Salesorderheader;

SELECT 
	A.SalesorderID,
	A.OrderDate,
	C.Title AS Jobtitle,
    B.Bonus,
    B.SalesYTD
 FROM Salesorderheader A
 INNER JOIN Salesperson B ON B.SalesPersonID = A.SalesPersonID
 LEFT JOIN Employee C	  ON C.EmployeeID = B.SalesPersonID;




SELECT * FROM Salesperson;
ALTER TABLE Salesperson
ADD COLUMN Jobtitle VARCHAR(255);

UPDATE Salesperson
SET Jobtitle = 'DEV'
WHERE Jobtitle IS NULL


