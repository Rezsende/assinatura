# 📦 API de Controler de assinaturas - Spring Boot + PostgreSQL + Docker

Esta é uma API REST desenvolvida com **Spring Boot**, utilizando **PostgreSQL** como banco de dados e **Docker Compose** para facilitar a execução.

---

## 🚀 Como executar o projeto com Docker

### 📋 Pré-requisitos

- [Docker](https://www.docker.com/get-started)
- [Docker Compose](https://docs.docker.com/compose/)

### 🛠️ Passo a passo

1. Clone o repositório:

   - git clone https://github.com/Rezsende/assinatura.git
   - cd seu-repositorio

2. Execute o comando maven para gerar o jar, sem os teste.

   - mvn clean package -DskipTests.

3. Execute o comando docker

   - docker-compose up -d

4. Acesse a API:

   - POST: http://localhost:8080/usuario
   - GET: http://localhost:8080/usuario
