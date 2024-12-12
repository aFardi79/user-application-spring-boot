FROM openjdk:21-jdk-slim
COPY target/user-application-spring-boot-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","app.jar"]