FROM openjdk:11-jre-slim
ARG ARG_VERSION
ENV VERSION=$ARG_VERSION
EXPOSE 8080

ARG FILES_TESTDATA=.
ARG ARTIFACTS=build/libs
ARG JAR_FILE=${ARTIFACTS}/hackarthon-api-$VERSION.jar

RUN groupadd worker -g 2000 && \
    useradd worker -u 1000 -g worker

ADD ${JAR_FILE} /opt/hackathon-api.jar

USER worker

CMD ["java", "-jar", "/opt/hackathon-api.jar"]
