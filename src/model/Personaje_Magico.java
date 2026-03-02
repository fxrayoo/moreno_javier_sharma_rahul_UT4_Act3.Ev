package model;

public abstract class Personaje_Magico extends Personaje {

    public Personaje_Magico(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    public void meditar() {
        System.out.println(getNombre() + " Meditando.");
    }
}