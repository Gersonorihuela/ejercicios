package libro;

import Entidades.parametros.ClaseLibro;
import Servicios.ClaseServicio;

public class Libro {

    public static void main(String[] args) {
        ClaseServicio CS = new ClaseServicio ();
        ClaseLibro CL = CS.CrearLibro();
        
        System.out.println("" + CL.toString());
        CL = null;
      
    }
    
    
}
