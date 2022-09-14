# Spring Boot + JSP + PostgreSQL + WildFly | Embeded Tomcat

## For Development

### Using DevTool Live Reload & Embeded Tomcat

1, Make sure your `pom.xml` did __NOT__ excludes the following dependencies:

``` xml
...
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <!-- <exclusions>
        <exclusion>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-classic</artifactId>
            </exclusion>
        <exclusion>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
        </exclusion>
    </exclusions> -->
</dependency>
...
```

2, Make sure your `application.properties` 's database url is set to ___"localhost"___:

``` properties
spring.datasource.url=jdbc:postgresql://localhost:5432/localdev
```

3, Last but not least, start a local postgresql db for the app to connect with!

Using docker to start the database:

``` docker cmd
docker run --name local-postgres -p 5432:5432 -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=password -e POSTGRES_DB=localdev -d postgres
```
