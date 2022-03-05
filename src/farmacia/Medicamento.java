package farmacia;

public class Medicamento {

    private String nome;
    private String dose;
    private Sintomas sintomas;

    public Medicamento(String nome, String dose, Sintomas sintomas) {
        this.nome = nome;
        this.dose = dose;
        this.sintomas = sintomas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public Sintomas getSintomas() {
        return sintomas;
    }

    public void setSintomas(Sintomas sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nome='" + nome + '\'' +
                ", dose='" + dose + '\'' +
                '}';
    }
}