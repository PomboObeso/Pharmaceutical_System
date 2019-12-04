package entities;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import entities.Remedio;

public class Estoque {
  
  private ArrayList<Remedio> remedios = new ArrayList<>();
  private Receita receita;
  Scanner input = new Scanner(System.in);
  
  public Estoque() {
    
    this.remedios = new ArrayList<Remedio>();
  
  }
  public void addRemedio(Remedio remedio, int quantityRemedio){
    //this.remedios.add(remedio);
    try{
        
        System.out.print("Insira o ID do Remedio");
        String id = input.nextLine();
        input.nextLine();
        System.out.print("Digite o nome do Remedio");
        String name = input.nextLine();
        System.out.print("Digite o preço do Remedio:");
        double price = input.nextDouble();
        input.nextLine();
        System.out.print("Quantidade a ser inserida no estoque:");
        quantityRemedio = input.nextInt();
        input.nextLine();
        boolean verify = verifyId(id);
        System.out.println("O Remedio precisa de recetuario?[S/N]");
        char choose = input.next().charAt(0);
        
        if(choose == 'S' || choose == 's'){
          System.out.print("Insira o nome do Médico:");
          String nameMedic = input.nextLine();
          System.out.print("Insira seu respectivo CRM:");
          int crm = input.nextInt();
          input.nextLine();
          System.out.print("Insira o Hospital que emitiu a receita:");
          String hospital = input.nextLine();
          receita = new Receita(name, price, quantityRemedio, id, nameMedic, crm, hospital);
        }else{

        }
        if(verify == true){
          System.out.println("Esta ID já esta em uso. Insira uma ID válida!");
          addRemedio(remedio, quantityRemedio);
        }else{
          remedios.add(new Remedio(name,price,id,quantityRemedio));
        }
    }catch(InputMismatchException error){
      System.out.println("Erro de tipo: Insira os dados corretamente");
    }

}

  public boolean verifyId(String id){
    for (Remedio element: remedios) {
      if(element.getId().equals(id)){
        return true;
      }
    }
    return false;
  }
  public Remedio getById(String id){
    for (Remedio element: remedios) {
      if(element.getId().equals(id)){
        
        return element;
      }
    }
    return null;
  }  
  public void removeRemedio() {
    try{
      System.out.println("Remoção de Remedios\n");
      System.out.print("Insira a quantidade de remedios que deseja remover:");
      int quantityForRemove = input.nextInt();
      input.nextLine();
      for(int i = 0; i < quantityForRemove; i++){
        String id = input.nextLine();
        boolean verify = verifyId(id);
        if(verify == true){
          remedios.remove(getById(id));
        }else{
          System.out.println("Insira um id válido");
          removeRemedio();
        }
      }
    }catch(InputMismatchException error){
      System.out.println("Erro de tipo: Insira os dados corretamente!");
    }
  }
  public void alterarRemedio(){
    try{
      System.out.println("Insira o Id do Remedio:");
      String id = input.nextLine();
      Remedio remedio = getById(id);
      boolean verify = verifyId(id);
      if(verify == true){
        System.out.println("Qual atributo deseja alterar:\n[1] Nome\n[2]Preço\n[3]Quantidade");
        int choose = input.nextInt();
        input.nextLine();
        if(choose == 1){
          System.out.print("Novo nome para o Remedio:");
          String name = input.nextLine();
          remedio.setName(name);
          
        }else if(choose == 2){
          System.out.print("Insira o novo preço do Remedio:");
          double price = input.nextDouble();
          input.nextLine();
          remedio.setPreco(price);
        }else if(choose == 3){
          System.out.print("Insira a nova quantidade:");
          int quantityRemedio = input.nextInt();
          input.nextLine();
          remedio.setQuantityRemedio(quantityRemedio);
        }else{
          System.out.println("Insira um número válido");
          alterarRemedio();
        }
      }
    }catch(InputMismatchException error){
      System.out.println("Erro de tipo: Insira os dados corretamente!");
    }
  }
  public double balanceamentoDeEstoque(){
    double sum = 0;
    for (Remedio remedio : remedios) {
      sum+= remedio.getPreco() * remedio.getQuantityRemedio();
    }
    return sum;
  }
  public String showEstoque(){
    if(receita == null){
      return remedios.toString();
    }else{
      return remedios.toString()+"\n"+receita.toString();
    }
  }

}