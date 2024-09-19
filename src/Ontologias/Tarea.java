package Ontologias;

import java.io.Serializable;

public class Tarea implements Serializable {
    private String nombre;
    private String descripcion;
    private int duracion; // en horas
    private Empleado empleadoAsignado;

    public Tarea(String nombre, String descripcion, int duracion, Empleado empleadoAsignado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.empleadoAsignado = empleadoAsignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Empleado getEmpleadoAsignado() {
        return empleadoAsignado;
    }

    public void setEmpleadoAsignado(Empleado empleadoAsignado) {
        this.empleadoAsignado = empleadoAsignado;
    }
    
    
}