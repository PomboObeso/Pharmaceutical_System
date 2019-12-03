package operador;

public class Operador {

    
    private int id; 
    private String name;
    private int cpf;
    
    public Operador(int id, String name, int cpf){
        this.id = id;
        this.name = name;
        this.cpf = cpf;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getCpf(){
        return cpf;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
}