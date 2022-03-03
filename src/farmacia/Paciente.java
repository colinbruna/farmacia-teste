package farmacia;

public class Paciente {

    private int registro;
    private String nome;

    public Paciente(int registro, String nome) {
        this.registro = registro;
        this.nome = nome;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "registro=" + registro +
                ", nome='" + nome + '\'' +
                '}';
    }
}
