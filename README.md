# retobase-java
Base para reto en Java

mvn clean package // generar jar
docker build --no-cache --build-arg DEPENDENCY=target/dependency -t myorg/myapp .   // construir la imagen
docker run -d myorg/myapp   // ejecutar la imagen
 
