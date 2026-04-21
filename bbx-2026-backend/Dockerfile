# ---- Build stage ----
FROM eclipse-temurin:25-jdk AS builder

WORKDIR /app
COPY . .

# makes gradlew executable -> Otherwise get "Permission Denied"
RUN chmod +x ./gradlew

RUN ./gradlew clean bootJar --no-daemon

# ---- Run stage ----
FROM eclipse-temurin:25-jdk

WORKDIR /app

COPY --from=builder /app/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "--enable-native-access=ALL-UNNAMED", "-jar", "app.jar"]
