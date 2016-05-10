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
public class NodoEmpleado {
    NodoEmpleado next;
    Empleado empleado;

    public NodoEmpleado(Empleado empleado) {        
        this.empleado = empleado;
        this.next = null;
    }

    public NodoEmpleado getNext() {
        return next;
    }

    public void setNext(NodoEmpleado next) {
        this.next = next;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    
}
