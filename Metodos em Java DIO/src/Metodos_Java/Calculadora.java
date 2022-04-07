package Metodos_Java;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        i();
    }
    public static void i(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("1)Somar"+
                "\n2)Subtrair"+
                "\n3)Multiplicar"+
                "\n4)Dividir");
        int opcao = entrada.nextInt();
        menu(opcao);
    }

    public static void soma(double valorA,double valorB){
        double resultadoSoma;
        resultadoSoma = (valorA + valorB);
        System.out.println(resultadoSoma);
    }
    public static void subtrair(double valorA,double valorB){
        double resultadoSub;
        resultadoSub = (valorA - valorB);
        System.out.println(resultadoSub);
    }
    public static void multiplicar(double valorA,double valorB){
        double resultadoMult;
        resultadoMult = (valorA*valorB);
        System.out.println(resultadoMult);
    }
    public static void dividir(double valorA,double valorB){
        double resultadoDiv;
        resultadoDiv = (valorA/valorB);
        System.out.println(resultadoDiv);
    }

    public static void menu(int opcao){
        Scanner entrada = new Scanner(System.in);
        double valorA;
        double valorB;
        System.out.println("Digite o primeiro valor: ");
        valorA = entrada.nextDouble();
        System.out.println("Digite o segundo valor: ");
        valorB = entrada.nextDouble();
            switch (opcao){
                case 1:
                    soma(valorA,valorB);
                    break;
                case 2:
                    subtrair(valorA,valorB);
                    break;
                case 3:
                    multiplicar(valorA,valorB);
                    break;
                case 4:
                    dividir(valorA,valorB);
                    break;
            }
            i();
        }
    }

