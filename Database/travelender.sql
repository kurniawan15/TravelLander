-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 11 Des 2017 pada 13.47
-- Versi Server: 10.1.9-MariaDB
-- PHP Version: 5.6.15

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
-- Struktur dari tabel `event`
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

-- --------------------------------------------------------

--
-- Struktur dari tabel `lokasi`
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
-- Struktur dari tabel `moda_perjalanan`
--

CREATE TABLE `moda_perjalanan` (
  `TRAVEL_MODE` varchar(50) NOT NULL,
  `AVOIDTOLLS` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `moda_perjalanan`
--

INSERT INTO `moda_perjalanan` (`TRAVEL_MODE`, `AVOIDTOLLS`) VALUES
('BICYCLING', 1),
('DRIVING', 0),
('DRIVING', 1),
('TRANSIT', 0),
('TRANSIT', 1),
('WALKING', 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `traveller`
--

CREATE TABLE `traveller` (
  `KD_TRAVELLER` varchar(6) NOT NULL,
  `NAMA_TRAVELLER` varchar(50) DEFAULT NULL,
  `USERNAME` varchar(16) DEFAULT NULL,
  `PASSWORD` varchar(16) DEFAULT NULL,
  `EMAIL` varchar(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
-- Indexes for table `traveller`
--
ALTER TABLE `traveller`
  ADD PRIMARY KEY (`KD_TRAVELLER`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `event`
--
ALTER TABLE `event`
  ADD CONSTRAINT `FK_MEMILIKI` FOREIGN KEY (`KD_TRAVELLER`) REFERENCES `traveller` (`KD_TRAVELLER`),
  ADD CONSTRAINT `FK_MENGGUNAKAN` FOREIGN KEY (`TRAVEL_MODE`,`AVOIDTOLLS`) REFERENCES `moda_perjalanan` (`TRAVEL_MODE`, `AVOIDTOLLS`);

--
-- Ketidakleluasaan untuk tabel `lokasi`
--
ALTER TABLE `lokasi`
  ADD CONSTRAINT `FK_BERTUJUAN` FOREIGN KEY (`KD_EVENT`) REFERENCES `event` (`KD_EVENT`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
