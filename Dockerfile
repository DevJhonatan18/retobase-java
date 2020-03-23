FROM openjdk:8-jdk
#RUN mvn -f clean package -DskipTests
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
#EXPOSE 8081
ENTRYPOINT ["java","-cp","app:app/lib/*","arcmop.blog.springbootest.configuracion.StartApplication"]
