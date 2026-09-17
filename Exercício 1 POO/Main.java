import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        int numero;
        Scanner valor = new Scanner(System.in);

        do {
        System.out.print("Digite um número inteiro positivo ou digite 0 para encerrar o programa: ");
        numero = valor.nextInt();
        ConsoleUtils.clearConsole();

        if(numero > 0){

            int i=0;
            System.out.println("A tabuada de " + numero + " é:");

            for(i = 1 ; i <=10 ; i++){

                int tabuada = i * numero;  

                if(tabuada % 2 == 0){
                    System.out.println(tabuada + " -> " + "Par");  
                }
                else{
                    System.out.println(tabuada + " -> " + "Ímpar");  
                }        
            }
        }
        else if(numero < 0){

            System.out.println("Número inválido. Por favor, digite um número maior que zero.");
        }
        else {

            System.out.print("O programa será encerrado.");
        }

        }while(numero != 0);
        valor.close();
    }

}
