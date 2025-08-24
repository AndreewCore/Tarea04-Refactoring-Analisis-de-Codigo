package model.evento;

import java.time.LocalDateTime;
import java.util.Random;

import model.prediccion.Prediccion;
import model.prediccion.PrediccionBasket;

public class EventoBasket extends Evento {
    private Boolean desempate;
    private Boolean tiempoExtra;
    private int puntosLocal;
    private int puntosVisitante;

    public EventoBasket(String nombre, LocalDateTime horaComienza) {
        super(nombre, horaComienza);
        this.desempate = false;
        this.tiempoExtra = false;
        this.puntosLocal = 0;
        this.puntosLocal = 0;
    }

    @Override
    public void actualizarEstadisticas() {
        estadistica.getEstatidisticas().clear();
        estadistica.getEstatidisticas().add(80 + new Random().nextInt(40));
        estadistica.getEstatidisticas().add(80 + new Random().nextInt(40));
        System.out.println("Estadísticas de básquet actualizadas");
    }

    @Override
    public String calcularResultado() {
        return estadistica.getEstatidisticas().stream().mapToInt(Integer::intValue).sum() + "";
    }

    @Override
    public Prediccion crearPrediccion() {
        return new PrediccionBasket();
    }

}
