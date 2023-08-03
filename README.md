# SpringBoot-Api-Swagger
Spring Boot api implementation with Swagger documentation

## [Swagger](https://swagger.io/)

- The design and documentation platform for teams and individuals working with the OpenAPI Specification.
- Design and model APIs according to specification-based standards.
- Build stable, reusable code for API in almost any language
- Improve developer experience with interactive API documentation
- Perform simple functional tests on APIs without overhead
- Set and enforce API style guidelines across API architecture

## [Implementation](https://github.com/af4092/SpringBoot-Api-Swagger/tree/main/SwaggerDemoAPI3/src/main/java/com/example/swaggerdemoapi3) 

- Following implements the Spring Boot application with Swagger.
- First we start with the Spring boot application creation. Following `build.gradle` shows the required dependencies:

  ```
  dependencies {
   //	spring boot
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
 
  //	swagger
	implementation 'io.springfox:springfox-swagger2:2.9.2'
	implementation 'io.springfox:springfox-swagger-ui:2.9.2'

  //	lombok
	compileOnly 'org.projectlombok:lombok'
	annotationProcessor 'org.projectlombok:lombok'

  //	DB
	runtimeOnly 'com.mysql:mysql-connector-j'
  }
 
  ```
- Following is the Database configuration, as the DB MySQL is used, check the `application.properties` file:

```
#DB configuration
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url = jdbc:mysql://localhost:3306/mystore
spring.datasource.username = username
spring.datasource.password = password
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
spring.mvc.pathmatch.matching-strategy=ant_path_matcher

```
  
  
