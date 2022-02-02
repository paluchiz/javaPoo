/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerpoo3;



public class EjerPoo3 {

    public static void main(String[] args) {
        Operaciones operacion = new Operaciones();

        operacion.crearOperacion();

        System.out.println("La suma entre es : " + operacion.sumar());
        System.out.println("La resta entre " + operacion.restar());
        System.out.printf("La multiplicacion  entre %2.f*%2.f es igual a %.2f " , operacion.getNroUno() , operacion.getNroDos() , operacion.multiplicar());
        System.out.printf("La division entre %.2f%2.f es igual a %.2f ", operacion.getNroUno(),operacion.getNroDos(), operacion.dividir());

    }

}