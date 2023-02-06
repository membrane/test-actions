FROM openjdk:17-jdk-slim-buster
WORKDIR /app

COPY target/demo-boot-0.0.1-SNAPSHOT.jar .

ENTRYPOINT java -jar demo-boot-0.0.1-SNAPSHOT.jar