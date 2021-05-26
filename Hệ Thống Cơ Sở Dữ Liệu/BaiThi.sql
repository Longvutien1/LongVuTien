DROP DATABASE IF EXISTS BaiThi;
CREATE DATABASE BaiThi;
USE BaiThi;
create table GiangVien (
	maGiangVien INT PRIMARY KEY,
	hoTen VARCHAR(50),
	luong VARCHAR(50)
);
insert into GiangVien (maGiangVien, hoTen, luong) values (1, 'Regina Gateman', '3987');
insert into GiangVien (maGiangVien, hoTen, luong) values (2, 'Rosamund Acuna', '5289');
insert into GiangVien (maGiangVien, hoTen, luong) values (3, 'Bob Birkinshaw', '42');
insert into GiangVien (maGiangVien, hoTen, luong) values (4, 'Saleem Idel', '5706');
insert into GiangVien (maGiangVien, hoTen, luong) values (5, 'Nathan Cormack', '5');
insert into GiangVien (maGiangVien, hoTen, luong) values (6, 'Alex Whitty', '1');
insert into GiangVien (maGiangVien, hoTen, luong) values (7, 'Boonie Pancast', '27267');
insert into GiangVien (maGiangVien, hoTen, luong) values (8, 'Chicky Kuschek', '503');
insert into GiangVien (maGiangVien, hoTen, luong) values (9, 'Amelie Blackesland', '351');
insert into GiangVien (maGiangVien, hoTen, luong) values (10, 'Kristyn Heggison', '9');


create table SinhVien (
	maSinhVien INT PRIMARY KEY,
	hoTen VARCHAR(50),
	namSinh DATE,
	queQuan VARCHAR(50)
);
insert into SinhVien (maSinhVien, hoTen, namSinh, queQuan) values (1, 'Leshia Dyshart', '2020-01-02', '71667 Summer Ridge Junction');
insert into SinhVien (maSinhVien, hoTen, namSinh, queQuan) values (2, 'Marysa Colt', '2021-04-22', '76516 Bayside Alley');
insert into SinhVien (maSinhVien, hoTen, namSinh, queQuan) values (3, 'Sampson Briereton', '2021-02-05', '06931 Merchant Avenue');
insert into SinhVien (maSinhVien, hoTen, namSinh, queQuan) values (4, 'Marietta Fines', '2020-08-25', '81 Morningstar Center');
insert into SinhVien (maSinhVien, hoTen, namSinh, queQuan) values (5, 'Shannon Oldacres', '2021-04-23', '2769 Hazelcrest Plaza');
insert into SinhVien (maSinhVien, hoTen, namSinh, queQuan) values (6, 'Ric Deniseau', '2021-02-11', '492 Luster Drive');
insert into SinhVien (maSinhVien, hoTen, namSinh, queQuan) values (7, 'Penni Millsom', '2020-02-04', '0223 American Ash Trail');
insert into SinhVien (maSinhVien, hoTen, namSinh, queQuan) values (8, 'Jeane Micallef', '2020-02-04', '6734 Artisan Plaza');
insert into SinhVien (maSinhVien, hoTen, namSinh, queQuan) values (9, 'Hayes Adamsson', '2020-02-04', '9 Westridge Court');
insert into SinhVien (maSinhVien, hoTen, namSinh, queQuan) values (10, 'Charlotte Hubball', '2021-06-05', '50 Towne Street');

create table DeTAi (
	maDeTai int PRIMARY KEY,
	tenDeTai VARCHAR(50),
	kinhPhi VARCHAR(50),
	noiThucTap VARCHAR(50)
);
insert into DeTAi (maDeTai, tenDeTai, kinhPhi, noiThucTap) values (1, 'Jodie Dobbinson', '$102.41', 'Cambridge');
insert into DeTAi (maDeTai, tenDeTai, kinhPhi, noiThucTap) values (2, 'Adrienne Erni', '$206.44', 'Anderson');
insert into DeTAi (maDeTai, tenDeTai, kinhPhi, noiThucTap) values (3, 'Candace Chippindale', '$3824.94', 'Pearson');
insert into DeTAi (maDeTai, tenDeTai, kinhPhi, noiThucTap) values (4, 'Emelyne Picker', '$4339.13', 'Rutledge');
insert into DeTAi (maDeTai, tenDeTai, kinhPhi, noiThucTap) values (5, 'Alex Dobrovolski', '$302.61', 'Oriole');
insert into DeTAi (maDeTai, tenDeTai, kinhPhi, noiThucTap) values (6, 'CONG NGHE ', '$5526.39', 'Walton');
insert into DeTAi (maDeTai, tenDeTai, kinhPhi, noiThucTap) values (7, 'Malynda Kirlin', '$2687.99', 'Montana');
insert into DeTAi (maDeTai, tenDeTai, kinhPhi, noiThucTap) values (8, 'CONG NGHE SINH HOC', '$3910.62', 'Cambridge');
insert into DeTAi (maDeTai, tenDeTai, kinhPhi, noiThucTap) values (9, 'Maighdiln Nelsey', '$1512.84', 'Dwight');
insert into DeTAi (maDeTai, tenDeTai, kinhPhi, noiThucTap) values (10, 'Cass Leyland', '$8715.15', 'Lindbergh');

