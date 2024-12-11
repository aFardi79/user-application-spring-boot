FROM openjdk:21-jdk-slim
ADD target/user-application-spring-boot-0.0.1-SNAPSHOT.jar app
EXPOSE 8081
ENTRYPOINT ["java","-jar","app.jar"]