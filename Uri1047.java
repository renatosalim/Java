import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int hI, mI, hF, mF;
        int tempoI, tempoF, durTotal;
        int hT, mT;

        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        // converter tudo para minutos
        tempoI = hI * 60 + mI;
        tempoF = hF * 60 + mF;

        durTotal = tempoF - tempoI;

        if (durTotal <= 0){
            durTotal = durTotal + 24*60; // somo 24h em minutos para mostrar que o dia "virou"
        }

        hT = durTotal / 60;
        mT = durTotal % 60;

        System.out.println("O JOGO DUROU "+ hT +" HORA(S) E "+ mT +" MINUTO(S)");
    }
}