import java.util.Scanner;

public class EntradadeDados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Insira seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        int idade = 2024 - anoNascimento;

        System.out.println("Insira seu salario: ");
        float salario = sc.nextFloat();

        System.out.println("Seu nome é : " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu salario é R$" + salario);

    }
}
