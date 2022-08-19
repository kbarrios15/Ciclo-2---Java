CREATE TABLE intencionCompra(
int_cli_alias  varchar(20) NOT NULL,
int_fabricante varchar(20) NOT NULL,
int_consulta varchar(45)NOT NULL,
foreign key(int_cli_alias) REFERENCES cliente(cli_alias) 

);


INSERT INTO intencionCompra(int_cli_alias,int_fabricante,int_consulta)
values ('lucky', "Cannondale","2017-10-25 20:00:00");

INSERT INTO intencionCompra(int_cli_alias,int_fabricante,int_consulta)
values ('lucky', "Trek","2019-03-15 18:30:00");

INSERT INTO intencionCompra(int_cli_alias,int_fabricante,int_consulta)
values ('lucky', "Starker","2019-05-20 20:30:00");

INSERT INTO intencionCompra(int_cli_alias,int_fabricante,int_consulta)
values ('malopez', "Cannondale",'2018-05-20 20:30:00');

INSERT INTO intencionCompra(int_cli_alias,int_fabricante,int_consulta)
values ('malopez', "Starker",'2020-01-20 20:30:00');

INSERT INTO intencionCompra(int_cli_alias,int_fabricante,int_consulta)
values ('diva', "Yeti",'2019-05-20 20:30:00');

INSERT INTO intencionCompra(int_cli_alias,int_fabricante,int_consulta)
values ('diva', "Fuji",'2018-06-22 21:30:00');

INSERT INTO intencionCompra(int_cli_alias,int_fabricante,int_consulta)
values ('diva', "Lucky Lion",'2020-03-17 15:30:20');

INSERT INTO intencionCompra(int_cli_alias,int_fabricante,int_consulta)
values ('dreamer', "Lucky Lion",'2020-03-17 15:30:20');

INSERT INTO intencionCompra(int_cli_alias,int_fabricante,int_consulta)
values ('dreamer', "Be Electric",'2020-04-10 18:30:20');

INSERT INTO intencionCompra(int_cli_alias,int_fabricante,int_consulta)
values ('ninja', "Aima",'2020-02-17 20:30:20');

INSERT INTO intencionCompra(int_cli_alias,int_fabricante,int_consulta)
values ('ninja', "Starker",'2020-02-20 16:30:20');

INSERT INTO intencionCompra(int_cli_alias,int_fabricante,int_consulta)
values ('ninja', "Mec de Colombia",'2020-03-27 18:30:20');

INSERT INTO intencionCompra(int_cli_alias,int_fabricante,int_consulta)
values ('rose', "Atom Electric",'2020-03-20 21:30:20');

INSERT INTO intencionCompra(int_cli_alias,int_fabricante,int_consulta)
values ('green', "Yeti",'2020-01-10 17:30:20');

INSERT INTO intencionCompra(int_cli_alias,int_fabricante,int_consulta)
values ('green', "Trek",'2020-02-15 20:30:20');

INSERT INTO intencionCompra(int_cli_alias,int_fabricante,int_consulta)
values ('green', "Bmc",'2020-03-17 18:30:20');