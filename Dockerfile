FROM maven:latest

LABEL authors="jonnerop"

WORKDIR /app

COPY pom.xml /app/

COPY . /app/

RUN mvn package

CMD ["java", "-jar", "target/aikidopractice.jar"]