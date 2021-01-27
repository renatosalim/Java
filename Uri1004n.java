import java.util.Scanner;

public class Uri1004n{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int a, b, prod;


        //System.out.println ("Este programa calcula a produto de dois valores");
        //System.out.println ("Digite o primeiro valor");
        a = teclado.nextInt ();

        //System.out.println ("Digite o segundo valor");
        b = teclado.nextInt ();

        prod = a * b;

        System.out.println ("PROD = " + prod);
    }  
}