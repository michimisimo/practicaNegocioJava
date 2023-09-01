/**
 *
 * @author michimisimo
 */
public class Producto {
    private int precio,codigo,cantidad;
    private String subcategoria,descripcion;
    private char unidad;

    public Producto() {
    }

    public Producto(int precio, int codigo, int cantidad, String subcategoria, String descripcion, char unidad) {
        this.precio = precio;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.subcategoria = subcategoria;
        this.descripcion = descripcion;
        this.unidad = unidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public char getUnidad() {
        return unidad;
    }

    public void setUnidad(char unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "precio=" + precio + ", codigo=" + codigo + ", cantidad=" + cantidad + ", subcategoria=" + subcategoria + ", descripcion=" + descripcion + ", unidad=" + unidad + '}';
    }
    
}
