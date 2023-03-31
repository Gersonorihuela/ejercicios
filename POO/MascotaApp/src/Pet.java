
import Servicios.ServicioMascota;
import java.util.Scanner;
import mascotaapp.entidades.Mascota;


public class Pet {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  
        
       ServicioMascota sm = new ServicioMascota();
        
       Mascota m1 = sm.CrearMAscota();
      
       System.out.println(m1);
       m1 = null;
    }
    
}
