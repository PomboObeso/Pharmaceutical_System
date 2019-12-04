package application;

//import java.util.ArrayList;
//import java.util.InputMismatchException;
import java.util.Scanner;
import operador.Operador;
//import entities.Estoque;
//import entities.Remedio;
//import entities.Receita;
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
            boolean retorno = Validator.validator(cpf);
            if(retorno == true){
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
        System.out.print("Digite o ID que deseja Buscar para alteração:");
        String id = input.nextLine();
        int buscaID = searchId(id);
        input.nextLine();
        if(buscaID != -1){
           System.out.println("O Id pertence ao Sistema");
           System.out.println("Digite oq deseja alterar\n"+"[1] Alterar o nome\n"+"[2] Alterar o CPF\n");
           int escolha = input.nextInt();
           if(escolha ==1){
               System.out.print("Inserir Nome do Operador:");
               String name = input.nextLine();
               operador[buscaID].setName(name);
           }
           else if(escolha == 2){
               System.out.print("Inserir CPF do Operador");
               String cpf = input.nextLine();
               boolean verify = Validator.validator(cpf);
               if(verify == true){
                   operador[buscaID].setCpf(cpf);
               }else{
                   System.out.println("CPF inválido. Tente novamente!");
                   alterarOperador();
               }
           }
           else{
               System.out.println("Opção invalida, tente novamente");
               alterarOperador();
           }
           
        }else{
            System.out.println("O Id não pertence ao Sistema"+"\nProcure novamente!");
            alterarOperador();
        }
    }
    public void removerOperador(){
        int searchId = searchId(id);
        if(searchId != -1){
            operador[searchId].setId(null);
            operador[searchId].setCpf(null);
            operador[searchId].setName(null);
        }else{
            System.out.println("Id invalido, tente novamente");
            removerOperador();
        }
    }
    public int searchId(String id){
        for(int i = 0; i < maxQtd; i++){
            if(operador[i].getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

}