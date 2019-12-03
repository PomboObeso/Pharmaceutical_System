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
    this.remedios.add(remedio);
    try{
        System.out.print("Insira o ID do Remedio");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Digite o nome do Remedio");
        String name = input.nextLine();
        System.out.print("Digite o preço do Remedio:");
        double price = input.nextDouble();
        input.nextLine();

    }catch(InputMismatchException error){

    }

}

  public void getFreeId(){
    
  }

  public void RemoveRemedio(int id ) {
    
  }

}