
package servicio;

import Clase.Circunferencia;
import java.util.Scanner;

public class Calculos {
    
      private Scanner sc = new Scanner (System.in);
      
      public Circunferencia Perimetro (){
          System.out.println("Ingrese valor del radio");
          double radio = sc.nextDouble();
          double perimetro = 2 * Math.PI *radio;
          double area = Math.PI * Math.sqrt(radio);
          Circunferencia c = new Circunferencia(radio);
         
          return new Circunferencia (radio, perimetro, area);
      }
      
      
}
