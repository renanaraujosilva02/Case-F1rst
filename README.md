# API - Catálogo de Livros 📚  

API REST para o gerenciamento de um catálogo de livros, desenvolvida com **Spring Boot** e projetada para ser leve e escalável.  

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

## Cadastro e Gestão  
Cada livro recebe um identificador único e é registrado com informações essenciais (título, autor, gênero, preço, etc.), garantindo organização e consistência.

## Operações CRUD  
A API permite criar, ler, atualizar e excluir livros para manter o catálogo sempre atualizado e acessível.

## Filtros Inteligentes  
Usuários podem buscar livros por autor, gênero ou tipo, facilitando uma navegação personalizada.

## Otimização de Consultas  
Livros mais acessados são servidos rapidamente para melhorar o desempenho e a experiência do usuário.

## Geração Automática de Dados  
Dados fictícios são criados para testes e validações, garantindo o bom funcionamento da API em diversos cenários.

## Preparação para Crescimento  
A estrutura é flexível e pronta para integrar novos recursos e conectar-se a outros sistemas no futuro.

## Monitoramento e Manutenção  
A lógica inclui verificação constante para assegurar a operação correta e a consistência dos dados.

## Segurança e Controle Futuro  
A API está preparada para implementar controles de acesso, protegendo as informações e garantindo a integridade do catálogo.


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

- **Java-17**: Linguagem e versão.
- **Eclipse**: Para conseguir visualizar o projeto.
- **Maven**: Para gerenciar dependências e construir o projeto.
- **Redis**: Para implementar caching e otimizar as leituras da API.
- **Docker Compose**: Para orquestrar os contêineres da aplicação, do PostgreSQL e do Redis.
- **Postman**: Para testar os endpoints da API de forma interativa.

---

# Baixando e instalando ferramentas ⚙️

# Como Baixar e Instalar o Java 17.11

Siga os passos abaixo para instalar o **Java 17.11**:

