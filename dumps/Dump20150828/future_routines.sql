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
-- Temporary view structure for view `factura`
--

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

-- Dump completed on 2015-08-28 17:42:21
