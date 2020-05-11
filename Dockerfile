FROM openjdk:8
LABEL maintainer="sansun2111@gmail.com" 
LABEL name="Sandeep Sundaram" 
EXPOSE 5505
ADD target/course-api.jar course-api.jar
ENTRYPOINT ["java","-jar","course-api.jar"]