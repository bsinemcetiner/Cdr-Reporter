FROM openjdk:21-jdk-slim
COPY target/Call-Detail-Record-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/app.jar"]
