package operador;

public class Operador {

    
    private String id; 
    private String name;
    private String cpf;
    
    public Operador(String id, String name, String cpf){
        this.id = id;
        this.name = name;
        this.cpf = cpf;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}