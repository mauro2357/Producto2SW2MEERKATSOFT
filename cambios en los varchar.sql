ALTER TABLE `future`.`cajero` CHANGE COLUMN `Caj_id` `Caj_id` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Caj_nombre` `Caj_nombre` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Caj_apellido` `Caj_apellido` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Caj_clave` `Caj_clave` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Caj_telefono` `Caj_telefono` VARCHAR(200) NULL  ;

ALTER TABLE `future`.`cliente` CHANGE COLUMN `Cli_id` `Cli_id` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Cli_nombre` `Cli_nombre` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Cli_apellido` `Cli_apellido` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Cli_sexo` `Cli_sexo` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Cli_puntos` `Cli_puntos` INT(100) NOT NULL DEFAULT '0'  , CHANGE COLUMN `Cli_telefono` `Cli_telefono` VARCHAR(200) NULL  ;

ALTER TABLE `future`.`despachador` CHANGE COLUMN `Des_Id` `Des_Id` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Des_nombre` `Des_nombre` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Des_apellido` `Des_apellido` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Des_telefono` `Des_telefono` VARCHAR(200) NULL  ;

ALTER TABLE `future`.`mesero` CHANGE COLUMN `Me_id` `Me_id` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Me_Nombre` `Me_Nombre` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Me_apellido` `Me_apellido` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Me_telefono` `Me_telefono` VARCHAR(200) NULL  ;

ALTER TABLE `future`.`producto` CHANGE COLUMN `Pro_id` `Pro_id` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Pro_nombre` `Pro_nombre` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Pro_valor` `Pro_valor` INT(100) NOT NULL  , CHANGE COLUMN `Pro_tipo` `Pro_tipo` VARCHAR(200) NOT NULL  ;

ALTER TABLE `future`.`detalles_compras` DROP FOREIGN KEY `detalles_compras_ibfk_1` , DROP FOREIGN KEY `detalles_compras_ibfk_2` ;

ALTER TABLE `future`.`detalles_compras` CHANGE COLUMN `Com_id` `Com_id` INT(100) NOT NULL  , CHANGE COLUMN `Ins_id` `Ins_id` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Dtc_cantidad` `Dtc_cantidad` INT(100) NOT NULL  , 

  ADD CONSTRAINT `detalles_compras_ibfk_1`

  FOREIGN KEY (`Com_id` )

  REFERENCES `future`.`compras` (`Com_id` )

  ON DELETE NO ACTION

  ON UPDATE NO ACTION, 

  ADD CONSTRAINT `detalles_compras_ibfk_2`

  FOREIGN KEY (`Ins_id` )

  REFERENCES `future`.`insumos` (`Ins_id` )

  ON DELETE NO ACTION

  ON UPDATE NO ACTION;

ALTER TABLE `future`.`detalles_venta` DROP FOREIGN KEY `detalles_venta_ibfk_1` , DROP FOREIGN KEY `detalles_venta_ibfk_2` ;

ALTER TABLE `future`.`detalles_venta` CHANGE COLUMN `Pro_id` `Pro_id` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Ven_id` `Ven_id` INT(100) NOT NULL  , CHANGE COLUMN `Dtv_cantidad` `Dtv_cantidad` INT(100) NULL  , 

  ADD CONSTRAINT `detalles_venta_ibfk_1`

  FOREIGN KEY (`Pro_id` )

  REFERENCES `future`.`producto` (`Pro_id` )

  ON DELETE NO ACTION

  ON UPDATE NO ACTION, 

  ADD CONSTRAINT `detalles_venta_ibfk_2`

  FOREIGN KEY (`Ven_id` )

  REFERENCES `future`.`venta` (`Ven_id` )

  ON DELETE NO ACTION

  ON UPDATE NO ACTION;

ALTER TABLE `future`.`insumos` CHANGE COLUMN `Ins_id` `Ins_id` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Ins_nombre` `Ins_nombre` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Ins_valor` `Ins_valor` INT(100) NOT NULL  ;

ALTER TABLE `future`.`venta` DROP FOREIGN KEY `Relationship16` , DROP FOREIGN KEY `venta_ibfk_1` , DROP FOREIGN KEY `venta_ibfk_2` , DROP FOREIGN KEY `venta_ibfk_3` ;

ALTER TABLE `future`.`venta` CHANGE COLUMN `Ven_id` `Ven_id` INT(100) NOT NULL AUTO_INCREMENT  , CHANGE COLUMN `Ven_estado` `Ven_estado` VARCHAR(200) NOT NULL  , CHANGE COLUMN `Cli_id` `Cli_id` VARCHAR(200) NULL  , CHANGE COLUMN `Me_id` `Me_id` VARCHAR(200) NULL DEFAULT NULL  , CHANGE COLUMN `Mesa_id` `Mesa_id` VARCHAR(200) NULL DEFAULT NULL  , CHANGE COLUMN `Caj_id` `Caj_id` VARCHAR(200) NULL DEFAULT NULL  , 

  ADD CONSTRAINT `Relationship16`

  FOREIGN KEY (`Caj_id` )

  REFERENCES `future`.`cajero` (`Caj_id` )

  ON DELETE NO ACTION

  ON UPDATE NO ACTION, 

  ADD CONSTRAINT `venta_ibfk_1`

  FOREIGN KEY (`Cli_id` )

  REFERENCES `future`.`cliente` (`Cli_id` )

  ON DELETE NO ACTION

  ON UPDATE NO ACTION, 

  ADD CONSTRAINT `venta_ibfk_2`

  FOREIGN KEY (`Me_id` )

  REFERENCES `future`.`mesero` (`Me_id` )

  ON DELETE NO ACTION

  ON UPDATE NO ACTION, 

  ADD CONSTRAINT `venta_ibfk_3`

  FOREIGN KEY (`Mesa_id` )

  REFERENCES `future`.`mesa` (`Mesa_id` )

  ON DELETE NO ACTION

  ON UPDATE NO ACTION;