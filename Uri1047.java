import java.util.Scanner;

public class Uri1047{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int horaI, minI, horaF, minF, tempoI, tempoF, durTotal;
                        
        horaI = teclado.nextInt ();
        minI = teclado.nextInt ();
        horaF = teclado.nextInt ();
        minF = teclado.nextInt ();

        tempoI = horaI * 60 + minI;  
        tempoF = horaF * 60 + minF;

        durTotal = tempoF - tempoI       

        if (durTotal <= 0) {
            durTotal = durTotal - 1440;

            System.out.println ("O JOGO DUROU " + durTotal + " HORA(S)");  

        }

    }
}
