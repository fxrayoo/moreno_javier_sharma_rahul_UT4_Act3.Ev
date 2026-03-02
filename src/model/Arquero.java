package model;

public class Arquero extends Personaje_Fisico implements Movible {
    private int agilidad;
    private int flechas;

    public Arquero(String nombre, int nivel, int salud, int agilidad, int flechas) {
        super(nombre, nivel, salud);
        this.agilidad = agilidad;
        this.flechas = flechas;
    }

    @Override
    public void atacar(Personaje objetivo) {
        if (flechas > 0) {
            flechas--;
            System.out.println(getNombre() + " dispara a " + objetivo.getNombre() + ". Flechas: " + flechas);
        } else {
            System.out.println(getNombre() + " no tiene flechas");
        }
    }

    public void precision_extrema() {
        System.out.println(getNombre() + " apunta aumentando su probabilidad de acierto.");
    }

    @Override
    public void moverse() {
        System.out.println(getNombre() + " caminando.");
    }
}