FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp

#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar

COPY target/*.jar app.jar
#ENTRYPOINT ["java", "-jar", "/app.jar"]
# ENTRYPOINT ["java","${JAVA_OPTS}","-jar","/app.jar"]
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app.jar ${0} ${@}"]


# docker run -ti --entrypoint /bin/sh myorg/myapp