## Passo 1: Baixar o Java 17.11
1. Acesse a página oficial do [Oracle Java](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) ou [Adoptium](https://adoptium.net/temurin/releases/).
2. Escolha a versão **17.11** do JDK (Java Development Kit) para o seu sistema operacional (Windows, macOS ou Linux).
3. Baixe o instalador apropriado:
   - **Windows**: `.msi` ou `.zip`
   - **macOS**: `.dmg`
   - **Linux**: `.tar.gz` ou pacotes `.deb/.rpm`

> **Nota**: Para baixar pela Oracle, você precisa criar uma conta gratuita.

---

## Passo 2: Instalar o Java 17.11
### **Windows**
1. Execute o instalador `.msi` baixado.
2. Siga as instruções na tela.
3. Durante a instalação, marque a opção para adicionar o Java ao **PATH**.
4. Conclua a instalação e reinicie o terminal/PC, se necessário.

### **macOS**
1. Abra o arquivo `.dmg` e arraste o Java para a pasta **Aplicativos**.
2. Verifique se o Java foi instalado corretamente executando `java -version` no terminal.

### **Linux**
1. Extraia o arquivo `.tar.gz` para `/opt` ou um diretório de sua escolha:
   ```bash
   sudo tar -xvzf openjdk-17.11_linux-x64_bin.tar.gz -C /opt/

- **Verificando a instalação**: Execute o comando no prompt: java -version

---

# Como Baixar e Instalar o Eclipse

Para baixar e instalar o Eclipse, siga os passos abaixo:

## Passo 1: Baixar o Eclipse
1. Acesse a página oficial do Eclipse: [Eclipse Downloads](https://www.eclipse.org/downloads/).
2. Escolha a versão desejada. A versão **Eclipse IDE for Java Developers** é recomendada para a maioria dos desenvolvedores Java.
3. Clique no botão **Download** para baixar o instalador.

## Passo 2: Executar o Instalador
1. Após o download, localize o arquivo do instalador (geralmente chamado de `eclipse-inst-win64.exe` para Windows ou `eclipse-inst-mac64.dmg` para macOS).
2. Execute o arquivo baixado:
   - No Windows, clique duas vezes no arquivo para iniciar o instalador.
   - No macOS, arraste o Eclipse para a pasta Aplicativos.

## Passo 3: Instalar o Eclipse
1. Selecione a versão do Eclipse que deseja instalar (por exemplo, **Eclipse IDE for Java Developers**).
2. Escolha um diretório de instalação (o padrão é geralmente adequado).
3. Clique em **Install** para iniciar a instalação.
4. Aceite os termos da licença quando solicitado.
5. Aguarde enquanto o Eclipse é instalado. Isso pode levar alguns minutos.

---

# Como Baixar e Instalar o Maven

Para baixar e instalar o Maven, siga os passos abaixo:

### Passo 1: Baixar o Maven
1. Acesse a página oficial do Maven: [Apache Maven Download](https://maven.apache.org/download.cgi).
2. Escolha a versão desejada. Normalmente, você deve optar pela versão mais recente (geralmente a que aparece no topo).
3. Clique no link para o arquivo ZIP ou TAR.GZ para baixar o Maven.

### Passo 2: Extrair o Maven
- Extraia o arquivo baixado em um diretório de sua escolha. Por exemplo, `C:\Programas\apache-maven-<versão>` no Windows ou `/opt/apache-maven-<versão>` no Linux.

### Passo 3: Configurar Variáveis de Ambiente
#### No Windows:
1. Abra as Configurações do Sistema:
   - Clique com o botão direito em "Este PC" ou "Meu Computador" e selecione "Propriedades".
   - Clique em "Configurações avançadas do sistema".
   - Clique em "Variáveis de Ambiente".

2. Adicione uma nova variável de sistema:
   - Clique em "Novo" na seção "Variáveis do sistema".
   - Nomeie a variável como `M2_HOME` e coloque o caminho da pasta onde você extraiu o Maven como valor (por exemplo, `C:\Programas\apache-maven-<versão>`).

3. Atualize a variável `PATH`:
   - Na lista de variáveis do sistema, encontre a variável `Path` e clique em "Editar".
   - Adicione o seguinte caminho ao final da lista: `%M2_HOME%\bin`.

---

# Como Baixar e Instalar o Redis

Siga os passos abaixo para instalar o **Redis** no seu sistema operacional.

---

## 🔽 Passo 1: Baixar o Redis

### **Windows**
1. Acesse o repositório oficial: [Redis for Windows (Memurai)](https://github.com/microsoftarchive/redis/releases) ou [Redis Windows Fork](https://github.com/tporadowski/redis/releases).
2. Baixe a versão mais recente disponível (um arquivo `.zip` ou `.msi`).

### **Linux**
1. Abra o terminal e execute:
   ```bash
   sudo apt update
   sudo apt install redis-server

---

# Como Baixar e Instalar o Docker

Siga as etapas abaixo para instalar o Docker no seu sistema operacional.

---

## 🔽 Passo 1: Baixar o Docker

### **Windows e macOS**
1. Acesse a página oficial do Docker: [Docker Desktop](https://www.docker.com/products/docker-desktop).
2. Escolha a versão adequada para seu sistema operacional (Windows ou macOS).
3. Baixe o instalador (`.exe` para Windows ou `.dmg` para macOS).

### **Linux (Ubuntu/Debian)**  
1. Abra o terminal e execute:
   ```bash
   sudo apt update
   sudo apt install apt-transport-https ca-certificates curl software-properties-common
   curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
   sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"
   sudo apt update
   sudo apt install docker-ce

---

# Como Baixar e Instalar o Postman

Siga os passos abaixo para instalar o Postman no seu sistema operacional.

---

## 🔽 Passo 1: Baixar o Postman

1. Acesse a página oficial do Postman: [Postman Downloads](https://www.postman.com/downloads/).
2. Escolha a versão compatível com seu sistema operacional:
   - **Windows**: `.exe` ou `.zip`
   - **macOS**: `.dmg`
   - **Linux**: `.tar.gz` ou via Snap

---

## 🖥️ Passo 2: Instalação por Sistema Operacional

### **Windows**
1. Execute o instalador `.exe` baixado.
2. Siga as instruções na tela para concluir a instalação.
3. Após a instalação, abra o Postman a partir do Menu Iniciar ou da área de trabalho.

### **macOS**
1. Abra o arquivo `.dmg` e arraste o ícone do Postman para a pasta **Aplicativos**.
2. Após a instalação, abra o Postman a partir da **Launchpad** ou da pasta **Aplicativos**.

### **Linux (Ubuntu/Debian)**
1. **Via Snap**:
   ```bash
   sudo snap install postman

---

# 🚀 Como Executar o Projeto via Linha de Comando

Siga estas instruções para compilar, executar e testar o projeto corretamente.

---

### 📂 Passo 1: Navegar até a Pasta do Projeto
Abra o **Prompt de Comando**, **Terminal** ou **PowerShell** e navegue até a pasta raiz do projeto: cd /caminho/para/o/projeto


---

### 🛠️ Passo 2: Compilar e Instalar Dependências
Execute o seguinte comando para compilar o projeto e instalar as dependências, ignorando a execução dos testes:
**mvn clean install -DskipTests**


---

### 🐳 Passo 3: Iniciar os Contêineres com Docker Compose
Inicie os contêineres do projeto usando o comando abaixo. Isso garante que eles sejam construídos do zero:
**docker-compose up --build**


---

#### 🧪 Passo 4: Executar Testes Unitários
Execute os testes unitários para garantir que tudo está funcionando corretamente: **mvn test**


---

## 🚀 Postman - Endpoints Disponíveis  
- **GET /books**: Retorna todos os livros.  
- **GET /books/{id}**: Busca um livro por ID.  
- **GET /books/main-genre/{mainGenre}**: Filtra por gênero principal.  
- **GET /books/author/{author}**: Filtra por autor.
- **Exemplo**: http://localhost:8080/books
