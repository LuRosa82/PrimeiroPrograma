public class CalculoCombustivel {

    public static void main(String[] args) {
        // Dados de entrada
        double distanciaPercorrida = 500; // em km
        double combustivelConsumido = 50; // em litros

        // Calcula o consumo médio
        double consumoMedio = calcularConsumoMedio(distanciaPercorrida, combustivelConsumido);

        // Imprime o resultado
        System.out.println("O consumo médio de combustível é: " + consumoMedio + " km/l");
    }

    // Método para calcular o consumo médio de combustível
    public static double calcularConsumoMedio(double distancia, double combustivel) {
        return distancia / combustivel;
    }
}
