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
public class Ordenes {

    public int num;
    public LinkedList Productos; // depende como le pongas a la clase de la lista de Productos

    public Ordenes() {
    }

    public Ordenes(int num, LinkedList productos) {
        this.num = num;
        this.Productos = productos;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }



    public LinkedList getProductos() {
        return Productos;
    }

    public void setProductos(LinkedList productos) {
        this.Productos = productos;
    }

    public Object getProducto(int Index) {
        return Productos.get(Index).getData();
    }

    public void addProducto(Object Data) {
        this.Productos.add(Data);
         
    }

    @Override
    public String toString() {
        return "Número de Orden " + num + "\n";
    }
}
