CREATE DATABASE supermercado_mvc;
USE supermercado_mvc;

CREATE TABLE empleados (

    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100),
    cargo VARCHAR(50),
    salario DOUBLE

);

INSERT INTO empleados(nombre, cargo, salario)
VALUES
('Ana', 'Cajero', 2500000),
('Carlos', 'Supervisor', 3500000),
('Laura', 'Administrador', 4500000),
('Pedro', 'Cajero', 2300000);

SELECT * FROM empleados;empleadosempleados