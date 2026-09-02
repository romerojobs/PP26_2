public class Cliente_202411250037 {

    public static void main(String[] args) {

        Calculadora_202411250037 calculadora =
                new Calculadora_202411250037();

        double a = 20;
        double b = 5;

        System.out.println("Operações matemáticas");
        System.out.println("---------------------");

        System.out.println("Soma: " +
                calculadora.somar(a, b));

        System.out.println("Subtração: " +
                calculadora.subtrair(a, b));

        System.out.println("Multiplicação: " +
                calculadora.multiplicar(a, b));

        System.out.println("Divisão: " +
                calculadora.dividir(a, b));
    }
}