package entities;

import entities.Remedio;

public class Receita extends Remedio{
    private String nameMedic;
    private int crm;
    private String hospital;

    public Receita(String nome, double preco, String id,String nameMedic,int crm, String hospital) {
        super(nome, preco, id);
    }

    public String getNameMedic() {
        return nameMedic;
    }

    public void setNameMedic(String nameMedic) {
        this.nameMedic = nameMedic;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
    public String toString(){
        return "ID: "+crm+"Nome: "+nameMedic+"\nPreço: "+hospital+"\n";
      }
}