# Estados

    GET estados

## Descrição
Retorna a lista dos estados brasileiros com seus nomes e siglas.

***

## Autenticação
* Não requer autenticação.

***

## Parêmtros
* Não requer parâmetros.

***

## Formato de retorno
Um array com as seguintes chaves e valores:

- **nome** — Nome do estado (exemplo: Minas Gerais).
- **sigla** — Sigla do estado (exemplo: MG).

***

## Erros
Nenhum

***

## Exemplo
**Request**

    http://localhost/estados

**Pequeno exemplo de retorno**

```json
[
  {"sigla":"AC","nome":"Acre"},
  {"sigla":"MG","nome":"Minas Gerais"},
  {"sigla":"RJ","nome":"Rio de Janeiro"},
  {"sigla":"RR","nome":"Roraima"}
]
```

