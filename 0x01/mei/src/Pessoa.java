import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Pessoa {

  private final String name;
  private final String surname;
  private final Date birthDate;
  private boolean anotherCompanyOwner;
  private boolean pensioner;
  private boolean publicServer;
  private float salary;

  public Pessoa(
      String name,
      String surname,
      Date birthDate,
      boolean anotherCompanyOwner,
      boolean pensioner,
      boolean publicServer) {
    this.name = name;
    this.surname = surname;
    this.birthDate = birthDate;
    this.anotherCompanyOwner = anotherCompanyOwner;
    this.pensioner = pensioner;
    this.publicServer = publicServer;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

  public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
    this.anotherCompanyOwner = anotherCompanyOwner;
  }

  public void setPensioner(boolean pensioner) {
    this.pensioner = pensioner;
  }

  public void setPublicServer(boolean publicServer) {
    this.publicServer = publicServer;
  }

  public String fullName() {
    return String.format("%s %s", getName(), getSurname());
  }

  public float calculateYearlySalary() {
    return this.salary * 12;
  }

  public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
    if ((birthDate != null) && (currentDate != null)) {
      return Period.between(birthDate, currentDate).getYears();
    } else {
      return 0;
    }
  }

  public boolean isMEI() {
    LocalDate currentDate = LocalDate.now();
    int age =
        calculateAge(
            getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), currentDate);

    if (getSalary() > 130000) return false;
    if (age < 18) return false;
    if (this.anotherCompanyOwner) return false;
    if (this.pensioner) return false;
    if (this.publicServer) return false;
    return true;
  }

}
