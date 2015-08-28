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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` VALUES (1,'2015-08-28','En espera','1001','800','1','5005'),(2,'2015-08-28','En espera','1001','800','1','5005'),(3,'2015-08-28','En espera','1001','800','1','5005'),(4,'2015-08-28','En espera','1001','800','2','5005'),(5,'2015-08-28','En espera','1002','800','9','5005'),(8,'2015-08-28','En espera','1001','802','1','5006'),(9,'2015-08-28','En espera','1002','800','10','5006');
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
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