create table HuongDan (
	id INT PRIMARY KEY,
	maSinhVien INT,
	maDeTai INT,
	maGiangVien INT  ,
    ketQua INT,
    FOREIGN KEY (maSinhVien) REFERENCES SinhVien(maSinhVien),
	FOREIGN KEY (maDeTai) REFERENCES DeTai(maDeTai),
	FOREIGN KEY (maGiangVien) REFERENCES GiangVien(maGiangVien)
    
);

INSERT INTO HuongDan(id,	maSinhVien,	maDeTai,	maGiangVien,	ketQua)
VALUES				(1,		1,			1,			4,			10),
					(2,		9,			2,			1,			8),
					(3,		2,			3,			2,			3),
					(4,		4,			8,			5,			7),
					(5,		1,			1,			7,			6),
					(6,		2,			8,			9,			7),
					(7,		7,			NULL,			8,			8),
					(8,		8,			3,			1,			8),
					(9,		6,			NULL,			2,			4),
					(10,	5,			9,			3,			5);


-- 2 A
SELECT B.*,maDeTai AS 'Đề tài' FROM HuongDan A
INNER JOIN SinhVien B ON B.maSinhVien = A.maSinhVien
WHERE maDeTai IS NULL;

-- 2. b) Lấy ra số sinh viên làm đề tài ‘CONG NGHE SINH HOC’
SELECT A.maDeTai,B.tenDeTai AS 'Đề tài',COUNT(maSinhVien) 'Số sinh viên' FROM HuongDan A
INNER JOIN DeTai B ON B.maDeTai = A.maDeTai
WHERE tenDeTai LIKE 'CONG NGHE SINH HOC'
GROUP BY A.maDeTai;

-- 3. Tạo view có tên là "SinhVienInfo" lấy các thông tin về học sinh bao gồm:mã số, họ tên và tên đề tài
-- (Nếu sinh viên chưa có đề tài thì column tên đề tài sẽ in ra "Chưa có")
DROP VIEW IF EXISTS SinhVienInfo;
CREATE VIEW SinhVienInfo AS
SELECT A.maSinhVien,A.hoTen ,
			CASE
				WHEN C.tenDeTai IS NOT NULL THEN C.tenDeTai 
                ELSE  'Chưa có'
			END AS 'Tên đề tài'			
	FROM  SinhVien  A
	LEFT JOIN HuongDan B ON B.maSinhVien = A.maSinhVien
	LEFT join DeTai C ON C.maDeTai = B.maDeTai
	GROUP BY A.maSinhVien
	ORDER BY A.maSinhVien;
    
SELECT * from  SinhVienInfo;
-- 4. Tạo trigger cho table SinhVien khi insert sinh viên có năm sinh <= 1900 thì hiện ra thông báo "năm sinh phải > 1900"

DROP TRIGGER IF EXISTS  checkSinhVien;
DELIMITER $$
CREATE TRIGGER checkSinhVien 
BEFORE INSERT ON SinhVien
FOR EACH ROW
	BEGIN
			DECLARE in_namSinh INT;
            SELECT YEAR(namSinh) into in_namSinh
            FROM  SinhVien
            WHERE NEW.namSinh = namSinh ;
            
			IF in_namSinh <= 1990 THEN
			SIGNAL SQLSTATE '45000'
			SET MESSAGE_TEXT = 'năm sinh phải > 1900';
        END IF;
			
    END$$
DELIMITER ;

insert into SinhVien (maSinhVien, hoTen, namSinh, queQuan) values (11, 'Leshia Dyshart', '2000-01-02', '71667 Summer Ridge Junction');			

-- 5. Hãy cấu hình table sao cho khi xóa 1 sinh viên nào đó thì sẽ tất cả thông tin trong table HuongDan liên quan tới sinh viên đó sẽ bị xóa đi

DROP TRIGGER IF EXISTS delete_SinhVien;
 DELIMITER $$
CREATE TRIGGER delete_SinhVien
BEFORE DELETE ON SinhVien
FOR EACH ROW
	BEGIN
				DELETE FROM   HuongDan 	 WHERE  maSinhVien = OLD.maSinhVien;
	END$$
DELIMITER ;

DELETE FROM SinhVien 
WHERE maSinhVien = 9;

SELECT * FROM SinhVien;
SELECT * FROM HuongDan;




