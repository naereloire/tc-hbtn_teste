package src; // package src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
  private String userName;
  private String password;

  public Person() {}

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
    Pattern p =
        Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$");
    return p.matcher(this.password).matches();
  }
}
