/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

import Cola.Cola;

/**
 *
 * @author ignacio
 */
public class Arbol <T>{
    private NodoDoble raiz;
        
    public Arbol(){
        
    }
    
    public boolean buscar(int dato) { 
            return(buscar(raiz, dato)); 
        } 
        
    private boolean buscar(NodoDoble node, int dato) { 
            if (node==null)  
                return(false); 
            if (dato==node.getDato()) 
                return(true);
            else if (dato < (Integer)node.getDato()) 
                return(buscar(node.getIzquierda(), dato)); 
            else 
                return(buscar(node.getDerecha(), dato)); 
        } 
       
    public void insertar(int data) { 
        insertar(raiz, data); 
    } 
    
    private void insertar(NodoDoble nodo, int dato) { 
        
    NodoDoble padre = null;
    NodoDoble actual = raiz;
    while(!vacio(actual) && dato != actual.getDato()) {
       padre = actual;
        if(dato > (Integer)actual.getDato())
          actual = actual.getDerecha();
        else 
          if(dato < (Integer)actual.getDato()) 
              actual = actual.getIzquierda();
   }

    if(!vacio(actual)) 
       return;

    if(vacio(padre)) 
       raiz = new NodoDoble(dato);
    else if(dato < (Integer)padre.getDato()) padre.setIzquierda(new NodoDoble(dato));
    else if(dato > (Integer)padre.getDato()) padre.setDerecha(new NodoDoble(dato));
    }
       
    public void elmininar(int dato){
    NodoDoble padre = null;
    NodoDoble nodo;
    int aux;

    NodoDoble actual = raiz;
    while(!vacio(actual)) {
      if(dato == (Integer)actual.getDato()) { 
         if(esHoja(actual)) { 
            if(padre != null) 
               if(padre.getDerecha() == actual) 
                   padre.setDerecha(null);
               else if(padre.getIzquierda() == actual) 
                    padre.setIzquierda(null);
            
            actual = null;
            return;
         }else{ 
            padre = actual;
            if(actual.getDerecha() != null) {
               nodo = actual.getDerecha();
             while(nodo.getIzquierda() != null) {
                padre = nodo;
                nodo = nodo.getIzquierda();
              }
            }else{
               nodo = actual.getIzquierda();
               while(nodo.getDerecha()!=null){
                  padre = nodo;
                  nodo = nodo.getDerecha();
               }
            }
            aux = (Integer)actual.getDato();
            actual.setDato(nodo.getDato());
            nodo.setDato(aux);
            actual = nodo;
         }
            }else{ 
            padre = actual;
                if(dato > (Integer)actual.getDato()) 
                    actual = actual.getDerecha();
                else if(dato < (Integer)actual.getDato()) 
                    actual = actual.getIzquierda();
            }
        }
    }
    
    public boolean esHoja(NodoDoble nodo){
        if(nodo.getDerecha() == null && nodo.getIzquierda() == null)
            return true;
        else
            return false;
    }
    
    public boolean vacio(NodoDoble rama){
        if(rama == null)
            return true;
        else
            return false;
    }
    
    public void niveles(){
        NodoDoble<T> aux = raiz;
        Cola cola = new Cola();
        cola.push(aux);
        
        while(!cola.vacia()){
            aux = (NodoDoble)cola.pop();
            System.out.print(aux.getDato()+" ");
            if(aux.getIzquierda()!= null)
                cola.push(aux.getIzquierda());
            if(aux.getDerecha() != null)
                cola.push(aux.getDerecha());
        }
            
    }
    
    public void preOrden(){
        preOrden(raiz);
    }
    
     private void preOrden(NodoDoble aux){
        if(aux == null)
            return;
        
        System.out.print(aux.getDato() + " ");     
        preOrden(aux.getIzquierda());  
        preOrden(aux.getDerecha()); 
    }
    
     public void postOrden(){
        postOrden(raiz);
    }
    
    private void postOrden(NodoDoble aux){       
        if(aux == null)
            return;
        postOrden(aux.getIzquierda());  
        postOrden(aux.getDerecha()); 
        System.out.print(aux.getDato() + " ");   
    }
    
    public void inOrden(){
        inOrden(raiz);
    }
    
    private void inOrden(NodoDoble aux){
        if(aux == null)
            return;
        inOrden(aux.getIzquierda());  
        System.out.print(aux.getDato() + " ");  
        inOrden(aux.getDerecha()); 
    }
}