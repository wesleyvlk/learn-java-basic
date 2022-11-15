package br.edu.dio.condicionalFluxo;

import java.util.Scanner;

public class ControleFluxo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print(
                "\n  Escolha um testes para iniciar:\n\n    [1 - If do mês, 2 - Switch da semana, 3 - Teste rápido?]\n\n    Digite um numero: ");
        String escolhaTestes = scanner.next();
        switch (escolhaTestes) {
            case "1":
                mesIf();
                break;
            case "2":
                semanaSwitch();
                break;
            case "3":
                verificaAll();
                break;
            default:
                System.out.println("\n    Valor indefinido");
                main(args);
                break;
        }
        System.out.print("\n");
        scanner.close();
    }

    private static void mesIf() {
        System.out.print("\n  Digite de 1 a 12 para mes do ano: ");
        String[] mesIf = { "", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
                "Setembro",
                "Outubro", "Novembro", "Dezembro" };
        int numeroMes = scanner.nextInt();
        boolean mesValido = (numeroMes > 0) && (numeroMes <= 12);
        if (mesValido) {
            System.out.print("\n    Mês escolhido: " + (mesIf[numeroMes]));
        } else {
            System.out.println("\n    Mês invalido!");
            mesIf();
        }
        boolean mesFerias = (numeroMes == 1) || (numeroMes == 7) || (numeroMes == 12);
        if (mesFerias) {
            System.out.print(" = Ferias!");
        }
        System.out.print("\n");
    }

    private static void semanaSwitch() {
        System.out.print("\n  Escreva o dia da semana abreviado para seu numero: [dom, seg, ter, qua, qui, sex, sab] ");
        String diaSemana = scanner.next();
        System.out.print("\n");
        switch (diaSemana) {
            case "dom":
                System.out.println(1);
                break;
            case "seg":
                System.out.println(2);
                break;
            case "ter":
                System.out.println(3);
                break;
            case "qua":
                System.out.println(4);
                break;
            case "qui":
                System.out.println(5);
                break;
            case "sex":
                System.out.println(6);
                break;
            case "sab":
                System.out.println(7);
                break;
            default:
                System.out.println("\n    Dia invalido");
                semanaSwitch();
                break;
        }
    }

    private static void verificaAll() {
        System.out.print("\n  Teste rápido escreva um numero de 1 a 5: ");
        int verificaAll = scanner.nextInt();
        switch (verificaAll) {
            case 1:
                System.out.println("\n    Certo");
                break;
            case 2:
                System.out.println("\n    Certo");
                break;
            case 3:
                System.out.println("\n    Certo");
                break;
            case 4:
                System.out.println("\n    Errado");
                break;
            case 5:
                System.out.println("\n    Talvez");
                break;
            default:
                System.out.println("\n    Valor indefinido");
                verificaAll();
                break;
        }
    }
}