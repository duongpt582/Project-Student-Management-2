-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1:3306
-- Thời gian đã tạo: Th2 01, 2023 lúc 08:31 AM
-- Phiên bản máy phục vụ: 10.4.24-MariaDB
-- Phiên bản PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `student_management`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ctdt`
--

CREATE TABLE `ctdt` (
  `nganhHoc` char(20) NOT NULL,
  `maNganh` char(10) NOT NULL,
  `tongSoTC` int(3) NOT NULL,
  `tongSoMon` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `ctdt`
--

INSERT INTO `ctdt` (`nganhHoc`, `maNganh`, `tongSoTC`, `tongSoMon`) VALUES
('Công nghệ thông tin', 'IT', 18, 5),
('Kỹ thuật Cơ điện tử', 'ME', 17, 5),
('Quản trị kinh doanh', 'EM', 14, 5);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dsdk`
--

CREATE TABLE `dsdk` (
  `maSV` char(10) NOT NULL,
  `maMonHoc` char(10) NOT NULL,
  `hocKy` char(8) DEFAULT NULL,
  `diemGK` double DEFAULT NULL,
  `diemCK` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `dsdk`
--

INSERT INTO `dsdk` (`maSV`, `maMonHoc`, `hocKy`, `diemGK`, `diemCK`) VALUES
('20206869', 'IT3010', '20201', 6.5, 7.5),
('20206869', 'IT3070', '20201', 6.5, 7.5),
('20206869', 'IT3080', '20201', 6.5, 7.5),
('20206869', 'IT3090', '20201', 6.5, 7.5),
('20206869', 'IT3100', '20201', 6.5, 7.5),
('20207592', 'EM1121', '20202', 5, 6),
('20207592', 'EM1131', '20202', 7, 8),
('20207592', 'IT3010', '20191', 8, 6.5),
('20207592', 'IT3070', '20191', 7, 8),
('20207592', 'IT3080', '20191', 9, 5),
('20207592', 'IT3090', '20192', 8.5, 7.5),
('20207592', 'IT3100', '20192', 6, 5.5),
('20207595', 'EM1111', '20202', 9, 9),
('20207595', 'EM1121', '2023.1', 8, 8.8),
('20207595', 'EM1131', '2020.2', 8.6, 8.8),
('20207595', 'EM1141', '20202', 9, 10),
('20207595', 'EM2040', '20202', 8.9, 8.8),
('20207595', 'IT3070', '20191', 8, 9),
('20207595', 'IT3090', '20192', 8.8, 8.6),
('20207595', 'ME3010', '20191', 7.5, 8.5),
('20207595', 'ME3020', '20191', 9, 7),
('20207595', 'ME3030', '20191', 9.5, 8),
('20207595', 'ME3040', '20192', 7, 6),
('20207595', 'ME3050', '20192', 8, 6.5),
('20207642', 'EM1111', '20201', 8, 2),
('20207642', 'EM1121', '20201', 8, 3),
('20207642', 'EM1131', '20201', 8, 4),
('20207642', 'EM1141', '20201', 8, 5),
('20207642', 'EM2040', '20201', 8, 6);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dssv`
--

CREATE TABLE `dssv` (
  `loaiSV` char(5) DEFAULT NULL,
  `hoTen` char(30) NOT NULL,
  `maSV` char(10) NOT NULL,
  `gioiTinh` char(3) DEFAULT NULL,
  `ngaySinh` date DEFAULT NULL,
  `Email` char(30) NOT NULL,
  `khoaHoc` int(4) NOT NULL,
  `nganhHoc` char(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `dssv`
--

INSERT INTO `dssv` (`loaiSV`, `hoTen`, `maSV`, `gioiTinh`, `ngaySinh`, `Email`, `khoaHoc`, `nganhHoc`) VALUES
('TC', 'Pham Van A', '20206868', 'Nam', '2023-01-05', 'abcd@gmail.com', 65, 'Công nghệ thông tin'),
('CTM', 'Pham Van B', '20206869', 'Nam', '2023-01-05', 'abcd@gmail.com', 65, 'Công nghệ thông tin'),
('TC', 'Nguyễn Minh Đức', '20207592', 'Nam', '2023-01-03', 'ducnm@gmail.com', 65, 'Công nghệ thông tin'),
('TC', 'Phạm Thái Dương', '20207595', 'Nam', '2023-01-07', 'duongpt@gmail.com', 64, 'Kỹ thuật Cơ điện tử'),
('CTM', 'Đỗ Văn Hải', '20207642', 'Nữ', '2023-01-28', 'haidv@gmail.com', 63, 'Quản trị kinh doanh'),
('CTM', 'Pham Van C', '20208888', 'Nam', '2023-02-03', 'abcd', 66, 'Công nghệ thông tin'),
('TC', 'Le linh', '233333', 'Nữ', '2004-02-02', 'linh@gmail.com', 66, 'Công nghệ thông tin'),
('TC', 'h', 'h', 'Nam', '0009-09-09', '9', 9, 'Công nghệ thông tin');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `monhoc`
--

CREATE TABLE `monhoc` (
  `nganhHoc` char(20) NOT NULL,
  `tenMonHoc` char(30) NOT NULL,
  `maMonHoc` char(10) NOT NULL,
  `trongSo` double DEFAULT NULL,
  `soTinChi` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `monhoc`
--

INSERT INTO `monhoc` (`nganhHoc`, `tenMonHoc`, `maMonHoc`, `trongSo`, `soTinChi`) VALUES
('Quản trị kinh doanh', 'Quản trị kinh doanh', 'EM1111', 0.5, 3),
('Quản trị kinh doanh', 'Quản trị chiến lược', 'EM1121', 0.3, 3),
('Quản trị kinh doanh', 'Đạo đức kinh doanh', 'EM1131', 0.4, 2),
('Quản trị kinh doanh', 'Quản trị quá trình kinh doanh', 'EM1141', 0.4, 3),
('Quản trị kinh doanh', 'Quản trị đa văn hóa', 'EM2040', 0.3, 3),
('Công nghệ thông tin', 'Cấu trúc dữ liệu và giải thuật', 'IT3010', 0.4, 4),
('Công nghệ thông tin', 'Hệ điều hành', 'IT3070', 0.5, 3),
('Công nghệ thông tin', 'Mạng máy tính', 'IT3080', 0.3, 4),
('Công nghệ thông tin', 'Cơ sở dữ liệu', 'IT3090', 0.4, 4),
('Công nghệ thông tin', 'Lập trình hướng đối tượng', 'IT3100', 0.5, 3),
('Kỹ thuật Cơ điện tử', 'Sức bền vật liệu', 'ME3010', 0.4, 4),
('Kỹ thuật Cơ điện tử', 'Cơ sở thiết kế máy', 'ME3020', 0.5, 3),
('Kỹ thuật Cơ điện tử', 'Nguyên lý kỹ thuật điện tử', 'ME3030', 0.3, 3),
('Kỹ thuật Cơ điện tử', 'Linh kiện bán dẫn và vi mạch', 'ME3040', 0.4, 3),
('Kỹ thuật Cơ điện tử', 'Kỹ thuật đo lường và cảm biến', 'ME3050', 0.4, 4);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `ctdt`
--
ALTER TABLE `ctdt`
  ADD PRIMARY KEY (`nganhHoc`);

--
-- Chỉ mục cho bảng `dsdk`
--
ALTER TABLE `dsdk`
  ADD PRIMARY KEY (`maSV`,`maMonHoc`),
  ADD KEY `maMonHoc` (`maMonHoc`);

--
-- Chỉ mục cho bảng `dssv`
--
ALTER TABLE `dssv`
  ADD PRIMARY KEY (`maSV`),
  ADD KEY `fk` (`nganhHoc`);

--
-- Chỉ mục cho bảng `monhoc`
--
ALTER TABLE `monhoc`
  ADD PRIMARY KEY (`maMonHoc`),
  ADD KEY `nganhHoc` (`nganhHoc`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `dsdk`
--
ALTER TABLE `dsdk`
  ADD CONSTRAINT `dsdk_ibfk_1` FOREIGN KEY (`maSV`) REFERENCES `dssv` (`maSV`),
  ADD CONSTRAINT `dsdk_ibfk_2` FOREIGN KEY (`maMonHoc`) REFERENCES `monhoc` (`maMonHoc`);

--
-- Các ràng buộc cho bảng `dssv`
--
ALTER TABLE `dssv`
  ADD CONSTRAINT `fk` FOREIGN KEY (`nganhHoc`) REFERENCES `ctdt` (`nganhHoc`);

--
-- Các ràng buộc cho bảng `monhoc`
--
ALTER TABLE `monhoc`
  ADD CONSTRAINT `monhoc_ibfk_1` FOREIGN KEY (`nganhHoc`) REFERENCES `ctdt` (`nganhHoc`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
