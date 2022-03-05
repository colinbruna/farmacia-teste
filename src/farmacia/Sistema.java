package farmacia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        List<Medicamento> medicamentos = new ArrayList<>();
        medicamentos.add(new Medicamento("Paracetamol", "500mg", Sintomas.DOR_DE_CABEÇA));
        medicamentos.add(new Medicamento("Buscopam", "10mg", Sintomas.DOR_DE_ESTOMAGO));
        medicamentos.add(new Medicamento("Plasil", "10mg", Sintomas.ENJOO));
        medicamentos.add(new Medicamento("Polaramine", "2mg", Sintomas.ALERGIA));

        System.out.println(medicamentos + "\n");

        int opcao = digiteUmaOpcao();

        for (Medicamento med : medicamentos) {
            if (med.getSintomas().getCodigo() == opcao) {
                System.out.println("Você deve tomar: " + med.getNome() + " " + med.getDose());
            }
        }

        if (opcao == 0) {
            System.out.println("Usuário saiu do sistema.");
        } else if (opcao > 4) {
            System.out.println("Sintoma não encontrado na lista, procure um médico!");
        }
    }

    public static int digiteUmaOpcao() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a opção que descreva o que está sentindo:");
        System.out.println("1: " + Sintomas.DOR_DE_CABEÇA.getDescricao());
        System.out.println("2: " + Sintomas.DOR_DE_ESTOMAGO.getDescricao());
        System.out.println("3: " + Sintomas.ENJOO.getDescricao());
        System.out.println("4: " + Sintomas.ALERGIA.getDescricao());
        System.out.println("0: Sair");

        return sc.nextInt();
    }
}