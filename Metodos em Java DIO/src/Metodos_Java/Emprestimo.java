package Metodos_Java;

public class Emprestimo {
    public Emprestimo(double valor, int parcelas){
        //double valorFinal = valor + (valor * 0.015);
        if (parcelas >= 3){
            double juros = 0.022;
                parcela(valor, parcelas, juros);
        }else{
            double juros = 0.015;
            parcela(valor, parcelas, juros);
        }
    }
    public static void parcela(double valor, int nParcelas, double juros){
        double valorParcela = valor / nParcelas;
        double valorParcelado = valorParcela + (valorParcela * juros);
        System.out.println("O valor de cada parcela: " + valorParcelado);
        double valorTotal = valor + (valor * juros);
        System.out.println("Valor total com juros: " + valorTotal);
    }
}
