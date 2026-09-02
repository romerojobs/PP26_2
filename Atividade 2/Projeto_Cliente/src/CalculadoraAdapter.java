
public class CalculadoraAdapter extends Calculadora_202321250008 implements Calculadora_Fake{

    @Override
    public double somar(double a, double b) {
        return super.somar(a,b);
    }

    @Override
    public double subtrair(double a, double b) {
        return super.subtrair(a,b);
    }

    @Override
    public double multiplicar(double a, double b) {
        return super.multiplicar(a,b);
    }

    @Override
    public double dividir(double a, double b) {
        return super.dividir(a,b);
    }
}
