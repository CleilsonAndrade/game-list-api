<div align="center">
  <h1>Game List API</h1>
  <p>Game List API é uma API com a proposta de que se possa gerenciar listas de jogos previamente cadastrados. Utilizando os recursos do framework Spring para web do Java em conjunto com outras ferramentas como: Spring Web, Spring Data JPA e banco de dados como MySQL e H2 Database, nos quais são utilizados para ambientes de desenvolvimentos específicos. Os recursos da aplicação incluem além do gerenciamento das listas exibir informações dos jogos e posicionamento das listas.</p>
  <img src="./referencias/model-domain.png" alt="Logo" width="800">
</div>

# 📒 Índice
* [Descrição](#descrição)
* [Requisitos Funcionais](#requisitos)
  * [Features](#features)
* [Tecnologias](#tecnologias)
* [Endpoints](#endpoints)
* [Instalação](#instalação)
* [Licença](#licença)

# 📃 <span id="descrição">Descrição</span>
Game List API é uma API com a proposta de que se possa gerenciar listas de jogos previamente cadastrados. Utilizando os recursos do framework Spring para web do Java em conjunto com outras ferramentas como: [**Spring Web**](https://docs.spring.io/spring-boot/docs/current/reference/html/web.html), [**Spring Data JPA**](https://spring.io/projects/spring-data-jpa) e banco de dados como [**MySQL**](https://www.mysql.com/) e [H2 Database](https://www.h2database.com/), nos quais são utilizados para ambientes de desenvolvimentos específicos. Os recursos da aplicação incluem além do gerenciamento das listas exibir informações dos jogos e posicionamento das listas.

# 📌 <span id="requisitos">Requisitos Funcionais</span>
- [x] Exibir todos os jogos previamente cadastrados<br>
- [x] Exibir as informações de um jogo especificamente<br>
- [x] Exibir lista de jogos e sua posição<br>
- [x] Exibir informações de jogos de uma lista especifica<br>
- [x] Atualização da posição da lista<br>

## Features
- [x] Adicionando mapeamento de CORS<br>
- [x] Modelo de domínio complexo<br>
- [x] Projeção com SQL nativo<br>
- [x] Ambientes diferentes de desenvolvimento: DEV, TEST, PROD<br>

# 💻 <span id="tecnologias">Tecnologias</span>
- **Java**
- **Spring**
- **Spring Web**
- **Spring Boot DevTools**
- **Spring Data JPA**
- **MySQL**
- **H2 Database**

# 📍 <span id="endpoints">Endpoints</span>
| Método | Endpoint               | Resumo                                          | Autenticação
|--------|----------------------|-----------------------------------------------------|-----------------------------------------------------
<kbd>GET</kbd> | <kbd>/games</kbd> | Responsável por listar todas as informações de todos os jogos | Não
<kbd>GET</kbd> | <kbd>/games/:id</kbd> | Responsável por listar todas as informações de um jogo por seu ID | Não
<kbd>GET</kbd> | <kbd>/lists</kbd> | Responsável por listar todas as listas de jogos cadastradas, retornando sua posição (ID) e nome da lista | Não
<kbd>GET</kbd> | <kbd>/lists/:id/games</kbd> | Responsável por listar todas as informações dos jogos de uma lista especifica por sua posição (ID) | Não
<kbd>POST</kbd> | <kbd>/lists/:id/replacement</kbd> | Responsável por reposicionar a posição (ID) da lista, e enviando via corpo de requisição a posição atual e a destino | Não
<kbd>GET</kbd> | <kbd>/h2-console</kbd> | Responsável por acesso ao *H2 Database* | Sim

# 🚀 <span id="instalação">Instalação</span>
```bash
  # Clone este repositório:
  $ git clone https://github.com/CleilsonAndrade/game-list-api.git
  $ cd ./game-list-api

  # Instalar as dependências:
  $ mvn clean install

  # Executar:
  $ mvn spring-boot:run
```

# 📝 <span id="licença">Licença</span>
Esse projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

<p align="center">
  Feito com 💜 by CleilsonAndrade
</p>
