
package bancoFlash;

import java.util.Scanner;

public class BancoApp {

    final static String USERNAME = "João";
    final static int SENHA_CORRETA = 123;
    private static Scanner scanner = new Scanner(System.in);
    private static int saldo = 1000;

    public static void main(String[] args) {
        exibirMensagemInicial();
        realizarLogin();
        realizarOperacoes();
        scanner.close();
    }

   

    private static void exibirMensagemInicial() {
        String[] opcoes = { "Saque", "Depósito", "Transferência", "Pagamento", "Investimento", "Seguro" };

        System.out.println("B A N C O - C O D E");
        System.out.println();
        System.out.println("Realize todas suas tarefas sem sair de casa!");
        System.out.println();
        System.out.println("OPÇÕES");
        System.out.println();

        for (String opcao : opcoes) {
            System.out.println(opcao);
            System.out.println();
        }
    }
    private static void realizarLogin() {
        System.out.println("Digite seu nome:");
        String usernameInput = scanner.nextLine();
        System.out.println();

        boolean senhaCorretaInserida = false;
        while (!senhaCorretaInserida) {
            System.out.println("Digite sua senha:");
            int senhaInput = scanner.nextInt();

            if (senhaInput == SENHA_CORRETA) {
                senhaCorretaInserida = true;
                System.out.println("Bem-vindo " + usernameInput);
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
                System.out.println();
            }
        }
    }
    private static void realizarOperacoes() {
        boolean realizarNovaOperacao = true;

        while (realizarNovaOperacao) {
            System.out.print("Digite o número da operação desejada: ");
            int operacao = scanner.nextInt();
            System.out.println();

            switch (operacao) {
                case 1:
                    realizarSaque();
                    break;
                case 2:
                    realizarDeposito();
                    break;
                case 3:
                    realizarTransferencia();
                    break;
                case 4:
                    realizarPagamento();
                    break;
                case 5:
                    realizarInvestimento();
                    break;
                case 6:
                    realizarSeguro();
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }

            System.out.println();
            System.out.println("Seu saldo atual é: R$" + saldo);
            scanner.nextLine();
            System.out.println();
            System.out.println("Realizar nova operação? (sim/não)");

            String novaOperacao = scanner.nextLine();

            if (novaOperacao.equalsIgnoreCase("não")) {
                System.out.println("Saindo do Aplicativo...");
                realizarNovaOperacao = false;
            }
        }
    }

    private static void realizarSeguro() {
		System.out.println("");
	}

	private static void realizarInvestimento() {
	
	
	
	}
		
	


	private static void realizarPagamento() {
		
		System.out.print("Digite o valor a ser pago : ");
        int valorPagamento = scanner.nextInt();
        System.out.println();
        if (valorPagamento <= saldo) {
            saldo -= valorPagamento;
            System.out.println("Deposito realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar o deposito.");
        }
	}

	private static void realizarTransferencia() {
		// TODO Auto-generated method stub
		System.out.print("Digite o valor a ser transferir");
        int valorTransferencia = scanner.nextInt();
        System.out.println();
        if (valorTransferencia <= saldo) {
            saldo -= valorTransferencia;
            System.out.println("Transferencia realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar o deposito.");
        }
	}

	private static void realizarDeposito() {
		
		 System.out.print("Digite o valor a ser depositado : ");
	        int valorDeposito = scanner.nextInt();
	        System.out.println();
	        if (valorDeposito <= saldo) {
	            saldo -= valorDeposito;
	            System.out.println("Deposito realizado com sucesso!");
	        } else {
	            System.out.println("Saldo insuficiente para realizar o deposito.");
	        }
	}

	private static void realizarSaque() {
        System.out.print("Digite o valor a ser sacado : ");
        int valorSaque = scanner.nextInt();
        System.out.println();

        if (valorSaque <= saldo) {
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar o deposito.");
        }
    }

}

