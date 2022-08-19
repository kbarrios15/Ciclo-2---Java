CREATE TABLE cliente(
cli_nombre varchar(20) NOT NULL,
cli_apellido varchar(20) NOT NULL,
cli_email varchar(45) NOT NULL,
cli_celular varchar(20) NOT NULL,
cli_alias varchar(20) NOT NULL,
cli_contrasenna varchar(8) NOT NULL,
primary key(cli_alias) 
);

INSERT INTO cliente(cli_alias, cli_nombre, cli_apellido, cli_email, cli_celular,cli_contrasenna)
values ('lucky', "Pedro",'Perez','pperez@gmail.com',"3126726253",'32145698');

INSERT INTO cliente(cli_alias, cli_nombre, cli_apellido, cli_email, cli_celular,cli_contrasenna)
values ('malopez', "Maria",'Lopez','mlopez@gmail.com',"3114460512",'65413254');


INSERT INTO cliente(cli_alias, cli_nombre, cli_apellido, cli_email, cli_celular,cli_contrasenna)
values ('diva', "Ana",'Diaz','adiaz@gmail.com',"3023952523",'35741251');

INSERT INTO cliente(cli_alias, cli_nombre, cli_apellido, cli_email, cli_celular,cli_contrasenna)
values ('dreamer', "Luis",'Rojas','lrojas@gmail.com',"3106371869",'74512785');


INSERT INTO cliente(cli_alias, cli_nombre, cli_apellido, cli_email, cli_celular,cli_contrasenna)
values ('ninja', "Andres",'Cruz','acruz@gmail.com',"3226683763",'65712864');

INSERT INTO cliente(cli_alias, cli_nombre, cli_apellido, cli_email, cli_celular,cli_contrasenna)
values ('neon', "Nelson",'Ruiz','nruiz@gmail.com',"3026635245",'25465367');

INSERT INTO cliente(cli_alias, cli_nombre, cli_apellido, cli_email, cli_celular,cli_contrasenna)
values ('rose', "Claudia",'Mendez','cmendez@gmail.com',"3156746252",'24557828');

INSERT INTO cliente(cli_alias, cli_nombre, cli_apellido, cli_email, cli_celular,cli_contrasenna)
values ('green', "Jorge",'Rodriguez','jrodriguez@gmail.com',"3046623596",'41057943');