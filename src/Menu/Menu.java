package Menu;

import Arbol.Arbol;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ignacio
 */
public class Menu {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(6);
        arbol.insertar(7);
        arbol.insertar(1);
        arbol.inOrden();
        System.out.println("");
        arbol.niveles();
    }
}
