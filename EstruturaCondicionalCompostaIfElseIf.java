import java.util.Scanner;

public class EstruturaCondicionalCompostaIfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        int idade = 2024 - anoNascimento;

        if(idade >= 0 && idade <= 10){
            System.out.println("Voce tem "+idade+" anos e é criança!");

        } else if(idade >= 11 && idade <= 18){
            System.out.println("Voce tem "+idade+" anos e é adolescente!");
        } else if(idade >= 19 && idade <= 60){
            System.out.println("Voce tem "+idade+" e é adulto!");
        } else{
            System.out.println("Voce tem "+idade+" anos e é idoso(a)");
        }
    }
}
