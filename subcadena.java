/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadenas;

import java.util.Scanner;

/**
 *
 * @author raulg
 */
public class subcadena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca una cadena: ");
        String cadena = scanner.nextLine();

        System.out.print("Introduzca la posición inicial de la subcadena: ");
        int inicio = scanner.nextInt();
        System.out.print("Introduzca la posición final de la subcadena: ");
        int fin = scanner.nextInt();

        String subcadena = cadena.substring(inicio, fin);
        String prefijo = cadena.substring(0, fin);
        String sufijo = cadena.substring(inicio);

        System.out.println("La subcadena es: " + subcadena);
        System.out.println("El prefijo es: " + prefijo);
        System.out.println("El sufijo es: " + sufijo);
    }
}
