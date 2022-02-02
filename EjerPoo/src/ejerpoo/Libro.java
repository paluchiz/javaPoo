/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package ejerpoo;

public class Libro {
private int isbn;
private String titulo;
private String autor;
private int nropag;

    
    public Libro() {
        
    }
    
    public Libro(int isbn, String titulo, String autor, int nropag){
        this.isbn=isbn;
        this.autor=autor;
        this.titulo=titulo;
        this.nropag=nropag;
    }
    public int getIsbn(){
        return isbn;
    }
    public void setIsbn(int isbn){
        this.isbn=isbn;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public int getNroPag(){
        return nropag;
    }
    public void setNroPag(int nropag){
        this.nropag=nropag;
    }
    public void llenarLibro(int ISBN,String titulo,String autor,int nropag){
        this.isbn=isbn;
        this.autor=autor;
        this.titulo=titulo;
        this.nropag=nropag;
    }
    public void mostrarLibro(){
        System.out.println("El codigo ISBN es "+isbn);
        System.out.println("El titulos del libre es: "+titulo);
        System.out.println("El autor del libro es: "+autor);
        System.out.println("La cantidad de paginas que tiene el libro es: "+nropag);       
        
    }

    void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
