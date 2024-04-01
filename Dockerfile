FROM openjdk:17-jdk-alpine
ARG JAR_FILE=/target/*.jar
COPY ./target/EurekaServiceMicroserviceServer-0.0.1-SNAPSHOT.jar EurekaServiceMicroserviceServer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/EurekaServiceMicroserviceServer-0.0.1-SNAPSHOT.jar"]
EXPOSE 8761