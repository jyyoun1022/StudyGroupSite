FROM adoptopenjdk/openjdk11
ARG JAR_FILE=StudyGroupSite-0.0.1-SNAPSHOT.jar
COPY /build/libs/${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]