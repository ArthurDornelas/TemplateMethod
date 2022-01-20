package padrao.templatemethod;

public class Estagiario extends Funcionario{
    public Float calcularPagamento() {
        return this.getHorasTrabalhadas() * 4.5f;
    }

    @Override
    public String getTipo() {
        return "Estagiario";
    }
}
