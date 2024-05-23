# Use a imagem base com JDK e Maven instalados
FROM maven:3.8.4-openjdk-17-slim AS build

# Copie os arquivos de origem do projeto
COPY src/main/java /app

# Defina o diretório de trabalho
WORKDIR /app

# Compile o projeto
RUN mvn clean package

# Etapa de criação da imagem final
FROM openjdk:17-slim

# Copie o arquivo JAR compilado do estágio anterior
COPY --from=build /app/target/labpenso-api-0.1.jar /app/labpenso-api-0.1.jar

# Defina o diretório de trabalho
WORKDIR /app

# Comando para iniciar a aplicação quando o contêiner for iniciado
CMD ["java", "-jar", "labpenso-api-0.1.jar"]
