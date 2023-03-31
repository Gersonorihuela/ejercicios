
package Servicios;

import Entidades.parametros.ClaseLibro;
import java.util.Scanner;

public class ClaseServicio {
    private final Scanner sc = new Scanner (System.in).useDelimiter("\n");
    ClaseLibro cl = new ClaseLibro();
   
    public ClaseLibro CrearLibro(){
        System.out.print("Ingrese ISBN del Libro :");
        String ISBN = sc.next();
        System.out.print("Ingrese Titulo del Libro :");
        String titulo = sc.next();
        System.out.print("Ingrese Autor del Libro :");
        String autor = sc.next();
        System.out.print("Ingrese Num de paginas del Libro :");
        String nPaginas = sc.next();
        return new ClaseLibro(ISBN,titulo,autor,nPaginas);
        
    }
  }
