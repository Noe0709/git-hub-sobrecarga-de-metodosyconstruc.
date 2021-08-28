package Sobrecarga;

/*Noé Jonatán Gómez Hernández 
CARNE: 7690-20-16812
INGENIERIA EN SISTEMAS
SECCION: " A" */

import java.util.Scanner;

public class TestSobreCarga {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Por favor Ingrese un numero");
        double x = in.nextDouble();

        System.out.println("Ingrese un segundo numero por favor");
        double y = in.nextDouble();
        
        Sobrecargamyc sm = new Sobrecargamyc (x, y);

        System.out.println("Ingrese el numero de la operación que quiere realizar");
        System.out.println("1: Sumar los dos númeos ");
        System.out.println("2: Sacar la raiz del primero numero por el segundo");
        int op = in.nextInt();

        switch (op) {
            case 1:                
                System.out.println(x + " + " + y + " = " + sm.operar());
                break;

            case 2:                
                System.out.println("Raiz " + x + " de " + y + " = " + sm.operar(x, y));
                break;
        }
    }
}
