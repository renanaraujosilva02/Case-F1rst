# Usar a imagem base do OpenJDK 17
FROM openjdk:17-jdk-slim

# Definir o diretório de trabalho
WORKDIR /app

# Copiar o arquivo JAR para o contêiner
COPY target/catalogo-0.0.1-SNAPSHOT.jar app.jar

# Expor a porta que a aplicação irá rodar
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]