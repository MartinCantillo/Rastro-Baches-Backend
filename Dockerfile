#Contenerizar la app

#Imagen java
FROM openjdk:17-jdk-slim
#Directorio de trabajo
WORKDIR /app
#Copiar el jar
COPY target/Software2.jar /app/app.jar

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
