package br.com.seniocaires.estadoscidades;

import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class DadosUtil {

  private static List<Estado> estados;
  private static List<String> cidadesVazia = new ArrayList<String>();

  private static final Type ESTADO_TYPE = new TypeToken<List<Estado>>() {
  }.getType();

  /**
   * Retorna a lista com os estados.
   * @author Senio Caires
   * @return {@link List}<{@link Estado}>
   */
  public static final List<Estado> getEstados() {

    if (estados == null) {

      Gson gson = new Gson();
      JsonReader jsonReader;
      jsonReader = new JsonReader(new InputStreamReader(DadosUtil.class.getClassLoader().getResourceAsStream("estados-cidades.json")));
      estados = gson.fromJson(jsonReader, ESTADO_TYPE);
    }

    return estados;
  }

  /**
   * Retorna a lista com as cidades cuja sigla do estado seja a passada como parâmetro.
   * @author Senio Caires
   * @param siglaEstado - {@link String}
   * @return {@link List}<{@link String}>
   */
  public static final List<String> getCidades(String siglaEstado) {

    for (Estado estado : getEstados()) {
      if (estado.getSigla().equalsIgnoreCase(siglaEstado)) {
        return estado.getCidades();
      }
    }

    return cidadesVazia;
  }
}
