FROM openjdk:8
expose 8080
ADD target/github-action-workflow.jar github-action-workflow.jar
ENTRYPOINT ["java", "-jar","github-action-workflow.jar"]