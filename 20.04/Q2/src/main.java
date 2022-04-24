
import java.util.Calendar;
import java.util.Objects;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        Scanner keyboardInt = new Scanner(System.in);
        Scanner keyboardStr = new Scanner(System.in);
        String nomeCliente;

        do {
            double valorFatura;
            String dateFatura = "21/04/2022";  //Variaveis pra fatura
            String cod;
            String dtBool;
            double valorBol; //Variaveis para o Boleto
            int qtdBol;

            System.out.println("[FATURA] [DIGITE]: NOME DO CLIENTE");
            nomeCliente = keyboardStr.nextLine();
            System.out.println("Seja bem vindo(a), Cliente " + nomeCliente + "\nPor favor, digite o valor total da fatura!");
            valorFatura = keyboardInt.nextDouble();

            System.out.println("Cliente " + nomeCliente + "\nPor favor, digite a quantidade de boletos para pagar a fatura de valor " + valorFatura);
            qtdBol = keyboardInt.nextInt();

            Fatura fatura = new Fatura(nomeCliente, dateFatura, valorFatura);
            Boletos listBoletos = new Boletos();

            for (int i = 0; i < qtdBol; i++) {
                System.out.println("Digite o codigo do boleto");
                cod = keyboardStr.next();

                System.out.println("Digite o valor do boleto");
                valorBol = keyboardInt.nextDouble();

                System.out.println("Digite a data do boleto");
                dtBool = keyboardStr.next();

                Boleto boleto = new Boleto(cod, dtBool, valorBol);
                listBoletos.addBoletos(boleto);
            }
            if (listBoletos.getListaDeBoletos().size() != 0) {
                Pagamento pagamento = new Pagamento(valorFatura, dateFatura, "BOLETO");
                imprimirResult(fatura, listBoletos, pagamento, qtdBol, valorFatura);
            } else {
                System.out.println("Não foi adicionado nenhum boleto. Por favor, tente novamente.");
            }

        } while (!Objects.equals(nomeCliente, "exit"));

    }

    public static void imprimirResult(Fatura fatura, Boletos listBoletos, Pagamento pagamento, int qtdBoletos, double valorFatura) {
        String statsFatura = "NÃO PAGA";
        if (fatura.isEstaPaga(listBoletos.getListaDeBoletos(), valorFatura)) {
            statsFatura = "PAGA";
        } else {
            statsFatura = "NAO PAGA";
        }
        System.out.print("FATURA DE " + fatura.getValor() + " COM " + qtdBoletos + " BOLETOS NO VALOR DE ");
        for (int i = 0; i < qtdBoletos; i++) {
            if (i != qtdBoletos - 1) {
                System.out.print(listBoletos.getListaDeBoletos().get(i).getValor() + ", ");
            } else {
                System.out.print("e " + listBoletos.getListaDeBoletos().get(i).getValor() + ": ");
            }
        }
        System.out.print("FATURA MARCADA COMO " + statsFatura + "\nEXISTE" + qtdBoletos + " PAGAMENTOS DO TIPO " + pagamento.getTipoDePagamento() + " CRIADOS.\n\n");

    }
}
