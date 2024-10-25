import java.util.Scanner;

public class EstruturaCondicionalCompostaSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tipos: Administrador/Vendedor/Consultor");
        System.out.println("Insira o seu tipo de usuario: ");
        String acesso = sc.nextLine();

        switch (acesso){
            case "Administrador":
                System.out.println("Nivel de acesso: 100%");
                break;
            case "Vendedor":
                System.out.println("Nivel de acesso: 50%");
                break;
            case "Consultor":
                System.out.println("Nivel de acesso: 10%");
                break;
            default:
                System.out.println("Tipo de acesso invalido!");
                break;
        }
    }
}
