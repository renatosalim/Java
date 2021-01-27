import java.util.Scanner;

public class Uri1048{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        double salario, reajuste, percentual, novoSalario;
                        
        salario = teclado.nextDouble ();
                        
        if (salario <= 400.00) {
            novoSalario = salario * 1.15f;
            reajuste = novoSalario - salario;
            System.out.printf ("Novo salario: %.2f\n", novoSalario);
            System.out.printf ("Reajuste ganho: %.2f\n", reajuste);
            System.out.println ("Em percentual: 15 %");
        }
        else if (salario >= 400.01 && salario <= 800.00) {
            novoSalario = salario * 1.12f;
            reajuste = novoSalario - salario;
            System.out.printf ("Novo salario: %.2f\n", novoSalario);
            System.out.printf ("Reajuste ganho: %.2f\n", reajuste);
            System.out.println ("Em percentual: 12 %");
        }
        else if (salario >= 800.01 && salario <= 1200.00){ 
            novoSalario = salario * 1.10f;
            reajuste = novoSalario - salario;
            System.out.printf ("Novo salario: %.2f\n", novoSalario);
            System.out.printf ("Reajuste ganho: %.2f\n", reajuste);
            System.out.println ("Em percentual: 10 %");
        }
        else if (salario >= 1200.01 && salario <= 2000.00){ 
            novoSalario = salario * 1.07f;
            reajuste = novoSalario - salario;
            System.out.printf ("Novo salario: %.2f\n", novoSalario);
            System.out.printf ("Reajuste ganho: %.2f\n", reajuste);
            System.out.println ("Em percentual: 7 %");
        }
        else if (salario > 2000.00) {
            novoSalario = salario * 1.04f;
            reajuste = novoSalario - salario;
            System.out.printf ("Novo salario: %.2f\n", novoSalario);
            System.out.printf ("Reajuste ganho: %.2f\n", reajuste);
            System.out.println ("Em percentual: 4 %");
        }
                
    }
}