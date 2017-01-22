# Cidades

    GET cidades/:estado

## Descrição
Retorna a lista das cidades do estado passado como parâmetro.

***

## Autenticação
* Não requer autenticação.

***

## Parêmtros
- **estado** _(obrigatório)_ — Sigla do estado. Valores reconhecidos são as siglas dos estados retornados pelo endpoint *[<code>GET</code> estados](https://github.com/seniocaires/estados-cidades/blob/master/endpoints/estados/GET_estados.md)*.

***

## Formato de retorno
Um array com as cidades do estado:

- Lista das cidades do respectivo estado
    - Nome da cidade.

***

## Erros
Nenhum. Caso seja enviado por parâmetro um estado inexistente, o serviço irá retornar uma lista vazia.

***

## Exemplo
**Request**

    http://localhost/cidades/MG

**Pequeno exemplo de retorno**

```json
[
  "Abadia dos Dourados","Abaeté","Abre Campo","Acaiaca","Açucena","Água Boa","Água Comprida","Aguanil","Águas Formosas","Águas Vermelhas","Aimorés","Aiuruoca"
]
```

