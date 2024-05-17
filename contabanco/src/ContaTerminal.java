import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroConta = 1021;
        String agencia = "067-8";
        String nomeCliente = "MARIO ANDRADE";
        float saldo = 237.48f;

        // Solicita e valida o número da conta
        System.out.println("Por favor, digite o número da conta: ");
        while (true) {
            if (scanner.hasNextInt()) {
                numeroConta = scanner.nextInt();
                break;
            } else {
                System.out.println("Por favor, digite um número de conta válido: ");
                scanner.next(); // Limpa o buffer do scanner
            }
        }

        scanner.nextLine(); // Limpa o buffer do scanner

        // Solicita e valida a agência
        System.out.println("Por favor, digite a agência: ");
        agencia = scanner.nextLine();

        // Solicita e valida o nome do cliente
        System.out.println("Por favor, digite seu nome: ");
        while (nomeCliente.isEmpty()) {
            nomeCliente = scanner.nextLine().trim();
            if (nomeCliente.isEmpty()) {
                System.out.println("Por favor, digite um nome válido: ");
            }
        }

        // Exibe os detalhes da conta
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco!%n" +
                          "O número da sua agência: %s%n" +
                          "Número da sua conta: %d%n" +
                          "Seu saldo inicial: R$%.2f%n", nomeCliente, agencia, numeroConta, saldo);

        scanner.close();
    }
}