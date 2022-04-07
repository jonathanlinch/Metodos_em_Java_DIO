package Metodos_Java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaMenu = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 5) {
            System.out.println("1)Somar" +
                    "\n2)Subtrair" +
                    "\n3)Multiplicar" +
                    "\n4)Dividir");
            opcao = entradaMenu.nextInt();
            menu(opcao);
        }
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
                Calculadora.soma(valorA,valorB);
                break;
            case 2:
                Calculadora.subtrair(valorA,valorB);
                break;
            case 3:
                Calculadora.multiplicar(valorA,valorB);
                break;
            case 4:
                Calculadora.dividir(valorA,valorB);
                break;
        }
    }
}
