package modelo;

/**
 *
 * @author Unalman
 */
public class Categorias {

    private int id;
    private String descripcion;

    public Categorias(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Categorias() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
