import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class PersonTest {
  private teste.Person person;

  @BeforeEach
  public void setup() {
    person = new teste.Person("Paul", "McCartney", new Date(2000), true, true, true);
  }

  @Test
  public void show_full_name() {
    System.out.println(person);
    assertEquals("Paul McCartney", person.fullName());
  }

  @Test
  public void test_calculateYearlySalary() {
    person.setSalary(1200);
    assertEquals(14400, person.calculateYearlySalary());
  }

  @Test
  public void person_is_MEI() {
    person.setAnotherCompanyOwner(false);
    person.setPensioner(false);
    person.setPublicServer(false);

    assertTrue(person.isMEI());
  }

  @Test
  public void person_is_not_MEI() {
    person.setAnotherCompanyOwner(true);
    assertFalse(person.isMEI());
  }
}
