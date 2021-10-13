FROM java:8
WORKDIR /app
COPY . /app
EXPOSE 9595
ADD ./target/credit-card-service.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
