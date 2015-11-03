create view factura as
select * from producto NATURAL JOIN detalles_venta NATURAL JOIN venta;


select sum(Valor) Valors from (select sum(Dtv_cantidad)*Pro_valor Valor from producto natural join Detalles_venta natural join venta group by Pro_nombre order by Dtv_cantidad asc) as A;

INSERT INTO `future`.`venta` (`Ven_fecha`, `Ven_estado`, `Cli_id`, `Me_id`, `Mesa_id`) VALUES ('2015-09-11', 'En espera', '1001', '800', '2');

create view lista_empleados as 
select Me_id Lista_id, Me_Nombre Nombre from mesero UNION select Des_Id Lista_id, Des_nombre Nombre from despachador UNION select Caj_id Lista_id, Caj_nombre Nombre from cajero UNION select Ad_id Lista_id, Ad_nombre Nombre from administrador;

INSERT INTO `future`.`pago_nomina` (`Empleado_id`, `Empleado_fecha`, `Empleado_valor`, `Nomina_id`) VALUES ('801', '2015-10-11', '50000', '1');

ALTER TABLE `future`.`pago_nomina` CHANGE `Nomina_id` `Nomina_id` varchar(40) NOT NULL AUTO_INCREMENT;

delete from pedidos_temporales where Me_id = 666 and Pro_id = "pl08";

select Pt_id from pedidos_temporales where Me_id = 667 and Pro_id = "pl09" group by Pt_id;
select * from pedidos_temporales where Me_id=12345 and Pro_id = 'pl07';

select * from pedidos_temporales;
select * from pedidos_temporales where Me_id=12345 order by Pt_id;

DELETE FROM `future`.`mesero` WHERE `Me_id`='666';


select max(Valor), Mesero from (select sum(Pro_valor) Valor, Me_id Mesero from factura where Ven_estado='Finalizado' group by Me_id) as T;
select * from factura order by Ven_id, Pro_id;
select * from pedidos_temporales;
select * from pago_nomina;
select * from lista_empleados;
select * from insumos;
select * from administrador;
select * from producto order by Pro_tipo, Pro_id;
select * from detalles_venta;
select * from mesero;
select * from venta;
select * from factura where Pro_id = "pl08" and Me_id = 666;
select * from despachador;
select * from compras;
select * from detalles_compras;
select * from detalle_compra;
select * from cajero;
select * from mesa;
select * from cliente;
delete from detalles_venta where Cli_id=1111;
delete from venta where Cli_id=1111;
delete from detalles_venta where ven_id>0;
delete from venta where ven_id>0;
ALTER TABLE venta AUTO_INCREMENT=1;
ALTER TABLE detalles_venta AUTO_INCREMENT=1;

UPDATE `future`.`mesa` SET `Mesa_estado`='disponible' WHERE `Mesa_id`>'0';


select * from factura where ven_id=2;

Select * from venta order by ven_id desc limit 1;

select * from factura where Pro_id = "li01";



