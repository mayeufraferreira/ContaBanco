import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o cpf do cliente: ");
		String cpf = scanner.nextLine();
		System.out.println("Digite o nome do cliente: ");
		String nome = scanner.nextLine();
		System.out.println("Digite o telefone do cliente: ");
		String telefone = scanner.nextLine();
		System.out.println("Digite o email do cliente: ");
		String email = scanner.nextLine();
		System.out.println("Digite o endereço do cliente: ");
		String endereco = scanner.nextLine();

		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		cliente.setNome(nome);
		cliente.setTelefone(telefone);
		cliente.setEmail(email);
		cliente.setEndereco(endereco);

		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		System.out.println("Digite o valor a ser depositado na conta corrente:");
		double valorDeposito = scanner.nextDouble();
		cc.depositar(valorDeposito);

		System.out.println("Informe a agência da conta que deseja depositar:");
		int agencia = scanner.nextInt();
		if (agencia != 1) {
			System.out.println("Informe o valor a ser transferido:");
			double valorTransferencia = scanner.nextDouble();
			System.out.println("Informe a conta destino:");
			double conta = scanner.nextDouble();
			cc.transferirParaOutroBanco(valorTransferencia, conta);
		} else {
			System.out.println("Informe o valor a ser transferido:");
			double valorTransferencia = scanner.nextDouble();
			cc.transferir(valorTransferencia, poupanca);
		}

		System.out.println("Extrato Conta Corrente:");
		cc.imprimirExtrato();

		System.out.println("Extrato Conta Poupança:");
		poupanca.imprimirExtrato();

		scanner.close();
	}
}
