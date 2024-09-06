FROM openjdk:17
LABEL authors="mohamedogleh"
COPY target/my-app-0.0.1.jar my-app.jar
ENTRYPOINT ["java", "-jar","my-app.jar"]
EXPOSE 8080

