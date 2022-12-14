# Spring Boot + JSP + PostgreSQL + WildFly

## For Development (Run Server Locally)

- Start a local postgresql db for the app to connect with! Using ___docker___ to start the database:

``` docker
docker run --name local-postgres -p 5432:5432 -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=password -e POSTGRES_DB=localdev -d postgres
```

- Make sure your `application.properties` 's database url is set to ___"localhost"___:

``` properties
spring.datasource.url=jdbc:postgresql://localhost:5432/localdev
```

- Then run the following cmd to create/build a local server with WildFly that contains our application:

``` sh
mvn clean package   

# Then run the server locally
./target/server/bin/standalone.sh 
```

- Finally, visit the link to test your site: [http://localhost:8080/contextName](http://localhost:8080/contextName)

## For Deployment (Run Docker Deployment with WildFly + PostgreSQL)

After you finish developing, make sure you already build local server by running `mvn clean package`.

Then, just run the `docker-compose.yml` to see it deploy as docker containers.

``` docker
docker-compose up --build
```
