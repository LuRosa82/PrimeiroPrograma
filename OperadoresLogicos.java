public class OperadoresLogicos {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 10;

        System.out.println((numero1==numero2)&&(numero1>=numero3)); //falso
        System.out.println((numero1<numero2)&&(numero3>=numero1)); //verdadeiro

        System.out.println((numero1==numero2)||(numero1>=numero3)); //verdadeiro
        System.out.println((numero1<numero2)||(numero3>=numero1)); //verdadeiro
        System.out.println((numero1>numero2)||(numero1>numero3)); //falso

    }
}
