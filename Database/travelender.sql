/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     12/5/2017 3:31:30 PM                         */
/*==============================================================*/


drop table if exists EVENT;

drop table if exists LOKASI;

drop table if exists MODA_PERJALANAN;

drop table if exists TRAVELLER;

/*==============================================================*/
/* Table: EVENT                                                 */
/*==============================================================*/
create table EVENT
(
   KD_EVENT             varchar(16) not null,
   KD_TRAVELLER         varchar(6) not null,
   TRAVEL_MODE          varchar(50) not null,
   AVOIDTOLLS           bool not null,
   NAMA_EVENT           varchar(50),
   WAKTU_MULAI          datetime,
   WAKTU_SELESAI        datetime,
   KETERANGAN           text,
   primary key (KD_EVENT)
);

/*==============================================================*/
/* Table: LOKASI                                                */
/*==============================================================*/
create table LOKASI
(
   KD_EVENT             varchar(16) not null,
   LATITUDE             varchar(30),
   LONGITUDE            varchar(30),
   NAMA_LOKASI          varchar(50),
   ALAMAT               text,
   KETERANGAN           text
);

/*==============================================================*/
/* Table: MODA_PERJALANAN                                       */
/*==============================================================*/
create table MODA_PERJALANAN
(
   TRAVEL_MODE          varchar(50) not null,
   AVOIDTOLLS           bool not null,
   primary key (TRAVEL_MODE, AVOIDTOLLS)
);

/*==============================================================*/
/* Table: TRAVELLER                                             */
/*==============================================================*/
create table TRAVELLER
(
   KD_TRAVELLER         varchar(6) not null,
   NAMA_TRAVELLER       varchar(50),
   USERNAME             varchar(16),
   PASSWORD             varchar(16),
   EMAIL                varchar(35),
   primary key (KD_TRAVELLER)
);

alter table EVENT add constraint FK_MEMILIKI foreign key (KD_TRAVELLER)
      references TRAVELLER (KD_TRAVELLER) on delete restrict on update restrict;

alter table EVENT add constraint FK_MENGGUNAKAN foreign key (TRAVEL_MODE, AVOIDTOLLS)
      references MODA_PERJALANAN (TRAVEL_MODE, AVOIDTOLLS) on delete restrict on update restrict;

alter table LOKASI add constraint FK_BERTUJUAN foreign key (KD_EVENT)
      references EVENT (KD_EVENT) on delete restrict on update restrict;

