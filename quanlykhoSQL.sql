-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 11, 2022 at 03:16 PM
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
  `maKho` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `tenKho` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `maQL` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE `manager` (
  `maQL` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `taikhoan` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tenQL` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cmndQL` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sdtQL` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `diaChiQL` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ;

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
  `taikhoan` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `maKho` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tenNV` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `diaChi` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `SDT` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CMND` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL
) ;

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
-- Table structure for table `quantri`
--

CREATE TABLE `quantri` (
  `maAd` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `taikhoan` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tenAd` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `diachi` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sdt` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cmnd` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL
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
  `tendaydu` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `trangthai` int(11) DEFAULT 0,
  `ngayhieuluc` date DEFAULT NULL,
  `quyen` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `thongtinkho`
--

CREATE TABLE `thongtinkho` (
  `maKho` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
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
  `thoiGian` date DEFAULT current_timestamp(),
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
  ADD PRIMARY KEY (`maKho`),
  ADD KEY `fk_8` (`maQL`);

--
-- Indexes for table `manager`
--
ALTER TABLE `manager`
  ADD PRIMARY KEY (`maQL`),
  ADD UNIQUE KEY `uni_3` (`taikhoan`,`cmndQL`,`sdtQL`);

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
  ADD UNIQUE KEY `ck_nv1` (`taikhoan`),
  ADD UNIQUE KEY `ck_nv2` (`SDT`),
  ADD UNIQUE KEY `ck_nv4` (`CMND`),
  ADD KEY `fk_10` (`maKho`);

--
-- Indexes for table `nhap`
--
ALTER TABLE `nhap`
  ADD PRIMARY KEY (`maNhap`),
  ADD KEY `fk_1` (`maNCC`);

--
-- Indexes for table `quantri`
--
ALTER TABLE `quantri`
  ADD PRIMARY KEY (`maAd`),
  ADD UNIQUE KEY `uni_1` (`taikhoan`,`sdt`,`cmnd`);

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
  ADD UNIQUE KEY `uni_2` (`email`);

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
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chitietnhap`
--
ALTER TABLE `chitietnhap`
  MODIFY `maCTNhap` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `nhap`
--
ALTER TABLE `nhap`
  MODIFY `maNhap` int(11) NOT NULL AUTO_INCREMENT;

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
-- Constraints for table `kho`
--
ALTER TABLE `kho`
  ADD CONSTRAINT `fk_8` FOREIGN KEY (`maQL`) REFERENCES `manager` (`maQL`);

--
-- Constraints for table `manager`
--
ALTER TABLE `manager`
  ADD CONSTRAINT `fk_12` FOREIGN KEY (`taikhoan`) REFERENCES `taikhoan` (`taikhoan`);

--
-- Constraints for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `fk_10` FOREIGN KEY (`maKho`) REFERENCES `kho` (`maKho`),
  ADD CONSTRAINT `fk_11` FOREIGN KEY (`taikhoan`) REFERENCES `taikhoan` (`taikhoan`);

--
-- Constraints for table `nhap`
--
ALTER TABLE `nhap`
  ADD CONSTRAINT `fk_1` FOREIGN KEY (`maNCC`) REFERENCES `nhacungcap` (`maNCC`);

--
-- Constraints for table `quantri`
--
ALTER TABLE `quantri`
  ADD CONSTRAINT `fk_13` FOREIGN KEY (`taikhoan`) REFERENCES `taikhoan` (`taikhoan`);

--
-- Constraints for table `thongtinkho`
--
ALTER TABLE `thongtinkho`
  ADD CONSTRAINT `fk_14` FOREIGN KEY (`maKho`) REFERENCES `kho` (`maKho`),
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
