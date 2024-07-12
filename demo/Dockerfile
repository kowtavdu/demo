FROM openjdk:17-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/springCassandra-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

#docker build -t springcass .
#docker tag springcass kowtavdu/springcass
#docker push kowtavdu/springcass

#>kubectl port-forward springmongoapp-bddf64f66-b7sg4 8080:8080