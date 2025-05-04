
![java](https://github.com/user-attachments/assets/9b23b709-18ef-4fe6-96d6-991adddb6ec4)

# 🧾 Client Management System

**Client Management System** es una aplicación de consola desarrollada en Java, 
diseñada para gestionar clientes mediante operaciones CRUD. Utiliza **JPA**, **Hibernate** y **MySQL** como base tecnológica, con una arquitectura modular y mantenible.

---

## 🚀 Características Principales

- Registro de nuevos clientes
- Actualización de información existente
- Eliminación de clientes con confirmación
- Búsqueda avanzada por ciudad
- Listado completo de clientes
- Menú interactivo en consola con navegación sencilla

---

## 🧱 Tecnologías Utilizadas

- **Java SE**
- **Maven** (gestor de dependencias)
- **JPA** (Java Persistence API)
- **Hibernate** (ORM)
- **MySQL** (base de datos relacional)
- **JDBC Driver**
- **Arquitectura modular y limpia**

---

## 🗂 Estructura del Proyecto

```plaintext
src/
├── entities/         # Clases JPA que representan entidades de dominio
├── controllers/      # Lógica de negocio y control de acciones
├── persistences/     # Configuración de la conexión y manejo de EntityManager
├── Utiles/           # Métodos de utilidad reutilizables
├── Menu/             # Menú interactivo
├── Main.java         # Clase principal y menú interactivo
resources/
└── META-INF/
    └── persistence.xml  # Configuración JPA de conexión a base de datos
pom.xml               # Archivo Maven con las dependencias del proyecto

```

🧑‍💻 Autor
Desarrollado por: Nico.F

