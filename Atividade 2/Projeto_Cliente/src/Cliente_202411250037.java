public class Cliente_202411250037 {

    public static void main(String[] args) {
        Calculadora_Fake calculadora = new CalculadoraAdapter();
        double a = 5;
        double b = 6;
        System.out.println(calculadora.somar(a,b));
    }
}