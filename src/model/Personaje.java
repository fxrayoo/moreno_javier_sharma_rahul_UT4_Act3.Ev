package model;

import java.util.Objects;
import java.util.UUID;

public abstract class Personaje {
    
    private String id;
    private String nombre;
    private int nivel;
    private int salud;

    public Personaje(String nombre, int nivel, int salud) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    public abstract void atacar(Personaje objetivo);

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        if (salud < 0) {
            this.salud = 0;
        } else {
            this.salud = salud;
        }
    }
    
    @Override
    public String toString() {
        return "Personaje: ID= " + id + ", Nombre= " + nombre + ", Nivel= " + nivel + ", Salud= " + salud;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Personaje personaje = (Personaje) obj;
        return Objects.equals(id, personaje.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}