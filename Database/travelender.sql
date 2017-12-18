-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2017 at 04:27 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `travelender`
--

-- --------------------------------------------------------

--
-- Table structure for table `event`
--

CREATE TABLE `event` (
  `KD_EVENT` varchar(16) NOT NULL,
  `KD_TRAVELLER` varchar(6) NOT NULL,
  `TRAVEL_MODE` varchar(50) NOT NULL,
  `AVOIDTOLLS` tinyint(1) NOT NULL,
  `NAMA_EVENT` varchar(50) DEFAULT NULL,
  `WAKTU_MULAI` datetime DEFAULT NULL,
  `WAKTU_SELESAI` datetime DEFAULT NULL,
  `KETERANGAN` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `event`
--

INSERT INTO `event` (`KD_EVENT`, `KD_TRAVELLER`, `TRAVEL_MODE`, `AVOIDTOLLS`, `NAMA_EVENT`, `WAKTU_MULAI`, `WAKTU_SELESAI`, `KETERANGAN`) VALUES
('KDETD00107111701', 'TD001', 'DRIVING', 0, 'Pengawasan', '2017-11-07 18:50:00', '2017-11-07 21:30:00', 'Jangan lupa bawa format'),
('KDETD00108111701', 'TD001', 'DRIVING', 1, 'Pengawasan dan pelatihan', '2017-11-08 07:00:00', '2017-11-08 13:00:00', 'Jangan lupa bawa format'),
('KDETD00108111702', 'TD001', 'WALKING', 1, 'Laporan dan evaluasi', '2017-11-08 16:00:00', '2017-11-08 18:00:00', 'Jangan lupa bawa format'),
('KDETD00108111703', 'TD001', 'DRIVING', 1, 'Istirahat', '2017-11-08 21:00:00', '2017-11-09 04:00:00', '-'),
('KDETD00109111701', 'TD001', 'DRIVING', 0, 'Check in pesawat', '2017-11-09 04:20:00', '2017-11-09 05:40:00', 'Jangan lupa bawa tiket'),
('KDETD00109111702', 'TD001', 'DRIVING', 0, 'Pengawasan dan pelatihan', '2017-11-09 09:00:00', '2017-11-09 13:00:00', 'Jangan lupa bawa format'),
('KDETD00109111703', 'TD001', 'DRIVING', 1, 'Laporan dan evaluasi', '2017-11-09 16:00:00', '2017-11-09 18:20:00', 'Jangan lupa bawa format'),
('KDETD00109111704', 'TD001', 'DRIVING', 1, 'Check in hotel', '2017-11-09 19:30:00', '2017-11-09 19:35:00', '-'),
('KDETD00110111701', 'TD001', 'DRIVING', 0, 'Check in pesawat', '2017-11-10 06:20:00', '2017-11-10 07:45:00', 'Jangan lupa bawa tiket'),
('KDETD00110111702', 'TD001', 'DRIVING', 0, 'Penyerahan laporan', '2017-11-10 13:00:00', '2017-11-10 14:40:00', 'Jangan lupa bawa berkas');

-- --------------------------------------------------------

--
-- Table structure for table `lokasi`
--

CREATE TABLE `lokasi` (
  `KD_EVENT` varchar(16) NOT NULL,
  `LATITUDE` varchar(30) DEFAULT NULL,
  `LONGITUDE` varchar(30) DEFAULT NULL,
  `NAMA_LOKASI` varchar(50) DEFAULT NULL,
  `ALAMAT` text,
  `KETERANGAN` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `moda_perjalanan`
--

CREATE TABLE `moda_perjalanan` (
  `TRAVEL_MODE` varchar(50) NOT NULL,
  `AVOIDTOLLS` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `moda_perjalanan`
--

INSERT INTO `moda_perjalanan` (`TRAVEL_MODE`, `AVOIDTOLLS`) VALUES
('BICYCLING', 1),
('DRIVING', 0),
('DRIVING', 1),
('TRANSIT', 1),
('WALKING', 1);

-- --------------------------------------------------------

--
-- Table structure for table `moda_transit`
--

CREATE TABLE `moda_transit` (
  `KD_EVENT` varchar(16) NOT NULL,
  `VEHICLE_MODE` varchar(50) DEFAULT NULL,
  `TRANSIT` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `traveller`
--

CREATE TABLE `traveller` (
  `KD_TRAVELLER` varchar(6) NOT NULL,
  `NAMA_TRAVELLER` varchar(50) DEFAULT NULL,
  `USERNAME` varchar(16) DEFAULT NULL,
  `PASSWORD` varchar(16) DEFAULT NULL,
  `EMAIL` varchar(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `traveller`
--

INSERT INTO `traveller` (`KD_TRAVELLER`, `NAMA_TRAVELLER`, `USERNAME`, `PASSWORD`, `EMAIL`) VALUES
('TD001', 'kanto', 'kanto', 'kanto', 'kanto@gmail.com'),
('TD002', 'fadhil', 'fadhil', 'fadhil', 'fadhil@gmail.com'),
('TD003', 'pega', 'pega', 'pega', 'pega@gmail.com'),
('TD004', 'ridwan', 'ridwan', 'ridwan', 'ridwan@gmail.com'),
('TD005', 'phuu', 'phuu', 'phuu', 'phuu@gmail.com'),
('TD006', 'fauzan', 'fauzan', 'fauzan', 'fauzan@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `event`
--
ALTER TABLE `event`
  ADD PRIMARY KEY (`KD_EVENT`),
  ADD KEY `FK_MEMILIKI` (`KD_TRAVELLER`),
  ADD KEY `FK_MENGGUNAKAN` (`TRAVEL_MODE`,`AVOIDTOLLS`);

--
-- Indexes for table `lokasi`
--
ALTER TABLE `lokasi`
  ADD KEY `FK_BERTUJUAN` (`KD_EVENT`);

--
-- Indexes for table `moda_perjalanan`
--
ALTER TABLE `moda_perjalanan`
  ADD PRIMARY KEY (`TRAVEL_MODE`,`AVOIDTOLLS`);

--
-- Indexes for table `moda_transit`
--
ALTER TABLE `moda_transit`
  ADD KEY `FK_MENAIKI` (`KD_EVENT`);

--
-- Indexes for table `traveller`
--
ALTER TABLE `traveller`
  ADD PRIMARY KEY (`KD_TRAVELLER`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `event`
--
ALTER TABLE `event`
  ADD CONSTRAINT `FK_MEMILIKI` FOREIGN KEY (`KD_TRAVELLER`) REFERENCES `traveller` (`KD_TRAVELLER`),
  ADD CONSTRAINT `FK_MENGGUNAKAN` FOREIGN KEY (`TRAVEL_MODE`,`AVOIDTOLLS`) REFERENCES `moda_perjalanan` (`TRAVEL_MODE`, `AVOIDTOLLS`);

--
-- Constraints for table `lokasi`
--
ALTER TABLE `lokasi`
  ADD CONSTRAINT `FK_BERTUJUAN` FOREIGN KEY (`KD_EVENT`) REFERENCES `event` (`KD_EVENT`);

--
-- Constraints for table `moda_transit`
--
ALTER TABLE `moda_transit`
  ADD CONSTRAINT `FK_MENAIKI` FOREIGN KEY (`KD_EVENT`) REFERENCES `event` (`KD_EVENT`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
