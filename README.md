# Rest Estados e Cidades

Este projeto provê um serviço para retornar os estados do Brasil e suas respectivas cidades.

A API é [REST](http://en.wikipedia.org/wiki/Representational_State_Transfer "RESTful") e usa o [Spark](http://sparkjava.com/ "Spark").
Atualmente, o formato de retorno de todos os endpoints é [JSON](http://json.org/ "JSON").

![alt tag](https://raw.githubusercontent.com/seniocaires/estados-cidades/master/img/docker-spark.png)

## Endpoints

#### Estados
- **[<code>GET</code> estados](https://github.com/seniocaires/estados-cidades/blob/master/endpoints/estados/GET_estados.md)**

#### Estados com cidades
- **[<code>GET</code> estados-cidades](https://github.com/seniocaires/estados-cidades/blob/master/endpoints/estados-cidades/GET_estados-cidades.md)**

#### Cidades
- **[<code>GET</code> cidades/:estado](https://github.com/seniocaires/estados-cidades/blob/master/endpoints/cidades/GET_cidades.md)**

## FAQ
### Como posso testar esta API?

Use o Docker para baixar a imagem e executar um container para testes.

- Baixe a imagem executando o docker pull:
```shell
docker pull seniocaires/estados-cidades
```
- Para iniciar um container da imagem recém baixada:
```shell
docker run --rm -p 80:4567 seniocaires/estados-cidades
```

### Quais formatos de retorno são suportados?
Atualmente os dados são retornados no formato [JSON](http://json.org/ "JSON").

### Qual o tipo de autenticação necessária?
Não requer nenhum tipo de autenticação.

