package Sistema;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta();

        System.out.println("Iniciando sistema bancario.");

        System.out.printf("Cliente, Informe seu nome:");
        conta.SetNomeCliente(scanner.next());

        System.out.printf("Informe agora a agência:");
        conta.SetAgencia(scanner.next());

        System.out.printf("Informe o número de sua conta:");
        conta.SetNumero(scanner.nextInt());

        System.out.printf("Informe seu saldo disponível para saque:");
        conta.SetSaldo(scanner.nextDouble());

        System.out.println(conta.ExibirConta());




    }



}

