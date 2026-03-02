package model;

import java.util.ArrayList;

public class Gestor_Juego {
    private ArrayList<Personaje> personajes;

    public Gestor_Juego() {
        this.personajes = new ArrayList<>();
    }

    public void agregar_personaje(Personaje p) {
        personajes.add(p);
    }

    public void mostrar_personajes() {
        for (Personaje p : personajes) {
            System.out.println(p.toString());
        }
    }

    public void realizar_ataques() {
        for (Personaje p : personajes) {
            p.atacar(p); 
        }
    }

    public void capacidades_especiales() {
        for (Personaje p : personajes) {
            if (p instanceof Curable) {
                ((Curable) p).curar(p);
            }
            if (p instanceof Defendible) {
                ((Defendible) p).defender();
            }
        }
    }
}