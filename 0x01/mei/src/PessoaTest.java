package mei.src;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {
  private Pessoa Pessoa;

  @BeforeEach
  public void setup() {
    Pessoa = new Pessoa("Paul", "McCartney", new Date(2000), true, true, true);
  }

  @Test
  public void show_full_name() {
    assertEquals("Paul McCartney", Pessoa.fullName());
  }

  @Test
  public void test_calculateYearlySalary() {
    Pessoa.setSalary(1200);
    assertEquals(14400, Pessoa.calculateYearlySalary());
  }

  @Test
  public void person_is_MEI() {
    Pessoa.setAnotherCompanyOwner(false);
    Pessoa.setPensioner(false);
    Pessoa.setPublicServer(false);

    assertTrue(Pessoa.isMEI());
  }

  @Test
  public void person_is_not_MEI() {
    Pessoa.setAnotherCompanyOwner(true);
    assertFalse(Pessoa.isMEI());
  }
}
