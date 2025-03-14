FROM openjdk:8
EXPOSE 8080
ADD target/springboot-imgs.jar springboot-imgs-new.jar
ENTRYPOINT ["java","-jar","/springboot-images-new.jar"]