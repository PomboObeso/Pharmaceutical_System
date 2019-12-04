package application;

import java.util.Scanner;

import application.Manager;
import entities.Estoque;

public class Menu{
    Estoque estoque = new Estoque();
    Manager mein = new Manager();
    Scanner input = new Scanner(System.in);
    public void run(){
        System.out.println("FARMACIA SHIBOROS\nO que deseja fazer?\n"+
        "[1]Cadastrar Operador\n"+
        "[2]Alterar Operador\n"+
        "[3]Remover Operador\n"+
        "[4]Adicionar Remedio\n"+
        "[5]Alterar Remedio\n"+
        "[6]Remover Remedio\n"+
        "[7]Mostrar Balanceamento de Estoque"+
        "[8]Listar Itens do Estoque\n");
        try{
            int choose = input.nextInt();

            if(choose == 1){
                System.out.println("ADICIONAR OPERADOR:");
                mein.addOperador();
                run();
            }else if(choose == 2){
                System.out.println("ALTERAR OPERADOR:");
                mein.alterarOperador();
                run();
            }else if(choose == 3){
                System.out.println("REMOVER OPERADOR:");
                mein.removerOperador();
                run();
            }else if(choose == 4){
                System.out.println("ADICIONAR REMEDIO:");
                estoque.addRemedio();
                run();
            }else if(choose == 5){
                System.out.println("ALTERAR REMEDIO:");
                estoque.alterarRemedio();
                run();
            }else if(choose == 6){
                System.out.println("REMOVER REMEDIO:");
                estoque.removeRemedio();
                run();
            }else if(choose == 7){
                System.out.println("BALANCEAMENTO DE ESTOQUE:");
                double total = estoque.balanceamentoDeEstoque();
                System.out.println("Total: R$ "+total);
                run();
            }else if(choose == 8){
                System.out.println("ITENS DA PESTE DO ESTOQUE:");
                System.out.println(estoque.showEstoque());
                run();
            }else{
                System.out.println("Insira um valor válido!");
                run();
            }

        }catch(NumberFormatException error){
            System.out.println("Insira um valor válido!");
            run();
        }
    }
}