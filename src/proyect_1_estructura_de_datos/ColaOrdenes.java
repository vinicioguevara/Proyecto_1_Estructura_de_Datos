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
public class ColaOrdenes {
    private NodoOrdenes inicio;
    private NodoOrdenes termino;

    public ColaOrdenes() {
        inicio = null;
        termino = null;
    }
    public void insertar(Ordenes ordenes) {
        NodoOrdenes i = new NodoOrdenes(ordenes);
        i.setNext(null);
        if (inicio == null & termino == null) {
            inicio = i;
            termino = i;
        }
        termino.setNext(i);
        termino = termino.getNext();
    }

    public Ordenes extraer() {
        Ordenes datos = inicio.getValue();
        inicio = inicio.getNext();
        return datos;
    }

    public boolean estaVacia() {
        boolean cola = false;
        if (inicio == null & termino == null) {
            cola = true;
            System.out.println("Las ordenes estan vacia");
        } else {
            System.out.println("Las ordenes no estan vacia");
            cola = false;
        }
        return cola;
    }

    public int contar() {
        int contador = 0;
        NodoOrdenes cola = this.inicio;
        while (cola != null) {
            contador++;
            cola = cola.getNext();
        }
        System.out.println("Numero de datos en la cola: " + contador);
        return contador;
    }

    @Override
    public String toString() {
        NodoOrdenes cola = this.inicio;
        String stri = "";
        while (cola != null) {
            stri = stri + cola.toString();
            cola = cola.getNext();
        }
        return stri;
    }


}
