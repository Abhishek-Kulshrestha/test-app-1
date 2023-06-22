FROM openjdk:8
LABEL maintainer="abc@gmail.com" 
LABEL name="Abhishek Kulshrestha" 
EXPOSE 80
ADD target/course-api.jar course-api.jar
ENTRYPOINT ["java","-jar","course-api.jar"]
