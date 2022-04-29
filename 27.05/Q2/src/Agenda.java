import java.util.ArrayList;
import java.util.Objects;

public class Agenda {
     ArrayList<Contato> contatos = new ArrayList<Contato>();

    public Contato buscarContato(int cpf) {
        for (Contato contato: contatos ) {
            if (((PessoaFisica) contato).getCpf() == cpf)  {
                return contato;
            }
        }
        return null;
    }

    public Contato buscarContato(String cnpj) {
        for (Contato contato: contatos ) {
            if (Objects.equals(((PessoaJuridica) contato).getCnpj(), cnpj))  {
                return contato;
            }
        }
        return null;
    }
    //Aqui, pra mim o mais correto seria criar apenas um Busca contato e dar a chave e um argumento que saberia se fosse cpf ou se fosse cpnj


}
