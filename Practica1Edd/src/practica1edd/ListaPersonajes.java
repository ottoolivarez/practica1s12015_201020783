/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd;

import java.util.Random;
/**
 *
 * @author otto
 */
public class ListaPersonajes {
    
    private boolean tipo;
    private Personaje raiz;
    private Personaje raizClon;
    int contadorPersonajes;
    int contadorRestantes;
    
    
    public ListaPersonajes(boolean Tipo){
    tipo=Tipo;
    }
    
    public void insertPersonaje(Personaje p){
        if (raiz==null){
            raiz= p;
        }else{
            Personaje aux= raiz;
            while (aux.siguiente!=null){
                aux= aux.siguiente;
            }
            aux.siguiente=p;
            p.anterior=aux;           
        }
        contadorPersonajes+=1;
    }
    
    public void ClonarLista(){
        raizClon=raiz.clone();
        contadorRestantes=contadorPersonajes;
    }
    
    public Personaje getPersonaje(){
        int indice;
        Random r= new Random();
        indice=r.nextInt(contadorRestantes)+1;
        Personaje aux=raizClon;
        
        for(int i=1;i==indice;i++){
            aux= aux.siguiente;
        }
       //si el nodo es el final 
        if(aux.siguiente==null){
             aux.anterior.siguiente=null;
             
        }else if(aux==raiz){//si es la raiz
            aux.siguiente.anterior=null;
            raiz= aux.siguiente;
        }else{//si es un nodo intermendio
                aux.siguiente.anterior= aux.anterior;
                aux.anterior.siguiente=aux.siguiente;
        }
        contadorRestantes-=1;
        
        return aux;
    }
    
    public String toDotGraph(){
    Personaje aux=raiz;
    int Contador=1;
    StringBuilder sb= new StringBuilder();    
    sb.append("digraph g{ \\n" );
    if(tipo){
    sb.append(" graph [label=\"Catalogo: Plantas\", labelloc=t]; \\n" );
    }else{
    sb.append(" graph [label=\"Catalogo: Zombis\", labelloc=t]; \\n" );
    }
    while (aux.siguiente!=null){
        
        sb.append("p");sb.append(Contador);
        sb.append("[label=\" Nombre:");
        sb.append(aux.nombre);
        sb.append("\\n Ataque: ");
        sb.append(aux.ataque);
        sb.append("\\n Defensa: ");
        sb.append(aux.defensa);
        sb.append("\\n");
        sb.append("p");sb.append(Contador);
        sb.append("->");
        sb.append("p");sb.append(Contador+1);
        
        aux=aux.siguiente;
        }
        return sb.toString();
    }
}
