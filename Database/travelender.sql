-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 30 Okt 2017 pada 14.56
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
  `Kd_Event` varchar(16) NOT NULL,
  `Kd_Perjalanan` varchar(7) NOT NULL,
  `Kd_Traveller` varchar(6) NOT NULL,
  `Nama_Event` varchar(50) NOT NULL,
  `Waktu_Mulai` datetime NOT NULL,
  `Waktu_Selesai` datetime NOT NULL,
  `Keterangan` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `event`
--

INSERT INTO `event` (`Kd_Event`, `Kd_Perjalanan`, `Kd_Traveller`, `Nama_Event`, `Waktu_Mulai`, `Waktu_Selesai`, `Keterangan`) VALUES
('EV061117TR000101', 'KDP0001', 'TR0001', 'Cek In Hotel Pengawas', '2017-11-06 18:30:00', '2017-11-06 18:50:00', ''),
('EV061117TR000102', 'KDP0001', 'TR0001', 'Pertemuan Pengawas', '2017-11-06 19:00:00', '2017-11-06 21:30:00', ''),
('EV061117TR000103', 'KDP0001', 'TR0001', 'Istirahat', '2017-11-06 22:00:00', '2017-11-07 06:00:00', ''),
('EV071117TR000101', 'KDP0002', 'TR0001', 'Pengawasan dan Pelatihan', '2017-11-07 07:00:00', '2017-11-07 13:00:00', ''),
('EV071117TR000102', 'KDP0002', 'TR0001', 'ISHOMA', '2017-11-07 13:15:00', '2017-11-07 15:00:00', ''),
('EV071117TR000103', 'KDP0003', 'TR0001', 'Laporan dan Evaluasi', '2017-11-07 16:00:00', '2017-11-07 18:00:00', ''),
('EV071117TR000104', 'KDP0003', 'TR0001', 'Makan - makan(ISHOMA)', '2017-11-07 18:10:00', '2017-11-07 19:00:00', ''),
('EV071117TR000105', 'KDP0004', 'TR0001', 'Istirahat', '2017-11-07 21:00:00', '2017-11-08 04:00:00', ''),
('EV081117TR000101', 'KDP0004', 'TR0001', 'Cek out Hotel/Kepergian', '2017-11-08 04:00:00', '2017-11-08 04:30:00', ''),
('EV081117TR000102', 'KDP0005', 'TR0001', 'Cek In(KTP,TIKET,KLARIFIKASI)', '2017-11-08 05:20:00', '2017-11-08 05:40:00', ''),
('EV081117TR000103', 'KDP0006', 'TR0001', 'Pengambilan Barang bawaan', '2017-11-08 07:20:00', '2017-11-08 07:30:00', ''),
('EV081117TR000104', 'KDP0007', 'TR0001', 'Pengawasan dan Pelatihan', '2017-11-08 08:00:00', '2017-11-08 13:00:00', ''),
('EV081117TR000105', 'KDP0007', 'TR0001', 'ISHOMA', '2017-11-08 13:00:00', '2017-11-08 15:00:00', ''),
('EV081117TR000106', 'KDP0008', 'TR0001', 'Laporan dan Evaluasi', '2017-11-08 16:00:00', '2017-11-08 18:20:00', ''),
('EV081117TR000107', 'KDP0008', 'TR0001', 'Makan - makan(ISHOMA)', '2017-11-08 18:20:00', '2017-11-08 19:00:00', ''),
('EV081117TR000108', 'KDP0009', 'TR0001', 'Cek In Hotel', '2017-11-08 19:30:00', '2017-11-08 19:35:00', ''),
('EV081117TR000109', 'KDP0009', 'TR0001', 'Istirahat', '2017-11-08 21:00:00', '2017-11-09 06:00:00', ''),
('EV091117TR000101', 'KDP0010', 'TR0001', 'Cek In(KTP,TIKET,KLARIFIKASI)', '2017-11-09 07:20:00', '2017-11-09 07:45:00', ''),
('EV091117TR000102', 'KDP0011', 'TR0001', 'Pengambilan Barang bawaan', '2017-11-09 09:20:00', '2017-11-09 09:30:00', ''),
('EV091117TR000103', 'KDP0012', 'TR0001', 'Penyerahan Laporan', '2017-11-09 13:00:00', '2017-11-09 14:40:00', '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `jarak`
--

CREATE TABLE `jarak` (
  `Kd_jarak` varchar(14) NOT NULL,
  `Kd_lokasi_awal` varchar(7) NOT NULL,
  `Kd_lokasi_akhir` varchar(7) NOT NULL,
  `Jarak` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `jarak`
--

INSERT INTO `jarak` (`Kd_jarak`, `Kd_lokasi_awal`, `Kd_lokasi_akhir`, `Jarak`) VALUES
('JPL00001', 'KL00033', 'KL00034', 70),
('JPL00002', 'KL00034', 'KL00036', 1),
('JPL00003', 'KL00036', 'KL00035', 1),
('JPL00004', 'KL00035', 'KL00034', 1),
('JPL00005', 'KL00034', 'KL00018', 1),
('JPL00006', 'KL00018', 'KL00041', 578),
('JPL00007', 'KL00041', 'KL00043', 11),
('JPL00008', 'KL00043', 'KL00044', 14),
('JPL00009', 'KL00044', 'KL00051', 1),
('JPL00010', 'KL00051', 'KL00041', 30),
('JPL00011', 'KL00041', 'KL00018', 578),
('JPL00012', 'KL00018', 'KL00039', 68);

-- --------------------------------------------------------

--
-- Struktur dari tabel `kota`
--

CREATE TABLE `kota` (
  `id_kota` varchar(7) NOT NULL,
  `nama_kota` varchar(50) NOT NULL,
  `id_provinsi` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kota`
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
-- Struktur dari tabel `lokasi`
--

CREATE TABLE `lokasi` (
  `kd_lokasi` varchar(7) NOT NULL,
  `nama_lokasi` varchar(50) NOT NULL,
  `alamat` text NOT NULL,
  `id_kota` varchar(7) NOT NULL,
  `id_provinsi` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `lokasi`
--

INSERT INTO `lokasi` (`kd_lokasi`, `nama_lokasi`, `alamat`, `id_kota`, `id_provinsi`) VALUES
('KL00001', 'Stasiun Kereta Api Bandung', 'Kb. Jeruk, Kb. Jeruk, Jl. Stasiun Barat, 40181, Kebon Jeruk, Andir, Kota Bandung', 'KT005', NULL),
('KL00002', 'SMA Negeri 9 Bandung', 'Jalan Suparmin No.1A, Pajajaran, Cicendo, Pajajaran, Cicendo, Kota Bandung, Jawa Barat 40173', 'KT005', NULL),
('KL00003', 'SMP Negeri 40 Bandung', 'Jl. Wastukencana Blok A No.75, Tamansari, Bandung Wetan, Kota Bandung, Jawa Barat 40116', 'KT005', NULL),
('KL00004', 'Stasiun Surabaya Gubeng', 'Jl. Stasiun Gubeng, Pacar Keling, Tambaksari, Kota SBY, Jawa Timur 60272', 'KT084', NULL),
('KL00005', 'Bandara Interasional Kualanamu', 'Jalan Bandara Kuala Namu, Beringin, Kabupaten Deli Serdang, Sumatera Utara 20553', 'KT049', NULL),
('KL00006', 'SMP Negeri 1 Surabaya', 'Jl. Pacar No.4-6, Ketabang, Genteng, Kota SBY, Jawa Timur 60272', 'KT084', NULL),
('KL00007', 'Bandar Udara Internasional Abdulrachman Saleh', 'Jl. Komodor Udara Abdul Rahman Saleh, Bunut Wetan, Pakis, Malang, Jawa Timur 65154', 'KT046', NULL),
('KL00008', 'SMP Negeri 37 Surabaya', 'Jl. Kalianyar No.18-20, Kapasari, Genteng, Kota Surabaya, Jawa Timur 60273', 'KT084', NULL),
('KL00009', 'SMK Negeri 5 Malang', 'Jl. Ikan Piranha Atas, Tunjungsekar, Kec. Lowokwaru, Kota Malang, Jawa Timur 65146', 'KT046', NULL),
('KL00010', 'SMAN 9 Malang', 'Jl. Puncak Borobudur No.1, Mojolangu, Kec. Lowokwaru, Kota Malang, Jawa Timur 65142', 'KT046', NULL),
('KL00011', 'Politeknik Negeri Bandung', 'Ciwaruga, Parongpong, Ciwaruga, Parongpong, West Bandung Regency, Jawa Barat 40559', 'KT005', NULL),
('KL00012', 'Gedung DPRD Kabupaten Bandung', 'Jl. Raya Soreang KM.17, Pamekaran, Soreang, Bandung, Jawa Barat 40912', 'KT005', NULL),
('KL00013', 'SMP Pangudi Luhur 1 Yogyakarta', 'Jalan Timoho II, Muja Muju, Umbulharjo, Yogyakarta City, Special Region of Yogyakarta 55165', 'KT098', NULL),
('KL00014', 'Stasiun Lempuyangan', 'Bausasran, Danurejan, Kota Yogyakarta, Daerah Istimewa Yogyakarta', 'KT098', NULL),
('KL00015', 'Stasiun Tebet', 'Jl. Tebet Raya No.62, Tebet Tim., Tebet, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12820', 'KT031', NULL),
('KL00016', 'SMA Negeri 8 Jakarta', 'Jalan Taman Bukit Duri, RT.2/RW.12, Bukit Duri, Tebet, RT.2/RW.12, RT.2/RW.12, Bukit Duri, Tebet, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12840', 'KT031', NULL),
('KL00017', 'SMP Negeri 1 Cimahi', 'Jl. SMP No.12, Karangmekar, Cimahi Tengah, Kota Cimahi, Jawa Barat 40523', 'KT022', NULL),
('KL00018', 'Bandara Husein Sastranegara', 'Jl. Pajajaran No. 156, Husen Sastranegara, Cicendo, Kota Bandung, Jawa Barat 40174', 'KT005', NULL),
('KL00019', 'SMK Teratai Putih Global 1 Bekasi', 'Perumahan Bumi Satria Kencana, Jalan Arjuna IV, Kayuringin Jaya, Bekasi Selatan, Kayuringin Jaya, Bekasi Sel., Kota Bks, Jawa Barat 17114', 'KT012', NULL),
('KL00020', 'SMA Negeri 36 Jakarta', 'Jl. Perhubungan Raya, RT.20/RW.6, Jati, Pulo Gadung, Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta 13220', 'KT032', NULL),
('KL00021', 'Institut Teknologi Bandung', 'Jl. Ganesha No.10, Lb. Siliwangi, Coblong, Kota Bandung, Jawa Barat 40132', 'KT005', NULL),
('KL00022', 'Museum Geologi', 'Jl. Diponegoro No.57, Cihaur Geulis, Cibeunying Kaler, Kota Bandung, Jawa Barat 40122', 'KT005', NULL),
('KL00023', 'Gedung Sate', 'Jalan Diponegoro No.22, Citarum, Bandung Wetan, Citarum, Bandung Wetan, Kota Bandung, Jawa Barat 40115', 'KT005', NULL),
('KL00024', 'Universitas Indonesia', 'Jl. Margonda Raya, Beji, Pondok Cina, Kota Depok, Jawa Barat 16424', 'KT025', NULL),
('KL00025', 'Green Purwa Residence', 'Jl. Timbul IV, RT.6/RW.6, Cipedak, Jagakarsa, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12630', 'KT031', NULL),
('KL00026', 'SMP Negeri 131 Jakarta', 'Jl. Moh. Kahfi I No.13, RT.4/RW.2, Cipedak, Jagakarsa, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12630', 'KT031', NULL),
('KL00027', 'SMA Negeri 6 Surakata', 'Jl. Mr. Sartono No.30, Nusukan, Banjarsari, Kota Surakarta, Jawa Tengah 57136', 'KT085', NULL),
('KL00028', 'Stasiun Solobalapan', 'Jalan Wolter Monginsidi No.112, Kestalan, Banjarsari, Kestalan, Surakarta, Kota Surakarta, Jawa Tengah 57133', 'KT085', NULL),
('KL00029', 'Pemkot Cimahi', 'Jl. Raden Demang Harja Kusumah, No. 1, Cimahi Utara, Cibabat, Cimahi, Jawa Barat, 40132', 'KT022', NULL),
('KL00030', 'Bosscha Observatory', 'Peneropong Bintang, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391', 'KT005', NULL),
('KL00031', 'Universitas Brawijaya', 'Jalan Veteran, Ketawanggede, Kec. Lowokwaru, Kota Malang, Jawa Timur 65145', 'KT046', NULL),
('KL00032', 'Taman Krida Budaya', 'Jl. Soekarno Hatta No.7, Jatimulyo, Kec. Lowokwaru, Kota Malang, Jawa Timur 65142', 'KT046', NULL),
('KL00033', 'Rumah', 'JL Kalibunder, Blok A 4 No. 1, Komplek Griya Maleber, Pamoyanan, Kec. Cianjur, Kabupaten Cianjur, Jawa Barat 43211', 'KT099', NULL),
('KL00034', 'Hotel Amaroossa Bandung', 'Jl. Aceh No. 71 A, Citarum, Bandung Wetan, Citarum, Bandung Wetan, Kota Bandung, Jawa Barat 40115', 'KT005', NULL),
('KL00035', 'Rumah Makan Ampera', 'Jl. PH.H. Mustofa, Sukapada, Cibeunying Kidul, Kota Bandung, Jawa Barat 40125', 'KT005', NULL),
('KL00036', 'SMA Negeri 20 Bandung', 'Jalan Citarum No.23, Citarum, Bandung Wetan, Citarum, Bandung Wetan, Kota Bandung, Jawa Barat 40115', 'KT005', NULL),
('KL00037', 'SMP Negeri 14 Bandung', 'Jl. Lap. Supratman No.8, Cihapit, Bandung Wetan, Kota Bandung, Jawa Barat 40114', 'KT005', NULL),
('KL00038', 'Rumah Makan Sugih Parahyangan', 'Jl. Ters. Jkt No.48, Babakan Surabaya, Kiaracondong, Kota Bandung, Jawa Barat 40291', 'KT005', NULL),
('KL00039', 'Dinas Pendidikan Kab. Cianjur', 'Jl. Perintis Kemerdekaan No. 3, Cilaku, Sirnagalih, Cilaku, Kabupaten Cianjur, Jawa Barat', 'KT099', NULL),
('KL00040', 'Dinas Pendidikan Provinsi Jawa Barat', 'Jl. Ahmad Yani No.239, Pasir Kaliki, Cicendo, Kota Bandung, Jawa Barat 40171', 'KT005', NULL),
('KL00041', 'Bandara Internasional Juanda Surabaya ', 'Jl. Ir. H. Juanda, Betro, Sedati, Kabupaten Sidoarjo, Jawa Timur 61253', 'KT084', NULL),
('KL00042', 'Red Planet Hotel Surabaya', 'Jl. Arjuna No. 64 - 66, Surabaya, Jawa Timur 60251', 'KT084', NULL),
('KL00043', 'SMAN 15 Surabaya', 'Jl. Dukuh Menanggal Sel. No.103, Dukuh Menanggal, Gayungan, Kota SBY, Jawa Timur 60234', 'KT084', NULL),
('KL00044', 'Bebek Handayani Surabaya', 'Jl. Parang Kusumo No.2-I, Kemayoran, Krembangan, Kota SBY, Jawa Timur 60176', 'KT084', NULL),
('KL00045', 'Mesjid Cheng Ho Surabaya', 'Jl. Gading No.2, Ketabang, Genteng, Kota SBY, Jawa Timur 60272', 'KT084', NULL),
('KL00046', 'Stasiun Kota Malang', 'Jalan Trunojoyo No.10, Klojen, Kiduldalem, Klojen, Kota Malang, Jawa Timur 65111', 'KT046', NULL),
('KL00047', 'Hotel Gajahmada Graha', 'Jalan Doktor Cipto No.17, Rampal Celaket, Klojen, Rampal Celaket, Klojen, Kota Malang, Jawa Timur 65111', 'KT046', NULL),
('KL00048', 'SMPN 12 Malang', 'Bandungrejosari, Sukun, Kota Malang, Jawa Timur 65148', 'KT046', NULL),
('KL00049', 'Bakso Bakar Pak Man', 'Jl. Diponegoro No.19, Klojen, Kota Malang, Jawa Timur 65111', 'KT046', NULL),
('KL00050', 'Taman Kunang Kunang ', 'Jl. Jakarta, Oro-oro Dowo, Klojen, Kota Malang, Jawa Timur 65113', 'KT046', NULL),
('KL00051', 'Hotel Acardia By Horison Surabaya', 'Jl. Rajawali No.9-11 Krembangan, Surabaya\r\n', 'KT046', NULL);

-- --------------------------------------------------------

--
-- Struktur dari tabel `moda_transportasi`
--

CREATE TABLE `moda_transportasi` (
  `Id_Moda` varchar(6) NOT NULL,
  `Tipe_Moda` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `moda_transportasi`
--

INSERT INTO `moda_transportasi` (`Id_Moda`, `Tipe_Moda`) VALUES
('KMT01', 'Kereta Api'),
('KMT02', 'Pesawat'),
('KMT03', 'Mobil'),
('KMT04', 'Bus'),
('KMT05', 'Motor'),
('KMT06', 'Sepeda'),
('KMT07', 'Jalan Kaki');

-- --------------------------------------------------------

--
-- Struktur dari tabel `perjalanan`
--

CREATE TABLE `perjalanan` (
  `Kd_Perjalanan` varchar(7) NOT NULL,
  `Kd_Transportasi_Publik` varchar(6) DEFAULT NULL,
  `Kd_Transportasi_Pribadi` varchar(6) DEFAULT NULL,
  `Kd_jarak` varchar(14) NOT NULL,
  `Waktu_Tempuh` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `perjalanan`
--

INSERT INTO `perjalanan` (`Kd_Perjalanan`, `Kd_Transportasi_Publik`, `Kd_Transportasi_Pribadi`, `Kd_jarak`, `Waktu_Tempuh`) VALUES
('KDP0001', NULL, 'TP0001', 'JPL00001', 125),
('KDP0002', 'TU0002', NULL, 'JPL00002', 5),
('KDP0003', NULL, 'TP0002', 'JPL00003', 1),
('KDP0004', NULL, 'TP0002', 'JPL00004', 2),
('KDP0005', 'TU0005', NULL, 'JPL00005', 25),
('KDP0006', 'TU0003', NULL, 'JPL00006', 75),
('KDP0007', 'TU0005', NULL, 'JPL00007', 25),
('KDP0008', 'TU0001', NULL, 'JPL00008', 28),
('KDP0009', 'TU0002', NULL, 'JPL00009', 2),
('KDP0010', 'TU0005', NULL, 'JPL00010', 38),
('KDP0011', 'TU0004', NULL, 'JPL00011', 75),
('KDP0012', NULL, 'TP0001', 'JPL00012', 129);

-- --------------------------------------------------------

--
-- Struktur dari tabel `provinsi`
--

CREATE TABLE `provinsi` (
  `id_provinsi` varchar(5) NOT NULL,
  `nama_provinsi` varchar(50) NOT NULL,
  `ibu_kota` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `provinsi`
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
-- Struktur dari tabel `transportasi_pribadi`
--

CREATE TABLE `transportasi_pribadi` (
  `Kd_Transportasi_Pribadi` varchar(6) NOT NULL,
  `Kd_Moda` varchar(6) NOT NULL,
  `Nama_Transportasi_Pribadi` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transportasi_pribadi`
--

INSERT INTO `transportasi_pribadi` (`Kd_Transportasi_Pribadi`, `Kd_Moda`, `Nama_Transportasi_Pribadi`) VALUES
('TP0001', 'KMT03', 'Mobil Dinas'),
('TP0002', 'KMT07', 'Jalan Kaki');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transportasi_publik`
--

CREATE TABLE `transportasi_publik` (
  `Kd_Transportasi_Publik` varchar(6) NOT NULL,
  `Kd_Moda` varchar(6) NOT NULL,
  `Nama_Transportasi_Publik` varchar(50) DEFAULT NULL,
  `Kd_lokasi_keberangkatan` varchar(7) DEFAULT NULL,
  `Kd_lokasi_kedatangan` varchar(7) DEFAULT NULL,
  `Waktu_Berangkat` datetime DEFAULT NULL,
  `Waktu_Datang` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transportasi_publik`
--

INSERT INTO `transportasi_publik` (`Kd_Transportasi_Publik`, `Kd_Moda`, `Nama_Transportasi_Publik`, `Kd_lokasi_keberangkatan`, `Kd_lokasi_kedatangan`, `Waktu_Berangkat`, `Waktu_Datang`) VALUES
('TU0001', 'KMT03', 'Agkot', NULL, NULL, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
('TU0002', 'KMT06', 'Gojek', NULL, NULL, '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
('TU0003', 'KMT02', 'Pesawat IN 377 (Boeing 737-500)', 'KL00018', 'KL00041', '2016-09-08 06:00:00', '2016-09-08 07:15:00'),
('TU0004', 'KMT02', 'Pesawat JT 911 (Boeing 737-800)', 'KL00041', 'KL00018', '2016-09-09 08:05:00', '2016-09-09 09:20:00'),
('TU0005', 'KMT03', 'Taxi Blue Bird', NULL, NULL, '0000-00-00 00:00:00', '0000-00-00 00:00:00');

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
-- Dumping data untuk tabel `traveller`
--

INSERT INTO `traveller` (`Kd_Traveller`, `Nama_Traveller`, `Username`, `Password`, `Email`) VALUES
('TR0001', 'Kanto', 'kanto1', 'kanto123', 'kanto1@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `event`
--
ALTER TABLE `event`
  ADD PRIMARY KEY (`Kd_Event`),
  ADD KEY `Kd_Traveller` (`Kd_Traveller`),
  ADD KEY `Id_Pejalanan` (`Kd_Perjalanan`);

--
-- Indexes for table `jarak`
--
ALTER TABLE `jarak`
  ADD PRIMARY KEY (`Kd_jarak`),
  ADD KEY `Kd_lokasi_awal` (`Kd_lokasi_awal`),
  ADD KEY `Kd_lokasi_akhir` (`Kd_lokasi_akhir`);

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
  ADD KEY `id_kota` (`id_kota`),
  ADD KEY `id_provinsi` (`id_provinsi`);

--
-- Indexes for table `moda_transportasi`
--
ALTER TABLE `moda_transportasi`
  ADD PRIMARY KEY (`Id_Moda`);

--
-- Indexes for table `perjalanan`
--
ALTER TABLE `perjalanan`
  ADD PRIMARY KEY (`Kd_Perjalanan`),
  ADD KEY `Kd_jarak` (`Kd_jarak`),
  ADD KEY `Kd_Transportasi_Pribadi` (`Kd_Transportasi_Pribadi`),
  ADD KEY `Kd_Transportasi_Publik` (`Kd_Transportasi_Publik`);

--
-- Indexes for table `provinsi`
--
ALTER TABLE `provinsi`
  ADD PRIMARY KEY (`id_provinsi`);

--
-- Indexes for table `transportasi_pribadi`
--
ALTER TABLE `transportasi_pribadi`
  ADD PRIMARY KEY (`Kd_Transportasi_Pribadi`),
  ADD KEY `Kd_Moda` (`Kd_Moda`);

--
-- Indexes for table `transportasi_publik`
--
ALTER TABLE `transportasi_publik`
  ADD PRIMARY KEY (`Kd_Transportasi_Publik`),
  ADD KEY `Kd_Moda` (`Kd_Moda`),
  ADD KEY `Kd_lokasi_kedatangan` (`Kd_lokasi_kedatangan`),
  ADD KEY `Kd_lokasi_keberangkatan` (`Kd_lokasi_keberangkatan`);

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
  ADD CONSTRAINT `event_ibfk_2` FOREIGN KEY (`Kd_Perjalanan`) REFERENCES `perjalanan` (`Kd_Perjalanan`);

--
-- Ketidakleluasaan untuk tabel `jarak`
--
ALTER TABLE `jarak`
  ADD CONSTRAINT `jarak_ibfk_1` FOREIGN KEY (`Kd_lokasi_awal`) REFERENCES `lokasi` (`kd_lokasi`),
  ADD CONSTRAINT `jarak_ibfk_2` FOREIGN KEY (`Kd_lokasi_akhir`) REFERENCES `lokasi` (`kd_lokasi`);

--
-- Ketidakleluasaan untuk tabel `kota`
--
ALTER TABLE `kota`
  ADD CONSTRAINT `kota_ibfk_1` FOREIGN KEY (`id_provinsi`) REFERENCES `provinsi` (`id_provinsi`);

--
-- Ketidakleluasaan untuk tabel `lokasi`
--
ALTER TABLE `lokasi`
  ADD CONSTRAINT `lokasi_ibfk_1` FOREIGN KEY (`id_kota`) REFERENCES `kota` (`id_kota`),
  ADD CONSTRAINT `lokasi_ibfk_2` FOREIGN KEY (`id_provinsi`) REFERENCES `provinsi` (`id_provinsi`);

--
-- Ketidakleluasaan untuk tabel `perjalanan`
--
ALTER TABLE `perjalanan`
  ADD CONSTRAINT `perjalanan_ibfk_2` FOREIGN KEY (`Kd_jarak`) REFERENCES `jarak` (`Kd_jarak`),
  ADD CONSTRAINT `perjalanan_ibfk_3` FOREIGN KEY (`Kd_Transportasi_Pribadi`) REFERENCES `transportasi_pribadi` (`Kd_Transportasi_Pribadi`),
  ADD CONSTRAINT `perjalanan_ibfk_4` FOREIGN KEY (`Kd_Transportasi_Publik`) REFERENCES `transportasi_publik` (`Kd_Transportasi_Publik`);

--
-- Ketidakleluasaan untuk tabel `transportasi_pribadi`
--
ALTER TABLE `transportasi_pribadi`
  ADD CONSTRAINT `transportasi_pribadi_ibfk_1` FOREIGN KEY (`Kd_Moda`) REFERENCES `moda_transportasi` (`Id_Moda`);

--
-- Ketidakleluasaan untuk tabel `transportasi_publik`
--
ALTER TABLE `transportasi_publik`
  ADD CONSTRAINT `transportasi_publik_ibfk_1` FOREIGN KEY (`Kd_Moda`) REFERENCES `moda_transportasi` (`Id_Moda`),
  ADD CONSTRAINT `transportasi_publik_ibfk_2` FOREIGN KEY (`Kd_lokasi_kedatangan`) REFERENCES `lokasi` (`kd_lokasi`),
  ADD CONSTRAINT `transportasi_publik_ibfk_3` FOREIGN KEY (`Kd_lokasi_keberangkatan`) REFERENCES `lokasi` (`kd_lokasi`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
