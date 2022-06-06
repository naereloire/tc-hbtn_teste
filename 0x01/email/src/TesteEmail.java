import org.junit.Test;
import testes.Pessoa;
import static org.junit.Assert.*;

/**
 * Pessoa Tester.
 *
 * @author <Authors name>
 * @since
 *     <pre>Jun 6, 2022</pre>
 *
 * @version 1.0
 */
public class TesteEmail {
  TesteEmail() {
    throw new IllegalStateException("Utility class");
  }

  /** Method: emailValid(String email) */
  @Test
  void testar_email_com_arroba() {
    String email = "email_teste@dominio.com.br";
    assertTrue(Pessoa.emailValid(email));
  }

  @Test
  void testar_email_sem_arroba() {
    String email = "email_testedominio.com.br";
    assertTrue(Pessoa.emailValid(email));
  }

  @Test
  void testar_email_mais_50_caracteres() {
    String email = "email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br";
    assertEquals(false, Pessoa.emailValid(email));
  }
}
