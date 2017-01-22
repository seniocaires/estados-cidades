package br.com.seniocaires.estadoscidades;

import java.util.List;

import com.google.gson.annotations.Expose;

public class Estado {

  @Expose
  private String sigla;

  @Expose
  private String nome;

  private List<String> cidades;

  public String getSigla() {
    return sigla;
  }

  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<String> getCidades() {
    return cidades;
  }

  public void setCidades(List<String> cidades) {
    this.cidades = cidades;
  }
}
