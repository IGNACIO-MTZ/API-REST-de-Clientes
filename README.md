# Proyecto API REST de Clientes

Este repositorio contiene un proyecto de API REST desarrollado en Java 17, utilizando herramientas como Postman y Swagger. 
La base de datos está gestionada con MySQL y SQL, y se ha utilizado el entorno de desarrollo IntelliJ IDEA. 
A continuación, se proporciona una guía paso a paso para configurar, desarrollar y documentar la API.

## Tecnologías Utilizadas

 - Java 17
 - Postman
 - Swagger
 - MySQL
 - SQL
 - IntelliJ IDEA
 - Spring boot

## Estructura del Proyecto

El proyecto está organizado en varios paquetes:

- `com.std.ec.controller`: Contiene el controlador principal de la API.
- `com.std.ec.model.dao`: Contiene la interfaz `ClienteDao` que extiende `CrudRepository` para operaciones CRUD en la base de datos.
- `com.std.ec.model.entity`: Contiene la entidad `Cliente` que representa la estructura de la tabla en la base de datos.
- `com.std.ec.model.dto`: Contiene el DTO (Data Transfer Object) `ClienteDto` utilizado para la transferencia de datos entre capas.
- `com.std.ec.service`: Contiene la interfaz `IClienteService` y su implementación `ClienteImplService` que define los servicios para gestionar clientes.

## Crear Base de Datos y Tabla

```sql
create database db_springboot_dev;
CREATE TABLE `db_springboot_dev`.`clientes` (
  `id_cliente` INT ZEROFILL NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `fecha_registro` date  NOT NULL,
  PRIMARY KEY (`id_cliente`)
);

INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Joel', 'Jurado', 'juradoec@yahoo.com', '2023-08-01');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Carlos', 'Miranda', 'mirandaTr98@gmail.com', '2023-08-02');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Marcela', 'Sanchez', 'schMarce@itb.com', '2023-08-03');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Ben', 'Tennyson', 'ben10@cn.com', '2023-08-04');
```
## Endpoints

### Obtener todos los clientes

```java
@GetMapping("clientes")
public ResponseEntity<?> Showall (){
}

```
### Crear un nuevo cliente

```java
@PostMapping("cliente")
@ResponseStatus(HttpStatus.ACCEPTED)
public ResponseEntity<?> create(@RequestBody ClienteDto clienteDto){

}

```
### Actualizar un cliente existente
```java
@PutMapping("cliente/{id}")
@ResponseStatus(HttpStatus.ACCEPTED)
public ResponseEntity<?> update(@RequestBody ClienteDto clienteDto, @PathVariable Integer id){

}

```

### Eliminar un cliente por ID
```java
@DeleteMapping("cliente/{id}")
public ResponseEntity<?> delete (@PathVariable Integer id){

}

```
### Obtener un cliente por ID
```java
@GetMapping("cliente/{id}")
public ResponseEntity<?> ShowById (@PathVariable Integer id){

}
```

### Configuración
El proyecto está configurado con los siguientes parámetros:


- `Puerto del Servidor`: 8092
- `Base de Datos MySQL`:
  - `Driver`: com.mysql.cj.jdbc.Driver
  - `Usuario`: root
  - `Contraseña`: Tu_contrasena
  - `URL`: jdbc:mysql://localhost/bd_springboot_dev?useSSL=false
- `Configuración de Hibernate`: MySQL8Dialect
- `Configuración Swagger UI`: /swagger-ui-custom.html

### Ejecución del Proyecto

Para ejecutar el proyecto, asegúrese de tener un servidor MySQL en ejecución y actualice la configuración de la base de datos en el archivo application.properties. 
Luego, ejecute la aplicación y acceda a la documentación de la API en Swagger UI utilizando la URL definida en la configuración.













