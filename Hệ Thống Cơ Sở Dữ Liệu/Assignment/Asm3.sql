USE Assignment1;

INSERT INTO	TraineeID(TraineeID	,Full_Name				,Birth_Date		,Gender	,ET_IQ	,ET_Gmath	,ET_English	,Training_Class	,Evaluation_Notes	,VTI_Account	)
VALUES				 (1			,'Vũ Tiến Long',		'2002-02-05'	,'male'	,10		,12			,10			,'VTI-ACADEMY'	,'Tốt'				,'long.vutien@vtiacademy.edu.vn'),
					 (2			,'Lê Trọng Đạt',		'2001-01-21'	,'male'	,12		,13			,11			,'VTI-ACADEMY'	,'Tốt'				,'dat.letrong@vtiacademy.edu.vn'),
					 (3			,'Vũ Minh Hiếu',		'2001-01-01'	,'male'	,19		,19			,19			,'VTI-ACADEMY'	,'Tốt'				,'hieu.vuminh@vtiacademy.edu.vn'),
					 (4			,'Pham Trọng Sang',		'1996-01-23'	,'male'	,12		,9			,9			,'VTI-ACADEMY'	,'Tốt'				,'sang.phamtrong@vtiacademy.edu.vn'),
				 	 (5			,'Nguyễn Khắc Thiệu',	'1998-01-02'	,'male'	,11		,8			,19			,'VTI-ACADEMY'	,'Tốt'				,'thieu.nguyenkhac@vtiacademy.edu.vn'),
				 	 (6			,'Bùi Minh Tuấn',		'1999-01-12'	,'male'	,3		,12			,18			,'VTI-ACADEMY'	,'Tốt'				,'tuan.vutien@vtiacademy.edu.vn'),
					 (7			,'Lê Đức Thọ',			'2000-03-24'	,'male'	,9		,18			,7			,'VTI-ACADEMY'	,'Tốt'				,'tho.vutien@vtiacademy.edu.vn'),
					 (8			,'Lê Duy Khánh',		'2001-01-26'	,'male'	,16		,19			,10			,'VTI-ACADEMY'	,'Tốt'				,'khanh.vutien@vtiacademy.edu.vn'),
					 (9			,'Nguyễn Vĩnh Ninh',	'1999-01-21'	,'male'	,10		,12			,11			,'VTI-ACADEMY'	,'Tốt'				,'ninh.vutien@vtiacademy.edu.vn'),
					 (10		,'Trần Quốc Toản',		'2001-01-31'	,'male'	,8		,4			,13			,'VTI-ACADEMY'	,'Tốt'				,'toan.vutien@vtiacademy.edu.vn');
                     
                     
-- SELECT
USE Assignment1;
-- Question 2: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào,  nhóm chúng thành các tháng sinh khác nhau
select *,COUNT(MONTH(Birth_Date)) AS 'Sô người có tháng sinh trùng nhau' from TraineeID
WHERE (ET_IQ + ET_Gmath) >= 20 AND ET_IQ >= 8 AND ET_Gmath >= 8 AND ET_English > 18
group by MONTH(Birth_Date);

-- Question 3: Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin sau: tên, tuổi, các thông tin cơ bản (như đã được định nghĩa trong table) 
select *,CHAR_LENGTH(Full_Name),	(2021-YEAR(Birth_Date))as 'Tuoi'	 from TraineeID
order by CHAR_LENGTH(Full_Name) desc;


/* Question 4: Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 1 ET thực tập sinh là 
những người đã vượt qua bài test đầu vào và thỏa mãn số điểm như sau:
 ET_IQ + ET_Gmath>=20
 ET_IQ>=8
 ET_Gmath>=8
 ET_English>=18 */

select  * from TraineeID
WHERE ET_IQ + ET_Gmath >=20 	AND ET_IQ >=8	 AND	ET_English >=10;

-- Question 5: xóa thực tập sinh có TraineeID = 3
DELETE from TraineeID
WHERE TraineeID = 3;

-- Question 6: Thực tập sinh có TraineeID = 5 được chuyển sang lớp "2". Hãy cập nhật thông tin vào database
UPDATE  TraineeID
SET		Training_Class = 2
WHERE	TraineeID = 2;