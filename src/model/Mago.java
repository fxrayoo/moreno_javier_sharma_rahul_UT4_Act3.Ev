package model;

public class Mago extends Personaje_Magico implements Movible {
    private int inteligencia;
    private int mana;

    public Mago(String nombre, int nivel, int salud, int inteligencia, int mana) {
        super(nombre, nivel, salud);
        this.inteligencia = inteligencia;
        this.mana = mana;
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(getNombre() + " lanza un rayo a " + objetivo.getNombre() + " usando " + inteligencia + " de poder.");
    }

    public void recargar_mana() {
        this.mana += 20;
        System.out.println(getNombre() + " ha recuperado energía mágica.");
    }

    @Override
    public void moverse() {
        System.out.println(getNombre() + " caminando.");
    }
}