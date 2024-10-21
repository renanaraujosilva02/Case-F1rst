# API de Catálogo de Livros 📚  

API RESTful para o gerenciamento de um catálogo de livros, desenvolvida com **Spring Boot** e projetada para ser leve e escalável.  

## 🛠️ Tecnologias Utilizadas  
- **Java 17**: Linguagem de desenvolvimento.  
- **Spring Boot 3.3.4**: Framework para a construção da API.  
- **PostgreSQL**: Banco de dados relacional.  
- **Redis**: Cache para respostas rápidas.  
- **Docker Compose**: Orquestração dos contêineres PostgreSQL, Redis e aplicação.  
- **Java Faker**: Geração de dados fictícios.  

---

## ⚙️ Arquitetura da Solução  
A API segue o padrão **MVC (Model-View-Controller)**:  

- **Modelo**: A classe `Livro` representa os livros, com campos como título, autor e preço.  
- **Controle**: A classe `LivroController` gerencia as operações CRUD.  
- **Serviço**:  
  - `DataGenerator`: Gera dados fictícios para popular o banco.  
  - `DatabaseInitializer`: Garante a consistência dos IDs no PostgreSQL.  

### **Decisões de Design**  
- **Autoincremento de IDs**: Controlado por `DatabaseInitializer` para evitar conflitos após múltiplas inserções.  
- **Cache Redis**: Aumenta a performance nas consultas frequentes.  
- **Modelo Flexível**: A classe `Livro` permite fácil extensão com novos campos e tipos no futuro.  

---

## 💼Lógica de Negócios:

A classe `DataGenerator` gera 10 livros fictícios por execução usando a biblioteca Java Faker. Esses livros são salvos no banco via repositório JPA.

---

## 🚀 Endpoints Disponíveis  
- **GET /books**: Retorna todos os livros.  
- **GET /books/{id}**: Busca um livro por ID.  
- **GET /books/main-genre/{mainGenre}**: Filtra por gênero principal.  
- **GET /books/author/{author}**: Filtra por autor.  

---

## 📋 Estrutura de Dados  
A classe `Livro` contém os seguintes campos:  
- **ID**: Auto-incrementado.  
- **Título e Autor**  
- **Gêneros Principal e Secundário**  
- **Tipo**: (eBook, Paperback, etc.)  
- **Preço, Avaliação e Número de Avaliações**  
- **URL de Referência**

---

## 🔧 Melhorias Futuras

- **Autenticação e Autorização**: Implementar com Spring Security.
- **Banco em Nuvem**: Migrar o PostgreSQL para a cloud.
- **Escalabilidade**: Utilizar Kubernetes para orquestrar contêineres.
- **Monitoramento e Logs**: Integrar com Prometheus e Grafana.
- **Testes Automatizados**: Expandir a cobertura de testes unitários e de integração.
---

# Ferramentas necessárias para o Projeto ⚙️
Você vai precisar:

- **Eclipse**: Para conseguir visualizar o projeto.
- **Maven**: Para gerenciar dependências e construir o projeto.
- **Redis**: Para implementar caching e otimizar as leituras da API.
- **Docker**: Para orquestrar os contêineres da aplicação, do PostgreSQL e do Redis.
- **Postman**: Para testar os endpoints da API de forma interativa.
