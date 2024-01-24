FROM openjdk:17
WORKDIR /wp-aud
COPY target/*.jar wp-aud.jar
EXPOSE 9090
CMD ["java", "-jar", "wp-aud.jar"]

