FROM openjdk:8-jdk-alpine

RUN apk update && apk upgrade && \
    apk add --no-cache bash git openssh
    
# Clone the conf files into the docker container
RUN git clone https://github.com/tsanm/spring-boot-rest.git /home/spring-boot-rest
WORKDIR /home/spring-boot-rest
RUN git checkout deploy
EXPOSE 8080

ENTRYPOINT ["java","-jar","/home/spring-boot-rest/deploy/spring-boot-rest-0.0.1-SNAPSHOT.jar"]