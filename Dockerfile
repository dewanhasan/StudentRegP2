FROM openjdk:19-jdk-slim

WORKDIR /app

COPY target/StudentReg-0.0.1-SNAPSHOT.jar /app

EXPOSE 8082

CMD ["java", "-jar", "StudentReg-0.0.1-SNAPSHOT.jar"]