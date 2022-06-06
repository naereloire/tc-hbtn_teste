public class Pessoa {
  Pessoa() {
    throw new IllegalStateException("Utility class");
  }

  public static boolean emailValid(String email) {
    return email.contains("@") && email.length() <= 50;
  }

}
