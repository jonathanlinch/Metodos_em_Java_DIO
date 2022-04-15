package Metodos_Java;

public class Mensagens {
    public Mensagens(int hora) {
         switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                mensagemBoaTarde();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoaNoite();
                break;
        }
    }

    public static void mensagemBomDia(){
        System.out.println("Bom Dia, um ótimo dia para você!");
    }
    public static void mensagemBoaTarde(){
        System.out.println("Boa Tarde, ótima tarde para você!");
    }
    public static void mensagemBoaNoite(){
        System.out.println("Boa noite para você!");
    }
}