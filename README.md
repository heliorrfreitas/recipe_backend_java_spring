# Recipes

The recipe API is a simple CRUD system. This project is the back end of the recipe api. It was built using Spring MVC, MariaDB, and Hibernate.

## Installing

### Clone the application 

```
https://github.com/heliorrfreitas/recipe_backend_java_spring.git
```

### Create the database
```
create database recipe
```

### Update the db.properties file with your database user and password
The file is at the address ```src/main/resources/db.properties```
change the fields ```mysql.user``` and ```mysql.password```

### Build and run the app using maven
I build the application using the Eclipse IDE. I clicked with the right click of the mouse on the top of the project, chose run as, and finally chose Maven Build.
Then it built the project. After the project was built, I ran it using a built in TOMCAT. 

### Testing
Below are the actions and links that I tested when I ran the application:

GET ALL
```http://localhost:8080/recipe/api/recipe```

POST
```http://localhost:8080/recipe/api/recipe```

PUT
```http://localhost:8080/recipe/api/recipe/{recipeID}```

GET BY ID
```http://localhost:8080/recipe/api/recipe/{recipeID}```

DELETE
```http://localhost:8080/recipe/api/recipe/{recipeID}```
