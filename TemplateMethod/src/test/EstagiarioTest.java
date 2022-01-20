package test;

import org.junit.jupiter.api.Test;
import padrao.templatemethod.Estagiario;

import static org.junit.jupiter.api.Assertions.*;

public class EstagiarioTest {

    @Test
    void deveRetornarPagamento() {
        Estagiario estagiario = new Estagiario();
        estagiario.setHorasTrabalhadas(30);
        assertEquals(135, estagiario.calcularPagamento());
    }

    @Test
    void deveRetornarInformacoes() {
        Estagiario estagiario = new Estagiario();
        estagiario.setHorasTrabalhadas(30);
        estagiario.setCodigo(2);
        estagiario.setNome("James");
        assertEquals("Estagiario{codigo=2, nome='James', pagamento=135.0}", estagiario.getInfo());
    }
}