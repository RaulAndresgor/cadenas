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
public class Potencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca la cadena: ");
        String cadena = scanner.nextLine();
        System.out.print("Introduzca la potencia: ");
        int potencia = scanner.nextInt();

        String resultado = "";
        for (int i = 0; i < potencia; i++) {
            resultado += cadena;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
