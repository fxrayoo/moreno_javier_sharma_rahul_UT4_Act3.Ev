package app;

import model.*;

public class Main {
    public static void main(String[] args) {
    
        Gestor_Juego gestor = new Gestor_Juego();

        
        Guerrero g = new Guerrero("Goku", 10, 100, 20, 15);
        Arquero a = new Arquero("Robin Hood", 8, 80, 25, 50);
        Mago m = new Mago("Gandalf", 12, 70, 40, 100);
        Clerigo c = new Clerigo("Rubius", 9, 90, 15, "Valhalla");

        
        gestor.agregar_personaje(g);
        gestor.agregar_personaje(a);
        gestor.agregar_personaje(m);
        gestor.agregar_personaje(c);

        
        System.out.println("=== LISTADO DE PERSONAJES ===");
        gestor.mostrar_personajes();

        
        System.out.println("\n=== SIMULACIÓN DE BATALLA (POLIMORFISMO) ===");
        gestor.realizar_ataques();

        
        System.out.println("\n=== ACCIONES ESPECIALES (INTERFACES) ===");
        gestor.capacidades_especiales();
    }
}
