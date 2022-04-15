package Metodos_Java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaInicial = new Scanner(System.in);
        int inicial;
        System.out.println("1-Calculadora" +
                "\n2-Mensagens" +
                "\n3-Empréstimo");
        inicial = entradaInicial.nextInt();
        switch (inicial) {
            case 1:
                menuCalculadora();
                break;
            case 2:
                mostrarMensagem();
        }
    }

        public static void menuCalculadora(){
            Scanner entradaMenu = new Scanner(System.in);
            int opcao;
            while (true) {
                System.out.println("1)Somar" +
                        "\n2)Subtrair" +
                        "\n3)Multiplicar" +
                        "\n4)Dividir");
                opcao = entradaMenu.nextInt();
                if(opcao == 5){
                   return;
                }
                calcular(opcao);
            }
        }

        public static void calcular(int opcao){
            Scanner entrada = new Scanner(System.in);
            double valorA;
            double valorB;
            System.out.println("Digite o primeiro valor: ");
            valorA = entrada.nextDouble();
            System.out.println("Digite o segundo valor: ");
            valorB = entrada.nextDouble();
            switch (opcao) {
                case 1:
                    Calculadora.soma(valorA, valorB);
                    break;
                case 2:
                    Calculadora.subtrair(valorA, valorB);
                    break;
                case 3:
                    Calculadora.multiplicar(valorA, valorB);
                    break;
                case 4:
                    Calculadora.dividir(valorA, valorB);
                    break;
            }
        }
        public static void mostrarMensagem(){
        int hora;
        Scanner entrada = new Scanner(System.in);
            System.out.println("Olá. Que horas?");
        hora = entrada.nextInt();
            Mensagens mensagens;
            mensagens = new Mensagens(hora);
        }
}