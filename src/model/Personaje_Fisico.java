package model;

public abstract class Personaje_Fisico extends Personaje {
    
    public Personaje_Fisico(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    public void cargar_energia() {
        System.out.println(getNombre() + " Cargando energía.");
    }
}