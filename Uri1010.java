import java.util.Scanner;

public class Uri1010{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int peca1, qtdpeca1, peca2, qtdpeca2; 
        Double valpeca1, valpeca2, valpagar;

        peca1 = teclado.nextInt ();
        qtdpeca1 = teclado.nextInt ();
        valpeca1 = teclado.nextDouble ();
        peca2 = teclado.nextInt ();
        qtdpeca2 = teclado.nextInt ();
        valpeca2 = teclado.nextDouble ();
        
        valpagar = ((qtdpeca1*valpeca1)+(qtdpeca2*valpeca2));

        System.out.printf ("VALOR A PAGAR: R$ %.2f\n" , valpagar);
    }  

}