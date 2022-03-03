package farmacia;

public class Sistema {

    public static void main(String[] args) {

        Medicamento medicamento = new Medicamento("Paracetamol", "500mg");
        Paciente paciente = new Paciente(1111111, "Bruna");

        Prescricao prescricao = new Prescricao(medicamento, paciente);

        System.out.println(prescricao.getMedicamento().getNome());
        System.out.println(prescricao.getMedicamento().getDose());
        System.out.println(prescricao.getPaciente().getNome());
        System.out.println(prescricao.getPaciente().toString());

    }
}
