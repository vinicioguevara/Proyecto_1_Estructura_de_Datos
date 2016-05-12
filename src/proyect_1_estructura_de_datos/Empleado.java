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
public class Empleado {
    public String nombre;
    public int id;
    public int edad;
    public String direccion;
    public double salario;
    boolean trabaja;

    public Empleado() {
    }

    public Empleado(String nombre, int id, int edad, String direccion, double salario, boolean trabaja) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.direccion = direccion;
        this.salario = salario;
        this.trabaja = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isTrabaja() {
        return trabaja;
    }

    public void setTrabaja(boolean trabaja) {
        this.trabaja = trabaja;
    }

//    @Override
//    public String toString() {
//        return id+" "+ nombre;
//    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", direccion=" + direccion + ", salario=" + salario + ", trabaja=" + trabaja + '}';
    }
    
    
    
    
    
}
