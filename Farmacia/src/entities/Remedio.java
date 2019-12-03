package entities;
//id será independente do do index (podendo ser alterado e removido independente do arraylist) do array list/ ira fazer uma verificação de id livre 
public abstract class Remedio {
    private String nome;
    private double preco;
    private String id;
    private int quantityRemedio;
    //private boolean controlador;
  
    public Remedio(String nome, double preco, String id) {
      this.nome = nome;
      this.preco = preco;
      this.id = id;
      //this.controlador = controlador;
    }
  
    public String getNome() {
      return this.nome;
    }
  
    public double getPreco() {
      return this.preco;
    }
  
    public void setPreco(double preco) {
      this.preco = preco;
    }
  
    public String getId() {
      return this.id;
    }
    public int getQuantityRemedio(){
      return quantityRemedio;
    }
    public void setQuantityRemedio(int quantityRemedio){
      this.quantityRemedio = quantityRemedio;
    }
    public String toString(){
      return "ID: "+id+"Nome: "+nome+"\nPreço: "+preco+"\n";
    }

  }