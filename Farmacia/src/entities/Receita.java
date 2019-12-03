package entities;

import entities.Remedio;

public class Receita extends Remedio{
    private String nameMedic;
    private int crm;
    private String hospital;

    public Receita(String nome, Double preco, int id, boolean controlador,String nameMedic,int crm, String hospital) {
        super(nome, preco, id, controlador);
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

}