FROM openjdk:17
WORKDIR /wp-aud
COPY target/wp-aud.jar wp-aud.jar
EXPOSE 9090
CMD ["java", "-jar", "wp-aud.jar"]

