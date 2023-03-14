FROM openjdk:17-alpine

COPY build/libs/rest-api-pernikahan-wnf-0.0.1-SNAPSHOT.jar /app/aplication.jar

CMD ["java", "-jar", "/app/aplication.jar"]
