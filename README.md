# retobase-java
Base para reto en Java

- NGINX ( Proxy reverso ) 
- Spring Boot 
- Postgress


Utilizar el bashero compile.sh para compilar el proyecto y generar los archivos necesarios 
   - Comando ./compile.sh
   
Correr docker-compose up -d --build para levantar los 3 servicios nginx - Microservicio - Postgress

si se require levantar mas de una isntancia de Spring boot ejecutar el siguiente comando 
 
   docker-compose up -d --build --scale app = 3

