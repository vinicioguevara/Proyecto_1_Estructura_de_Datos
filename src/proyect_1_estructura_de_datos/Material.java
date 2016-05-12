package proyect_1_estructura_de_datos;

/**
 *
 * @author Vinicio
 */
public class Material {

    String Nombre = "";
    String Descripcion = "";
    String Marca = "";
    String Serie = "";

    public Material(String Nombre, String Descripcion, String Marca) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Marca = Marca;
        
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

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getSerie() {
        return Serie;
    }

    @Override
    public String toString() {
        return "Codigo: " + Serie + ", Nombre: " + Nombre + ", Descripción: " + Descripcion + ", Marca: " + Marca + "";
    }

    public String generarSerie(String Serie) {
        return "";
    }
}
