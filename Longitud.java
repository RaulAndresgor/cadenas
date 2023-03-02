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
public class Longitud {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca una cadena: ");
        String cadena = scanner.nextLine();

        int longitud = cadena.length();

        System.out.println("La longitud de la cadena es: " + longitud);
    }
}
