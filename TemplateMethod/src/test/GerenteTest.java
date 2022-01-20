package test;

import org.junit.jupiter.api.Test;
import padrao.templatemethod.Gerente;

import static org.junit.jupiter.api.Assertions.*;

public class GerenteTest {

    @Test
    void deveRetornarPagamento() {
        Gerente gerente = new Gerente();
        gerente.setHorasTrabalhadas(40);
        assertEquals(820, gerente.calcularPagamento());
    }

    @Test
    void deveRetornarInformacoes() {
        Gerente gerente = new Gerente();
        gerente.setHorasTrabalhadas(40);
        gerente.setCodigo(1);
        gerente.setNome("Jack");
        assertEquals("Funcionario{codigo=1, nome='Jack', pagamento=820.0}", gerente.getInfo());
    }
}
