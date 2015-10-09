CREATE DATABASE  IF NOT EXISTS `future` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `future`;
-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: future
-- ------------------------------------------------------
-- Server version	5.6.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `administrador` (
  `Ad_id` varchar(20) NOT NULL,
  `Ad_nombre` varchar(20) NOT NULL,
  `Ad_apellido` varchar(20) NOT NULL,
  `Ad_telefono` varchar(20) DEFAULT NULL,
  `Ad_clave` varchar(20) NOT NULL,
  PRIMARY KEY (`Ad_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrador`
--

LOCK TABLES `administrador` WRITE;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cajero`
--

DROP TABLE IF EXISTS `cajero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cajero` (
  `Caj_id` varchar(20) NOT NULL,
  `Caj_nombre` varchar(20) NOT NULL,
  `Caj_apellido` varchar(20) NOT NULL,
  `Caj_clave` varchar(20) NOT NULL,
  `Caj_telefono` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Caj_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cajero`
--

LOCK TABLES `cajero` WRITE;
/*!40000 ALTER TABLE `cajero` DISABLE KEYS */;
INSERT INTO `cajero` VALUES ('5005','yeni','valencia','4444','77\r'),('5006','mariana','gaviria','666','89\r'),('5007','jenifer','davila','777','09');
/*!40000 ALTER TABLE `cajero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `Cli_id` varchar(20) NOT NULL,
  `Cli_nombre` varchar(20) NOT NULL,
  `Cli_apellido` varchar(20) NOT NULL,
  `Cli_sexo` varchar(20) NOT NULL,
  `Cli_puntos` int(11) NOT NULL DEFAULT '0',
  `Cli_musica` varchar(200) DEFAULT NULL,
  `Cli_email` varchar(20) DEFAULT NULL,
  `Cli_telefono` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Cli_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES ('1001','crisman','carmona','masculino',0,'pop','crispo@nada','566\r'),('1002','william','valencia','masculino',0,'pop','eusse@nada','667\r'),('1003','sebastian','eusse','masculino',0,'rock','william@nada','889\r'),('Publico','Publico','56','56',456,'456','456','56');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compras`
--

DROP TABLE IF EXISTS `compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `compras` (
  `Com_id` int(11) NOT NULL AUTO_INCREMENT,
  `Com_fecha` date NOT NULL,
  PRIMARY KEY (`Com_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compras`
--

LOCK TABLES `compras` WRITE;
/*!40000 ALTER TABLE `compras` DISABLE KEYS */;
/*!40000 ALTER TABLE `compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `despachador`
--

DROP TABLE IF EXISTS `despachador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `despachador` (
  `Des_Id` varchar(20) NOT NULL,
  `Des_nombre` varchar(20) NOT NULL,
  `Des_apellido` varchar(20) NOT NULL,
  `Des_telefono` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Des_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `despachador`
--

LOCK TABLES `despachador` WRITE;
/*!40000 ALTER TABLE `despachador` DISABLE KEYS */;
INSERT INTO `despachador` VALUES ('4040','Mauricio','Giraldo','5533787'),('456','789','456','789'),('5005','crisman','carmona','5533787'),('601','valentina','duque','33\r'),('602','adriana','roman','45\r'),('603','sandra','lopez','56\r');
/*!40000 ALTER TABLE `despachador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `insumos`
--

DROP TABLE IF EXISTS `insumos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `insumos` (
  `Ins_id` varchar(20) NOT NULL,
  `Ins_nombre` varchar(20) NOT NULL,
  `Ins_valor` int(11) NOT NULL,
  PRIMARY KEY (`Ins_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `insumos`
--

LOCK TABLES `insumos` WRITE;
/*!40000 ALTER TABLE `insumos` DISABLE KEYS */;
INSERT INTO `insumos` VALUES ('2001','bulto harina',70000),('2002','kilo pescado',5000),('2003','arroba arroz',30000),('2004','bulto papa',60000),('2005','barra salchichon',6000),('2006','kilo frijol',5000),('2007','queso',7000),('2008','caja cerveza',45000);
/*!40000 ALTER TABLE `insumos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_compra`
--

DROP TABLE IF EXISTS `detalle_compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalle_compra` (
  `Dtc_cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_compra`
--

LOCK TABLES `detalle_compra` WRITE;
/*!40000 ALTER TABLE `detalle_compra` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle_compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalles_compras`
--

DROP TABLE IF EXISTS `detalles_compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalles_compras` (
  `Com_id` int(11) NOT NULL,
  `Ins_id` varchar(20) NOT NULL,
  `Dtc_cantidad` int(11) NOT NULL,
  PRIMARY KEY (`Com_id`,`Ins_id`),
  KEY `Ins_id` (`Ins_id`),
  CONSTRAINT `detalles_compras_ibfk_1` FOREIGN KEY (`Com_id`) REFERENCES `compras` (`Com_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalles_compras_ibfk_2` FOREIGN KEY (`Ins_id`) REFERENCES `insumos` (`Ins_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalles_compras`
--

LOCK TABLES `detalles_compras` WRITE;
/*!40000 ALTER TABLE `detalles_compras` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalles_compras` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto` (
  `Pro_id` varchar(20) NOT NULL,
  `Pro_nombre` varchar(20) NOT NULL,
  `Pro_valor` int(11) NOT NULL,
  `Pro_descripcion` varchar(200) DEFAULT NULL,
  `Pro_tipo` varchar(20) NOT NULL,
  `Pro_imagen` varchar(200) NOT NULL,
  PRIMARY KEY (`Pro_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES ('be01','coca cola ',2000,'bien fria','bebida','editadas/coca.png'),('be02','gaseosa colombiana',1900,'la nuestra ','bebida','editadas/colombiana.png'),('be03','jugo natural',2500,'maracuya mora mango fresa banano guanabana','bebida','editadas/jugo.png'),('li01','cerveza pilsen',2000,'bien fria','licor','editadas/pilsen.png'),('li02','aguardiente',18000,'de pura ca','licor','editadas/guaro.png'),('li03','cerveza club',2500,'bien fria','licor','editadas/club.png'),('li04','ron medellin ',20000,'unico y  delicioso ','licor','editadas/ron-mde.png'),('pl 05','picada',15000,'carne res y cerdo morcilla chorizo','plato','editadas/picad.png'),('pl01','mondongo',7000,'delicioso mondongo con el sabor casero','plato','editadas/mondongo.png\r'),('pl02','desayuno paisa',4000,'desayuno monta','plato','editadas/desayunopaisa.png\r'),('pl03','pescado frito',12000,'con bastante grasita','plato','editadas/pescado.png\r'),('pl04','bandeja paisa',13000,'arroz chorizo chicharron frijoles maduro','plato','editadas/bandejapaisa.png\r'),('pl06','carne asada',11000,'carne res o cerdo con ensalada y papas','plato','editadas/carne_asada.png\r'),('pl07','hamburguesa',7500,'papas y tocineta','plato','editadas/hamburguesa.png\r'),('pl08','sancocho',6000,'de gallina criolla :3','plato','editadas/sancocho.png\r'),('pl09','arroz con pollo ',6000,'con raices chinas','plato','editadas/arrozpollo.png\r'),('pl10','chuzo de res',10000,'con adicion de papas','plato','editadas/chuzo.png\r');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mesa`
--

DROP TABLE IF EXISTS `mesa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mesa` (
  `Mesa_id` varchar(20) NOT NULL,
  `Mesa_estado` varchar(20) NOT NULL,
  PRIMARY KEY (`Mesa_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mesa`
--

LOCK TABLES `mesa` WRITE;
/*!40000 ALTER TABLE `mesa` DISABLE KEYS */;
INSERT INTO `mesa` VALUES ('1','ocupada'),('10','disponible'),('2','ocupada'),('3','disponible'),('4','ocupada'),('5','ocupada'),('6','ocupada'),('7','ocupada'),('8','disponible\r'),('9','disponible\r');
/*!40000 ALTER TABLE `mesa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mesero`
--

DROP TABLE IF EXISTS `mesero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mesero` (
  `Me_id` varchar(20) NOT NULL,
  `Me_Nombre` varchar(20) NOT NULL,
  `Me_apellido` varchar(20) NOT NULL,
  `Me_telefono` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Me_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mesero`
--

LOCK TABLES `mesero` WRITE;
/*!40000 ALTER TABLE `mesero` DISABLE KEYS */;
INSERT INTO `mesero` VALUES ('800','crisman','zapata','45\r'),('801','katerine','zapata','46\r'),('802','lorena','posada','67\r'),('98977','Melisa','Agudelo','5536666');
/*!40000 ALTER TABLE `mesero` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venta` (
  `Ven_id` int(11) NOT NULL AUTO_INCREMENT,
  `Ven_fecha` date NOT NULL,
  `Ven_estado` varchar(20) NOT NULL,
  `Cli_id` varchar(20) DEFAULT NULL,
  `Me_id` varchar(20) DEFAULT NULL,
  `Mesa_id` varchar(20) DEFAULT NULL,
  `Caj_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Ven_id`),
  KEY `IX_Relationship1` (`Cli_id`),
  KEY `IX_Relationship3` (`Me_id`),
  KEY `IX_Relationship14` (`Mesa_id`),
  KEY `IX_Relationship16` (`Caj_id`),
  CONSTRAINT `Relationship16` FOREIGN KEY (`Caj_id`) REFERENCES `cajero` (`Caj_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`Cli_id`) REFERENCES `cliente` (`Cli_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `venta_ibfk_2` FOREIGN KEY (`Me_id`) REFERENCES `mesero` (`Me_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `venta_ibfk_3` FOREIGN KEY (`Mesa_id`) REFERENCES `mesa` (`Mesa_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` VALUES (1,'2015-10-09','Despachado','Publico','800','1',NULL),(2,'2015-10-09','Despachado','1002','800','6',NULL),(3,'2015-10-09','Despachado','Publico','800','2',NULL),(4,'2015-10-09','Despachado','1002','800','7',NULL),(5,'2015-10-09','Despachado','1002','800','5',NULL),(6,'2015-10-09','Despachado','1002','800','4',NULL);
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalles_venta`
--

DROP TABLE IF EXISTS `detalles_venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalles_venta` (
  `Pro_id` varchar(20) NOT NULL,
  `Ven_id` int(11) NOT NULL,
  `Dtv_cantidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`Pro_id`,`Ven_id`),
  KEY `Ven_id` (`Ven_id`),
  CONSTRAINT `detalles_venta_ibfk_1` FOREIGN KEY (`Pro_id`) REFERENCES `producto` (`Pro_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalles_venta_ibfk_2` FOREIGN KEY (`Ven_id`) REFERENCES `venta` (`Ven_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalles_venta`
--

LOCK TABLES `detalles_venta` WRITE;
/*!40000 ALTER TABLE `detalles_venta` DISABLE KEYS */;
INSERT INTO `detalles_venta` VALUES ('be01',2,2),('be01',3,1),('be02',5,1),('be03',6,1),('li04',4,1),('pl06',2,2),('pl10',1,5);
/*!40000 ALTER TABLE `detalles_venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `factura`
--

select * from factura;

DROP TABLE IF EXISTS `factura`;
/*!50001 DROP VIEW IF EXISTS `factura`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `factura` AS SELECT 
 1 AS `Ven_id`,
 1 AS `Pro_id`,
 1 AS `Pro_nombre`,
 1 AS `Pro_valor`,
 1 AS `Pro_descripcion`,
 1 AS `Pro_tipo`,
 1 AS `Pro_imagen`,
 1 AS `Dtv_cantidad`,
 1 AS `Ven_fecha`,
 1 AS `Ven_estado`,
 1 AS `Cli_id`,
 1 AS `Me_id`,
 1 AS `Mesa_id`,
 1 AS `Caj_id`*/;
SET character_set_client = @saved_cs_client;

select * from factura;

create view factura as
select * from producto natural join detalles_venta natural join venta;
--
-- Dumping events for database 'future'
--

--
-- Dumping routines for database 'future'
--

--
-- Final view structure for view `factura`
--

/*!50001 DROP VIEW IF EXISTS `factura`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `factura` AS select `detalles_venta`.`Ven_id` AS `Ven_id`,`producto`.`Pro_id` AS `Pro_id`,`producto`.`Pro_nombre` AS `Pro_nombre`,`producto`.`Pro_valor` AS `Pro_valor`,`producto`.`Pro_descripcion` AS `Pro_descripcion`,`producto`.`Pro_tipo` AS `Pro_tipo`,`producto`.`Pro_imagen` AS `Pro_imagen`,`detalles_venta`.`Dtv_cantidad` AS `Dtv_cantidad`,`venta`.`Ven_fecha` AS `Ven_fecha`,`venta`.`Ven_estado` AS `Ven_estado`,`venta`.`Cli_id` AS `Cli_id`,`venta`.`Me_id` AS `Me_id`,`venta`.`Mesa_id` AS `Mesa_id`,`venta`.`Caj_id` AS `Caj_id` from ((`producto` join `detalles_venta` on((`producto`.`Pro_id` = `detalles_venta`.`Pro_id`))) join `venta` on((`detalles_venta`.`Ven_id` = `venta`.`Ven_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-10-09 17:07:42
