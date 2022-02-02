/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package ejerpoo2;

import java.util.Locale;
import java.util.Scanner;


public class EjerPoo2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Circunferencia calculo1=new Circunferencia();
        calculo1.crearCircunferencia();
        System.out.println(" ");
        calculo1.calculoArea();
        System.out.println(" ");
        calculo1.calculoPerimetro();
                
                
                
        
    }
    
}
