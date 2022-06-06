//package src;

public class Person {
  private  String userName;
  private  String password;

  Person() {

  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean checkUser() {
    return (this.userName.length() >= 8) && this.userName.matches("/^[A-Za-z0-9 ]+$/");
  }

  public boolean checkPassword() {
    return this.password.length() >= 8
        && this.userName.matches("(?m)^((?=.*\\\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[\\\\W]).{8,})$\n");
  }

}
