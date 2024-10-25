import java.sql.SQLOutput;
import java.util.Scanner;

public class EstruturaCondicionalSimples {
    public static void main(String[] args) {
        /*
        Receba o ano de nascimento do usuario e diga se ele é maior de idade
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int idade = 2024 - anoNascimento;

        //System.out.println("Sua idade é: "+idade);
        //if(idade >= 18){
        //    System.out.println("Voce é maior de idade");
        //}

        if(idade >= 60){
            System.out.println("Voce é idoso!");
        }
    }
}
