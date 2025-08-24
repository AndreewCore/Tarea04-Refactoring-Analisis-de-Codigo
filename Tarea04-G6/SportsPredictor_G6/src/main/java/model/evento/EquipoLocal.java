package model.evento;

import java.util.ArrayList;
import java.util.List;

import model.participante.Participante;

public class EquipoLocal extends Equipo {
    protected List<Participante> EquipoLocal;

    public EquipoLocal() {
        this.EquipoLocal = new ArrayList<>();
        
    }
    public List<Participante> getEquipoLocal() {
        return EquipoLocal;
    }

    public void añadirParticipanteLocal(Participante p){
        EquipoLocal.add(p);
    }

    public void removerParticipanteLocal(Participante p){
        EquipoLocal.remove(p);
    }
}
