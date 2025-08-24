package model.evento;

import java.util.ArrayList;
import java.util.List;

import model.participante.Participante;

public class EquipoVisitante extends Equipo{

    protected List<Participante> EquipoVisitante;

    public EquipoVisitante() {
        this.EquipoVisitante = new ArrayList<>();
    }

    public List<Participante> getEquipoVisitante() {
        return EquipoVisitante;
    }

    public void añadirParticipanteVisitante(Participante p){
        EquipoVisitante.add(p);
    }

    public void removerParticipanteVisitante(Participante p){
        EquipoVisitante.remove(p);

}
}