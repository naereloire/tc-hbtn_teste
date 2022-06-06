package teste;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonTest {
  Person person;

  @BeforeAll
  public void setup() {
    person = new Person();
  }
}
