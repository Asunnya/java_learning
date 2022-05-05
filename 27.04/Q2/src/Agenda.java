import java.util.ArrayList;
import java.util.Objects;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    public void addContatos(Contato contato) {
        contatos.add(contato);
    }

    public Contato buscaContato(int chave) {
        for (Contato contato : contatos) {
            if (contato.getClass() == PessoaFisica.class) {
                if (((PessoaFisica) contato).getCpf() == chave) {
                    return contato;
                }
            }
            else if (contato.getClass() == PessoaJuridica.class) {
                if (((PessoaJuridica) contato).getCnpj() == chave) {
                    return contato;
                }
            }
        }

        return null;
    }

    public void imprimeContatos() {
        for (Contato contato : contatos) {
            System.out.println(contato.toString());

        }

    }
        //Aqui, pra mim o mais correto seria criar apenas um Busca contato e dar a chave e um argumento que saberia se fosse cpf ou se fosse cpnj

}
