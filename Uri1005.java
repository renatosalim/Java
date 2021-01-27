import java.util.Scanner;

public class Uri1005{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        double a, b, media;


        //System.out.println ("Este programa calcula a produto de dois valores");
        //System.out.println ("Digite o primeiro valor");
        a = teclado.nextDouble ();

        //System.out.println ("Digite o segundo valor");
        b = teclado.nextDouble ();

        media = ((a*3.5) + (b*7.5))/11;

        System.out.printf ("MEDIA = %.5f\n" , media);
    }  

}