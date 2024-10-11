FROM amazoncorretto:17

# MySQL 클라이언트 설치
RUN yum -y update && yum -y install mysql && yum clean all


ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
