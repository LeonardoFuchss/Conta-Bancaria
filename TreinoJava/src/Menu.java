import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public void inicializador(){
        ContaBancária conta1 = new ContaBancária(354321, 10000, "Leonardo Santos");//declarações de objetos
        ContaBancária conta2 = new ContaBancária(432658, 20000, "Andrielli Fraga");
        ContaBancária conta3 = new ContaBancária(234212, 2000, "Lucimar Santos");
        ContaBancária conta4 = new ContaBancária(325456, 3000, "Rafaela Fuchs");

        System.out.println(" Olá, seja bem vindo a sua conta bancária! Aperte Enter para continuar. ");
        scanner.nextLine();

        System.out.println(" Escolha uma opção: Depositar - [1] | Transferir - [2] | Sacar - [3] ");
        int number = scanner.nextInt();

        switch (number) {
            case 1 -> {
                System.out.println(" informe o valor a ser depositado: ");
                if (scanner.hasNextDouble()) { //Condição para verificar se o usuário utilizou um numero válido.
                    double valorDeposito = scanner.nextDouble();
                    conta2.depositar(valorDeposito);
                    System.out.println(" Depósito realizado com sucesso! ");
                    System.out.println(" o saldo atual da conta é: " + conta1.getSaldo()); //Chama o saldo atual da conta.
                } else {
                    System.out.println(" Erro: Entrada Inválida. Digite um número válido. ");
                    break;
                }
            }
            case 2 -> {
                //transferência
                System.out.println(" Informe o valor a ser transferido: ");
                if (scanner.hasNextDouble()) { //Condição para verificar se o usuário utilizou um numero válido.
                    double valorTransferido = scanner.nextDouble();
                    System.out.println(" Escolha a conta que queira transferir: [1] conta2 - [2] conta3 - [3] conta4 ");
                    int number1 = scanner.nextInt();
                    switch (number1) {
                        case 1 ->
                                conta1.transferir(valorTransferido, conta2 );
                        case 2 ->
                                conta1.transferir(valorTransferido, conta3);
                        case 3 ->
                                conta1.transferir(valorTransferido, conta4);
                        default -> System.out.println(" opção inválida!");
                    }
                } else {
                    System.out.println(" Erro: Entrada inválida. Digite um número válido. ");
                    break;
                }

            }
            case 3 -> {
                System.out.println("informe um valor para sacar da conta1: ");
                if (scanner.hasNextDouble()) { //Condição para verificar se o usuário utilizou um numero válido.
                    double valorSaque = scanner.nextDouble();
                    conta1.sacar(valorSaque);
                    System.out.println(" Saque realizado com sucesso! ");
                    System.out.println(" O saldo da conta agora é: " + conta1.getSaldo());
                } else {
                    System.out.println(" Erro: Entrada Inválida. Digite um número válido.");
                    break;
                }
            }
            default -> {
                System.out.println(" Opção inválida!");
            }
        }
    }
}
