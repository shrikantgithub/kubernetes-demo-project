FROM openjdk:8
EXPOSE 8084
COPY target/kubernetes-demo-project*.jar kubernetes-demo-project.jar
ENTRYPOINT ["java", "-jar", "kubernetes-demo-project.jar"]