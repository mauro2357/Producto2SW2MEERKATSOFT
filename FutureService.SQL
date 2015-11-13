select count(Me_id),Me_id from venta natural join mesero where ven_estado="Finalizado";

select * from insumos

select (Pro_nombre), count(*)
from venta natural join producto natural join detalles_venta where Ven_estado ="finalizado"
group by Pro_nombre
having count(*) =
(select max(x.z)
from(select Pro_nombre, count(*)z
from producto natural join venta natural join detalles_venta where Ven_estado="finalizado"
group by Pro_nombre )x);

10
select (Pro_nombre),sum(Dtv_cantidad)cantidad
from venta natural join producto natural join detalles_venta where Ven_estado ="finalizado"
group by Pro_nombre
having sum(Dtv_cantidad) =
(select max(x.maximo)
from (select Pro_nombre, sum(Dtv_cantidad)maximo
from producto natural join detalles_venta natural join venta where Ven_estado ="finalizado"
group by Pro_nombre)x);


select distinct count(Ven_id)
 from venta;
 select *from factura group by pro_id

select  Mesero from (select sum(Pro_valor) Valor, Me_nombre Mesero 
from factura natural join mesero where Ven_estado='Finalizado' group by Me_id) as T;

SELECT * FROM  detalles_venta

select * from venta natural join producto