SELECT 'Consulta 1';
select pro_nombre_fabricante from producto order by  pro_nombre_fabricante asc;


SELECT 'Consulta 2';
SELECT pro_nombre_fabricante, pro_precio_unitario, pro_anno_construccion from producto where pro_anno_construccion >=2019 order by pro_nombre_fabricante;


SELECT 'Consulta 3';
SELECT pro_nombre_fabricante FROM producto where pro_proveedor='Auteco';

SELECT 'Consulta 4';
SELECT int_fabricante from intencionCompra where int_cli_alias='lucky' order by int_fabricante;

SELECT 'Consulta 5';
select int_cli_alias, cli_nombre, cli_apellido from intencionCompra, cliente where intencionCompra.int_fabricante="Yeti" and cliente.cli_alias=intencionCompra.int_cli_alias ; 

SELECT 'Consulta 6';
SELECT count(pro_nombre_fabricante) from producto where pro_anno_construccion >= 2019;