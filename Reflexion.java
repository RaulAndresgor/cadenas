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
public class Reflexion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca una cadena: ");
        String cadena = scanner.nextLine();

        String reflexion = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            reflexion += cadena.charAt(i);
        }

        System.out.println("La reflexión de la cadena es: " + reflexion);
    }
}
