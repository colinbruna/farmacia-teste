package farmacia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Medicamento> medicamentos = new ArrayList<>();

        medicamentos.add(new Medicamento("Paracetamol", "500mg", Sintomas.DOR_DE_CABEÇA));
        medicamentos.add(new Medicamento("Buscopam", "10mg", Sintomas.DOR_DE_ESTOMAGO));
        medicamentos.add(new Medicamento("Plasil", "10mg", Sintomas.ENJOO));
        medicamentos.add(new Medicamento("Polaramine", "2mg", Sintomas.ALERGIA));

        System.out.println(medicamentos + "\n");

        System.out.println("Opções: ");
        System.out.println("1: " + Sintomas.DOR_DE_CABEÇA.getDescricao());
        System.out.println("2: " + Sintomas.DOR_DE_ESTOMAGO.getDescricao());
        System.out.println("3: " + Sintomas.ENJOO.getDescricao());
        System.out.println("4: " + Sintomas.ALERGIA.getDescricao());
        System.out.println("0: Sair");
        System.out.println("Digite o número da opção que descreva o que está sentindo:");

        System.out.println("Primeira opção: ");
        int opcao1 = sc.nextInt();

        if (opcao1 == 0) {
            System.out.println("Usuário saiu do sistema.");
        } else if (opcao1 > 4) {
            System.out.println("Sintoma não encontrado na lista, procure um médico!");
        } else {
            System.out.println("Segunda opção: ");
            int opcao2 = sc.nextInt();
            for (Medicamento med : medicamentos) {
                if (med.getSintomas().getCodigo() == opcao1) {
                    System.out.print("Você pode tomar: " + med.getNome() + " " + med.getDose() + " + ");
                } else if (med.getSintomas().getCodigo() == opcao2) {
                    System.out.println(med.getNome() + " " + med.getDose());
                }
            }
        }
        sc.close();
    }
}