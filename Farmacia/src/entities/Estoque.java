package entities;

import java.util.ArrayList;

public class Estoque {
  private static final int maxQt = 1000;
  private ArrayList<Remedio> remedios;
  private boolean[] idsRemedio;
  private int[] quantidades;
  
  public Estoque() {
    this.remedios = new ArrayList<Remedio>();
    this.idsRemedio = new boolean[maxQt];
    this.quantidades = new int[maxQt];
  }

  public void addRemedio(Remedio r, int quantidade) {
    this.remedios.add(r);
    this.quantidades[r.getId()] += quantidade;
    this.idsRemedio[r.getId()] = true;
  }

  public void RemoveRemedioAll(int id) {
    for (Remedio r : this.remedios) {
      if (r.getId() == id) {
        this.remedios.remove(r);
        this.idsRemedio[id] = false;
        this.quantidades[id] = 0;
      }
    }
  }

  public void RemoveRemedio(int id ) {
    
  }

  public int getFreeId() {
    for (int i = 0; i < this.idsRemedio.length; i++) {
      if (!this.idsRemedio[i]) return i;
    }
    return -1;
  }

}