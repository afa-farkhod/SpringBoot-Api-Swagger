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

- Then we make swagger configuration class `SwaggerConfiguration.java`:

  ```
  @Configuration
  @EnableSwagger2
  public class SwaggerConfiguration {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.swaggerdemoapi3.controller"))
                .paths(regex("/.*"))
                .build();
    }
  }
  ```

- After implementation, we run the Spring application:
  
  <p align="center">
 	 <img src="https://github.com/af4092/SpringBoot-Api-Swagger/assets/24220136/b24c4784-6dfa-44be-8d1b-70f4d085ee05" alt="Image">
  </p>

- We check for table creation in the DB:

  <p align="center">
 	 <img src="https://github.com/af4092/SpringBoot-Api-Swagger/assets/24220136/57b181eb-0123-4e02-80d7-eaff2d3d6638" alt="Image">
  </p>

- Then in browser we type `localhost:8080/swagger-ui.html` which opens the Swagger Api documentation:

   <p align="center">
 	 <img src="https://github.com/af4092/SpringBoot-Api-Swagger/assets/24220136/9f87b4d8-90af-440a-8400-e01f99cbef37" alt="Image">
  </p>

- In Swagger Api documentation we can see our created APIs:
 
<p align="center">
 	 <img src="https://github.com/af4092/SpringBoot-Api-Swagger/assets/24220136/461199b5-343b-43b5-a5d4-bab6a8337a69" alt="Image">
  </p>

- We give sample data to add student name in to DB then we press `Execute` button which sends resquest to api:

<p align="center">
 	 <img src="https://github.com/af4092/SpringBoot-Api-Swagger/assets/24220136/0e80bd12-2b28-47cb-b5bf-f82ce0b69926" alt="Image">
  </p>



  
  
