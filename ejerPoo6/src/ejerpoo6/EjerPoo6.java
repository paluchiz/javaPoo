/*
 Programa Nespresso. Desarrolle una clase Cafetera con los atributos
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
recibe y se añade a la cafetera la cantidad de café indicada. */
package ejerpoo6;

import ejer6.Cafetera;
import java.util.Locale;
import java.util.Scanner;

public class EjerPoo6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        Cafetera cafetera = new Cafetera();
        int opcion = 0;
        int tamaño;
        int cafe;
        int opcion1=0;

        while (opcion != 6) {
            System.out.println("******* MENU*****");
            System.out.println("Opcion 1 lenar cafetera");
            System.out.println("Opcion 2 servir taza");
            System.out.println("Opcion 3 vaciar cafetera");
            System.out.println("Opcion 4 agregar cafe");
            System.out.println("Opcion 5 consultar cantidad de cafe en cafetera");
            System.out.println("Opcion 6 salir");
            System.out.println("Ingrese una opcion valida");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cafetera.llenarCafetera();
                    break;
                case 2:
                    do{
                    System.out.println("Ingrese el tamaño de la taza");
                    System.out.println("1 taza pequeña---> 150cc");
                    System.out.println("2 taza mediana----> 250 cc");
                    System.out.println("3 taza grande----> 500 cc");
                    tamaño = leer.nextInt();
                    cafetera.servirTaza(tamaño);
                switch (opcion1)   {
                    case 1:
                        cafetera.servirTaza(150);
                        break;
                    case 2:
                        cafetera.servirTaza(250);
                        break;
                    case 3:
                        cafetera.servirTaza(500);
                            
                    break;
                    default:
                            System.out.println("Ingrese la opcion correcta");
                }
                    } while(!(opcion1==1||opcion1==2||opcion1==3));
                break;
                
                case 3:
                    cafetera.vaciarCafetera();
                    break;
                case 4:
                    System.out.println("Cuanto cafe desea agregar?");
                    cafe = leer.nextInt();
                    cafetera.agregarCafe(cafe);
                    break;
                case 5:
                    System.out.println("Cuanto cafe queda en al cafetera?");
                    cafetera.getCantidadActual();
                    break;

                case 6:
                    System.out.println("Saliendo del programa");

            }

        }

    
}
}