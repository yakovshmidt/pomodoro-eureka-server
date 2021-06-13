FROM openjdk:13-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} pomodoro-eureka-server.jar
ENTRYPOINT ["java","-jar","/pomodoro-eureka-server.jar"]