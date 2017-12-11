-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 11, 2017 at 05:57 PM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `travelasik`
--

-- --------------------------------------------------------

--
-- Table structure for table `event`
--

CREATE TABLE IF NOT EXISTS `event` (
  `KD_EVENT` varchar(16) NOT NULL,
  `KD_TRAVELLER` varchar(6) NOT NULL,
  `TRAVEL_MODE` varchar(50) NOT NULL,
  `AVOIDTOLLS` tinyint(1) NOT NULL,
  `NAMA_EVENT` varchar(50) DEFAULT NULL,
  `WAKTU_MULAI` datetime DEFAULT NULL,
  `WAKTU_SELESAI` datetime DEFAULT NULL,
  `KETERANGAN` text,
  PRIMARY KEY (`KD_EVENT`),
  KEY `FK_MEMILIKI` (`KD_TRAVELLER`),
  KEY `FK_MENGGUNAKAN` (`TRAVEL_MODE`,`AVOIDTOLLS`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `event`
--

INSERT INTO `event` (`KD_EVENT`, `KD_TRAVELLER`, `TRAVEL_MODE`, `AVOIDTOLLS`, `NAMA_EVENT`, `WAKTU_MULAI`, `WAKTU_SELESAI`, `KETERANGAN`) VALUES
('E07112017T00101', 'T001', 'DRIVING', 0, 'Pertemuan Pengawas', '2017-11-07 18:30:00', '2017-11-08 06:00:00', 'pertemuan para pengawas '),
('E08112017T00101', 'T001', 'DRIVING', 1, 'Pengawasan Dan Pelatihan', '2017-11-08 07:00:00', '2017-11-08 15:00:00', 'mulai pengawasan dan pelatihan');

-- --------------------------------------------------------

--
-- Stand-in structure for view `list_event`
--
CREATE TABLE IF NOT EXISTS `list_event` (
`KD_EVENT` varchar(16)
,`NAMA_TRAVELLER` varchar(50)
,`TRAVEL_MODE` varchar(50)
,`AVOIDTOLLS` tinyint(1)
,`NAMA_EVENT` varchar(50)
,`WAKTU_MULAI` datetime
,`WAKTU_SELESAI` datetime
,`LOKASI_AWAL` varchar(50)
,`LOKASI_AKHIR` varchar(50)
,`KETERANGAN` text
);
-- --------------------------------------------------------

--
-- Table structure for table `lokasi`
--

CREATE TABLE IF NOT EXISTS `lokasi` (
  `KD_EVENT` varchar(16) NOT NULL,
  `LATITUDE` varchar(30) DEFAULT NULL,
  `LONGITUDE` varchar(30) DEFAULT NULL,
  `NAMA_LOKASI` varchar(50) DEFAULT NULL,
  `ALAMAT` text,
  `KETERANGAN` text,
  KEY `FK_BERTUJUAN` (`KD_EVENT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lokasi`
--

INSERT INTO `lokasi` (`KD_EVENT`, `LATITUDE`, `LONGITUDE`, `NAMA_LOKASI`, `ALAMAT`, `KETERANGAN`) VALUES
('E07112017T00101', '-6.817923', '107.175629', 'Rumah', 'Maleber, KarangTengah, Cianjur', 'awal'),
('E07112017T00101', '-6.9085255', '107.6183885', 'HOTEL AMAROSSA BANDUNG', 'Jl. Aceh No. 71 A, Citarum, Bandung Wetan', 'akhir'),
('E08112017T00101', '-6.9085255', '107.6183885', 'HOTEL AMAROSSA BANDUNG', 'Jl. Aceh No. 71 A, Citarum, Bandung Wetan', 'awal'),
('E08112017T00101', '-6.9041041', '107.6221608', 'SMAN 20 BANDUNG', 'Jalan Citarum No.23, Citarum, Bandung', 'akhir');

-- --------------------------------------------------------

--
-- Table structure for table `moda_perjalanan`
--

CREATE TABLE IF NOT EXISTS `moda_perjalanan` (
  `TRAVEL_MODE` varchar(50) NOT NULL,
  `AVOIDTOLLS` tinyint(1) NOT NULL,
  PRIMARY KEY (`TRAVEL_MODE`,`AVOIDTOLLS`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `moda_perjalanan`
--

INSERT INTO `moda_perjalanan` (`TRAVEL_MODE`, `AVOIDTOLLS`) VALUES
('BICYCLING', 1),
('DRIVING', 0),
('DRIVING', 1),
('MOBIL', 1),
('TRANSIT', 0),
('TRANSIT', 1),
('WALKING', 1);

-- --------------------------------------------------------

--
-- Table structure for table `traveller`
--

CREATE TABLE IF NOT EXISTS `traveller` (
  `KD_TRAVELLER` varchar(6) NOT NULL,
  `NAMA_TRAVELLER` varchar(50) DEFAULT NULL,
  `USERNAME` varchar(16) DEFAULT NULL,
  `PASSWORD` varchar(16) DEFAULT NULL,
  `EMAIL` varchar(35) DEFAULT NULL,
  PRIMARY KEY (`KD_TRAVELLER`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `traveller`
--

INSERT INTO `traveller` (`KD_TRAVELLER`, `NAMA_TRAVELLER`, `USERNAME`, `PASSWORD`, `EMAIL`) VALUES
('T001', 'Kanto', 'Kanto1', 'kanto123', 'kanto123@gmail.com');

-- --------------------------------------------------------

--
-- Structure for view `list_event`
--
DROP TABLE IF EXISTS `list_event`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `list_event` AS select `e`.`KD_EVENT` AS `KD_EVENT`,`t`.`NAMA_TRAVELLER` AS `NAMA_TRAVELLER`,`e`.`TRAVEL_MODE` AS `TRAVEL_MODE`,`e`.`AVOIDTOLLS` AS `AVOIDTOLLS`,`e`.`NAMA_EVENT` AS `NAMA_EVENT`,`e`.`WAKTU_MULAI` AS `WAKTU_MULAI`,`e`.`WAKTU_SELESAI` AS `WAKTU_SELESAI`,`l1`.`NAMA_LOKASI` AS `LOKASI_AWAL`,`l2`.`NAMA_LOKASI` AS `LOKASI_AKHIR`,`e`.`KETERANGAN` AS `KETERANGAN` from (((`event` `e` join `traveller` `t`) join `lokasi` `l1`) join `lokasi` `l2`) where ((`e`.`KD_TRAVELLER` = `t`.`KD_TRAVELLER`) and (`l1`.`KD_EVENT` = `e`.`KD_EVENT`) and (`l1`.`KETERANGAN` = 'awal') and (`l2`.`KD_EVENT` = `e`.`KD_EVENT`) and (`l2`.`KETERANGAN` = 'akhir'));

--
-- Constraints for dumped tables
--

--
-- Constraints for table `event`
--
ALTER TABLE `event`
  ADD CONSTRAINT `FK_MENGGUNAKAN` FOREIGN KEY (`TRAVEL_MODE`, `AVOIDTOLLS`) REFERENCES `moda_perjalanan` (`TRAVEL_MODE`, `AVOIDTOLLS`),
  ADD CONSTRAINT `FK_MEMILIKI` FOREIGN KEY (`KD_TRAVELLER`) REFERENCES `traveller` (`KD_TRAVELLER`);

--
-- Constraints for table `lokasi`
--
ALTER TABLE `lokasi`
  ADD CONSTRAINT `FK_BERTUJUAN` FOREIGN KEY (`KD_EVENT`) REFERENCES `event` (`KD_EVENT`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
