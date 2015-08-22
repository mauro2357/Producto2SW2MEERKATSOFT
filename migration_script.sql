-- ----------------------------------------------------------------------------
-- MySQL Workbench Migration
-- Migrated Schemata: futurem
-- Source Schemata: future
-- Created: Fri Aug 21 17:11:38 2015
-- ----------------------------------------------------------------------------

SET FOREIGN_KEY_CHECKS = 0;;

-- ----------------------------------------------------------------------------
-- Schema futurem
-- ----------------------------------------------------------------------------
DROP SCHEMA IF EXISTS `future` ;
CREATE SCHEMA IF NOT EXISTS `futurem`;;

-- ----------------------------------------------------------------------------
-- Table futurem.administrador
-- ----------------------------------------------------------------------------
CREATE  TABLE IF NOT EXISTS `futurem`.`administrador` (
  `Ad_id` VARCHAR(20) NOT NULL ,
  `Ad_nombre` VARCHAR(20) NOT NULL ,
  `Ad_apellido` VARCHAR(20) NOT NULL ,
  `Ad_telefono` CHAR(1) NULL DEFAULT NULL ,
  `Ad_clave` VARCHAR(20) NOT NULL ,
  PRIMARY KEY (`Ad_id`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- ----------------------------------------------------------------------------
-- Table futurem.cajero
-- ----------------------------------------------------------------------------
CREATE  TABLE IF NOT EXISTS `futurem`.`cajero` (
  `Caj_id` VARCHAR(20) NOT NULL ,
  `Caj_nombre` VARCHAR(20) NOT NULL ,
  `Caj_apellido` VARCHAR(20) NOT NULL ,
  `Caj_clave` VARCHAR(20) NOT NULL ,
  `Caj_telefono` VARCHAR(20) NULL DEFAULT NULL ,
  PRIMARY KEY (`Caj_id`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- ----------------------------------------------------------------------------
-- Table futurem.cliente
-- ----------------------------------------------------------------------------
CREATE  TABLE IF NOT EXISTS `futurem`.`cliente` (
  `Cli_id` VARCHAR(20) NOT NULL ,
  `Cli_nombre` VARCHAR(20) NOT NULL ,
  `Cli_apellido` VARCHAR(20) NOT NULL ,
  `Cli_sexo` VARCHAR(20) NOT NULL ,
  `Cli_puntos` INT(11) NOT NULL DEFAULT '0' ,
  `Cli_musica` VARCHAR(200) NULL DEFAULT NULL ,
  `Cli_email` VARCHAR(20) NULL DEFAULT NULL ,
  `Cli_telefono` CHAR(1) NULL DEFAULT NULL ,
  PRIMARY KEY (`Cli_id`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- ----------------------------------------------------------------------------
-- Table futurem.compras
-- ----------------------------------------------------------------------------
CREATE  TABLE IF NOT EXISTS `futurem`.`compras` (
  `Com_id` INT(11) NOT NULL AUTO_INCREMENT ,
  `Com_fecha` DATE NOT NULL ,
  PRIMARY KEY (`Com_id`) )
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = latin1;

-- ----------------------------------------------------------------------------
-- Table futurem.despachador
-- ----------------------------------------------------------------------------
CREATE  TABLE IF NOT EXISTS `futurem`.`despachador` (
  `Des_Id` VARCHAR(20) NOT NULL ,
  `Des_nombre` VARCHAR(20) NOT NULL ,
  `Des_apellido` VARCHAR(20) NOT NULL ,
  `Des_telefono` VARCHAR(20) NULL DEFAULT NULL ,
  PRIMARY KEY (`Des_Id`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- ----------------------------------------------------------------------------
-- Table futurem.detalles_compras
-- ----------------------------------------------------------------------------
CREATE  TABLE IF NOT EXISTS `futurem`.`detalles_compras` (
  `Com_id` INT(11) NOT NULL ,
  `Ins_id` VARCHAR(20) NOT NULL ,
  `Dtc_cantidad` CHAR(1) NULL DEFAULT NULL ,
  PRIMARY KEY (`Com_id`, `Ins_id`) ,
  INDEX `Ins_id` (`Ins_id` ASC) ,
  CONSTRAINT `detalles_compras_ibfk_2`
    FOREIGN KEY (`Ins_id` )
    REFERENCES `futurem`.`insumos` (`Ins_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `detalles_compras_ibfk_1`
    FOREIGN KEY (`Com_id` )
    REFERENCES `futurem`.`compras` (`Com_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- ----------------------------------------------------------------------------
-- Table futurem.insumos
-- ----------------------------------------------------------------------------
CREATE  TABLE IF NOT EXISTS `futurem`.`insumos` (
  `Ins_id` VARCHAR(20) NOT NULL ,
  `Ins_nombre` VARCHAR(20) NOT NULL ,
  `Ins_valor` DOUBLE NOT NULL ,
  PRIMARY KEY (`Ins_id`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- ----------------------------------------------------------------------------
-- Table futurem.detalles_venta
-- ----------------------------------------------------------------------------
CREATE  TABLE IF NOT EXISTS `futurem`.`detalles_venta` (
  `Pro_id` VARCHAR(20) NOT NULL ,
  `Ven_id` INT(11) NOT NULL ,
  `Dtv_cantidad` CHAR(1) NULL DEFAULT NULL ,
  PRIMARY KEY (`Pro_id`, `Ven_id`) ,
  INDEX `Ven_id` (`Ven_id` ASC) ,
  CONSTRAINT `detalles_venta_ibfk_2`
    FOREIGN KEY (`Ven_id` )
    REFERENCES `futurem`.`venta` (`Ven_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `detalles_venta_ibfk_1`
    FOREIGN KEY (`Pro_id` )
    REFERENCES `futurem`.`producto` (`Pro_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- ----------------------------------------------------------------------------
-- Table futurem.venta
-- ----------------------------------------------------------------------------
CREATE  TABLE IF NOT EXISTS `futurem`.`venta` (
  `Ven_id` INT(11) NOT NULL AUTO_INCREMENT ,
  `Ven_fecha` DATE NOT NULL ,
  `Ven_estado` VARCHAR(20) NOT NULL ,
  `Cli_id` VARCHAR(20) NULL DEFAULT NULL ,
  `Me_id` VARCHAR(20) NULL DEFAULT NULL ,
  `Mesa_id` VARCHAR(20) NULL DEFAULT NULL ,
  `Caj_id` VARCHAR(20) NULL DEFAULT NULL ,
  PRIMARY KEY (`Ven_id`) ,
  INDEX `IX_Relationship1` (`Cli_id` ASC) ,
  INDEX `IX_Relationship3` (`Me_id` ASC) ,
  INDEX `IX_Relationship14` (`Mesa_id` ASC) ,
  INDEX `IX_Relationship16` (`Caj_id` ASC) ,
  CONSTRAINT `Relationship16`
    FOREIGN KEY (`Caj_id` )
    REFERENCES `futurem`.`cajero` (`Caj_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `venta_ibfk_1`
    FOREIGN KEY (`Cli_id` )
    REFERENCES `futurem`.`cliente` (`Cli_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `venta_ibfk_2`
    FOREIGN KEY (`Me_id` )
    REFERENCES `futurem`.`mesero` (`Me_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `venta_ibfk_3`
    FOREIGN KEY (`Mesa_id` )
    REFERENCES `futurem`.`mesa` (`Mesa_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = latin1;

-- ----------------------------------------------------------------------------
-- Table futurem.producto
-- ----------------------------------------------------------------------------
CREATE  TABLE IF NOT EXISTS `futurem`.`producto` (
  `Pro_id` VARCHAR(20) NOT NULL ,
  `Pro_nombre` VARCHAR(20) NOT NULL ,
  `Pro_valor` DOUBLE NOT NULL ,
  `Pro_descripcion` VARCHAR(200) NULL DEFAULT NULL ,
  PRIMARY KEY (`Pro_id`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- ----------------------------------------------------------------------------
-- Table futurem.mesa
-- ----------------------------------------------------------------------------
CREATE  TABLE IF NOT EXISTS `futurem`.`mesa` (
  `Mesa_id` VARCHAR(20) NOT NULL ,
  `Mesa_estado` VARCHAR(20) NOT NULL ,
  PRIMARY KEY (`Mesa_id`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- ----------------------------------------------------------------------------
-- Table futurem.mesero
-- ----------------------------------------------------------------------------
CREATE  TABLE IF NOT EXISTS `futurem`.`mesero` (
  `Me_id` VARCHAR(20) NOT NULL ,
  `Me_Nombre` VARCHAR(20) NOT NULL ,
  `Me_apellido` VARCHAR(20) NOT NULL ,
  `Me_telefono` VARCHAR(20) NULL DEFAULT NULL ,
  PRIMARY KEY (`Me_id`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;
SET FOREIGN_KEY_CHECKS = 1;;
