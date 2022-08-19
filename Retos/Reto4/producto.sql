CREATE TABLE producto(
pro_id INTEGER primary key,
pro_nombre_fabricante varchar(45) NOT NULL,
pro_precio_unitario varchar(45)NOT NULL,
pro_anno_construccion int,
pro_autonomia varchar(45),
pro_proveedor varchar(45)
);


INSERT INTO producto(pro_id, pro_nombre_fabricante, pro_precio_unitario, pro_anno_construccion)
values (1,'Cannondale', "1200000",2020);

INSERT INTO producto(pro_id, pro_nombre_fabricante, pro_precio_unitario, pro_anno_construccion)
values (2,'Trek', "1450000",2019);

INSERT INTO producto(pro_id, pro_nombre_fabricante, pro_precio_unitario, pro_anno_construccion)
values (3,'Yeti', "2000000",2020);

INSERT INTO producto(pro_id, pro_nombre_fabricante, pro_precio_unitario, pro_anno_construccion)
values (4,'Fuji', "950000",2021);

INSERT INTO producto(pro_id, pro_nombre_fabricante, pro_precio_unitario, pro_anno_construccion)
values (5,'Bmc', "1950000",1018);

INSERT INTO producto(pro_id, pro_nombre_fabricante, pro_precio_unitario, pro_autonomia, pro_proveedor)
values (6,'Starker', "4200000","18 horas", "Auteco");

INSERT INTO producto(pro_id, pro_nombre_fabricante, pro_precio_unitario, pro_autonomia, pro_proveedor)
values (7,'Lucky Lion', "5600000","14 horas", "Hitachi");

INSERT INTO producto(pro_id, pro_nombre_fabricante, pro_precio_unitario, pro_autonomia, pro_proveedor)
values (8,'Be Electric', "4600000","26 horas", "Auteco");

INSERT INTO producto(pro_id, pro_nombre_fabricante, pro_precio_unitario, pro_autonomia, pro_proveedor)
values (9,'Aima', "8000000","36 horas", "Bosch");

INSERT INTO producto(pro_id, pro_nombre_fabricante, pro_precio_unitario, pro_autonomia, pro_proveedor)
values (10,'Mec de Colombia', "5900000","20 horas", "Teco");

INSERT INTO producto(pro_id, pro_nombre_fabricante, pro_precio_unitario, pro_autonomia, pro_proveedor)
values (11,'Atom Electric', "4500000","12 horas", "General Electric");