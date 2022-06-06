package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteEmail {
  @Test
  public void testar_email_com_arroba() {
    String email = "email_teste@dominio.com.br";
    assertTrue(src.Pessoa.emailValid(email));
  }

  @Test
  public void testar_email_sem_arroba() {
    String email = "email_testedominio.com.br";
    assertFalse(src.Pessoa.emailValid(email));
  }

  @Test
  public void testar_email_mais_50_caracteres() {
    String email = "email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br";
    assertFalse(src.Pessoa.emailValid(email));
  }
}
