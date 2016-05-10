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
    Ordenes orden = null;
    NodoOrdenes next;
    
    

    public NodoOrdenes(Ordenes orden){
        this.orden=orden;
    }
    
    public NodoOrdenes(){
        
    }
    public Ordenes getValue() {
        return orden;
    }

    public void setValue(Ordenes orden) {
        this.orden = orden;
    }

    public NodoOrdenes getNext() {
        return next;
    }

    public void setNext(NodoOrdenes next) {
        this.next = next;
    }

}
