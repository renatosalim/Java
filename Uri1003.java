import java.util.Scanner;

public class Uri1003{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int a, b, soma;


        //System.out.println ("Este programa calcula a soma de dois valores");
        System.out.println ("Digite o primeiro valor");
        a = teclado.nextInt ();

        System.out.println ("Digite o segundo valor");
        b = teclado.nextInt ();

        soma = a + b;

        System.out.println ("SOMA = " + soma);
    }  
}