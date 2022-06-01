//package calculadora;

public class OperacaoBasicaTeste {
  OperacaoBasicaTeste() {
    throw new IllegalStateException("Utility class");
  }

  public static boolean testar_soma() {
    double numb1 = 5;
    double numb2 = 3;
    return OperacaoBasica.somar(numb1, numb2) == 8;
  }

  public static boolean testar_subtracao() {
    double numb1 = 5;
    double numb2 = 3;
    return OperacaoBasica.subtrair(numb1, numb2) == 2;
  }

  public static boolean testar_multiplicacao() {
    double numb1 = 5;
    double numb2 = 3;
    return OperacaoBasica.multiplicar(numb1, numb2) == 15;
  }

  public static boolean testar_divisao() {
    double numb1 = 9;
    double numb2 = 3;
    return OperacaoBasica.dividir(numb1, numb2) == 3;
  }
}
