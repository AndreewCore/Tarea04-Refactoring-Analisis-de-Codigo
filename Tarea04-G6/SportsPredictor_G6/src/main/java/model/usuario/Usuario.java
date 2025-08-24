package model.usuario;

import model.evento.Evento;
import model.prediccion.Prediccion;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Usuario {
    private String id;
    private String nombre;
    private String email;
    private Integer puntosTotales;
    private List<Prediccion> predicciones;

    public Usuario(String nombre, String email){
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre; 
        this.email = email;
        this.puntosTotales = 0;
        this.predicciones = new ArrayList<>();
    }

    public void realizarPrediccion(Evento evento){
        Prediccion p = evento.crearPrediccion();
        p.setUsuario(this);
        p.setEvento(evento);
        predicciones.add(p);
        System.out.println(nombre + " realizó predicción para: " + evento.getNombre());
        
    }

    public void consultarPuntos(){
        System.out.println(nombre + " tiene " + puntosTotales + " puntos totales");
    }

    public String getNombre(){
        return nombre;
    }
    
    public Integer getPuntosTotales(){
        return puntosTotales;
    }
    
    public void agregarPuntos(Integer p){
        this.puntosTotales += p;
    }
    public List<Prediccion> getPredicciones(){
        return predicciones;
    }

    public void update(String mensaje){
        System.out.println( nombre + " recibió notificación: " + mensaje);
    }
}
