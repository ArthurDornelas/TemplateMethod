package padrao.templatemethod;

public abstract class Funcionario {
    private int codigo;
    protected String nome;
    private float horasTrabalhadas;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public abstract Float calcularPagamento();

    public String getTipo() {
        return "Funcionario";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "codigo=" + this.codigo +
                ", nome='" + this.nome + '\'' +
                ", pagamento=" + this.calcularPagamento() +
                '}';
    }
}
