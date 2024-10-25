import java.sql.SQLOutput;
import java.util.Scanner;

public class EstruturaCondicionalComposta {
    public static void main(String[] args) {
        /* Escreva um programa que receba a data de nascimento e informe se é maior ou menod de idade

         */

        Scanner valor = new Scanner(System.in);
        System.out.println("Insira seu ano de nascimento: ");
        int anoNascimento = valor.nextInt();
        int idade = 2024 - anoNascimento;

        if(idade>=18){
            System.out.println("Voce é adulto");


           } else{
            System.out.println("Voce é menor de idade");
        }
    }
}
