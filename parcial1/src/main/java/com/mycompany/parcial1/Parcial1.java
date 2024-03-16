/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial1;
import java.util.Scanner;

/**
 *
 * @author Miguel Daniel Reyes Martinez
 */
public class Parcial1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se piden tres números al usuario
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        // Ecuantra más grande el mediano y el mas pequeño
        int maximo = Math.max(Math.max(num1, num2), num3);
        /**
         * Se usa el método Math.max(a, b) para encontrar el valor máximo entre dos numeros
           primero se compara num1 y num2, y luego se compara el resultado con el num3
           al valor más grande se le asigna la variable max.
         */
        int minimo = Math.min(Math.min(num1, num2), num3);
        /**
         * Parecido al anterior, usamos el método Math.min(a, b) para encontrar el valor mínimo entre dos números
           se compara num1 y num2 y despues se compara con el num3
           al valor más pequeño se asigna a la variable min.
         */
        
        int medio = num1 + num2 + num3 - maximo - minimo;
        /**
         * En este caso calculamos el valor del número de en medio (med)
           se suman los tres numeros ingresados (num1, num2 y num3)
           se le restamos el valor máximo y el valor mínimo
           el resultado nos dara un numero que no es ni el más grande ni el más pequeño 
           ese sera el número de en medio.
         */

        // Determinar si son pares o impares
        String parImparMaximo = (maximo % 2 == 0) ? "par" : "impar";
        /**
         * Se utiliza el operador ternario (? :) para determinar si maximo es par o impar.
           (maximo % 2 == 0) verifica si maximo es divisible entre 2 sin dejar residuo asi define, si es par).
           si la expresión es verdadera es decir, maximo es par, se le agrega "par" a la variable parImparMaximo.
           si la expresión es falsa, maximo es impar), se le agrega la cadena "impar"

         */
        String parImparMinimo = (minimo % 2 == 0) ? "par" : "impar";
        /**
         *Igual que arriba se verifica si minimo es par o impar
          el resultado se asigna a la variable parImparMinimo.
         */
        String parImparMedio = (medio % 2 == 0) ? "par" : "impar";
        /**
         * De nuevo, se evalua si medio es par o impar.
           y el resultado se asigna a la variable parImparMedio.
         */

        // Se muestran los resultados
        System.out.println("El número " + maximo + " es el número más grande de los tres y es " + parImparMaximo);
        System.out.println("El número " + minimo + " es el número más pequeño de los tres y es " + parImparMinimo);
        System.out.println("El número " + medio + " es el número de en medio de los tres y es " + parImparMedio);

        scanner.close();
    }
}
