
package rectangulo;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {

    private double altura;
    private double base;
    
      
    public Rectangulo() {
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
        
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

   

    public void crearRectangulo() {
       Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
       System.out.print("ingrese la base: ");
       this.base=leer.nextDouble();
       
       System.out.print("ingrese la altura: ");
       this.altura=leer.nextDouble();
       System.out.println("***** rectangulo creado******");
    }
    
    public double calcularSuperficie(){
        return base*altura;
    }
    public double  calcularPerimetro(){
        return (base+altura)*2;
    }
   
       public void dibujarRectangulo(){
        for (int i=0;i<altura;i++){
            for (int j=0;j<base;j++){
                
                    System.out.print("* ");
                
                
                
            }
            System.out.println("");
        }
    }
}

