import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicita primeito numero
        System.out.println("Insira o primeiro número");
        float numero1 = sc.nextFloat();
        // Solicita segundo numero
        System.out.println("Insira o segundo número");
        float numero2 = sc.nextFloat();
        // Soma
        System.out.println("A soma é: " + (numero1 + numero2));
        // Subtração
        System.out.println("A subtração é: " + (numero1 - numero2));
        // Multiplicação
        System.out.println("A multiplicação é: " + (numero1 * numero2));
        // Divisão
        System.out.println("A divisão é: " + (numero1 / numero2));
        // Resto divisão
        System.out.println("O resto da divisão é: " + (numero1 % numero2));

        float media = (numero1+numero2) / 2;
        System.out.println("A média é: " + media);



    }
}
