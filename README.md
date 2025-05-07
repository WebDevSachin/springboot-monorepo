# Java SpringBoot Monorepo

This is a monorepo containing multiple Spring Boot applications that share common code.

## Project Structure

- **common**: Contains shared code, models, and utilities
- **service1**: Backend Service 1 (port 8081)
- **service2**: Backend Service 2 (port 8082)

## Requirements

- Java 17+
- Maven 3.8+

## Building

To build all projects:

```bash
mvn clean install
```

## Running Applications

### Service 1
```bash
cd service1
mvn spring-boot:run
```
Access at http://localhost:8081/api/service1/status

### Service 2
```bash
cd service2
mvn spring-boot:run
```
Access at http://localhost:8082/api/service2/status

## Shared Code

The common module contains shared code that is used by all applications:

- `PlannerResponse`: A common response model
- `ResponseUtil`: Utility methods for creating standardized responses

When you make changes to the common module, you need to rebuild it:

```bash
cd common
mvn clean install
```

Then, the changes will be available to all other modules.

## Adding New Modules

1. Create a new directory for your module
2. Create a pom.xml file that includes the common module as a dependency
3. Add the module to the parent pom.xml in the `<modules>` section
