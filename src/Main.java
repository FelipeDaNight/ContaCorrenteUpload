import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ContaCorrente conta2 = new ContaCorrente();

        conta2.cliente="Felipe";
        conta2.numero_da_conta=1244;
        conta2.nome_agencia="felps pagamentos";
        conta2.saldo = 1000;
        conta2.Cpf_cliente ="111-111-111-11";

        System.out.println("digite o numero da operação requisitada ");
        System.out.println("1- sacar  2- depositar  3-tranferecia " );
        int numero_operacao = s.nextInt();

        switch (numero_operacao) {

            case 1:
                conta2.sacar();
                break;
            case 2:
                conta2.depositar();
                break;
            case 3:
                conta2.tranferir();
                break;

            default:
                System.out.println("opção invalida tente novamente "    );
        }
    }
}