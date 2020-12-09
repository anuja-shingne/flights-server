# Flights Server Application

### This is a server application for flight itinerary of the flights. ###

 ### Technical Stack  ###
 1. Java 8 (Spring boot Framework)
 2. Maven
 
### Libraries used ###

 1. Spring Boot 2.4.0.RELEASE
 2. Custom: Lombok, ModelMapper, File IO
 3. Spring Boot Test
 4. Swagger API

### Features ###
These services can perform:
1. Gives all the itenerary and legs of the itenerary of the flights.
    
### Local Installation ###

1. Create a new Java Project in Eclipse. Import project using Import --> File system option. Right click on the project. Go to configure & select convert into maven project.

2. download lombark.jar dependency from [here](https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.12). Double click on the jar and add eclipse in the path.

3. The default port to run the server is 8080. It can be modified in application.properties file.

    `server.port=8081`
 	
4. Create a executable jar file of the application and run the jar. For instance:

    `java -jar ../target/trips-0.0.1-SNAPSHOT.jar
  
5. Refer following swagger API for Rest API specifications in json :

   ` http://localhost:8080/trips/swagger-ui.html `
 
 ### Versions ###
 
 1. 0.0.1-SNAPSHOT: Contains service to fetch flight itinerary.
   
 ### Developer ###
 
  Anuja Rajendra Shingne (anuja.shingne@gmail.com)
 
 