FROM java:8
ARG JAR_FILE=target/college-service.jar
WORKDIR /opt/app
EXPOSE 4040
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
