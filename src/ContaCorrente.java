import java.util.Scanner;
public class ContaCorrente {

String cliente;
double saldo;
int numero_da_conta;
String nome_agencia;
String Cpf_cliente;





void sacar(){
    Scanner s = new Scanner(System.in);
    System.out.println("digite o valor a sacar ");
    double valor_saque = s.nextDouble();
if (valor_saque>saldo){
    System.out.println("impossivel realizar o saque...");
    System.out.println("valor de saque indisponivel!!!");
} else {
    System.out.println("o seu novo saldo é de ");
    System.out.println(saldo - valor_saque);
}
    }
void depositar(){
    Scanner s = new Scanner(System.in);
    System.out.println("digite o valor que deseja depositar ");
double valor_deposito = s.nextDouble();
    System.out.print("o seu novo saldo é de ");
    System.out.print(saldo+valor_deposito);
    }
void tranferir() {
    Scanner s = new Scanner(System.in);
    System.out.println("digite o numero da conta em que deseja tranferir ");
    Double conta_tranferencia = s.nextDouble();
    System.out.println("digite o valor que deseja tanferir ");
    double valor_tranferencia = s.nextDouble();

    if (valor_tranferencia > saldo) {
        System.out.println("voce não possui saldo para essa trasferencia ");

    }else {
        System.out.println("tranferencia realizada com sucesso...");
        System.out.println("seu novo saldo é de ");
        System.out.print(saldo - valor_tranferencia);
    }


}
}
