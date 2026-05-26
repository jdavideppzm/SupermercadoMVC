# 🛒 SupermercadoMVC

Sistema de gestión de empleados desarrollado en Java utilizando arquitectura MVC, Java Swing, JDBC y MySQL.

---

# 📌 Descripción del proyecto

Este proyecto fue desarrollado como una aplicación de escritorio para la gestión de empleados de un supermercado, permitiendo realizar operaciones CRUD (Crear, Consultar, Actualizar y Eliminar) mediante una interfaz gráfica desarrollada en Java Swing.

El sistema implementa el patrón de arquitectura MVC (Modelo - Vista - Controlador), permitiendo mantener una adecuada separación de responsabilidades y una mejor organización del código fuente.

---

# 🚀 Tecnologías utilizadas

- Java JDK 17
- Java Swing
- JDBC
- MySQL
- Maven
- NetBeans IDE
- Git & GitHub

---

# 🏗️ Arquitectura implementada

El proyecto fue desarrollado bajo arquitectura MVC:

## Modelo
Contiene las clases encargadas de representar los datos y la lógica de negocio.

- Empleado.java
- EmpleadoDAO.java

## Vista
Contiene la interfaz gráfica desarrollada con Java Swing.

- FrmEmpleado.java

## Controlador
Gestiona la interacción entre la vista y el modelo.

- Eventos y acciones implementadas en FrmEmpleado.java

## Conexión
Administra la conexión JDBC con MySQL.

- ConexionBD.java

---

# ⚙️ Funcionalidades del sistema

✅ Registrar empleados  
✅ Buscar empleados por cargo  
✅ Actualizar información  
✅ Eliminar empleados  
✅ Validar campos vacíos  
✅ Actualizar JTable automáticamente  
✅ Conexión dinámica con MySQL  

---

# 🗂️ Estructura del proyecto

```text
com.mycompany.supermercadomvc
│
├── conexion
│   └── ConexionBD.java
│
├── modelo
│   ├── Empleado.java
│   └── EmpleadoDAO.java
│
├── vista
│   └── FrmEmpleado.java
│
└── Main.java
```

---

# 🖥️ Base de datos

El sistema utiliza MySQL y una tabla llamada:

```sql
empleados
```

Campos principales:

- id
- nombre
- cargo
- salario

---

# 📸 Evidencias del sistema

El proyecto incluye pruebas funcionales relacionadas con:

- Registro de empleados
- Búsquedas dinámicas
- Actualización de datos
- Eliminación de registros
- Verificación en MySQL

---

# 👨‍💻 Autor

Jesús David Estrada Prada

---

# 📚 Objetivo académico

Aplicar conocimientos relacionados con:

- Programación orientada a objetos
- Arquitectura MVC
- JDBC
- Java Swing
- CRUD
- Bases de datos relacionales
- Buenas prácticas de desarrollo
