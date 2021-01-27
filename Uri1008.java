import java.util.Scanner;

public class Uri1008{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int numfunc, hrstrab; 
        float recebhora, salario;

        numfunc = teclado.nextInt ();
        hrstrab = teclado.nextInt ();
        recebhora = teclado.nextFloat ();
      
        salario = hrstrab * recebhora;

        System.out.println ("NUMBER = " + numfunc);
        System.out.printf ("SALARY = U$ %.2f\n" , salario);
    }  

}