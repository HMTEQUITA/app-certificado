insert into empresa (razon_social, tipo_documento, numero_documento, direccion, telefono) values ('Tesla', 'NI', '89999997', 'Calle 192 # 72 - 25', '7321219');

insert into cargos (nombre_cargo) values ('OPERADOR');
insert into cargos (nombre_cargo) values ('INGENIERO JUNIOR');
insert into cargos (nombre_cargo) values ('INGENIERO SENIOR');
insert into cargos (nombre_cargo) values ('ANALISTA QA');
insert into cargos (nombre_cargo) values ('DIRECTOR TALENTO HUMANO');

insert into empleados (tipo_documento, numero_documento, primer_apellido, segundo_apellido, primer_nombre, segundo_nombre, salario, estado, fecha_ingreso, fecha_fin, id_cargo, id_empresa) values('CC', '1015433646', 'TEQUITA', 'ROBAYO' , 'HECTOR', 'MAURICIO', 2500000, true, '2014-04-01', '2100-01-01', 2, 1);

insert into empleados (tipo_documento, numero_documento, primer_apellido, segundo_apellido, primer_nombre, segundo_nombre, salario, estado, fecha_ingreso, fecha_fin, id_cargo, id_empresa) values('CC', '1030659698', 'LOPEZ', 'CRUZ' , 'LUISA', 'FERNANDA', 4000000, true, '2017-01-01', '2100-01-01', 5, 1);

insert into empleados (tipo_documento, numero_documento, primer_apellido, segundo_apellido, primer_nombre, segundo_nombre, salario, estado, fecha_ingreso, fecha_fin, id_cargo, id_empresa) values('CC', '71624712', 'ROBAYO', 'BARBOSA' , 'ELSA', '', 1500000, true, '2010-10-01', '2100-01-01', 1, 1);

insert into empleados (tipo_documento, numero_documento, primer_apellido, segundo_apellido, primer_nombre, segundo_nombre, salario, estado, fecha_ingreso, fecha_fin, id_cargo, id_empresa) values('CC', '19350225', 'CRUZ', 'RODRIGUEZ' , 'DAVID', 'SANTIAGO', 2500000, true, '2018-04-01', '2100-01-01', 2, 1);

insert into empleados (tipo_documento, numero_documento, primer_apellido, segundo_apellido, primer_nombre, segundo_nombre, salario, estado, fecha_ingreso, fecha_fin, id_cargo, id_empresa) values('CC', '58963258', 'PARRA', 'LOPERA' , 'KAROL', 'SOFIA', 2000000, true, '2020-08-01', '2100-01-01', 4, 1);

insert into empleados (tipo_documento, numero_documento, primer_apellido, segundo_apellido, primer_nombre, segundo_nombre, salario, estado, fecha_ingreso, fecha_fin, id_cargo, id_empresa) values('CC', '1025639521', 'NADER', 'FERNANDEZ' , 'PABLO', 'ANTONIO', 2000000, true, '2010-05-01', '2100-01-01', 4, 1);

insert into empleados (tipo_documento, numero_documento, primer_apellido, segundo_apellido, primer_nombre, segundo_nombre, salario, estado, fecha_ingreso, fecha_fin, id_cargo, id_empresa) values('CC', '19340552', 'SILVA', 'LOVERA' , 'CARLOS', '', 5500000, true, '2011-05-01', '2100-01-01', 3, 1);

update empresa set id_empleado=2 where id_empresa=1;