# Stage 1: Build Stage using Maven image to compile and package the Spring Boot backend application
FROM maven:3.8.5-openjdk-17 AS build

# Set the working directory inside the build container container
WORKDIR /app

# Copy the pom.xml and all source files into the build environment
COPY . .

# Compile and package the Java project into an executable JAR file while skipping unit tests to optimize the build speed
RUN mvn clean package -DskipTests

# Stage 2: Production Runtime Stage using a lightweight Java Runtime Environment (JRE) footprint image
FROM openjdk:17-jdk-slim

# Establish a distinct, clean working directory inside the runtime context container
WORKDIR /app

# Safely extract and copy over the compiled executable JAR file artifact from the previous build container stage
COPY --from=build /app/target/*.jar app.jar

# Explicitly document that the application service container intends to listen on network port 8080 at runtime
EXPOSE 8080

# Configure the primary application entrypoint execution trigger command to run our compiled Java service
ENTRYPOINT ["java", "-jar", "app.jar"]
