import java.util.Scanner;

public class EstruturaDeRepeticaoWhile {
    public static void main(String[] args) {
        /* Escreva um programa que conte de 0 ate 100

         */
        //int contador = 0;
        //while (contador<=100){
       //   System.out.println(contador);
        //  contador = contador + 1;

     //   }

        // Receba numeros inteiros positivos diferentes de 0

        Scanner sc = new Scanner(System.in);
        int numero = 1;

        while (numero!=0){

            System.out.println("Insira um numero: ");
            numero = sc.nextInt();
            System.out.println("Sucesso");

        }



    }
}
