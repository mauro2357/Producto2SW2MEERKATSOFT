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
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-08-28 17:42:20
