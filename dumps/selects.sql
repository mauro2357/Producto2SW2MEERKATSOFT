create view factura as
select * from producto NATURAL JOIN detalles_venta NATURAL JOIN venta;

select sum(Valor) Valors from (select sum(Dtv_cantidad)*Pro_valor Valor from producto natural join Detalles_venta natural join venta group by Pro_nombre order by Dtv_cantidad asc) as A;

INSERT INTO `future`.`venta` (`Ven_fecha`, `Ven_estado`, `Cli_id`, `Me_id`, `Mesa_id`) VALUES ('2015-09-11', 'En espera', '1001', '800', '2');

select * from producto;
select * from detalles_venta;
select * from mesero;
select * from venta;
select * from factura;
select * from despachador;
select * from detalles_compras;
select * from cajero;
select * from mesa;
select * from cliente;
delete from detalles_venta where ven_id>3;
delete from venta where ven_id>0;
ALTER TABLE venta AUTO_INCREMENT=1;
ALTER TABLE detalles_venta AUTO_INCREMENT=1;

select * from factura where ven_id=2;

Select * from venta order by ven_id desc limit 1;

select * from factura where Pro_id = "li01";



