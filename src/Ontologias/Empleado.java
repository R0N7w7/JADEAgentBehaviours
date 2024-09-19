package Ontologias;

import java.io.Serializable;

public class Empleado implements Serializable {
    private String nombre;
    private String posicion;
    private int nivelExperiencia;

    public Empleado(String nombre, String posicion, int nivelExperiencia) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.nivelExperiencia = nivelExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(int nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }
}
