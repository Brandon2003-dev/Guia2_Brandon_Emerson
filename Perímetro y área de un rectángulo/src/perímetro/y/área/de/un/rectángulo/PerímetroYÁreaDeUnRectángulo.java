/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perímetro.y.área.de.un.rectángulo;

/**
 *
 * @author brand
 */
import java.util.Scanner;

public class PerímetroYÁreaDeUnRectángulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado: ");
        double lado = scanner.nextDouble();

        System.out.print("Ingrese la longitud del ancho: ");
        double ancho = scanner.nextDouble();

        double perimetro = 2 * lado + 2 * ancho;
        double area = lado * ancho;

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);

        scanner.close();
    }
}
