/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd;
/**
 *
 * @author oolivarez
 * 
 */

public class Jugador {
  public Jugador siguienteJ=null;
  public Jugador anteriorJ=null;
  public DatosJugador raiz_dato=null;
  public String nombre; 
  public int cantidad; 
  public boolean tipo; //true para plantas y false para zombis
  
  public Personaje CatalogoPersonaje;
  public Personaje ListaPersonajes;
  public int contPersonajes;
  
  public void clonarCatalogo(){
  }
  
  public void setPersonaje(){
        
  }
  
  public void getPersonaje(){
  
  }
  
  public String toDotCatalgo(){
  return "";
  }
  
  
  
}
