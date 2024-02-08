/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayor.de.tres.números;

/**
 *
 * @author brand
 */
import java.util.Scanner;

public class MayorDeTresNúmeros{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        int mayor = Math.max(num1, Math.max(num2, num3));

        System.out.println("El mayor número es: " + mayor);

        scanner.close();
    }
}
