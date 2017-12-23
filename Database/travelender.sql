-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 13 Nov 2017 pada 15.20
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
  `Id_Event` varchar(16) NOT NULL,
  `Kd_Traveller` varchar(6) NOT NULL,
  `Kd_Transportasi_Tidak_Terjadwal` varchar(6) DEFAULT NULL,
  `Kd_Transportasi_Terjadwal` varchar(6) DEFAULT NULL,
  `Nama_Event` varchar(50) NOT NULL,
  `Waktu_Mulai` datetime NOT NULL,
  `Waktu_Selesai` datetime NOT NULL,
  `Keterangan` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `lokasi`
--

CREATE TABLE `lokasi` (
  `Id_Event` varchar(16) NOT NULL,
  `latitude` varchar(30) DEFAULT NULL,
  `longitude` varchar(30) DEFAULT NULL,
  `nama_lokasi` varchar(50) NOT NULL,
  `alamat` text NOT NULL,
  `keterangan` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `moda_transportasi`
--

CREATE TABLE `moda_transportasi` (
  `Kd_Moda` varchar(6) NOT NULL,
  `Tipe_Moda` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `transportasi_terjadwal`
--

CREATE TABLE `transportasi_terjadwal` (
  `Kd_Transportasi_Terjadwal` varchar(6) NOT NULL,
  `Kd_Moda` varchar(6) NOT NULL,
  `Nama_Transportasi_Terjadwal` varchar(50) NOT NULL,
  `Waktu_Berangkat` datetime DEFAULT NULL,
  `Waktu_Datang` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `transportasi_tidak_terjadwal`
--

CREATE TABLE `transportasi_tidak_terjadwal` (
  `Kd_Transportasi_Tidak_Terjadwal` varchar(6) NOT NULL,
  `Kd_Moda` varchar(6) NOT NULL,
  `Nama_Transportasi_Tidak_Terjadwal` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `traveller`
--

CREATE TABLE `traveller` (
  `Kd_Traveller` varchar(6) NOT NULL,
  `Nama_Traveller` varchar(50) NOT NULL,
  `Username` varchar(16) NOT NULL,
  `Password` varchar(16) NOT NULL,
  `Email` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `event`
--
ALTER TABLE `event`
  ADD PRIMARY KEY (`Id_Event`),
  ADD KEY `Kd_Traveller` (`Kd_Traveller`),
  ADD KEY `Kd_Transportasi_Tidak_Terjadwal` (`Kd_Transportasi_Tidak_Terjadwal`);

--
-- Indexes for table `lokasi`
--
ALTER TABLE `lokasi`
  ADD PRIMARY KEY (`Id_Event`,`keterangan`);

--
-- Indexes for table `moda_transportasi`
--
ALTER TABLE `moda_transportasi`
  ADD PRIMARY KEY (`Kd_Moda`);

--
-- Indexes for table `transportasi_terjadwal`
--
ALTER TABLE `transportasi_terjadwal`
  ADD PRIMARY KEY (`Kd_Transportasi_Terjadwal`),
  ADD KEY `Kd_Moda` (`Kd_Moda`);

--
-- Indexes for table `transportasi_tidak_terjadwal`
--
ALTER TABLE `transportasi_tidak_terjadwal`
  ADD PRIMARY KEY (`Kd_Transportasi_Tidak_Terjadwal`),
  ADD KEY `Kd_Moda` (`Kd_Moda`);

--
-- Indexes for table `traveller`
--
ALTER TABLE `traveller`
  ADD PRIMARY KEY (`Kd_Traveller`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `event`
--
ALTER TABLE `event`
  ADD CONSTRAINT `event_ibfk_1` FOREIGN KEY (`Kd_Traveller`) REFERENCES `traveller` (`Kd_Traveller`),
  ADD CONSTRAINT `event_ibfk_2` FOREIGN KEY (`Kd_Transportasi_Tidak_Terjadwal`) REFERENCES `transportasi_tidak_terjadwal` (`Kd_Transportasi_Tidak_Terjadwal`),
  ADD CONSTRAINT `event_ibfk_3` FOREIGN KEY (`Kd_Transportasi_Tidak_Terjadwal`) REFERENCES `transportasi_terjadwal` (`Kd_Transportasi_Terjadwal`);

--
-- Ketidakleluasaan untuk tabel `lokasi`
--
ALTER TABLE `lokasi`
  ADD CONSTRAINT `lokasi_ibfk_1` FOREIGN KEY (`Id_Event`) REFERENCES `event` (`Id_Event`);

--
-- Ketidakleluasaan untuk tabel `transportasi_terjadwal`
--
ALTER TABLE `transportasi_terjadwal`
  ADD CONSTRAINT `transportasi_terjadwal_ibfk_1` FOREIGN KEY (`Kd_Moda`) REFERENCES `moda_transportasi` (`Kd_Moda`);

--
-- Ketidakleluasaan untuk tabel `transportasi_tidak_terjadwal`
--
ALTER TABLE `transportasi_tidak_terjadwal`
  ADD CONSTRAINT `transportasi_tidak_terjadwal_ibfk_1` FOREIGN KEY (`Kd_Moda`) REFERENCES `moda_transportasi` (`Kd_Moda`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
