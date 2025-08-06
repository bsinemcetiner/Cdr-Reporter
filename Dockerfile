# Temel image olarak OpenJDK 17 kullan
FROM openjdk:21-jdk-slim

# Uygulamanın jar dosyasını image içine kopyala
COPY target/Call-Detail-Record-0.0.1-SNAPSHOT.jar app.jar

# Uygulamayı çalıştır
ENTRYPOINT ["java", "-jar", "/app.jar"]
