# Projeto final MJV - Spring Boot

Para esta jornada é desenvolvida uma Api em Java, com Spring Boot para a criação de uma Playlists de Músicas.

## A tecnologia utilizada para realizar este projeto é:
- Java 11
- Maven
- IDE Eclipse
- Spring Boot
- Swagger
- MySql Workbench

## Execução do projeto
Este projeto está estruturado em quatro pacotes: Model, Controller e o pacote repository com as interfaces que possibilitam 
a manipulação de dados no banco.
Como primeira parte deste projeto, consiste apenas em adicionar, remover e selecionar elementos do banco de dados.
Foram utilizados Spring Framework para configurações do sistema, Spring data jpa para a persistência de dados e 
Springdoc-openapi para gerar documentação com Swagger. Para estabelecer a conexão com o banco de dados mysql utilizamos
o Mysql connector Java.

Para acessar a API documentada no Swagger foi utilizada a url:

http://localhost:8080/swagger-ui/index.html
