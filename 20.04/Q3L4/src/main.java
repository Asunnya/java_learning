import java.text.DateFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.Calendar;


public class main {
    public static void main(String[] args) {
        Scanner keyboardInt = new Scanner(System.in);
        Scanner kstr = new Scanner(System.in);
        int op;
        int idL = 1;
        ListaDeCompromissos listaDeCompromissos = new ListaDeCompromissos(idL);
        System.out.println("\n[MENU]: LISTA DE COMPROMISSOS\nDIGITE O VALOR 1 PARA ADICIONAR UM NOVO COMPROMISSO EM UMA LISTA EXISTENTE\nDIGITE 2 PARA IMPRIMIR A DE COMPROMISSO!\nDIGIE 3 PARA IMPRIMIR A LISTA DE COMPROMISSO NO DIA INFORMADO\nDIGITE -1 PARA SAIR DO PROGRAMA");
        op = keyboardInt.nextInt();

        while (op != -1) {
            switch (op) {
                case 1:
                    String titulo;
                    String desc;
                    String data;
                    String local;
                    System.out.println("-------------- ADICIONANDO NA LISTA --------------------");

                    System.out.println("DIGITE O TITULO");
                    titulo = kstr.nextLine();
                    System.out.println("DIGITE A DESCRICAO");
                    desc = kstr.nextLine();

                    System.out.println("DIGITE O LOCAL");
                    local = kstr.nextLine();

                    Compromisso compromisso = new Compromisso(titulo, desc, local);
                    listaDeCompromissos.addCompromissoInList(compromisso);
                    break;
                case 2:
                    System.out.println("DIGITE [1] PARA A DATA SER IMPRESSA EM FORMATO EXTENSO");
                    int opDataint = keyboardInt.nextInt();
                    System.out.println("DIGITE [2] PARA A DATA SER IMPRESSA EM PT-BR OU DIGITE [3] PARA SER IMPRESSA EM EN-US");
                    int idiom = keyboardInt.nextInt();
                    Locale locale;
                    DateFormat dt;
                    if (idiom == 2) {
                        locale = new Locale("pt", " BR");
                    } else {
                        locale = new Locale("en", "US");
                    }
                    if (opDataint == 1) {
                        dt = DateFormat.getDateInstance(DateFormat.LONG, locale);
                    } else {
                        dt = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
                    }
                    System.out.println();
                    System.out.println("-------------- LISTA DE COMPROMISSOS  --------------------");
                    for (int i = 0; i < listaDeCompromissos.getListaC().size(); i++) {
                        System.out.println("TITULO: " + listaDeCompromissos.getListaC().get(i).getTitulo());
                        System.out.println("DESCRICAO: " + listaDeCompromissos.getListaC().get(i).getDescricao());
                        data = dt.format(listaDeCompromissos.getListaC().get(i).getData().getTime());
                        System.out.println("DATA: " + data);
                        System.out.println("LOCAL: " + listaDeCompromissos.getListaC().get(i).getLocal());
                        System.out.println("---------------------------------------------------------");
                    }
                    break;
                case 3:
                    String opData;
                    int c = 0;
                    String[] rOpDate;
                    System.out.println("DIGITE O DIA PARA IMPRIMIR OS COMPROMISSOS DESSE DIA. FORMATO 22/04/2022");
                    opData = kstr.nextLine();

                    rOpDate = opData.split("/");

                    int dia = Integer.parseInt(rOpDate[0]);
                    int mes = Integer.parseInt(rOpDate[1]);
                    int ano = Integer.parseInt(rOpDate[2]);

                    System.out.println("-------------- LISTA DE COMPROMISSOS DIA: " + opData + " --------------------");
                    for (int i = 0; i < listaDeCompromissos.getListaC().size(); i++) {
                        Calendar dataCalendar = listaDeCompromissos.getListaC().get(i).getData();
                        if (dataCalendar.get(Calendar.DAY_OF_MONTH) == dia && dataCalendar.get(Calendar.MONTH) == (mes - 1) && dataCalendar.get(Calendar.YEAR) == ano) {
                            c = 1;
                            System.out.println("TITULO: " + listaDeCompromissos.getListaC().get(i).getTitulo());
                            System.out.println("DESCRICAO: " + listaDeCompromissos.getListaC().get(i).getDescricao());
                            System.out.println("LOCAL: " + listaDeCompromissos.getListaC().get(i).getLocal());
                            System.out.println("---------------------------------------------------------");
                        }
                    }
                    if (c == 0) {
                        System.out.println("NENHUM COMPROMISSO ENCONTRADO PARA ESSE DIA: " + opData);
                        System.out.println("VERIFIQUE SE FOI INSERIDO CORRETAMENTE A DATA");
                        System.out.println("---------------------------------------------------------");
                    }
            }

            System.out.println("\n[MENU]: LISTA DE COMPROMISSOS\nDIGITE O VALOR 1 PARA ADICIONAR UM NOVO COMPROMISSO EM UMA LISTA EXISTENTE\nDIGITE 2 PARA IMPRIMIR A DE COMPROMISSO!\nDIGITE -1 PARA SAIR DO PROGRAMA");
            op = keyboardInt.nextInt();
        }
    }
}

