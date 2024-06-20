import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o número da conta: ");
        numero = Integer.parseInt(scanner.nextLine().trim()); 
        System.out.print("Por favor, digite a agência: ");
        agencia = scanner.nextLine().trim(); 
        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine().trim(); 
        System.out.print("Por favor, digite o saldo: ");
        saldo = Double.parseDouble(scanner.nextLine().trim());

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque!", nomeCliente, agencia, numero, saldo);

        System.out.print(mensagem);
        
        scanner.close();
    }
}
