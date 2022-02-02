
package ejerpoo4;

import rectangulo.Rectangulo;


public class Ejerpoo4 {

     
    public static void main(String[] args) {
       Rectangulo nuevoRectangulo= new Rectangulo();
       
        nuevoRectangulo.crearRectangulo();
        nuevoRectangulo.dibujarRectangulo();
       
        
        
        System.out.println("La superficie del rectangulo es: "+ nuevoRectangulo.calcularSuperficie());
        System.out.printf("El aere del rectangulo es: %.2f\n ", nuevoRectangulo.calcularPerimetro());
    }
    
}
