/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

/**
 *
 * @author ignacio
 */
public class NodoDoble<T> {
    private T dato;
    private NodoDoble<T> izquierda;
    private NodoDoble<T> derecha;

    public NodoDoble(){
        
    }
    
    public NodoDoble(T dato){
        this.dato = dato;
        this.derecha = null;
        this.izquierda = null;
    }
          
    /**
     * @return the dato
     */
    public T getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(T dato) {
        this.dato = dato;
    }

    /**
     * @return the izquierda
     */
    public NodoDoble getIzquierda() {
        return izquierda;
    }

    /**
     * @param izquierda the izquierda to set
     */
    public void setIzquierda(NodoDoble izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * @return the derecho
     */
    public NodoDoble getDerecha() {
        return derecha;
    }

    /**
     * @param derecho the derecho to set
     */
    public void setDerecha(NodoDoble derecho) {
        this.derecha = derecho;
    } 
}
