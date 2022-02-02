/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package ejerpoo;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class EjerPoo {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Libro libro1=new Libro();
        System.out.println("Ingrese el codigo ISBN");
        int ISBN=leer.nextInt();
        System.out.println("Ingrese el titulo  del libro");
        String titulo=leer.next();
         System.out.println("Ingrese el autor  del libro");
        String autor=leer.next();
       System.out.println("Ingrese el numero de paginas");
        int nropag=leer.nextInt();
        libro1.llenarLibro(ISBN,titulo,autor, nropag);
        libro1.mostrarLibro();
        
    }
    
}
