package testes;

import org.junit.Test;

import static org.junit.Assert.*;

public class TesteEmail {
  TesteEmail() {
    throw new IllegalStateException("Utility class");
  }

  /** Method: emailValid(String email) */
  @Test
  public void testar_email_com_arroba() {
    String email = "email_teste@dominio.com.br";
    assertTrue(Pessoa.emailValid(email));
  }

  @Test
  public void testar_email_sem_arroba() {
    String email = "email_testedominio.com.br";
    assertTrue(Pessoa.emailValid(email));
  }

  @Test
  public void testar_email_mais_50_caracteres() {
    String email = "email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br";
    assertFalse(Pessoa.emailValid(email));
  }
}
