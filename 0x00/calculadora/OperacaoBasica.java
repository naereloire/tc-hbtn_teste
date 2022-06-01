package calculadora;

public class OperacaoBasica {
  OperacaoBasica() {
    throw new IllegalStateException("Utility class");
  }

  public static double somar(double a, double b) {
    double result = a + b;
    return result;
  }

  public static double subtrair(double a, double b) {
    double result = a - b;
    return result;
  }

  public static double multiplicar(double a, double b) {
    double result = a * b;
    return result;
  }

  public static double dividir(double a, double b) {
    double result = a / b;
    return result;
  }
}
