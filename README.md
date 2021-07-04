# Projeto Spring Boot Java Alura - Fórum

API Rest que recria o Fórum da Alura com um CRUD de tópicos de dúvidas. Banco de dados em memória (H2) utilizando Hibernate, para documentar foi utilizado o Swagger e para os testes unitários o JUnit.

Aplicação desenvolvida nos seguintes cursos:

- [Spring Boot API REST: Construa uma API](https://cursos.alura.com.br/course/spring-boot-api-rest)
- [Spring Boot API Rest: Segurança da API, Cache e Monitoramento](https://cursos.alura.com.br/course/spring-boot-seguranca-cache-monitoramento)
- [Spring Boot e Teste: Profiles, Testes e Deploy](https://cursos.alura.com.br/course/spring-boot-profiles-testes-deploy)

## Tecnologias

- [Java Spring Boot](https://spring.io/projects/spring-boot)
- [Hibernate](https://hibernate.org/)
- [H2 Database](https://www.h2database.com/)
- [Spring Boot Admin](https://github.com/codecentric/spring-boot-admin)
- [Swagger](https://swagger.io/)
- [SpringFox](https://springfox.github.io/springfox/)
- [JUnit](https://junit.org/)
- [Docker](https://www.docker.com/)

## Documentação

Para visualizar os endpoints disponíveis acesse alguma das seguintes documentações:

- [Documentação Swagger](http://localhost:8080/swagger-ui.html)
- [Documentação Postman](postman/Curso%20Alura%20Spring.postman_collection.json)

## Rodando

Para testar a aplicação você pode seguir os seguintes passos após clonar o repositório:

``` shell
# Gera o arquivo .jar
mvn clean package

# Executa a aplicaçõa em modo de desenvolvimento
java -jar -Dspring.profiles.active=dev -DFORUM_DATABASE_URL=DATABASE:h2:mem:alura-forum -DFORUM_DATABASE_USERNAME=sa -DFORUM_DATABASE_PASSWORD= -DFORUM_JWT_SECRET=123456 target/forum.jar 
```

## Monitoramento

Para realizar o monitoramento foi utilizado o Actuator:

- [GET] /actuator
- [GET] /actuator/health
- [GET] /actuator/info

Você também pode utilizar o Spring Boot Admin para ter visualizar estas informações.

## Deploy

A aplicação está hospedada no heroku: https://forum-alura-jj.herokuapp.com/topicos

--- 
developed by [Jean Jacques Barros](https://github.com/jjeanjacques10)
