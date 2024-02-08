/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package área.y.volumen.de.una.circunferencia;

/**
 *
 * @author brand
 */
import java.util.Scanner;

public class ÁreaYVolumenDeUnaCircunferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * radio * radio;
        double volumen = (4.0 / 3.0) * Math.PI * radio * radio * radio;

        System.out.println("Área: " + area);
        System.out.println("Volumen: " + volumen);

        scanner.close();
    }
}
