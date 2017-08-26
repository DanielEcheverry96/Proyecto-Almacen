package modelo;

/**
 *
 * @author Unalman
 */
public class Categorias implements Comparable<Categorias> {

    protected int id;
    protected String descripcion;

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

    @Override
    public String toString() {
        return "Categorias{" + "id=" + id + ", descripcion=" + descripcion + '}';
    }

    @Override
    public int compareTo(Categorias t) {
        return this.id - t.getId();
    }

}
