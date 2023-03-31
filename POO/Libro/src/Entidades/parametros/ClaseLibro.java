  /*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/  
package Entidades.parametros;

public class ClaseLibro {
    
//parametros
    private String ISBN, titulo, autor, numPaginas;
    
// constructores
 public ClaseLibro() {}
 
  public ClaseLibro(String ISBN, String titulo, String autor, String numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
  
  // metodos

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }
   /*Mostramos*/

    @Override
    public String toString() {
        return "ClaseLibro{" + "ISBN=" + ISBN + ", titulo=" + titulo 
                + ", autor=" + autor + ", numPaginas=" + numPaginas + '}';
    }
   
    
   
    }

   

   
    
