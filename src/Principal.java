
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author michimisimo
 */
public class Principal {
    
    public static void main(String[] args) {
        
         boolean flag;
         int opc;
    
    Solicitud solicitud = new Solicitud();
    Scanner input = new Scanner(System.in);
    Validar validar = new Validar();
    
    //atributos
        //cliente
    String nombre, direccion, email;
    int telefono, rut;
        //producto
    int codigo,precio,cantidad;
    String subcategoria,descripcion;
    char medida;
        //solicitud
    int descuento;
    String fechaSol;
    
        do {

            System.out.println("\n------MENU------");
            System.out.println("1) INGRESAR CLIENTE");
            System.out.println("2) INGRESAR SOLICITUD Y SUS PRODUCTOS");
            System.out.println("3) APLICAR DESCUENTO");
            System.out.println("4) SALIR Y MOSTRAR SOLICITUD");
            opc=input.nextInt();

            switch (opc) {

                case 1:

                    Cliente cliente = new Cliente();

                    System.out.println("\n ingrese nombre:");
                    nombre=input.next();

                    System.out.println("\n ingrese rut sin dv:");
                    rut=input.nextInt();

                    System.out.println("ingrese direccion:");
                    direccion=input.next();

                    do {
                        System.out.println("ingrese telefono: ");
                        telefono=input.nextInt();
                        flag=validar.telefono(telefono);

                    } while (flag==false);

                    do {
                        System.out.println("ingrese email:");
                        email=input.next();
                        flag=validar.email(email);

                    } while (flag==false);

                    cliente.setDireccion(direccion);
                    cliente.setEmail(email);
                    cliente.setNombre(nombre);
                    cliente.setRut(rut);
                    cliente.setTelefono(telefono);
                    solicitud.setCliente(cliente);
                    
                    System.out.println("------ciente ingresado------");
                    System.out.println(cliente);

                    break;

                case 2:

                    solicitud.setNumero(solicitud.obtNum());

                    do {
                        System.out.println("\ningrese fecha (dd-mm-yyyy):");
                        fechaSol=input.next();

                        Date fecha = new Date();
                        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

                        try {
                            fecha=formato.parse(fechaSol);
                        }
                        
                        catch (ParseException e) {
                            System.out.println("\nerror de conversion a fecha");
                        }                    
                        
                        flag = validar.fecha(fecha);
                        
                        if (flag==true) {
                        solicitud.setFecha(fecha);
                        }

                    } while (flag==false);



                    System.out.println("\n¿cuantos productos va a ingresar?");
                    int cantidadProd=input.nextInt();

                    for (int i = 1; i <= cantidadProd; i++) {

                        Producto producto = new Producto();

                        do {
                            System.out.println("\ningrese codigo:");
                            codigo=input.nextInt();
                            flag=validar.codigo(codigo);

                        } while (flag==false);

                        do {
                            System.out.println("\ningrese categoria (fruta/verdura):");
                            subcategoria=input.next();
                            flag=validar.subcat(subcategoria);

                        } while (flag==false);

                        System.out.println("\ningrese descripcion:");
                        descripcion=input.next();

                        System.out.println("\ningrese cantidad:");
                        cantidad=input.nextInt();

                        System.out.println("\ningrese unidad (G/U)");
                        medida=input.next().charAt(0);

                        do {
                            System.out.println("\ningrese precio:");
                            precio=input.nextInt();
                            flag=validar.precio(precio);

                        } while (flag==false);

                        producto.setCantidad(cantidad);
                        producto.setCodigo(codigo);
                        producto.setDescripcion(descripcion);
                        producto.setUnidad(medida);
                        producto.setPrecio(precio);
                        producto.setSubcategoria(subcategoria);

                        solicitud.agregarProd(producto);
                        System.out.println(solicitud.getProducto());
                    }

                    System.out.println("\n-----PRODUCTOS AGREGADOS-----");

                    break;

                case 3:

                    System.out.println("ingrese el procentaje (1-100):");
                    descuento=input.nextInt();
                    solicitud.descuento(descuento);
                    System.out.println("descuento: $"+descuento);
                    System.out.println("total: $"+solicitud.getTotal());
                    System.out.println("a pagar: $"+(solicitud.getTotal()-descuento));

                    break;

                case 4:

                    System.out.println("\n---solicitud terminada---");
                    solicitud.mostrarDet();
                    break;

                default:

                    System.out.println("\nOpcion no valida.");
            }

        } while (opc!=4);
        
    }
    
}
