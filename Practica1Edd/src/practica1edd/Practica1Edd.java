/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd;

/**
 *
 * @author otto
 */
public class Practica1Edd {

    /**
     * @param args the command line arguments
     */
    public static Jugador raizJugador;
    public static ListaPersonajes CatPlantas;
    public static ListaPersonajes CatZombis;

   // public static Personaje Plantas;
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Programando con repositorios");
    
        FrameInicial fi = new FrameInicial();
        fi.setLayout(null);
        fi.setSize(400,400);
        fi.setVisible(true);
           
    }
    
}
