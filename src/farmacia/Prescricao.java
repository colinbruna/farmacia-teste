package farmacia;

public class Prescricao {

    private Medicamento medicamento;
    private Paciente paciente;

    public Prescricao(Medicamento medicamento, Paciente paciente) {
        this.medicamento = medicamento;
        this.paciente = paciente;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Prescricao{" +
                "medicamento=" + medicamento +
                ", paciente=" + paciente +
                '}';
    }
}
