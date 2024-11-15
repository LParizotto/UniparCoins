import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarteiraDigital minhaCarteira = new CarteiraDigital();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            menu();
            opcao = lerEntradaUsuario(scanner);

            switch (opcao) {
                case 1:
                    System.out.print("digite o valor a ser adicionado: ");
                    double valorAdicionar = scanner.nextDouble();
                    minhaCarteira.adicionarSaldo(valorAdicionar);
                    break;
                case 2:
                    System.out.print("digite o valor a ser pago: ");
                    double valorPagamento = scanner.nextDouble();
                    minhaCarteira.realizarPagamento(valorPagamento);
                    break;
                case 3:
                    System.out.println("o saldo atual é: " + minhaCarteira.verificarSaldo());
                    break;
                case 4:
                    System.out.println("até logo!");
                    break;
                default:
                    System.out.println("opção inválida!");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }

    public static void menu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1- Adicionar Saldo");
        System.out.println("2- Realizar Pagamento");
        System.out.println("3- Verificar Saldo");
        System.out.println("4- Sair");
    }

    public static int lerEntradaUsuario(Scanner scanner) {
        System.out.print("Digite a opção: ");
        return scanner.nextInt();
    }
}
