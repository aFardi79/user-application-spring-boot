FROM openjdk:21-jdk-slim
ADD
EXPOSE 8081
ENTRYPOINT ["java","-jar","app.jar"]