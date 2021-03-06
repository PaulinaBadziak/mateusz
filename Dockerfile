FROM adoptopenjdk/openjdk11:alpine
ARG JAR_FILE=target/mateusz-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]