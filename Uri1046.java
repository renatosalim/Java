import java.util.Scanner;

public class Uri1046{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int inicio, termino, duracao;
                        
        inicio = teclado.nextInt ();
        termino = teclado.nextInt ();
                        
        if (inicio == termino) {
            System.out.println ("O JOGO DUROU 24 HORA(S)");
        }
        else if (inicio > termino) {
            duracao = (24 - inicio) + termino; 
            System.out.println ("O JOGO DUROU " + duracao + " HORA(S)");      
        }
        else if (inicio < termino) {
            duracao = termino - inicio; 
            System.out.println ("O JOGO DUROU " + duracao + " HORA(S)"); 
        }
        
    }
}