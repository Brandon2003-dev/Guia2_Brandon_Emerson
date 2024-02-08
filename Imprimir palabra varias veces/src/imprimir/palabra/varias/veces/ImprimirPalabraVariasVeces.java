/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imprimir.palabra.varias.veces;

/**
 *
 * @author brand
 */
import java.util.Scanner;

public class ImprimirPalabraVariasVeces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.next();

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println(palabra);
        }

        scanner.close();
    }
}
