package Ontologias;

import java.io.Serializable;

public class Reporte implements Serializable {
    private Tarea tarea;
    private String estado;
    private int porcentajeRealizacion; 

    public Reporte(Tarea tarea, String estado, int porcentajeRealizacion) {
        this.tarea = tarea;
        this.estado = estado;
        this.porcentajeRealizacion = porcentajeRealizacion;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPorcentajeRealizacion() {
        return porcentajeRealizacion;
    }

    public void setPorcentajeRealizacion(int porcentajeRealizacion) {
        this.porcentajeRealizacion = porcentajeRealizacion;
    }
}
