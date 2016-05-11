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
<<<<<<< HEAD
    public LinkedList productos; // depende como le pongas a la clase de la lista de productos
=======
    public LinkedList productos;
>>>>>>> 3346e741f5be3d397ec6e0ce998f14d2d006d8eb

    public Ordenes() {
    }

    public Ordenes(int num, LinkedList productos) {
        this.num = num;
        this.productos = productos;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

<<<<<<< HEAD
    public LinkedList getProductos() {
        return productos;
    }

    public void setProductos(LinkedList productos) {
        this.productos = productos;
=======
    public Object getProducto(int Index) {
        return productos.get(Index).getData();
    }

    public void addProducto(Object Data) {
        this.productos.add(Data);
>>>>>>> 3346e741f5be3d397ec6e0ce998f14d2d006d8eb
    }

    @Override
    public String toString() {
        return "Número de Orden " + num + "\n";
    }
}
