FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/Scientific-calculator-1.0-SNAPSHOT.jar calculator.jar

CMD ["java","-jar","calculator.jar"]
