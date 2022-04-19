package Metodos_Java;

import java.security.PublicKey;

public class Area {
    public static void area(double lado){
        double equilatero = ((lado * lado) * Math.sqrt(3))/4;
        System.out.println("A área do trriângulo equilátero é " + equilatero);
    }
    public static void area(double lado1, double lado2){
        double quadrado = lado1 * lado2;
        System.out.println("A área do quadrado é " + quadrado);
    }
    public static void area(double bMenor, double bMaior, double Altura){
        double trapezio = ((bMaior + bMenor) * Altura)/2;
        System.out.println("A área do trapézio é " + trapezio);
    }
}
