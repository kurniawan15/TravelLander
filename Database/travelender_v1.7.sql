-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 21, 2017 at 11:33 AM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `travelendar`
--

-- --------------------------------------------------------

--
-- Table structure for table `agenda`
--

CREATE TABLE `agenda` (
  `id_agenda` varchar(16) NOT NULL,
  `id_user` varchar(6) NOT NULL,
  `nama_agenda` varchar(50) DEFAULT NULL,
  `waktu_mulai` datetime DEFAULT NULL,
  `waktu_selesai` datetime DEFAULT NULL,
  `id_lookup` varchar(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `agenda`
--

INSERT INTO `agenda` (`id_agenda`, `id_user`, `nama_agenda`, `waktu_mulai`, `waktu_selesai`, `id_lookup`) VALUES
('PL00000000000001', 'ID0001', 'Pelatihan Guru', '2017-09-03 08:00:00', '2017-09-03 12:00:00', 'IDL0001');

-- --------------------------------------------------------

--
-- Table structure for table `lokasi`
--

CREATE TABLE `lokasi` (
  `kd_lokasi` varchar(7) NOT NULL,
  `nama_lokasi` varchar(50) DEFAULT NULL,
  `alamat` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lokasi`
--

INSERT INTO `lokasi` (`kd_lokasi`, `nama_lokasi`, `alamat`) VALUES
('KL00001', 'Stasiun Kereta Api Bandung', 'Kb. Jeruk, Kb. Jeruk, Jl. Stasiun Barat, 40181, Kebon Jeruk, Andir, Kota Bandung'),
('KL00002', 'SMA Negeri 9 Bandung', 'Jalan Suparmin No.1A, Pajajaran, Cicendo, Pajajaran, Cicendo, Kota Bandung, Jawa Barat 40173'),
('KL00003', 'SMP Negeri 40 Bandung', 'Jl. Wastukencana Blok A No.75, Tamansari, Bandung Wetan, Kota Bandung, Jawa Barat 40116'),
('KL00004', 'Stasiun Surabaya Gubeng', 'Jl. Stasiun Gubeng, Pacar Keling, Tambaksari, Kota SBY, Jawa Timur 60272'),
('KL00005', 'Bandara Interasional Kualanamu', 'Jalan Bandara Kuala Namu, Beringin, Kabupaten Deli Serdang, Sumatera Utara 20553'),
('KL00006', 'SMP Negeri 1 Surabaya', 'Jl. Pacar No.4-6, Ketabang, Genteng, Kota SBY, Jawa Timur 60272'),
('KL00007', 'Bandar Udara Internasional Abdulrachman Saleh', 'Jl. Komodor Udara Abdul Rahman Saleh, Bunut Wetan, Pakis, Malang, Jawa Timur 65154'),
('KL00008', 'SMP Negeri 37 Surabaya', 'Jl. Kalianyar No.18-20, Kapasari, Genteng, Kota Surabaya, Jawa Timur 60273'),
('KL00009', 'SMK Negeri 5 Malang', 'Jl. Ikan Piranha Atas, Tunjungsekar, Kec. Lowokwaru, Kota Malang, Jawa Timur 65146'),
('KL00010', 'SMAN 9 Malang', 'Jl. Puncak Borobudur No.1, Mojolangu, Kec. Lowokwaru, Kota Malang, Jawa Timur 65142'),
('KL00011', 'Politeknik Negeri Bandung', 'Ciwaruga, Parongpong, Ciwaruga, Parongpong, West Bandung Regency, Jawa Barat 40559'),
('KL00012', 'Gedung DPRD Kabupaten Bandung', 'Jl. Raya Soreang KM.17, Pamekaran, Soreang, Bandung, Jawa Barat 40912');

-- --------------------------------------------------------

--
-- Table structure for table `lookup`
--

CREATE TABLE `lookup` (
  `id_lookup` varchar(7) NOT NULL,
  `jarak_tempuh` int(11) NOT NULL,
  `waktu_tempuh` int(11) DEFAULT NULL,
  `kode_lokasi_awal` varchar(7) DEFAULT NULL,
  `kode_lokasi_akhir` varchar(7) DEFAULT NULL,
  `kd_moda` varchar(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lookup`
--

INSERT INTO `lookup` (`id_lookup`, `jarak_tempuh`, `waktu_tempuh`, `kode_lokasi_awal`, `kode_lokasi_akhir`, `kd_moda`) VALUES
('IDL0001', 5, 19, 'KL00002', 'KL00003', 'KMT03'),
('IDL0002', 4, 13, 'KL00003', 'KL00002', 'KMT03'),
('IDL0003', 30, 67, 'KL00011', 'KL00012', 'KMT03'),
('IDL0004', 31, 68, 'KL00012', 'KL00011', 'KMT03');

-- --------------------------------------------------------

--
-- Table structure for table `moda_transportasi`
--

CREATE TABLE `moda_transportasi` (
  `kd_moda` varchar(6) NOT NULL,
  `tipe_moda` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `moda_transportasi`
--

INSERT INTO `moda_transportasi` (`kd_moda`, `tipe_moda`) VALUES
('KMT01', 'Kereta Api'),
('KMT02', 'Pesawat'),
('KMT03', 'Mobil'),
('KMT04', 'Bus'),
('KMT05', 'Motor');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` varchar(6) NOT NULL,
  `nama_user` varchar(50) DEFAULT NULL,
  `email` varchar(35) DEFAULT NULL,
  `password` varchar(17) DEFAULT NULL,
  `posisi_sekarang` varchar(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `nama_user`, `email`, `password`, `posisi_sekarang`) VALUES
('ID0001', 'Kanto', 'kanto123@gmail.com', 'kanto123', 'KL00002');

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
-- Constraints for dumped tables
--

--
-- Constraints for table `agenda`
--
ALTER TABLE `agenda`
  ADD CONSTRAINT `agenda_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`),
  ADD CONSTRAINT `agenda_ibfk_2` FOREIGN KEY (`id_lookup`) REFERENCES `lookup` (`id_lookup`);

--
-- Constraints for table `lookup`
--
ALTER TABLE `lookup`
  ADD CONSTRAINT `lookup_ibfk_1` FOREIGN KEY (`kode_lokasi_awal`) REFERENCES `lokasi` (`kd_lokasi`),
  ADD CONSTRAINT `lookup_ibfk_2` FOREIGN KEY (`kode_lokasi_akhir`) REFERENCES `lokasi` (`kd_lokasi`),
  ADD CONSTRAINT `lookup_ibfk_3` FOREIGN KEY (`kd_moda`) REFERENCES `moda_transportasi` (`kd_moda`);

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`posisi_sekarang`) REFERENCES `lokasi` (`kd_lokasi`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
