# Rest Estados e Cidades

Este projeto provê um serviço para retornar os estados do Brasil e suas respectivas cidades.

A API é [REST API](http://en.wikipedia.org/wiki/Representational_State_Transfer "RESTful")
e usa [Apache Spark](http://oauth.net/ "OAuth") como servidor.
Atualmente, o formato de retorno de todos os endpoint é [JSON](http://json.org/ "JSON").

## Endpoints

#### Estados
- **[<code>GET</code> estados](https://github.com/seniocaires/estados-cidades/blob/master/endpoints/estados/GET_estados.md)**

#### Estados com cidades
- **[<code>GET</code> estados-cidades](https://github.com/seniocaires/estados-cidades/blob/master/endpoints/estados-cidades/GET_estados-cidades.md)**

#### Cidades
- **[<code>GET</code> cidades](https://github.com/seniocaires/cidades/blob/master/endpoints/cidades/GET_cidades.md)**

## FAQ
### Como posso testar esta aPI?

Após fazer o download ou clonar o projeto, use o Docker para construir uma imagem e executar um container para testes.

- Construa a imagem executando o docker build no diretório raiz do projeto:
```shell
docker build -t estados-cidades .
```
- Para iniciar um container da imagem recém construída:
```shell
docker run --rm -p 80:4567 estados-cidades
```

### Quais formatos de retorno são suportados?
Atualmente os dados são retornados no formato [JSON](http://json.org/ "JSON").

### Qual o tipo de autenticação necessária?
Não requer nenhum tipo de autenticação.

