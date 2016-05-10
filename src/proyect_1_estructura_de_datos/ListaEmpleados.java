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
public class ListaEmpleados {

    NodoEmpleado head;
    protected int tamano;

    public ListaEmpleados() {
        this.tamano = 0;
        this.head = null;
    }

    public NodoEmpleado getHead() {
        return head;
    }

    public void setHead(NodoEmpleado head) {
        this.head = head;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void insert(Empleado empleado) {
        NodoEmpleado newNodo = new NodoEmpleado(empleado);
        NodoEmpleado temp = head;

        if (tamano == 0) {
            this.setHead(newNodo);
            tamano++;
        } else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNodo);
            tamano++;
        }
    }

    public void borrar(int pos) {
        NodoEmpleado temp = head;
        NodoEmpleado temp2 = temp.getNext();//siguiente
        if (pos == 0) {
            this.setHead(temp2);
        } else {
            for (int i = 1; i < pos ; i++) {
                temp = temp.getNext();
            }
            NodoEmpleado temp3 = temp.getNext();
            temp.setNext(temp3.getNext());
        }
    }

    public void Print_Lista() {
        NodoEmpleado temp = head;
        while (temp != null) {
            System.out.println(temp.getEmpleado().toString());
            temp = temp.next;
        }
    }
}
