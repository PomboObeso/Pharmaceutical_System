package application;

import java.util.Scanner;

import operador.Operador;
import entities.Estoque;
import entities.Remedio;
import entities.Receita;
import operador.Validator;

public class Manager{
    public static final int maxQtd = 5;
    Operador[] operador = new Operador[maxQtd];
    Validator validador = new Validator();
    Scanner input = new Scanner(System.in);
    
    String id, nome, cpf;
    public void addOperador(){
        System.out.println("Digite o ID do Operador");
        id = input.nextLine();
        System.out.println("Digite o nome do Operador");
        nome = input.nextLine();
        System.out.println("DIgite o CPf do Operador");
        cpf = input.nextLine();
        boolean retorno = validador.Validator(cpf);
        if(retorno = true){
            System.out.println("CPF aceito com sucesso");
        }else{
            System.out.println("CPF inválido! Tente novo");
            addOperador();
        }
               
        
    }
}