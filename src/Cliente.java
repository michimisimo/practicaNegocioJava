/**
 *
 * @author michimisimo
 */
public class Cliente {
   private int rut,telefono;
   private String nombre,direccion,email;

    public Cliente() {
    }

    public Cliente(int rut, int telefono, String nombre, String direccion, String email) {
        this.rut = rut;
        this.telefono = telefono;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", telefono=" + telefono + ", nombre=" + nombre + ", direccion=" + direccion + ", email=" + email + '}';
    }
   
}
