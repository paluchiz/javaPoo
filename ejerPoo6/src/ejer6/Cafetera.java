/*
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ejer6;

import java.util.Locale;
import java.util.Scanner;

public class Cafetera {
private int cantidadMax;
private int cantidadActual;

    public Cafetera() {
        
    }
    
    public void Cafetera(int cantidadMax, int cantidadActual){
        this.cantidadMax=cantidadMax;
        this.cantidadActual=cantidadActual;
        
    }
    
    public int getCantidadMax(){
        return cantidadMax;
    }
    public void setCantidadMax(int cantidadMax){
        this.cantidadMax=cantidadMax;
    }
    public int getCantidadActual(){
        return cantidadActual;
           }
    
    public void setCantidadActual(int cantidadActual){
        this.cantidadActual=cantidadActual;
    }
    public void llenarCafetera(){
        cantidadMax=cantidadActual;
     
        System.out.println("Cafetera llena");}

           
    public void servirTaza(int tamanoTaza) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el tamaño de la taza");
        tamanoTaza = leer.nextInt();

        if (this.cantidadActual == 0) {

            System.out.println("No hay cafe!");
        } else if (this.cantidadActual > tamanoTaza)
        {
            tamanoTaza = this.cantidadActual;
            this.cantidadActual = 0;
            System.out.printf("La taza no se lleno por completo, solo se lleno con %d de cafe \n", tamanoTaza);
        }else{
       System.out.println("La taza se lleno completamente");
            this.cantidadActual-=tamanoTaza;
                               
                
                }
    }
    
    
  


    public void vaciarCafetera() {
        this.cantidadActual = 0;
        System.out.println("Cafetera vacia!");
    }

    
      public void agregarCafe(int cafe){
          if ((cafe+cantidadActual)>cantidadMax){
              cantidadActual=cantidadMax;
              System.out.println("Supera la capacidad maxima " + ((cafe+cantidadActual) - cantidadMax)+ "de cafe ");
          }else {
              System.out.println("Cafe agregado ");
              cantidadActual+=cafe;
          }
          
      }
    
}



