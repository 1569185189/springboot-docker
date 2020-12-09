FROM java:8

COPY springboot_docker-0.0.1-SNAPSHOT.jar /springboot_docker.jar

CMD ["--server.port=8080"]

EXPOSE 8081

ENTRYPOINT ["java","-jar","/springboot_docker.jar"]