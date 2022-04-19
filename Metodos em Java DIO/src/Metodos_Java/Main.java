package Metodos_Java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaInicial = new Scanner(System.in);
        int inicial;
        System.out.println("1-Calculadora" +
                "\n2-Mensagens" +
                "\n3-Empréstimo" +
                "\n4-Cálculo de área");
        inicial = entradaInicial.nextInt();
        switch (inicial) {
            case 1:
                menuCalculadora();
                break;
            case 2:
                mostrarMensagem();
                break;
            case 3:
                mostrarEmpréstimo();
            case 4:
                calcularArea();
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

        public static void mostrarEmpréstimo(){
        double valor;
        int parcelas;
        Scanner entradaValor = new Scanner(System.in);
        Scanner entradaParcelas = new Scanner(System.in);
        System.out.println("Qual o valor que precisa?");
        valor = entradaValor.nextDouble();
        System.out.println("Em quantas vezes?");
        parcelas = entradaParcelas.nextInt();
        Emprestimo emprestimo;
        emprestimo = new Emprestimo(valor, parcelas);
        }

        public static void calcularArea(){
            System.out.println("Digite o valor do(s) lado(s):");
            Scanner entradaLados = new Scanner(System.in);
            double lado = entradaLados.nextDouble();
            Area.area(lado);
            System.out.println("Quadrado: ");
            lado = entradaLados.nextDouble();
            double lado1 = entradaLados.nextDouble();
            Area.area(lado, lado1);
            System.out.println("Trapézio: ");
            System.out.println("Base maior: ");
            lado = entradaLados.nextDouble();
            System.out.println("Base menor: ");
            lado1 = entradaLados.nextDouble();
            System.out.println("Altura: ");
            double lado2 = entradaLados.nextDouble();
            Area.area(lado, lado1, lado2);
        }
}