package model.evento;

import java.time.LocalDateTime;
import java.util.Random;

import model.prediccion.Prediccion;
import model.prediccion.PrediccionFutbol;

public class EventoFutbol extends Evento {
    private Boolean penales;
    private Boolean tiempoExtra;
    private int golesVisitante;
    private int golesLocal;

    public EventoFutbol(String nombre, LocalDateTime horaComienza) {
        super(nombre, horaComienza);
        this.penales = false;
        this.tiempoExtra = false;
        this.golesVisitante = 0;
        this.golesLocal = 0;
    }

    @Override
    public void actualizarEstadisticas() {
        estadistica.getEstatidisticas().clear();
        estadistica.getEstatidisticas().add(new Random().nextInt(5));
        estadistica.getEstatidisticas().add(new Random().nextInt(5));
        System.out.println("Estadísticas de fútbol actualizadas");
    }

    @Override
    public String calcularResultado() {
        if (estadistica.getEstatidisticas().size() >= 2) {
            int golesLocal = estadistica.getEstatidisticas().get(0);
            int golesVisitante = estadistica.getEstatidisticas().get(1);
            return golesLocal + " - " + golesVisitante;
        }
        return "0 - 0";
    }

    @Override
    public Prediccion crearPrediccion() {
        return new PrediccionFutbol();
    }

}
