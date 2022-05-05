public class main {
    public static void main(String [] args) {


        Agenda agenda = new Agenda();
        PessoaFisica pessoa1 = new PessoaFisica("Rua dos bobos", "Jonas", 123483209, "20/12/2002");
        PessoaJuridica pessoa2 = new PessoaJuridica("Rua dos bobos", "Maria", 888877123, 3000000);

        agenda.addContatos(pessoa1);
        agenda.addContatos(pessoa2);

        agenda.imprimeContatos();
        System.out.println("Buscando pessoa 1 com o CPF 12348***** ");
        Contato pessoaBusca = agenda.buscaContato(123483209);
        if (pessoaBusca != null) {
            System.out.println("Encontrado, Ola "+ ((PessoaFisica) pessoaBusca).getNome());
        } else {
            System.out.println("Nao Encontrado");
        }
        Contato pessoaBusca2 = agenda.buscaContato(888877123);
        if (pessoaBusca2 != null) {
            System.out.println("Encontrado, Ola "+ ((PessoaJuridica) pessoaBusca2).getRazaoSocial());
        } else {
            System.out.println("Nao Encontrado");
        }
    }


}

//ESSE EXERCICIO NAO PRECISAA TER MAIN, OS EXERCICIOS DE HERANCA E POLIMORFISMO APENAS TREINAM ESSES CONCEITOS, SEM SE APROFUNDAR NUM MAIN E ENTRADAS DO USUARIOO
//PARA ENTRADAS MAIS ELABORADAS, BUSCAR EM OUTRA LISTA, EX QUESTAO 3 DA ULTIMA LISTA