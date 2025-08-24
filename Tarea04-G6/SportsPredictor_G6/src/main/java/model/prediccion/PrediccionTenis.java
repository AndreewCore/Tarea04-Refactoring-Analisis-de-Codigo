package model.prediccion;

import model.evento.EventoTenis;
import model.enums.EstadoEvento;

public class PrediccionTenis extends Prediccion {
    private String ganadorPredicho;
    private Integer setsPredichos;

    public PrediccionTenis() { 
        super(); 
    }

    @Override
    public void validarPrediccion() {
        if (!(evento instanceof EventoTenis)) return;
        if (evento.getEstado() != EstadoEvento.FINALIZADO) return;

        EventoTenis tenis = (EventoTenis) evento;
        String ganadorReal = tenis.calcularResultado();

        if (ganadorReal.equals(ganadorPredicho)) {
            this.estado = model.enums.EstadoPrediccion.ACERTADO;
            this.puntos = calcularPuntos();
        } else {
            this.estado = model.enums.EstadoPrediccion.FALLIDO;
        }
    }

    @Override
    public void setPrediccion(String s, int i, int j) {
        this.ganadorPredicho = s;
        this.setsPredichos = i;
    }

    @Override
    public Integer calcularPuntos() {
        return estado == model.enums.EstadoPrediccion.ACERTADO ? 12 : 0;
    }
}
