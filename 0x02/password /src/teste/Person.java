package teste;

class Person {
  private final String userName;
  private final String password;

  Person() {
    throw new IllegalStateException("Utility class");
  }

  public boolean checkUser() {
    return (this.userName.length() >= 8) && this.userName.matches("/^[A-Za-z0-9 ]+$/");
  }

  public boolean checkPassword() {
    return this.password.length() >= 8
        && this.userName.matches("(?m)^((?=.*\\\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[\\\\W]).{8,})$\n");
  }
}
