/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

/**
 *
 * @author ignacio
 */
public class NodoSimple<T> {
     private T signo;
    private NodoSimple<T> liga;
    
    NodoSimple(){
        
    }
    
    public NodoSimple(T info){
        this.signo=info;
        this.liga=null;
    }
    

    /**
* @return the dato
*/
    public T getDato() {
        return signo;
    }

    /**
* @param dato the dato to set
*/
    public void setDato(T dato) {
        this.signo = dato;
    }

    /**
* @return the liga
*/
    public NodoSimple<T> getLiga() {
        return liga;
    }

    /**
* @param liga the liga to set
*/
    public void setLiga(NodoSimple<T> liga) {
        this.liga = liga;
    }
}
