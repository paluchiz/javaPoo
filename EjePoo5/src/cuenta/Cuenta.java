/*
 *Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package cuenta;

import java.util.Locale;
import java.util.Scanner;

public class Cuenta {

    private long nroDni;
    private int nroCuenta;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(long nroDni, int nroCuenta, double saldoActual) {
        this.nroDni = nroDni;
        this.nroCuenta = nroCuenta;
        this.saldoActual = saldoActual;
    }

    public long getNroDni() {
        return nroDni;
    }

    public void setNroDni(long nroDni) {
        this.nroDni = nroDni;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getsaldoActual() {
        return saldoActual;
    }

    public void setsaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese su numero de Cuenta");
        nroCuenta = leer.nextInt();
        System.out.println("Ingrese su dni");
        nroDni = leer.nextLong();

    }

    public void ingresarDinero() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingresar cantidad de dinero");
         saldoActual+=leer.nextDouble();
        
    }

    public void retirarDinero() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el dindero que desea retirar");
       double retirar = leer.nextDouble();

        if (retirar > saldoActual) {
            System.out.println("Su saldo no es insuficiente");
            saldoActual = 0;

        } else {
            saldoActual -= retirar;
        }

    }   

        
            
    

    public void extraccionRapida() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        double extraccion;
        System.out.println("Cantidad a retirar");
        extraccion = leer.nextDouble();
      
        if (extraccion >(saldoActual * 0.2)){
            System.out.println("su saldo es insufiente");
            saldoActual=0;
                }else {
            System.out.println("Se realizo la extraccion : "+ extraccion);
            saldoActual-=extraccion;
            
        
    }
        }
        

         

    public void consultarSaldo() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Consultar saldo: " + saldoActual);     
        saldoActual = leer.nextDouble();
    }

    public void consultarDatos() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Consultar datos");
        nroCuenta = leer.nextInt();
        nroDni = leer.nextLong();

    }

}
