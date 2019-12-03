package application;

import java.util.Scanner;

import operador.Operador;
import entities.Estoque;
import entities.Remedio;
import entities.Receita;
import operador.Validator;
import java.lang.ArrayIndexOutOfBoundsException;

public class Manager{
    public static final int maxQtd = 5;
    Operador[] operador = new Operador[maxQtd];
    Validator validador = new Validator();
    Scanner input = new Scanner(System.in);
    
    String id, name, cpf;
    public void addOperador(){
        try{
            System.out.println("Digite o ID do Operador");
            id = input.nextLine();
            System.out.println("Digite o nome do Operador");
            name = input.nextLine();
            System.out.println("DIgite o CPF do Operador");
            cpf = input.nextLine();
            boolean retorno = validador.Validator(cpf);
            if(retorno = true){
                System.out.println("CPF aceito com sucesso");
                int free = getFreeId();
                if(free != -1){
                    operador[free] = new Operador(id, name, cpf); 
                }
                else{
                    System.out.println("Não há ID's Disponíveis!");
                }
            }else{
                System.out.println("Cpf invalido digite novamente o CPF");
                addOperador();    
            }
        }catch(ArrayIndexOutOfBoundsException erro){
           System.out.println("Quantidade Máxima de Operadores alcançada!"); 
        }
   
    }
    public int getFreeId(){
        for(int j = 0; j < maxQtd; j++){
            if(operador[j] == null){
                return j;
            }
        }
            return -1;        
    }
    
    public void alterarOperador(){
        
    }
}