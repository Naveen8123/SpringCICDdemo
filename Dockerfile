FROM openjdk:17
EXPOSE 8080
ADD target/spring_cicd_demo.jar spring_cicd_demo.jar
ENTRYPOINT ["java","-jar","/spring_cicd_demo.jar"]