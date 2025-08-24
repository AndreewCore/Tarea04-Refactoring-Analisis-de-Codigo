package model.evento;

import java.util.ArrayList;
import java.util.List;

import model.participante.Participante;

public class Estadistica {
    protected List<Integer> Estatidisticas;
    public Estadistica(){
        this.Estatidisticas = new ArrayList<>();
    }
    public List<Integer> getEstatidisticas() {
        return Estatidisticas;
    }
    public void setEstatidisticas(List<Integer> estatidisticas) {
        Estatidisticas = estatidisticas;
    }
}
