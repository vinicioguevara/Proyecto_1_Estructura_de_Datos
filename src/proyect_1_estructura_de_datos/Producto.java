package proyect_1_estructura_de_datos;

/**
 *
 * @author Vinicio
 */
public class Producto {

    private String Nombre = "";
    private String Descripcion = "";
    private int tiempoEnsamblado = 0;
    private LinkedList Materiales = new LinkedList();

    public Producto(String Nombre, String Descripcion, int tiempoEnsamblado) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.tiempoEnsamblado = tiempoEnsamblado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getTiempoEnsamblado() {
        return tiempoEnsamblado;
    }

    public void setTiempoEnsamblado(int tiempoEnsamblado) {
        this.tiempoEnsamblado = tiempoEnsamblado;
    }

    public Object getMaterial(int p) {
        return Materiales.get(p);
    }

    public void setMaterial(Material Material) {
        Materiales.add(Material);
    }

    public LinkedList getMateriales() {
        return Materiales;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + ", Descripcion: " + Descripcion + ", Tiempo de Ensamblado: " + tiempoEnsamblado;
    }
    
}
