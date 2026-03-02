package model;

public class Clerigo extends Personaje_Magico implements Curable {
    private int fe;
    private String deidad;

    public Clerigo(String nombre, int nivel, int salud, int fe, String deidad) {
        super(nombre, nivel, salud);
        this.fe = fe;
        this.deidad = deidad;
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(getNombre() + " ataca a " + objetivo.getNombre());
    }

    public void rezar() {
        System.out.println(getNombre() + " le reza a " + deidad);
    }

    @Override
    public void curar(Personaje objetivo) {
        int sanacion = fe * 2;
        objetivo.setSalud(objetivo.getSalud() + sanacion);
        System.out.println(getNombre() + " sana a " + objetivo.getNombre() + " recuperando " + sanacion + " de salud.");
    }
}