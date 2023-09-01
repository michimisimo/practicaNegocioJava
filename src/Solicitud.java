
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author michimisimo
 */
public class Solicitud {
    private int total,numero;
    private String producto="";
    private Date fecha;
    private Cliente cliente;

    public Solicitud() {
    }

    public Solicitud(int total, int numero, String producto, Date fecha, Cliente cliente) {
        this.total = total;
        this.numero = numero;
        this.producto = producto;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Solicitud{" + "total=" + total + ", numero=" + numero + ", producto=" + producto + ", fecha=" + fecha + ", cliente=" + cliente + '}';
    }
    
    public int descuento(int porcentaje){
        int descuento=this.total*(porcentaje/100);
        return descuento;
    }
  
    public int obtNum(){
        return this.numero++;
    }
    
    public void agregarProd(Producto producto){
        
        this.total=this.total+producto.getPrecio();
        String medida="";
        
        if (producto.getUnidad()=='U') {
            medida="unidad/es";
        }
        else{
            medida="gramos";
        }
            
        this.producto=this.producto+producto.getDescripcion()+" "+producto.getCantidad()+
                      " "+medida+" $"+producto.getPrecio()+";\n";
    }
    
    public void mostrarDet(){
        SimpleDateFormat formato = new SimpleDateFormat();
        
        System.out.println("------DETALLE------");
        System.out.println("fecha: "+formato.format(fecha));
        System.out.println("numero: "+this.numero);
        System.out.println("cliente:"+this.cliente.getNombre());
        System.out.println(this.producto);
        System.out.println("--------------------");
        System.out.println("total: "+this.total);
    }
}

