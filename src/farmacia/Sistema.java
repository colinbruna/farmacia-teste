package farmacia;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Medicamento medicamento = new Medicamento("Paracetamol", "500mg");
        Paciente paciente = new Paciente(1111111, "Bruna");

        Prescricao prescricao = new Prescricao(medicamento, paciente);

        System.out.println(prescricao.getMedicamento().getNome());
        System.out.println(prescricao.getMedicamento().getDose());
        System.out.println(prescricao.getPaciente().getNome());
        System.out.println(prescricao.getPaciente());

        System.out.println("**********\n");

        digiteUmaOpcao(sc);
    }

    public static void digiteUmaOpcao(Scanner sc) {

        System.out.println("Digite a opção que descreva o que está sentindo:");
        System.out.println("1: Dor de cabeça.");
        System.out.println("2: Dor de estomâgo.");
        System.out.println("3: Enjôo.");
        System.out.println("4: Alergia.");
        System.out.println("5: Cólica.");
        System.out.println("0: Sair.");

        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("Medicamento: Paracetamol");
        } else if (opcao == 2) {
            System.out.println("Medicamento: Buscopan");
        } else if (opcao == 3) {
            System.out.println("Medicamento: Plasil");
        } else if (opcao == 4) {
            System.out.println("Medicamento: Polaramine");
        } else if (opcao == 5) {
            System.out.println("Medicamento: Buscopan");
        } else if (opcao == 0) {
            System.out.println("O paciente digitou 0, programa terminado.");;
        } else {
            System.out.println("Se não encontrou uma opção adequada, procure um médico!");
        }
    }
}