public class CalculoNota {

    public static void main(String[] args) {
        // Dados de entrada
        String nomeAluno = "Maria"; // Nome do aluno
        double nota1 = 8.5;
        double nota2 = 7.0;
        double nota3 = 9.2;
        double nota4 = 6.8;

        // Calcula a média das notas
        double media = calcularMedia(nota1, nota2, nota3, nota4);

        // Imprime o resultado
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Média das notas: " + media);
    }

    // Método para calcular a média das notas
    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
}