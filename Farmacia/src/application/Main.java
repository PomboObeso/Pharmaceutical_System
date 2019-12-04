package application;
import application.Manager;
import application.Menu;
import entities.Estoque;
public class Main{
  public static void main(String[] args){
    Estoque estoque = new Estoque();
    estoque.addRemedio();
    estoque.alterarRemedio();
    estoque.removeRemedio();
    estoque.balanceamentoDeEstoque();
    estoque.showEstoque();
  
  }     
}