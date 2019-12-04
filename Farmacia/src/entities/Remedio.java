package entities;
//id será independente do do index (podendo ser alterado e removido independente do arraylist) do array list/ ira fazer uma verificação de id livre 
public class Remedio {
    private String name;
    private double price;
    private String id;
    private int quantityRemedio;
    //private boolean controlador;
  
    public Remedio(String name, double price, String id, int quantityRemedio) {
      this.name = name;
      this.price = price;
      this.id = id;
      this.quantityRemedio = quantityRemedio;
      //this.controlador = controlador;
    }
  
    public String getNome() {
      return this.name;
    }
    public void setName(String name){
      this.name = name;
    }
    public double getPreco() {
      return this.price;
    }
  
    public void setPreco(double price) {
      this.price = price;
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
      return "ID: "+id+ "\nNome: "+name+"\nPreço: "+price+"\n";
    }

  }