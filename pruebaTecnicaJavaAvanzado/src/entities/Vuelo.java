package entities;

import javax.annotation.processing.Generated;
import java.time.LocalDate;

public class Vuelo {
    // Cremaos lavariable contador para generar automaticamente el id.
    private static long contadorId = 1;

    // Crear clase Vuelo con sus atributos.
    private long id;
    private String nombreVuelo;
    private String empres;
    private String lugarSalida;
    private String lugarLlegada;
    LocalDate fechaInicio;
    LocalDate fechaFinal;

    public Vuelo(String nombreVuelo, String empres, String lugarSalida, String lugarLlegada, LocalDate fechaInicio, LocalDate fechaFinal) {
        // Generamos el id automaticamente.
        this.id = contadorId++;
        this.nombreVuelo = nombreVuelo;
        this.empres = empres;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public long getId() {
        return id;
    }

    public String getNombreVuelo() {
        return nombreVuelo;
    }

    public String getEmpres() {
        return empres;
    }

    public String getLugarSalida() {
        return lugarSalida;
    }

    public String getLugarLlegada() {
        return lugarLlegada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setNombreVuelo(String nombreVuelo) {
        this.nombreVuelo = nombreVuelo;
    }

    public void setEmpres(String empres) {
        this.empres = empres;
    }

    public void setLugarSalida(String lugarSalida) {
        this.lugarSalida = lugarSalida;
    }

    public void setLugarLlegada(String lugarLlegada) {
        this.lugarLlegada = lugarLlegada;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    @Override
    public String toString() {
        return "Vuelo: " +
                "id=" + id +
                ", nombreVuelo='" + nombreVuelo + '\'' +
                ", empres='" + empres + '\'' +
                ", lugarSalida='" + lugarSalida + '\'' +
                ", lugarLlegada='" + lugarLlegada + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFinal=" + fechaFinal;
    }
}
