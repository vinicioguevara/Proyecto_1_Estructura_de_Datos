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
    private int tamano;

    public ColaOrdenes() {
        inicio = null;
        termino = null;
        this.tamano = 0;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public Ordenes peek(int pos) {
        int tempNum = 0;
        NodoOrdenes temp = inicio;
        while (tempNum != pos) {
            temp = temp.getSiguiente();
            tempNum++;
        }
        return temp.getOrden();
    }

    public void insertar(Ordenes ordenes) {
        NodoOrdenes i = new NodoOrdenes(ordenes);
        i.setSiguiente(null);
        if (inicio == null & termino == null) {
            inicio = i;
            termino = i;
        }
        termino.setSiguiente(i);
        termino = termino.getSiguiente();
        tamano++;
    }

    public Ordenes extraer() {
        Ordenes datos = inicio.getOrden();
        inicio = inicio.getSiguiente();
        tamano--;
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
            cola = cola.getSiguiente();
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
            cola = cola.getSiguiente();
        }
        return stri;
    }

}
