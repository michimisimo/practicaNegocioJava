
import java.util.Date;

/**
 *
 * @author michimisimo
 */
public class Validar {
    
    public boolean fecha(Date fechaSol){
        Date fechaAct = new Date();
        return fechaSol.compareTo(fechaAct)<=0;
    }
    
    public boolean email(String email){
        return email.length()>5;
    }
    
    public boolean precio(int valor){
        return valor>0;
    }
    
    public boolean telefono (int telefono){
        return telefono>9999999 && telefono<100000000;
    }
    
    public boolean subcat(String categoria){
        return categoria.equalsIgnoreCase("fruta")||categoria.equalsIgnoreCase("verdura");
    }
    
    public boolean codigo(int cod){
        return cod>999 && cod<10000;
    }
}
