package model.evento;

import java.time.LocalDateTime;
import java.util.Random;

import model.prediccion.Prediccion;
import model.prediccion.PrediccionTenis;

public class EventoTenis extends Evento {
    private int setsLocal;
    private int juegos;
    private int setsVisitantes;

    public EventoTenis(String nombre, LocalDateTime horaComienza) {
        super(nombre, horaComienza);
        this.setsLocal = 0;
        this.juegos = 0;
        this.setsVisitantes = 0;
    }

    @Override
    public void actualizarEstadisticas() {
        estadistica.getEstatidisticas().clear();
        estadistica.getEstatidisticas().add(new Random().nextInt(3) + 1);
        estadistica.getEstatidisticas().add(new Random().nextInt(3) + 1);
        System.out.println("Estadísticas de tenis actualizadas");
    }

    @Override
    public String calcularResultado() {
        if (estadistica.getEstatidisticas().size() >= 2) {
            return estadistica.getEstatidisticas().get(0) > estadistica.getEstatidisticas().get(1) ? "Jugador 1" : "Jugador 2";
        }
        return "Sin determinar";
    }

    @Override
    public Prediccion crearPrediccion() {
        return new PrediccionTenis();
    }

}
