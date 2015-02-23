/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author otto
 */
public class Personaje  extends javax.swing.JLabel implements Cloneable{
    
 public Personaje anterior, siguiente;   
 public  String imagePath;
 public String nombre;
 public  int ataque; 
 public  int defensa;
 public  int tipoAtaque; //0 para ataque directo 1 para ataque con proyectil
 public  int cantidad;
 Icon imageicon;
    
 
 public Personaje clone(){
     Personaje obj=null;
     try{
         obj= (Personaje)super.clone();
     }catch(CloneNotSupportedException ex){
         JOptionPane.showMessageDialog(this, ex.toString());
     }
     
     return obj;
 }
}
