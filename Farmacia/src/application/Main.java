package application;
import application.Manager;
import application.Menu;
import entities.Estoque;
public class Main{
  public static void main(String[] args){
    Estoque estoque = new Estoque();
    estoque.addRemedio();
    estoque.alterarRemedio();
    //estoque.removeRemedio();
    double total = estoque.balanceamentoDeEstoque();
    System.out.println("Total em estoque: "+total);
    System.out.println(estoque.showEstoque());
  
  }     
}