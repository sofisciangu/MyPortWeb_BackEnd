FROM amazoncorretto:17-alpine3.17-jdk
MAINTAINER sofia_sciangula
COPY target/sciangulasofia-0.0.1-SNAPSHOT.jar  sciangulasofia-app.jar
ENTRYPOINT ["java","-jar","/sciangulasofia-app.jar"]
