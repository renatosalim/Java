import java.util.Scanner;

public class Leitura{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        float lado1;
        double lado2;
        double area;

        System.out.println ("Digite o primeiro lado do quadrado");
        lado1 = teclado.nextFloat ();

        System.out.println ("Digite o segundo lado do quadrado");
        lado2 = teclado.nextDouble ();

        area = lado1 * lado2;

        System.out.println ("A area do quadradro eh = " + area + " m2");
    }  
}





