FROM amazoncorretto:17-alpine-jdk

COPY target/Api_ArquiWeb_Backend_KevinPalian_1eraEntrega-0.0.1-SNAPSHOT.jar /api-v1.jar
ENTRYPOINT ["java", "-jar", "/api-v1.jar"]