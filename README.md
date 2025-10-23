# MOXISKINCARE

El propósito de este proyecto, que lleva como nombre MOXISKINCARE, es
desarrollar un sistema de ventas especializado en la venta de productos de
cuidado de la piel.

## Estructura del Proyecto

Este proyecto sigue una arquitectura Spring Boot estándar, con los siguientes
directorios y archivos clave:

```
demo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── demo/
│   │   │               ├── Controller/
│   │   │               │   └── UsuarioController.java    // Controlador REST para la gestión de usuarios
│   │   │               ├── Entity/
│   │   │               │   └── Usuario.java              // Entidad JPA que representa la tabla de usuarios
│   │   │               ├── Repository/
│   │   │               │   └── UsuarioRepository.java    // Interfaz de repositorio para operaciones CRUD de Usuario
│   │   │               └── DemoApplication.java          // Clase principal de Spring Boot
│   │   └── resources/
│   │       ├── templates/
│   │       │   └── usuarios.html                       // Interfaz de usuario para el CRUD de usuarios
│   │       └── application.properties                  // Configuración de la aplicación (base de datos, etc.)
│   └── test/
│       └── ... (archivos de prueba)
└── pom.xml                                           // Archivo de configuración de Maven
```

### Descripción de los Componentes Clave:

- **`com.example.demo.Controller.UsuarioController.java`**: Este controlador
  REST expone los endpoints HTTP para realizar operaciones CRUD (Crear, Leer,
  Actualizar, Eliminar) en la entidad `Usuario`.

- **`com.example.demo.Entity.Usuario.java`**: Define la entidad `Usuario`, que
  se mapea a una tabla en la base de datos. Contiene los atributos de un usuario
  (ID, nombre, apellidos, correo, contraseña, teléfono, dirección).

- **`com.example.demo.Repository.UsuarioRepository.java`**: Es una interfaz que
  extiende `JpaRepository`, proporcionando métodos predefinidos para interactuar
  con la base de datos para la entidad `Usuario`.

- **`demo/src/main/resources/templates/usuarios.html`**: Este archivo HTML
  contiene la interfaz de usuario para interactuar con el CRUD de usuarios.
  Utiliza JavaScript para realizar las peticiones HTTP al `UsuarioController`.

- **`demo/src/main/resources/application.properties`**: Contiene la
  configuración de la aplicación, incluyendo la conexión a la base de datos
  MySQL y la configuración de JPA/Hibernate.

- **`demo/pom.xml`**: El archivo de configuración de Maven que gestiona las
  dependencias del proyecto, incluyendo Spring Boot, JPA, MySQL Connector/J y
  Lombok.

## Herramientas Utilizadas

- **Lenguaje de Programación:** Java
- **Framework:** Spring Boot
- **Base de Datos:** MySQL
- **ORM:** JPA/Hibernate
- **Motor de Plantillas:** Thymeleaf
- **Gestión de Dependencias:** Maven
- **Control de Versiones:** Git y GitHub
- **Gestión de Proyectos y Tareas:** Trello, Asana
- **Comunicación:** Slack

## Proceso de Desarrollo

El desarrollo de MOXISKINCARE sigue una metodología ágil, utilizando las siguientes prácticas:

1.  **Planificación:** Las tareas y sprints se gestionan a través de nuestros tableros en Trello y Asana.
2.  **Comunicación:** La comunicación del equipo se centraliza en nuestro canal de Slack.
3.  **Control de Versiones:** Utilizamos Git con un flujo de trabajo basado en ramas. Las nuevas características se desarrollan en ramas separadas (`feature/...`) y se integran en la rama `develop` a través de Pull Requests.
4.  **Integración y Despliegue:** Una vez que el código es estable en `develop`, se fusiona en la rama `main` para crear una nueva versión (release).

## Gestión de Tareas

Puedes seguir el progreso del proyecto en nuestros tableros:

- **Trello:** [Enlace al tablero de Trello](https://trello.com/b/a4Kg5DRS/moxiskincare)
- **Asana:** [Enlace al tablero de Asana](https://app.asana.com/1/966364834832463/project/1211701303117383/timeline/1211701367649178)

## Releases

La evidencia de los releases se puede encontrar en la sección de [Releases de GitHub](https://github.com/AlejandrO11102003/MOXISKINCARE/releases) del repositorio.

## Capturas de Pantalla

![Conflicto Merge](./src/main/resources/static/img/Imagen%20de%20WhatsApp%202025-10-20%20a%20las%2021.23.50_b9b9a7aa.jpg)

## Enlaces del Proyecto

- **Repositorio en GitHub:** [Github](https://github.com/AlejandrO11102003/MOXISKINCARE.git)
- **Canal de Slack:** [Slack](https://app.slack.com/client/T09LX7B8SG4/D09M6JQMV6V)
