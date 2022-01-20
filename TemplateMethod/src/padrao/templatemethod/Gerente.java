package padrao.templatemethod;

public class Gerente extends Funcionario{

    public Float calcularPagamento() {
        return this.getHorasTrabalhadas() * 20.5f;
    }
}
