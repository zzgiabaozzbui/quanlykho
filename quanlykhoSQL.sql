-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 17, 2022 at 10:10 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlykho`
--

-- --------------------------------------------------------

--
-- Table structure for table `chitietnhap`
--

CREATE TABLE `chitietnhap` (
  `maCTNhap` int(11) NOT NULL,
  `maNhap` int(11) NOT NULL,
  `maSanPham` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `soLuong` int(11) NOT NULL DEFAULT 1,
  `giaNhap` float NOT NULL
) ;

-- --------------------------------------------------------

--
-- Table structure for table `chitietxuat`
--

CREATE TABLE `chitietxuat` (
  `maCTXuat` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `maXuat` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `maSanPham` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `thoiGian` date DEFAULT current_timestamp(),
  `soLuong` int(11) DEFAULT 1,
  `thanhTien` decimal(18,4) DEFAULT NULL
) ;

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `maKh` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `tenKH` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `diaChi` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sdt` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cmnd` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL
) ;

-- --------------------------------------------------------

--
-- Table structure for table `kho`
--

CREATE TABLE `kho` (
  `maKho` int(11) NOT NULL,
  `tenKho` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `kho`
--

INSERT INTO `kho` (`maKho`, `tenKho`) VALUES
(1, 'f');

-- --------------------------------------------------------

--
-- Table structure for table `nhacungcap`
--

CREATE TABLE `nhacungcap` (
  `maNCC` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `tenNCC` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `diaChi` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sdtNCC` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL
) ;

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `maNV` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `tennv` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `diachi` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sdt` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cmnd` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `chucvu` int(11) DEFAULT NULL,
  `maKho` int(11) DEFAULT NULL
) ;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`maNV`, `tennv`, `email`, `diachi`, `sdt`, `cmnd`, `chucvu`, `maKho`) VALUES
('NV01', 'Nguyễn Quang Bảo', 'zzgiabaozz@gmail.com', 'Nam Định', '0399645778', '121535568235', 1, 1),
('NV02', 'Nguyễn Quang Bảo', 'zzgiabao2zz@gmail.com', 'Nam Định', '0399645777', '121535528235', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `nhap`
--

CREATE TABLE `nhap` (
  `maNhap` int(11) NOT NULL,
  `maNCC` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `maNV` int(11) NOT NULL,
  `thoiGian` datetime NOT NULL DEFAULT current_timestamp(),
  `thanhTien` float NOT NULL DEFAULT 0,
  `trangThai` int(11) NOT NULL DEFAULT 0
) ;

-- --------------------------------------------------------

--
-- Table structure for table `sanpham`
--

CREATE TABLE `sanpham` (
  `maSanPham` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `tenSanPham` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `moTa` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `taikhoan` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `matkhau` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `maNV` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `trangthai` int(11) NOT NULL DEFAULT 0,
  `quyen` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`taikhoan`, `matkhau`, `maNV`, `trangthai`, `quyen`) VALUES
('a', 'a', 'NV02', 0, 1);

-- --------------------------------------------------------

--
-- Table structure for table `thongtinkho`
--

CREATE TABLE `thongtinkho` (
  `maKho` int(11) NOT NULL,
  `maNCC` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `maSanPham` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `soLuong` int(11) NOT NULL DEFAULT 0,
  `giaXuat` float NOT NULL DEFAULT 0
) ;

-- --------------------------------------------------------

--
-- Table structure for table `xuat`
--

CREATE TABLE `xuat` (
  `maXuat` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `maKH` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `thoiGian` datetime DEFAULT current_timestamp(),
  `thanhTien` decimal(18,4) DEFAULT NULL
) ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chitietnhap`
--
ALTER TABLE `chitietnhap`
  ADD PRIMARY KEY (`maCTNhap`),
  ADD KEY `fk_2` (`maNhap`),
  ADD KEY `fk_3` (`maSanPham`);

--
-- Indexes for table `chitietxuat`
--
ALTER TABLE `chitietxuat`
  ADD PRIMARY KEY (`maCTXuat`),
  ADD KEY `fk_5` (`maXuat`),
  ADD KEY `fk_6` (`maSanPham`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`maKh`),
  ADD UNIQUE KEY `uni_KhachHang` (`sdt`,`cmnd`);

--
-- Indexes for table `kho`
--
ALTER TABLE `kho`
  ADD PRIMARY KEY (`maKho`);

--
-- Indexes for table `nhacungcap`
--
ALTER TABLE `nhacungcap`
  ADD PRIMARY KEY (`maNCC`),
  ADD UNIQUE KEY `sdtNCC` (`sdtNCC`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`maNV`),
  ADD UNIQUE KEY `uni_1` (`email`,`sdt`,`cmnd`),
  ADD KEY `fk_11` (`maKho`);

--
-- Indexes for table `nhap`
--
ALTER TABLE `nhap`
  ADD PRIMARY KEY (`maNhap`),
  ADD KEY `fk_1` (`maNCC`);

--
-- Indexes for table `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`maSanPham`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`taikhoan`),
  ADD KEY `fk_12` (`maNV`);

--
-- Indexes for table `thongtinkho`
--
ALTER TABLE `thongtinkho`
  ADD PRIMARY KEY (`maKho`),
  ADD KEY `fk_7` (`maSanPham`),
  ADD KEY `fk_9` (`maNCC`);

--
-- Indexes for table `xuat`
--
ALTER TABLE `xuat`
  ADD PRIMARY KEY (`maXuat`),
  ADD KEY `fk_4` (`maKH`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chitietnhap`
--
ALTER TABLE `chitietnhap`
  ADD CONSTRAINT `fk_2` FOREIGN KEY (`maNhap`) REFERENCES `nhap` (`maNhap`),
  ADD CONSTRAINT `fk_3` FOREIGN KEY (`maSanPham`) REFERENCES `sanpham` (`maSanPham`);

--
-- Constraints for table `chitietxuat`
--
ALTER TABLE `chitietxuat`
  ADD CONSTRAINT `fk_5` FOREIGN KEY (`maXuat`) REFERENCES `xuat` (`maXuat`),
  ADD CONSTRAINT `fk_6` FOREIGN KEY (`maSanPham`) REFERENCES `sanpham` (`maSanPham`);

--
-- Constraints for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `fk_11` FOREIGN KEY (`maKho`) REFERENCES `kho` (`maKho`);

--
-- Constraints for table `nhap`
--
ALTER TABLE `nhap`
  ADD CONSTRAINT `fk_1` FOREIGN KEY (`maNCC`) REFERENCES `nhacungcap` (`maNCC`);

--
-- Constraints for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD CONSTRAINT `fk_12` FOREIGN KEY (`maNV`) REFERENCES `nhanvien` (`maNV`);

--
-- Constraints for table `thongtinkho`
--
ALTER TABLE `thongtinkho`
  ADD CONSTRAINT `fk_10` FOREIGN KEY (`maKho`) REFERENCES `kho` (`maKho`),
  ADD CONSTRAINT `fk_7` FOREIGN KEY (`maSanPham`) REFERENCES `sanpham` (`maSanPham`),
  ADD CONSTRAINT `fk_9` FOREIGN KEY (`maNCC`) REFERENCES `nhacungcap` (`maNCC`);

--
-- Constraints for table `xuat`
--
ALTER TABLE `xuat`
  ADD CONSTRAINT `fk_4` FOREIGN KEY (`maKH`) REFERENCES `khachhang` (`maKh`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
