package model.evento;

import model.participante.Participante;
import model.enums.EstadoEvento;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import creational.BasketFactory;
import creational.EventoAbstractFactory;
import creational.FutbolFactory;
import creational.TenisFactory;

public abstract class Evento {
    protected String id;
    protected String nombre;
    protected LocalDateTime horaComienza;
    protected List<Integer> estadisticas;
    protected int duracion;
    protected String lugar;
    protected EstadoEvento estado;
    protected EquipoLocal equipoLocal;
    protected EquipoVisitante equipoVisitante;

    public Evento(String nombre, LocalDateTime horaComienza) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.equipoLocal = new EquipoLocal();
        this.equipoVisitante = new EquipoVisitante();
        this.horaComienza = horaComienza;
        this.estadisticas = new ArrayList<>();
        this.lugar = "Mi casa padre";
        this.estado = EstadoEvento.PROGRAMADO;
        this.estadistica = new Estadistica();
    }

    public abstract Prediccion crearPrediccion();

    public void agregarParticipante(Participante p, List<Participante> Equipo){
        Equipo.add(p);
    }

    public void iniciarEvento() {
        this.estado = EstadoEvento.EN_CURSO;
        System.out.println("Evento iniciado: " + nombre);
    }

    public void finalizarEvento() {
        this.estado = EstadoEvento.FINALIZADO;
        System.out.println("Evento finalizado: " + nombre);
    }

    public abstract void actualizarEstadisticas();
    public abstract String calcularResultado();

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Participante> getEquipoLocal() {
        return equipoLocal.getEquipoLocal();
    }

    public void setEquipoLocal(List<Participante> equipoLocalParticipante) {
        equipoLocal.añadirParticipanteLocal(equipoLocalParticipante.get(equipoLocalParticipante.size()));
    }

    public List<Participante> getEquipoVisitante() {
        return equipoVisitante.getEquipoVisitante();
    }

    public void setEquipoVisitante(List<Participante> equipoVisitanteParticipante) {
        equipoVisitante.añadirParticipanteVisitante(equipoVisitanteParticipante.get(equipoVisitanteParticipante.size()));
    }

    public LocalDateTime getHoraComienza() {
        return horaComienza;
    }

    public void setHoraComienza(LocalDateTime horaComienza) {
        this.horaComienza = horaComienza;
    }

    public List<Integer> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<Integer> estadisticas) {
        this.estadisticas = estadisticas;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setEstado(EstadoEvento estado) {
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public EstadoEvento getEstado() {
        return estado;
    }
}
