package entities;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import entities.Remedio;

public class Estoque {
  private ArrayList<Remedio> remedios = new ArrayList<>();
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
        boolean verify = getFreeId(id);
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

  public boolean getFreeId(String id){
    for (Remedio element: remedios) {
      if(element.getId().equals(id)){
        return true;
      }
    }
    return false;
  }

  public void RemoveRemedio(int id ) {
    try{
      System.out.println("Remoção de Remedios\n");
      System.out.print("Insira a quantidade de reemios que deseja remover:");
      int quantityForRemove = input.nextInt();
      input.nextLine();
      for(int i = 0; i < quantityForRemove; i++){
        String id = input.nextLine();
        boolean
      }
    }catch(InputMismatchException error){
      System.out.println("Erro de tipo: Insira os dados corretamente");
    }
  }

}