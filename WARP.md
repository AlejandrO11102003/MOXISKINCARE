# WARP.md

This file provides guidance to WARP (warp.dev) when working with code in this repository.

Repository overview
- Stack: Java 21, Spring Boot, Maven. App lives in `demo/`.
- Persistence: Spring Data JPA (MySQL). Lombok for boilerplate. Thymeleaf enabled for server-rendered views.
- High-level architecture:
  - Entry point: `demo/src/main/java/com/example/demo/DemoApplication.java`.
  - Domain: `Entity/Usuario`, `Entity/Categoria` (+ enum `Enum/TipoPiel`).
  - Data access: `Repository/UsuarioRepository`, `Repository/CategoriaRepository` (extend `JpaRepository`).
  - Services: `Service/CategoriaService` (interface) with implementation `Service/Implementacion/ICategoriaService` (naming note: class is the implementation).
  - Web layer:
    - REST: `/usuario` CRUD uses `UsuarioRepository` directly.
    - REST: `/api/categorias` CRUD via `ICategoriaService`.
    - Views: `HolaController` maps `GET /usuarios` → `usuarios`, `GET /login` → `login` (expects Thymeleaf templates in `src/main/resources/templates/`).

Common commands
- All commands run from `demo/` unless noted.

Build and run
```powershell path=null start=null
# from repo root
cd demo
# build (runs tests)
mvn -q clean package
# build without tests
mvn -q -DskipTests clean package
# run app (dev mode)
mvn spring-boot:run
# run the packaged jar (after package)
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

Tests
```powershell path=null start=null
# run all tests
mvn -q test
# run a single test class
mvn -q -Dtest=DemoApplicationTests test
# run a single test method
mvn -q -Dtest=DemoApplicationTests#contextLoads test
```

Linting/formatting
- No Checkstyle/SpotBugs/Formatter plugins are configured in `pom.xml`.

Configuration
- Application configuration is expected in `src/main/resources/application.properties` (e.g., Spring datasource and JPA settings) and Thymeleaf templates in `src/main/resources/templates/`.

Notes for agents
- Controllers expose both REST APIs and view routes; Category operations are mediated by a service, while Usuario uses the repository directly.
- Lombok is in use; ensure annotation processing is enabled in your editor/IDE when generating code that relies on Lombok annotations.
