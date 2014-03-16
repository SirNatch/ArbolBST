package Cola;

/**
 *
 * @author ignacio
 */
public class Cola<T> {
    private NodoSimple raiz;
    private NodoSimple fondo;

    public boolean vacia(){
        if(raiz == null)
            return true;
        else
            return false;
    }
    
    public void push(T dato){
        NodoSimple nuevo = new NodoSimple(dato);
        if(vacia()){
            raiz = nuevo;
            fondo = nuevo;
        }else{
            fondo.setLiga(nuevo);
            fondo = nuevo;
        }
    }
    
    public T pop(){
        T x = (T) raiz.getDato();
         NodoSimple dato = new NodoSimple(raiz.getDato());
            if(raiz == fondo){
                raiz = null;
                fondo = null;
            }else{
                raiz = raiz.getLiga();
            }
         return x;

    }
    
    public NodoSimple peek(){
           return raiz;
    }
    
    public String imprimir(){
        String aux = "";
        while(!vacia()){
            aux = aux + pop();
        }
        return aux;
    }
}
