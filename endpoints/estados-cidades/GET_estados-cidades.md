# Estados com cidades

    GET estados-cidades

## Descrição
Retorna a lista dos estados brasileiros com seus nomes, siglas e suas respectivas cidades.

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
- **cidades** — Lista das cidades do respectivo estado.
    - Nome da cidade.

***

## Erros
Nenhum

***

## Exemplo
**Request**

    http://localhost/estados-cidades

**Pequeno exemplo de retorno**

```json
[
  {"sigla":"AC","nome":"Acre","cidades":["Acrelândia","Assis Brasil","Brasiléia","Bujari","Capixaba","Cruzeiro do Sul","Epitaciolândia"]},
  {"sigla":"MG","nome":"Minas Gerais","cidades":["Abadia dos Dourados","Abaeté","Abre Campo","Acaiaca","Açucena","Água Boa","Água Comprida","Aguanil","Águas Formosas","Águas Vermelhas","Aimorés","Aiuruoca"]},
  {"sigla":"RJ","nome":"Rio de Janeiro","cidades":["Angra dos Reis","Aperibé","Araruama","Areal","Armação de Búzios"]},
  {"sigla":"RR","nome":"Roraima","cidades":["Alto Alegre","Amajari","Boa Vista","Bonfim","Cantá"]}
]
```

