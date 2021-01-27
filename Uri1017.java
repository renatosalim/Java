import java.util.Scanner;

public class Uri1017{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int tempoGasto, velocidadeMedia; 
        Double litrosGastos;

        tempoGasto= teclado.nextInt ();
        velocidadeMedia = teclado.nextInt ();
                
        litrosGastos = ((velocidadeMedia/tempoGasto)/12);

        System.out.printf ("%.3f\n", litrosGastos);
    }  

}/