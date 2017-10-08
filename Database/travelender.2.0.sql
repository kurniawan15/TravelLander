-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 08, 2017 at 01:49 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.6.19

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
  `id_event` varchar(16) NOT NULL,
  `id_user` varchar(6) NOT NULL,
  `nama_agenda` varchar(50) DEFAULT NULL,
  `waktu_mulai` datetime DEFAULT NULL,
  `waktu_selesai` datetime DEFAULT NULL,
  `id_perjalanan` varchar(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `event`
--

INSERT INTO `event` (`id_event`, `id_user`, `nama_agenda`, `waktu_mulai`, `waktu_selesai`, `id_perjalanan`) VALUES
('EV230917TR000101', 'TR0001', 'Menginap', '2017-09-23 21:00:00', '2017-09-24 05:40:00', 'IDP0008'),
('EV230917TR000102', 'TR0001', 'Pengawasan dan Pelatihan', '2017-09-24 06:15:00', '2017-09-24 14:00:00', 'IDP0009'),
('EV230917TR000103', 'TR0001', 'Laporan dan Evaluasi', '2017-09-24 18:00:00', '2017-09-24 20:45:00', 'IDP0010'),
('EV230917TR000104', 'TR0001', 'Menginap', '2017-09-24 21:10:00', '2017-09-25 03:45:00', 'IDP0011'),
('EV230917TR000105', 'TR0001', 'Pengawasan dan Pelatihan', '2017-09-25 06:20:00', '2017-09-25 14:00:00', 'IDP0012'),
('EV230917TR000106', 'TR0001', 'Laporan dan Evaluasi', '2017-09-25 18:00:00', '2017-09-25 20:45:00', 'IDP0013'),
('EV230917TR000107', 'TR0001', 'Menginap', '2017-09-25 21:10:00', '2017-09-26 03:45:00', 'IDP0014'),
('EV230917TR000108', 'TR0001', 'Penyerahan Laporan', '2017-09-26 06:15:00', '2017-09-26 08:30:00', 'IDP0015'),
('EV230917TR000109', 'TR0001', 'Pulang ke Rumah', '2017-09-26 08:45:00', NULL, 'IDP0016');

-- --------------------------------------------------------

--
-- Table structure for table `kendaraan`
--

CREATE TABLE `kendaraan` (
  `kd_kendaraan` varchar(12) NOT NULL,
  `kd_moda` varchar(6) DEFAULT NULL,
  `nama_kendaraan` varchar(50) DEFAULT NULL,
  `waktu_keberangkatan` datetime DEFAULT NULL,
  `waktu_kedatangan` datetime DEFAULT NULL,
  `kecepatan_kendaraan` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `kota`
--

CREATE TABLE `kota` (
  `id_kota` varchar(7) NOT NULL,
  `nama_kota` varchar(50) DEFAULT NULL,
  `id_provinsi` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kota`
--

INSERT INTO `kota` (`id_kota`, `nama_kota`, `id_provinsi`) VALUES
('KT001', 'Ambon', 'MA'),
('KT002', 'Balikpapan', 'KT'),
('KT003', 'Banda Aceh', 'AC'),
('KT004', 'Bandar Lampung', 'LA'),
('KT005', 'Bandung', 'JB'),
('KT006', 'Banjar', 'JB'),
('KT007', 'Banjarbaru', 'KS'),
('KT008', 'Banjarmasin', 'KS'),
('KT009', 'Batam', 'KR'),
('KT010', 'Batu', 'JT'),
('KT011', 'Bau-Bau', 'SG'),
('KT012', 'Bekasi', 'JB'),
('KT013', 'Bengkulu', 'BE'),
('KT014', 'Bima', 'NB'),
('KT015', 'Binjai', 'SU'),
('KT016', 'Bitung', 'SU'),
('KT017', 'Blitar', 'JT'),
('KT018', 'Bogor', 'JB'),
('KT019', 'Bontang', 'KT'),
('KT020', 'Bukittinggi', 'SB'),
('KT021', 'Cilegon', 'BT'),
('KT022', 'Cimahi', 'JB'),
('KT023', 'Cirebon', 'JB'),
('KT024', 'Denpasar', 'BA'),
('KT025', 'Depok', 'JB'),
('KT026', 'Dumai', 'RI'),
('KT027', 'Gorontalo', 'GO'),
('KT028', 'Gunungsitoli', 'SU'),
('KT029', 'Jakarta Barat', 'JK'),
('KT030', 'Jakarta Pusat', 'JK'),
('KT031', 'Jakarta Selatan', 'JK'),
('KT032', 'Jakarta Timur', 'JK'),
('KT033', 'Jakarta Utara', 'JK'),
('KT034', 'Jambi', 'JA'),
('KT035', 'Jayapura', 'PA'),
('KT036', 'Kediri', 'JT'),
('KT037', 'Kendari', 'SG'),
('KT038', 'Kotamobagu', 'SU'),
('KT039', 'Kupang', 'NT'),
('KT040', 'Langsa', 'AC'),
('KT041', 'Lhokseumawe', 'AC'),
('KT042', 'Lubuklinggau', 'SS'),
('KT043', 'Madiun', 'JT'),
('KT044', 'Magelang', 'JT'),
('KT045', 'Makassar', 'SS'),
('KT046', 'Malang', 'JT'),
('KT047', 'Manado', 'SU'),
('KT048', 'Mataram', 'NB'),
('KT049', 'Medan', 'SU'),
('KT050', 'Metro', 'LA'),
('KT051', 'Mojokerto', 'JT'),
('KT052', 'Padang', 'SB'),
('KT053', 'Padangpanjang', 'SB'),
('KT054', 'PadangsKTempuan', 'SU'),
('KT055', 'Pagar Alam', 'SS'),
('KT056', 'Palangka Raya', 'KT'),
('KT057', 'Palembang', 'SS'),
('KT058', 'Palopo', 'SS'),
('KT059', 'Palu', 'ST'),
('KT060', 'Pangkal Pinang', 'BB'),
('KT061', 'Parepare', 'ST'),
('KT062', 'Pariaman', 'SB'),
('KT063', 'Pasuruan', 'JT'),
('KT064', 'Payakumbuh', 'SB'),
('KT065', 'Pekalongan', 'JT'),
('KT066', 'Pekanbaru', 'RI'),
('KT067', 'Pematangsiantar', 'SU'),
('KT068', 'Pontianak', 'KB'),
('KT069', 'Prabumulih', 'SS'),
('KT070', 'Probolinggo', 'JT'),
('KT071', 'Sabang', 'AC'),
('KT072', 'Salatiga', 'JT'),
('KT073', 'Samarinda', 'KT'),
('KT074', 'Sawahlunto', 'SB'),
('KT075', 'Semarang', 'JT'),
('KT076', 'Serang', 'BT'),
('KT077', 'Sibolga', 'SU'),
('KT078', 'Singkawang', 'KB'),
('KT079', 'Solok', 'SB'),
('KT080', 'Sorong', 'PB'),
('KT081', 'Subulussalam', 'AC'),
('KT082', 'Sukabumi', 'JB'),
('KT083', 'Sungai Penuh', 'JA'),
('KT084', 'Surabaya', 'JI'),
('KT085', 'Surakarta', 'JT'),
('KT086', 'Tangerang Selatan', 'BT'),
('KT087', 'Tangerang', 'BT'),
('KT088', 'Tanjung Pinang', 'KR'),
('KT089', 'Tanjungbalai', 'SU'),
('KT090', 'Tarakan', 'KU'),
('KT091', 'Tasikmalaya', 'JB'),
('KT092', 'Tebing Tinggi', 'SU'),
('KT093', 'Tegal', 'JT'),
('KT094', 'Ternate', 'MU'),
('KT095', 'TKTore Kepulauan', 'MU'),
('KT096', 'Tomohon', 'SA'),
('KT097', 'Tual', 'MA'),
('KT098', 'Yogyakarta', 'YO'),
('KT099', 'Cianjur', 'JB');

-- --------------------------------------------------------

--
-- Table structure for table `lokasi`
--

CREATE TABLE `lokasi` (
  `kd_lokasi` varchar(7) NOT NULL,
  `nama_lokasi` varchar(50) DEFAULT NULL,
  `alamat` text,
  `id_kota` varchar(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lokasi`
--

INSERT INTO `lokasi` (`kd_lokasi`, `nama_lokasi`, `alamat`, `id_kota`) VALUES
('KL00001', 'Stasiun Kereta Api Bandung', 'Kb. Jeruk, Kb. Jeruk, Jl. Stasiun Barat, 40181, Kebon Jeruk, Andir, Kota Bandung', 'KT005'),
('KL00002', 'SMA Negeri 9 Bandung', 'Jalan Suparmin No.1A, Pajajaran, Cicendo, Pajajaran, Cicendo, Kota Bandung, Jawa Barat 40173', 'KT005'),
('KL00003', 'SMP Negeri 40 Bandung', 'Jl. Wastukencana Blok A No.75, Tamansari, Bandung Wetan, Kota Bandung, Jawa Barat 40116', 'KT005'),
('KL00004', 'Stasiun Surabaya Gubeng', 'Jl. Stasiun Gubeng, Pacar Keling, Tambaksari, Kota SBY, Jawa Timur 60272', 'KT084'),
('KL00005', 'Bandara Interasional Kualanamu', 'Jalan Bandara Kuala Namu, Beringin, Kabupaten Deli Serdang, Sumatera Utara 20553', 'KT049'),
('KL00006', 'SMP Negeri 1 Surabaya', 'Jl. Pacar No.4-6, Ketabang, Genteng, Kota SBY, Jawa Timur 60272', 'KT084'),
('KL00007', 'Bandar Udara Internasional Abdulrachman Saleh', 'Jl. Komodor Udara Abdul Rahman Saleh, Bunut Wetan, Pakis, Malang, Jawa Timur 65154', 'KT046'),
('KL00008', 'SMP Negeri 37 Surabaya', 'Jl. Kalianyar No.18-20, Kapasari, Genteng, Kota Surabaya, Jawa Timur 60273', 'KT084'),
('KL00009', 'SMK Negeri 5 Malang', 'Jl. Ikan Piranha Atas, Tunjungsekar, Kec. Lowokwaru, Kota Malang, Jawa Timur 65146', 'KT046'),
('KL00010', 'SMAN 9 Malang', 'Jl. Puncak Borobudur No.1, Mojolangu, Kec. Lowokwaru, Kota Malang, Jawa Timur 65142', 'KT046'),
('KL00011', 'Politeknik Negeri Bandung', 'Ciwaruga, Parongpong, Ciwaruga, Parongpong, West Bandung Regency, Jawa Barat 40559', 'KT005'),
('KL00012', 'Gedung DPRD Kabupaten Bandung', 'Jl. Raya Soreang KM.17, Pamekaran, Soreang, Bandung, Jawa Barat 40912', 'KT005'),
('KL00013', 'SMP Pangudi Luhur 1 Yogyakarta', 'Jalan Timoho II, Muja Muju, Umbulharjo, Yogyakarta City, Special Region of Yogyakarta 55165', 'KT098'),
('KL00014', 'Stasiun Lempuyangan', 'Bausasran, Danurejan, Kota Yogyakarta, Daerah Istimewa Yogyakarta', 'KT098'),
('KL00015', 'Stasiun Tebet', 'Jl. Tebet Raya No.62, Tebet Tim., Tebet, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12820', 'KT031'),
('KL00016', 'SMA Negeri 8 Jakarta', 'Jalan Taman Bukit Duri, RT.2/RW.12, Bukit Duri, Tebet, RT.2/RW.12, RT.2/RW.12, Bukit Duri, Tebet, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12840', 'KT031'),
('KL00017', 'SMP Negeri 1 Cimahi', 'Jl. SMP No.12, Karangmekar, Cimahi Tengah, Kota Cimahi, Jawa Barat 40523', 'KT022'),
('KL00018', 'Bandara Husein Sastranegara', 'Jl. Pajajaran No. 156, Husen Sastranegara, Cicendo, Kota Bandung, Jawa Barat 40174', 'KT005'),
('KL00019', 'SMK Teratai Putih Global 1 Bekasi', 'Perumahan Bumi Satria Kencana, Jalan Arjuna IV, Kayuringin Jaya, Bekasi Selatan, Kayuringin Jaya, Bekasi Sel., Kota Bks, Jawa Barat 17114', 'KT012'),
('KL00020', 'SMA Negeri 36 Jakarta', 'Jl. Perhubungan Raya, RT.20/RW.6, Jati, Pulo Gadung, Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta 13220', 'KT032'),
('KL00021', 'Institut Teknologi Bandung', 'Jl. Ganesha No.10, Lb. Siliwangi, Coblong, Kota Bandung, Jawa Barat 40132', 'KT005'),
('KL00022', 'Museum Geologi', 'Jl. Diponegoro No.57, Cihaur Geulis, Cibeunying Kaler, Kota Bandung, Jawa Barat 40122', 'KT005'),
('KL00023', 'Gedung Sate', 'Jalan Diponegoro No.22, Citarum, Bandung Wetan, Citarum, Bandung Wetan, Kota Bandung, Jawa Barat 40115', 'KT005'),
('KL00024', 'Universitas Indonesia', 'Jl. Margonda Raya, Beji, Pondok Cina, Kota Depok, Jawa Barat 16424', 'KT025'),
('KL00025', 'Green Purwa Residence', 'Jl. Timbul IV, RT.6/RW.6, Cipedak, Jagakarsa, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12630', 'KT031'),
('KL00026', 'SMP Negeri 131 Jakarta', 'Jl. Moh. Kahfi I No.13, RT.4/RW.2, Cipedak, Jagakarsa, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12630', 'KT031'),
('KL00027', 'SMA Negeri 6 Surakata', 'Jl. Mr. Sartono No.30, Nusukan, Banjarsari, Kota Surakarta, Jawa Tengah 57136', 'KT085'),
('KL00028', 'Stasiun Solobalapan', 'Jalan Wolter Monginsidi No.112, Kestalan, Banjarsari, Kestalan, Surakarta, Kota Surakarta, Jawa Tengah 57133', 'KT085'),
('KL00029', 'Pemkot Cimahi', 'Jl. Raden Demang Harja Kusumah, No. 1, Cimahi Utara, Cibabat, Cimahi, Jawa Barat, 40132', 'KT022'),
('KL00030', 'Bosscha Observatory', 'Peneropong Bintang, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391', 'KT005'),
('KL00031', 'Universitas Brawijaya', 'Jalan Veteran, Ketawanggede, Kec. Lowokwaru, Kota Malang, Jawa Timur 65145', 'KT046'),
('KL00032', 'Taman Krida Budaya', 'Jl. Soekarno Hatta No.7, Jatimulyo, Kec. Lowokwaru, Kota Malang, Jawa Timur 65142', 'KT046'),
('KL00033', 'Rumah', 'JL Kalibunder, Blok A 4 No. 1, Komplek Griya Maleber, Pamoyanan, Kec. Cianjur, Kabupaten Cianjur, Jawa Barat 43211', 'KT099'),
('KL00034', 'Hotel Amaroossa Bandung', 'Jl. Aceh No. 71 A, Citarum, Bandung Wetan, Citarum, Bandung Wetan, Kota Bandung, Jawa Barat 40115', 'KT005'),
('KL00035', 'Rumah Makan Ampera', 'Jl. PH.H. Mustofa, Sukapada, Cibeunying Kidul, Kota Bandung, Jawa Barat 40125', 'KT005'),
('KL00036', 'SMA Negeri 20 Bandung', 'Jalan Citarum No.23, Citarum, Bandung Wetan, Citarum, Bandung Wetan, Kota Bandung, Jawa Barat 40115', 'KT005'),
('KL00037', 'SMP Negeri 14 Bandung', 'Jl. Lap. Supratman No.8, Cihapit, Bandung Wetan, Kota Bandung, Jawa Barat 40114', 'KT005'),
('KL00038', 'Rumah Makan Sugih Parahyangan', 'Jl. Ters. Jkt No.48, Babakan Surabaya, Kiaracondong, Kota Bandung, Jawa Barat 40291', 'KT005'),
('KL00039', 'Dinas Pendidikan Kab. Cianjur', 'Jl. Perintis Kemerdekaan No. 3, Cilaku, Sirnagalih, Cilaku, Kabupaten Cianjur, Jawa Barat', 'KT099'),
('KL00040', 'Dinas Pendidikan Provinsi Jawa Barat', 'Jl. Ahmad Yani No.239, Pasir Kaliki, Cicendo, Kota Bandung, Jawa Barat 40171', 'KT005'),
('KL00041', 'Bandara Internasional Juanda Surabaya ', 'Jl. Ir. H. Juanda, Betro, Sedati, Kabupaten Sidoarjo, Jawa Timur 61253', 'KT084'),
('KL00042', 'Red Planet Hotel Surabaya', 'Jl. Arjuna No. 64 - 66, Surabaya, Jawa Timur 60251', 'KT084'),
('KL00043', 'SMAN 15 Surabaya', 'Jl. Dukuh Menanggal Sel. No.103, Dukuh Menanggal, Gayungan, Kota SBY, Jawa Timur 60234', 'KT084'),
('KL00044', 'Bebek Handayani Surabaya', 'Jl. Parang Kusumo No.2-I, Kemayoran, Krembangan, Kota SBY, Jawa Timur 60176', 'KT084'),
('KL00045', 'Mesjid Cheng Ho Surabaya', 'Jl. Gading No.2, Ketabang, Genteng, Kota SBY, Jawa Timur 60272', 'KT084'),
('KL00046', 'Stasiun Kota Malang', 'Jalan Trunojoyo No.10, Klojen, Kiduldalem, Klojen, Kota Malang, Jawa Timur 65111', 'KT046'),
('KL00047', 'Hotel Gajahmada Graha', 'Jalan Doktor Cipto No.17, Rampal Celaket, Klojen, Rampal Celaket, Klojen, Kota Malang, Jawa Timur 65111', 'KT046'),
('KL00048', 'SMPN 12 Malang', 'Bandungrejosari, Sukun, Kota Malang, Jawa Timur 65148', 'KT046'),
('KL00049', 'Bakso Bakar Pak Man', 'Jl. Diponegoro No.19, Klojen, Kota Malang, Jawa Timur 65111', 'KT046'),
('KL00050', 'Taman Kunang Kunang ', 'Jl. Jakarta, Oro-oro Dowo, Klojen, Kota Malang, Jawa Timur 65113', 'KT046');

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
('KMT05', 'Motor'),
('KMT06', 'Sepeda');

-- --------------------------------------------------------

--
-- Table structure for table `perjalanan`
--

CREATE TABLE `perjalanan` (
  `id_perjalanan` varchar(7) NOT NULL,
  `waktu_tempuh` int(11) DEFAULT NULL,
  `jarak_tempuh` int(11) DEFAULT NULL,
  `kode_lokasi_awal` varchar(7) DEFAULT NULL,
  `kode_lokasi_akhir` varchar(7) DEFAULT NULL,
  `kd_moda` varchar(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `perjalanan`
--

INSERT INTO `perjalanan` (`id_perjalanan`, `waktu_tempuh`, `jarak_tempuh`, `kode_lokasi_awal`, `kode_lokasi_akhir`, `kd_moda`) VALUES
('IDP0001', 19, 5, 'KL00002', 'KL00003', 'KMT03'),
('IDP0002', 13, 4, 'KL00002', 'KL00003', 'KMT05'),
('IDP0003', 67, 30, 'KL00011', 'KL00012', 'KMT03'),
('IDP0004', 50, 31, 'KL00011', 'KL00012', 'KMT05'),
('IDP0005', 15, 2, 'KL00003', 'KL00001', 'KMT03'),
('IDP0006', 5, 2, 'KL00003', 'KL00001', 'KMT05'),
('IDP0007', 12, 2, 'KL00003', 'KL00001', 'KMT06'),
('IDP0008', 99, 63, 'KL00033', 'KL00034', 'KMT03'),
('IDP0009', 3, 1, 'KL00034', 'KL00036', 'KMT03'),
('IDP0010', 7, 3, 'KL00036', 'KL00035', 'KMT03'),
('IDP0011', 10, 4, 'KL00035', 'KL00034', 'KMT03'),
('IDP0012', 5, 2, 'KL00034', 'KL00037', 'KMT03'),
('IDP0013', 9, 4, 'KL00037', 'KL00038', 'KMT03'),
('IDP0014', 10, 4, 'KL00038', 'KL00034', 'KMT03'),
('IDP0015', 95, 68, 'KL00034', 'KL00039', 'KMT03'),
('IDP0016', 11, 8, 'KL00039', 'KL00033', 'KMT03'),
('IDP0017', 133, 63, 'KL00033', 'KL00018', 'KMT03'),
('IDP0018', 90, 573, 'KL00018', 'KL00041', 'KMT02'),
('IDP0019', 40, 19, 'KL00041', 'KL00042', 'KMT03'),
('IDP0020', 30, 12, 'KL00042', 'KL00043', 'KMT03'),
('IDP0021', 34, 14, 'KL00043', 'KL00044', 'KMT05'),
('IDP0022', 25, 4, 'KL00044', 'KL00045', 'KMT05'),
('IDP0023', 15, 2, 'KL00045', 'KL00004', 'KMT04'),
('IDP0024', 168, 90, 'KL00004', 'KL00046', 'KMT01'),
('IDP0025', 3, 1, 'KL00046', 'KL00047', 'KMT03'),
('IDP0026', 18, 5, 'KL00047', 'KL00048', 'KMT03'),
('IDP0027', 18, 5, 'KL00048', 'KL00049', 'KMT03'),
('IDP0028', 9, 3, 'KL00049', 'KL00050', 'KMT05'),
('IDP0029', 10, 4, 'KL00050', 'KL00047', 'KMT05'),
('IDP0030', 25, 12, 'KL00047', 'KL00007', 'KMT03');

-- --------------------------------------------------------

--
-- Table structure for table `provinsi`
--

CREATE TABLE `provinsi` (
  `id_provinsi` varchar(5) NOT NULL,
  `nama_provinsi` varchar(50) DEFAULT NULL,
  `ibu_kota` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `provinsi`
--

INSERT INTO `provinsi` (`id_provinsi`, `nama_provinsi`, `ibu_kota`) VALUES
('AC', 'Aceh', 'Banda Aceh'),
('BA', 'Bali', 'Denpasar'),
('BB', 'Kepulauan Bangka Belitung', 'Pangkalpinang'),
('BE', 'Bengkulu', 'Bengkulu'),
('BT', 'Banten', 'Serang'),
('GO', 'Gorontalo', 'Gorontalo'),
('JA', 'Jambi', 'Jambi'),
('JB', 'Jawa Barat', 'Bandung'),
('JI', 'Jawa Timur', 'Surabaya'),
('JK', 'Jakarta', 'Jakarta'),
('JT', 'Jawa Tengah', 'Semarang'),
('KB', 'Kalimantan Barat', 'Pontianak'),
('KI', 'Kalimantan Timur', 'Samarinda'),
('KR', 'Kepulauan Riau', 'Tanjung Pinang'),
('KS', 'Kalimantan Selatan', 'Banjarmasin'),
('KT', 'Kalimantan Tengah', 'Palangkaraya'),
('KU', 'Kalimantan Utara', 'Tanjungselor'),
('LA', 'Lampung', 'Bandar Lampung'),
('MA', 'Maluku', 'Ambon'),
('MU', 'Maluku Utara', 'Sofifi'),
('NB', 'Nusa Tenggara Barat', 'Mataram'),
('NT', 'Nusa Tenggara Timur', 'Kupang'),
('PA', 'Papua', 'Jayapura'),
('PB', 'Papua Barat', 'Manokwari'),
('RI', 'Riau', 'Pekanbaru'),
('SA', 'Sulawesi Utara', 'Manado'),
('SB', 'Sumatera Barat', 'Padang'),
('SG', 'Sulawesi Tenggara', 'Kendari'),
('SN', 'Sulawesi Selatan', 'Makassar'),
('SR', 'Sulawesi Barat', 'Mamuju'),
('SS', 'Sumatera Selatan', 'Palembang'),
('ST', 'Sulawesi Tengah', 'Palu'),
('SU', 'Sumatera Utara', 'Medan'),
('YO', 'Yogyakarta', 'Yogyakarta');

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
('TR0001', 'Kanto', 'kanto1@gmail.com', 'kanto123', 'KL00033');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `event`
--
ALTER TABLE `event`
  ADD PRIMARY KEY (`id_event`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_lookup` (`id_perjalanan`);

--
-- Indexes for table `kendaraan`
--
ALTER TABLE `kendaraan`
  ADD PRIMARY KEY (`kd_kendaraan`),
  ADD KEY `kd_moda` (`kd_moda`);

--
-- Indexes for table `kota`
--
ALTER TABLE `kota`
  ADD PRIMARY KEY (`id_kota`),
  ADD KEY `id_provinsi` (`id_provinsi`);

--
-- Indexes for table `lokasi`
--
ALTER TABLE `lokasi`
  ADD PRIMARY KEY (`kd_lokasi`),
  ADD KEY `lookup_ibfk_1` (`id_kota`);

--
-- Indexes for table `moda_transportasi`
--
ALTER TABLE `moda_transportasi`
  ADD PRIMARY KEY (`kd_moda`);

--
-- Indexes for table `perjalanan`
--
ALTER TABLE `perjalanan`
  ADD PRIMARY KEY (`id_perjalanan`),
  ADD KEY `kode_lokasi_awal` (`kode_lokasi_awal`),
  ADD KEY `kode_lokasi_akhir` (`kode_lokasi_akhir`),
  ADD KEY `kd_moda` (`kd_moda`);

--
-- Indexes for table `provinsi`
--
ALTER TABLE `provinsi`
  ADD PRIMARY KEY (`id_provinsi`);

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
-- Constraints for table `event`
--
ALTER TABLE `event`
  ADD CONSTRAINT `event_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`),
  ADD CONSTRAINT `event_ibfk_2` FOREIGN KEY (`id_perjalanan`) REFERENCES `perjalanan` (`id_perjalanan`);

--
-- Constraints for table `kendaraan`
--
ALTER TABLE `kendaraan`
  ADD CONSTRAINT `kendaraan_ibfk_1` FOREIGN KEY (`kd_moda`) REFERENCES `moda_transportasi` (`kd_moda`);

--
-- Constraints for table `kota`
--
ALTER TABLE `kota`
  ADD CONSTRAINT `kota_ibfk_1` FOREIGN KEY (`id_provinsi`) REFERENCES `provinsi` (`id_provinsi`);

--
-- Constraints for table `lokasi`
--
ALTER TABLE `lokasi`
  ADD CONSTRAINT `lookup_ibfk_1` FOREIGN KEY (`id_kota`) REFERENCES `kota` (`id_kota`);

--
-- Constraints for table `perjalanan`
--
ALTER TABLE `perjalanan`
  ADD CONSTRAINT `perjalanan_ibfk_1` FOREIGN KEY (`kode_lokasi_awal`) REFERENCES `lokasi` (`kd_lokasi`),
  ADD CONSTRAINT `perjalanan_ibfk_2` FOREIGN KEY (`kode_lokasi_akhir`) REFERENCES `lokasi` (`kd_lokasi`),
  ADD CONSTRAINT `perjalanan_ibfk_3` FOREIGN KEY (`kd_moda`) REFERENCES `moda_transportasi` (`kd_moda`);

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`posisi_sekarang`) REFERENCES `lokasi` (`kd_lokasi`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
