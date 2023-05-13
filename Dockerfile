FROM amazoncorretto:17-alpine-jdk
MAINTAINER sofia_sciangula
COPY target/sciangulasofia-0.0.1-SNAPSHOT.jar  sciangulasofia-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/sciangulasofia-0.0.1-SNAPSHOT.jar"]
