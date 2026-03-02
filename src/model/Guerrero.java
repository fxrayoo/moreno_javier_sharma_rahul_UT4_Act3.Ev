package model;

public class Guerrero extends Personaje_Fisico implements Defendible, Movible {
    private int fuerza;
    private int armadura;

    public Guerrero(String nombre, int nivel, int salud, int fuerza, int armadura) {
        super(nombre, nivel, salud);
        this.fuerza = fuerza;   
        this.armadura = armadura;
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(getNombre() + " golpea con su espada a " + objetivo.getNombre() + " y hace " + fuerza + " de daño.");
    }

    public void usar_escudo() {
        System.out.println(getNombre() + " aumenta la defensa usando escudo.");
    }

    @Override
    public void defender() {
        System.out.println(getNombre() + " está defendiendo.");
    }

    @Override
    public void moverse() {
        System.out.println(getNombre() + " caminando.");
    }
}