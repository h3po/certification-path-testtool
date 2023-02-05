FROM maven:latest

WORKDIR /build
COPY pom.xml ./
RUN mvn compile


