# Etapa de build com Maven e Java 21
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa de execução com Java 21
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar ClimaAlerta-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "ClimaAlerta-1.0.jar"]
