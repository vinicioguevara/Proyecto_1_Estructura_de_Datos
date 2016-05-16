/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect_1_estructura_de_datos;

/**
 *
 * @author jordi
 */
public class NodoOrdenes {
    Ordenes orden;
    NodoOrdenes next;
    
    

    public NodoOrdenes(Ordenes orden) {
        this.orden = orden;
        this.next = null;
    }

    public Ordenes getOrden() {
        return orden;
    }

    public void setOrden(Ordenes orden) {
        this.orden = orden;
    }

    public NodoOrdenes getSiguiente() {
        return next;
    }

    public void setSiguiente(NodoOrdenes siguiente) {
        this.next = siguiente;
    }

}
