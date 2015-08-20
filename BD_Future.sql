create schema future;

use future;

-- Table Mesero

CREATE TABLE Mesero
(
  Me_id Varchar(20) NOT NULL,
  Me_Nombre Varchar(20) NOT NULL,
  Me_apellido Varchar(20) NOT NULL,
  Me_telefono Varchar(20)
)
;

ALTER TABLE Mesero ADD PRIMARY KEY (Me_id)
;

-- Table Despachador

CREATE TABLE Despachador
(
  Des_Id Varchar(20) NOT NULL,
  Des_nombre Varchar(20) NOT NULL,
  Des_apellido Varchar(20) NOT NULL,
  Des_telefono Varchar(20)
)
;

ALTER TABLE Despachador ADD PRIMARY KEY (Des_Id)
;

-- Table Producto

CREATE TABLE Producto
(
  Pro_id Varchar(20) NOT NULL,
  Pro_nombre Varchar(20) NOT NULL,
  Pro_valor Double NOT NULL,
  Pro_descripcion Varchar(200)
)
;

ALTER TABLE Producto ADD PRIMARY KEY (Pro_id)
;

-- Table Administrador

CREATE TABLE Administrador
(
  Ad_id Varchar(20) NOT NULL,
  Ad_nombre Varchar(20) NOT NULL,
  Ad_apellido Char(1) NOT NULL,
  Ad_telefono Char(1),
  Ad_clave Varchar(20) NOT NULL
)
;

ALTER TABLE Administrador ADD PRIMARY KEY (Ad_id)
;

-- Table Venta

CREATE TABLE Venta
(
  Ven_id Int NOT NULL,
  Ven_fecha Date NOT NULL,
  Ven_estado Varchar(20) NOT NULL,
  Cli_id Varchar(20),
  Me_id Varchar(20),
  Mesa_id Varchar(20),
  Caj_id Varchar(20)
)
;

ALTER TABLE Venta ADD PRIMARY KEY (Ven_id)
;

CREATE INDEX IX_Relationship1 ON Venta (Cli_id)
;

CREATE INDEX IX_Relationship3 ON Venta (Me_id)
;

CREATE INDEX IX_Relationship14 ON Venta (Mesa_id)
;

CREATE INDEX IX_Relationship16 ON Venta (Caj_id)
;

-- Table Compras

CREATE TABLE Compras
(
  Com_id Int NOT NULL,
  Com_fecha Date NOT NULL
)
;

ALTER TABLE Compras ADD PRIMARY KEY (Com_id)
;

-- Table Detalle_compra

CREATE TABLE Detalle_compra
(
  Dtc_cantidad Int NOT NULL
)
;

-- Table Insumos

CREATE TABLE Insumos
(
  Ins_id Varchar(20) NOT NULL,
  Ins_nombre Varchar(20) NOT NULL,
  Ins_valor Double NOT NULL
)
;

ALTER TABLE Insumos ADD PRIMARY KEY (Ins_id)
;

-- Table Mesa

CREATE TABLE Mesa
(
  Mesa_id Varchar(20) NOT NULL,
  Mesa_estado Varchar(20) NOT NULL
)
;

ALTER TABLE Mesa ADD PRIMARY KEY (Mesa_id)
;

-- Table Cajero

CREATE TABLE Cajero
(
  Caj_id Varchar(20) NOT NULL,
  Caj_nombre Varchar(20) NOT NULL,
  Caj_apellido Varchar(20) NOT NULL,
  Caj_clave Varchar(20) NOT NULL,
  Caj_telefono Varchar(20)
)
;

ALTER TABLE Cajero ADD PRIMARY KEY (Caj_id)
;

-- Table Cliente

CREATE TABLE Cliente
(
  Cli_id Varchar(20) NOT NULL,
  Cli_nombre Varchar(20) NOT NULL,
  Cli_apellido Varchar(20) NOT NULL,
  Cli_sexo Varchar(20) NOT NULL,
  Cli_puntos Int NOT NULL,
  Cli_musica Varchar(200),
  Cli_email Varchar(20),
  Cli_telefono Char(1)
)
;

ALTER TABLE Cliente ADD PRIMARY KEY (Cli_id)
;

-- Table Detalles_Venta

CREATE TABLE Detalles_Venta
(
  Pro_id Varchar(20) NOT NULL,
  Ven_id Int NOT NULL,
  Dtv_cantidad Char(1)
)
;

ALTER TABLE Detalles_Venta ADD PRIMARY KEY (Pro_id,Ven_id)
;

-- Table Detalles_compras

CREATE TABLE Detalles_compras
(
  Com_id Int NOT NULL,
  Ins_id Varchar(20) NOT NULL,
  Dtc_cantidad Char(1)
)
;

ALTER TABLE Detalles_compras ADD PRIMARY KEY (Com_id,Ins_id)
;

-- Create relationships section ------------------------------------------------- 

ALTER TABLE Venta ADD CONSTRAINT  FOREIGN KEY (Cli_id) REFERENCES Cliente (Cli_id) ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE Venta ADD CONSTRAINT  FOREIGN KEY (Me_id) REFERENCES Mesero (Me_id) ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE Detalles_Venta ADD CONSTRAINT  FOREIGN KEY (Pro_id) REFERENCES Producto (Pro_id) ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE Detalles_Venta ADD CONSTRAINT  FOREIGN KEY (Ven_id) REFERENCES Venta (Ven_id) ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE Detalles_compras ADD CONSTRAINT  FOREIGN KEY (Com_id) REFERENCES Compras (Com_id) ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE Detalles_compras ADD CONSTRAINT  FOREIGN KEY (Ins_id) REFERENCES Insumos (Ins_id) ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE Venta ADD CONSTRAINT  FOREIGN KEY (Mesa_id) REFERENCES Mesa (Mesa_id) ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE Venta ADD CONSTRAINT Relationship16 FOREIGN KEY (Caj_id) REFERENCES Cajero (Caj_id) ON DELETE NO ACTION ON UPDATE NO ACTION
;

