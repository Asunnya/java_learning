
import java.util.Scanner;

public class mainanterior {
    public static void main(String[] args) {
        Scanner keyboardInt = new Scanner(System.in);
        Scanner keyboardStr = new Scanner(System.in);
        int op;
        int idL = 1;
        do {
            System.out.println("[MENU]: DIGITE 1 PARA CRIAR A LISTA\nDIGITE O VALOR 2 PARA ADICIONAR UM NOVO COMPROMISSO EM UMA LISTA EXISTENTE\nDIGITE 3 PARA IMPRIMIR A DE COMPROMISSO!\nDIGITE -1 PARA SAIR DO PROGRAMA");
            op = keyboardInt.nextInt();
            menu(op, keyboardInt, keyboardStr, idL);
            if (op == 1) {
                idL++;
            }


        } while (op != -1);

    }

    public static void menu(int op, Scanner kint, Scanner kstr, int idL) {
        ListaDeCompromissos listaDeCompromissos = new ListaDeCompromissos(idL);
        switch (op) {
            case 1:
                String nome;
                System.out.println("-------------- CRIANDO A LISTA --------------------");
                menu(2, kint, kstr, idL);

                break;
            case 2:
                String titulo;
                String desc;
                String data;
                String local;
                System.out.println("-------------- ADICIONANDO NA LISTA --------------------");

                System.out.println("DIGITE O TITULO");
                titulo = kstr.nextLine();
                System.out.println("DIGITE A DESCRICAO");
                desc = kstr.nextLine();
                System.out.println("DIGITE A DATA");
                data = kstr.nextLine();
                System.out.println("DIGITE O LOCAL");
                local = kstr.nextLine();

                Compromisso compromisso = new Compromisso(titulo, desc, local);
                listaDeCompromissos.addCompromissoInList(compromisso);
                break;
            case 3:
                System.out.println("-------------- LISTA --------------------");
                for (int i = 0; i < listaDeCompromissos.getListaC().size(); i++) {
                    System.out.println("TITULO: " + listaDeCompromissos.getListaC().get(i).getTitulo());
                    System.out.println("DESCRICAO: " + listaDeCompromissos.getListaC().get(i).getDescricao());
                    System.out.println("DATA: " + listaDeCompromissos.getListaC().get(i).getData());
                    System.out.println("LOCAL: " + listaDeCompromissos.getListaC().get(i).getLocal());
                }

                break;

        }

    }

}


