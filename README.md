# ecommerceAPI
# Getting Started
This is an application write in Java 17 using *spring-boot mvc*, it has several components.
### Application Class
The application class takes the package *ecommercePrice* structure and scan automatically the model, controller and service packages from the project.
### Model Package-Repository Layer
The model package defines the watch object with corresponding name, unit price and potential discounts. 
### Service Package-Service Layer
The service package initializes the watch database with items and properties we want, it serves similiar to a database in our project context.
### Controller Package
The controller package is the key of our application, which controls the path of post, and way of parsing input Json contents and return the price we want.
***
## Start the application
1. Change directory to the current project
2. The Java program could be simply installed with `mvn clean install` in the bash shell.
3. `mvn sprint-boot:run` will start the application, by default the application is running at *localhost:8080*
   1. If the port is not working, you could `cd` to the `target` directory and run `java -jar -Dserver.port={port-number} e-commerce-0.0.1-SNAPSHOT.jar`
4. You could test the API with `curl` in the shell, example test template
````shell
 curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X POST --data   '["001","002","001","004","003"]' http://localhost:8080/checkout
````

***
## Test the application
All tests will be automatically triggered with `mvn clean install`.
### Unit tests
This application is using junit test to test individual model and service class using the command `mvn test -Dtest=WatchTest` or `mvn test -Dtest=WatchServiceTest` 
### Integration test
Spring-boot MVC has the mock module which allows us to mock the behavior of the controller. The test could be independantly run with `mvn test -Dtest=MyControllerIT` 
