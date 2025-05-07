# Incident Management Application

Esta aplicação é um sistema simples de gerenciamento de incidentes, construído com Spring Boot, JPA (Hibernate), e banco de dados H2 em memória.

## 🚀 Funcionalidades

- Cadastro de Incidentes
- Atualização de Incidentes
- Exclusão de Incidentes
- Listagem de todos os Incidentes
- Busca de Incidente por ID
- Listagem dos últimos 20 Incidentes (ordenados de forma decrescente)

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Banco de dados H2 (in-memory)
- Maven
- JUnit 5 + Mockito (Testes Unitários)
- Swagger (opcional)

## ⚙️ Como rodar o projeto

### 1. Pré-requisitos
- Java 17+ instalado
- Maven instalado

### 2. Clonar o repositório e abrir em alguma IDE (preferência intellij)

```bash
- git clone https://github.com/pehennu/api-incidentmanagement-diazero.git
```

# 📚 Endpoints da API - Incident Management

Este documento descreve os endpoints disponíveis na API de gerenciamento de incidentes.

---

## 🔥 Endpoints Disponíveis

### 1. Cadastrar novo incidente

- **Método**: POST
- **Rota**: `/api/incidents`
- **Descrição**: Cadastra um novo incidente no sistema.

---

### 2. Atualizar incidente existente

- **Método**: PUT
- **Rota**: `/api/incidents/{id}`
- **Descrição**: Atualiza as informações de um incidente específico utilizando o ID.

---

### 3. Deletar incidente

- **Método**: DELETE
- **Rota**: `/api/incidents/{id}`
- **Descrição**: Deleta um incidente do sistema com base no ID fornecido.

---

### 4. Listar todos os incidentes

- **Método**: GET
- **Rota**: `/api/incidents`
- **Descrição**: Retorna uma lista com todos os incidentes cadastrados.

---

### 5. Buscar incidente por ID

- **Método**: GET
- **Rota**: `/api/incidents/{id}`
- **Descrição**: Busca e retorna os detalhes de um incidente específico através do ID.

---

### 6. Listar os últimos 20 incidentes

- **Método**: GET
- **Rota**: `/api/incidents/last20`
- **Descrição**: Retorna os últimos 20 incidentes cadastrados, em ordem decrescente de criação.

---

### Insomnia
- Vai acompanhado um arquivo com as requisições para testes via insomnia. Importe-o no app do insomnia e ta pronto pra utilizar.
- Caso queira testar em outro tipo postman, lembre de configurar a autenticacao basica pra user: admin e senha: password

# 🛡️ Justificativa do Uso de Frameworks/Bibliotecas

### Spring Boot
Facilitou a criação de uma API REST robusta, com configuração mínima. Tornou possível focar na lógica de negócio sem se preocupar com infraestrutura e configuração manual de servidores e componentes.

### Spring Data JPA
Simplificou o acesso ao banco de dados, evitando a necessidade de escrever implementações de DAOs manualmente. Utilizou-se de repositórios prontos para operações CRUD e consultas personalizadas de forma rápida e segura.

### H2 Database
Banco de dados leve e em memória, ideal para desenvolvimento e testes. Permitiu criar e testar funcionalidades de persistência sem a necessidade de configuração ou instalação de um banco externo.

### JUnit 5 + Mockito
Frameworks modernos para criação de testes unitários confiáveis. O JUnit 5 forneceu estrutura de testes robusta, enquanto o Mockito facilitou a simulação (mock) de dependências, isolando as unidades a serem testadas.

### MockMvc
Ferramenta essencial para testes, simulando chamadas HTTP de forma leve, sem necessidade de levantar o servidor real, garantindo agilidade e confiabilidade nos testes de API.

---

# 🧹 Notas adicionais

- O projeto foi estruturado para ser limpo, simples e de fácil manutenção, seguindo boas práticas de desenvolvimento de software.
- As práticas RESTful foram adotadas para a organização e padronização dos endpoints da API.
- Houve a separação clara de responsabilidades entre as camadas:
    - **Controller**: Camada de entrada da API, lidando com as requisições HTTP.
    - **Service**: Contém a lógica de negócio da aplicação.
    - **Repository**: Responsável pela comunicação com o banco de dados.
    - **Entity**: Representação dos modelos de dados persistidos.


