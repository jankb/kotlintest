FROM amazoncorretto:17

ADD ./build/libs/app.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]

EXPOSE 8080

