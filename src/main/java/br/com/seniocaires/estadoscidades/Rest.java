package br.com.seniocaires.estadoscidades;

import static spark.Spark.get;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Rest {

  private static Gson gson = new Gson();
  private static Gson gsonExclusion = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

  public static void main(String[] args) {

    get("/estados", (request, response) -> {
      response.status(200);
      response.type("application/json");
      return gsonExclusion.toJson(DadosUtil.getEstados());
    });

    get("/estados-cidades", (request, response) -> {
      response.status(200);
      response.type("application/json");
      return gson.toJson(DadosUtil.getEstados());
    });

    get("/cidades/:estado", (request, response) -> {
      response.status(200);
      response.type("application/json");
      return gson.toJson(DadosUtil.getCidades(request.params(":estado")));
    });
  }
}