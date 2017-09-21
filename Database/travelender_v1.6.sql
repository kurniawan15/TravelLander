-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 20 Sep 2017 pada 17.39
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
-- Struktur dari tabel `agenda`
--

CREATE TABLE `agenda` (
  `id_agenda` varchar(16) NOT NULL,
  `id_user` varchar(6) NOT NULL,
  `nama_agenda` varchar(50) DEFAULT NULL,
  `waktu_mulai` datetime DEFAULT NULL,
  `waktu_selesai` datetime DEFAULT NULL,
  `id_lookup` varchar(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `lokasi`
--

CREATE TABLE `lokasi` (
  `kd_lokasi` varchar(7) NOT NULL,
  `nama_lokasi` varchar(50) DEFAULT NULL,
  `alamat` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `lookup`
--

CREATE TABLE `lookup` (
  `id_lookup` varchar(7) NOT NULL,
  `waktu_tempuh` int(11) DEFAULT NULL,
  `kode_lokasi_awal` varchar(7) DEFAULT NULL,
  `kode_lokasi_akhir` varchar(7) DEFAULT NULL,
  `kd_moda` varchar(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `moda_transportasi`
--

CREATE TABLE `moda_transportasi` (
  `kd_moda` varchar(6) NOT NULL,
  `tipe_moda` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id_user` varchar(6) NOT NULL,
  `nama_user` varchar(50) DEFAULT NULL,
  `email` varchar(35) DEFAULT NULL,
  `password` varchar(17) DEFAULT NULL,
  `posisi_sekarang` varchar(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `agenda`
--
ALTER TABLE `agenda`
  ADD PRIMARY KEY (`id_agenda`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_lookup` (`id_lookup`);

--
-- Indexes for table `lokasi`
--
ALTER TABLE `lokasi`
  ADD PRIMARY KEY (`kd_lokasi`);

--
-- Indexes for table `lookup`
--
ALTER TABLE `lookup`
  ADD PRIMARY KEY (`id_lookup`),
  ADD KEY `kode_lokasi_awal` (`kode_lokasi_awal`),
  ADD KEY `kode_lokasi_akhir` (`kode_lokasi_akhir`),
  ADD KEY `kd_moda` (`kd_moda`);

--
-- Indexes for table `moda_transportasi`
--
ALTER TABLE `moda_transportasi`
  ADD PRIMARY KEY (`kd_moda`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`),
  ADD KEY `posisi_sekarang` (`posisi_sekarang`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `agenda`
--
ALTER TABLE `agenda`
  ADD CONSTRAINT `agenda_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`),
  ADD CONSTRAINT `agenda_ibfk_2` FOREIGN KEY (`id_lookup`) REFERENCES `lookup` (`id_lookup`);

--
-- Ketidakleluasaan untuk tabel `lookup`
--
ALTER TABLE `lookup`
  ADD CONSTRAINT `lookup_ibfk_1` FOREIGN KEY (`kode_lokasi_awal`) REFERENCES `lokasi` (`kd_lokasi`),
  ADD CONSTRAINT `lookup_ibfk_2` FOREIGN KEY (`kode_lokasi_akhir`) REFERENCES `lokasi` (`kd_lokasi`),
  ADD CONSTRAINT `lookup_ibfk_3` FOREIGN KEY (`kd_moda`) REFERENCES `moda_transportasi` (`kd_moda`);

--
-- Ketidakleluasaan untuk tabel `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`posisi_sekarang`) REFERENCES `lokasi` (`kd_lokasi`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
