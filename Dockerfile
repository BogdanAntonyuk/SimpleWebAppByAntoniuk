# our base image
FROM openjdk:11

ADD target/simple-app.jar simple-web-antoniuk.jar
# tell the port number the container should expose
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "simple-web-antoniuk.jar"]
# run the application

