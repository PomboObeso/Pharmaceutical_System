package entities;

public abstract class Remedio {
    private String nome;
    private Double preco;
    private int id;
    //private boolean controlador;
  
    public Remedio(String nome, Double preco, int id, boolean controlador) {
      this.nome = nome;
      this.preco = preco;
      this.id = id;
      //this.controlador = controlador;
    }
  
    public String getNome() {
      return this.nome;
    }
  
    public Double getPreco() {
      return this.preco;
    }
  
    public void setPreco(Double preco) {
      this.preco = preco;
    }
  
    public int getId() {
      return this.id;
    }
    public String toString(){
      return "ID: "+id+"Nome: "+nome+"\nPreço: "+preco+"\n";
    }

  }