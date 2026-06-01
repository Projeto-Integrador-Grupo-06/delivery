# 🍔 Delivery de Alimentos
<p align="center">
  <img src="https://i.pinimg.com/originals/81/eb/51/81eb51c3ea910a59ddf6f66896bba40c.gif" width="600">
</p>

---

# 📌 Delivery de Alimentos

Projeto backend desenvolvido com Java e Spring Boot para gerenciamento de produtos, categorias e usuários de uma plataforma de delivery.

---

## 🛠️ Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* Git & GitHub
* Insomnia
* STS / Eclipse

---

# 📚 Table of Contents

* 📌 About
* 🚀 Features
* 👓 Conceitos Aplicados
* 📕 Installation
* 🎮 Getting Started
* 🔄 Endpoints
* 🌐 Technologies
* 👥 Team
* 📝 License

---

# 📌 About

O Delivery de Alimentos é uma API REST desenvolvida para gerenciar produtos, categorias e usuários em uma plataforma de delivery.

A aplicação foi construída utilizando Java com Spring Boot, seguindo o padrão de arquitetura MVC e utilizando banco de dados MySQL para persistência dos dados.

O sistema permite:

* Cadastro de usuários
* Cadastro de categorias
* Cadastro de produtos
* Consulta de registros
* Atualização de dados
* Exclusão de registros
* Relacionamento entre entidades

---

# 🚀 Features

## Funcionalidades do Projeto

### Usuário

* CRUD completo de usuários

### Categoria

* CRUD completo de categorias

### Produto

* CRUD completo de produtos
* Associação com categoria
* Associação com usuário

### API

* Integração com banco MySQL
* API REST
* Validação de dados
* Persistência com Spring Data JPA

---

# 👓 Conceitos Aplicados

## Conceitos Utilizados no Projeto

* Arquitetura MVC
* Desenvolvimento de API REST
* CRUD com Spring Boot
* Persistência de dados com JPA
* Relacionamentos entre entidades
* Banco de dados MySQL
* Versionamento com Git e GitHub
* Validações com Bean Validation
* Organização em camadas
* Testes de API com Insomnia

---

# 📕 Installation

## Pré-requisitos

Você deve possuir instalado:

* Java JDK
* Maven
* MySQL
* STS ou Eclipse

---

## Recomendações

* Utilizar o Insomnia para testar os endpoints.
* Utilizar STS ou Eclipse como IDE de desenvolvimento.

---

## Instalação do Projeto

### 1. Clonar o repositório

```bash
git clone URL_DO_REPOSITORIO
```

---

### 2. Criar o banco de dados

```sql
CREATE DATABASE db_delivery;
```

---

### 3. Configurar o application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost/db_delivery
spring.datasource.username=root
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
```

---

### 4. Executar a aplicação

Abra o projeto na IDE e execute a classe principal do Spring Boot.

---

# 🎮 Getting Started

Após executar a aplicação, o backend iniciará localmente.

Agora você poderá testar os endpoints utilizando o Insomnia.

Exemplo:

```http
GET http://localhost:8080/produtos
```

---

# 🔄 Endpoints

## Usuários

### CREATE

```http
POST /usuarios
```

### READ

```http
GET /usuarios
GET /usuarios/{id}
```

### UPDATE

```http
PUT /usuarios
```

### DELETE

```http
DELETE /usuarios/{id}
```

---

## Categorias

### CREATE

```http
POST /categorias
```

### READ

```http
GET /categorias
GET /categorias/{id}
```

### UPDATE

```http
PUT /categorias
```

### DELETE

```http
DELETE /categorias/{id}
```

---

## Produtos

### CREATE

```http
POST /produtos
```

### READ

```http
GET /produtos
GET /produtos/{id}
```

### UPDATE

```http
PUT /produtos
```

### DELETE

```http
DELETE /produtos/{id}
```

---

# 📨 Exemplo de Requisição

## Cadastro de Produto

```json
{
  "nome": "Pizza Calabresa",
  "descricao": "Pizza tradicional de calabresa",
  "preco": 49.90,
  "quantidade": 10
}
```

---

# 🌐 Technologies

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* GitHub
* Insomnia

---

# 👥 Team

| Integrantes        |
| ------------------ |
| Giovanna Mendes    |
| Bianca Casagrande  |
| Jhonatan Oliveira  |
| Dayane Santana     |
| Isabella Rodrigues |
| Rafael Scherer     |

---

# 📝 License

Projeto desenvolvido para fins educacionais durante o Bootcamp Java Full Stack da Generation Brasil.

---

# 📄 Documentação

A documentação completa será disponibilizada após a finalização do projeto.

---

# 🔗 Repositório

Link do repositório será adicionado após a publicação do projeto.
