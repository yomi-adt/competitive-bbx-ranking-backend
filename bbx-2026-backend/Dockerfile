FROM eclipse-temurin:25-jdk

WORKDIR /bbx-2026-backend

COPY build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "--enable-native-access=ALL-UNNAMED", "-jar", "app.jar"]
