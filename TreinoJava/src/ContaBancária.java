import java.util.Scanner;

public class ContaBancária {
    //propriedades
    private int numeroConta;
    private double saldo;
    private String nomeTitular;
    Scanner scanner = new Scanner(System.in);

    //construtor
    public ContaBancária(int numeroConta, double saldo, String nomeTitular) { //definimos esses dados na instância da declaração de objeto.
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    // método para depositar um valor. this.saldo soma com o valor passado na instância.
    public void depositar(double valor) {
        this.saldo += valor;
    }
    public double getSaldo() { //get saldo é usado para acessar o saldo atual
        return saldo;
    }
    public void sacar(double valor2) { //método para sacar um valor do saldo, atribuindo uma condição para ser aprovado ou negado.
        if (saldo >= valor2) {
            this.saldo -= valor2;
            System.out.println("Saque Aprovado!");
        } else {
            System.out.println("Saque Negado!");
        }
    }

    public void transferir(double valor3, ContaBancária ContaDestino) { //método para transferir valor para contaDestino
        //definimos contaDestino no parametro do metodo transferir, e na classe de execução transferir definimos qual a conta destino. Para isso precisamos criar 2 declarações de objeto (conta1, conta2).
        if (saldo >= valor3) {
            this.saldo -= valor3;
            ContaDestino.depositar(valor3);
            System.out.println("transferência realizada com sucesso!");
        } else {
            System.out.println("transferência negada, saldo insuficiente! ");

        }

    }


}