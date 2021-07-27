FROM openjdk:8
MAINTAINER Sunil
COPY target/springboot-openshift-docker.jar springboot-openshift-docker.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/springboot-openshift-docker.jar"]
