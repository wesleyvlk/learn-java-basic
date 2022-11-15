package br.edu.dio.desafios.contaBanco;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    private static String agency;
    private static int account;
    private static String client;
    private static double balance;
    private static String bank;
    private static boolean clI;
    private static Scanner scanner = new Scanner(System.in);

    ContaTerminal(String agency, int account, String client, double balance) {
        this.agency = agency;
        this.account = account;
        this.client = client;
        this.balance = balance;
    }

    public static String getAgency() {
        return agency;
    }

    public static Integer getAccount() {
        return account;
    }

    public static String getClient() {
        return client;
    }

    public static Double getBalance() {
        return balance;
    }

    void setAgency() {
        ContaTerminal.bank = "BBC [Nome do Banco]";
        ContaTerminal.agency = "Agencia de [UF, Cidade]: 9999";
    }

    void clI() {
        Locale locale = new Locale("US");
        setAgency();
        boolean exit = false;
        if (!clI) {
            clI = true;
            System.out.println("\n:: Iniciando Registrador de contas bancarias... " + bank);
            System.out.print("    Aperte ENTER para continuar ");
            scanner.nextLine();
        }
        System.out.println("\n Menu iniciar:\n");
        System.out.println("  1 - Registrar nova conta\n  2 - Buscar conta registrada\n  0 - Finalizar\n");
        System.out.print("    Escolha uma opção: [1, 2 ou 0] ");
        switch (scanner.next()) {
            case "1":
                setRegister();
                listRegistered();
                clI();
                break;
            case "2":
                listRegistered();
                clI();
                break;
            case "0":
                exit = true;
                break;
            default:
                System.out.println("\n  Opção invalida");
                clI();
                break;
        }
        if (exit) {
            clI = false;
            System.out.println("\n:: Finalizando Registrador de contas bancarias... " + bank + "\n");
        }
    }

    void setRegister() {
        Locale locale = new Locale("US");
        System.out.println("\n Opção escolhida...");
        System.out.println(" Registrando nova conta:\n");
        System.out.println("  Preencha o solicitado:");
        System.out.println("\n    Nome completo:");
        System.out.printf("    ");
        ContaTerminal.client = scanner.next();
        try {
            System.out.println("    Deposito inicial: [Se não houver: 0] ");
            System.out.printf("    ");
            ContaTerminal.balance = scanner.nextDouble();
        } catch (InputMismatchException e0) {
            System.out.println("\n  insira apenas números!");
            setRegister();
        }
        ContaTerminal.agency = agency;
        Random generatorAccount = new Random();
        ContaTerminal.account = generatorAccount.nextInt(99999999 + 1);
        System.out.println("\n  Atribuindo dados a agencia...");
        System.out.println("\n  Gerando numero de conta...");
        System.out.println("\n    Novo cliente registrado com sucesso!");
    }

    void listRegistered() {
        // infelizmente nao consegui implementar em formato de lista
        List<ContaTerminal> contaTerminalList = new ArrayList<ContaTerminal>();
        for (ContaTerminal listRegistered : contaTerminalList) {
            contaTerminalList.add(new ContaTerminal(agency, account, client, balance));
        }
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "\n    " + agency + ", " + account + ", " + client + ", "
                + String.format("Saldo: R$ %.2f", balance);
    }

    public static void main(String[] args) {
        ContaTerminal contaTerminal = new ContaTerminal(agency, account, client, balance);
        contaTerminal.clI();
        scanner.close();
    }
}