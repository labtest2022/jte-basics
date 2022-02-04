FROM openjdk:8-jdk-alpine
COPY /target /var/jenkins_home/workspace/SimpleGreetingMaven/target/*.jar
ENTRYPOINT ["java","-jar","/target/SimpleGreeting-1.0-SNAPSHOT.jar"]
