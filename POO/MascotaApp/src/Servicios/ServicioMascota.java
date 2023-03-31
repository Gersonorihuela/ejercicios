
package Servicios;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;



public class ServicioMascota {
    private  Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Mascota CrearMAscota(){
         System.out.println("Introducir nombre");
         String nombre = sc.next();
         System.out.println("Introducir apodo");
         String apodo = sc.next();
         System.out.println("Introducir tipo");
         String tipo = sc.next();
      return new Mascota(nombre, apodo, tipo);
        
       
    }
}
