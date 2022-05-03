package Q3.src;

import java.util.ArrayList;
import java.util.Objects;

public class menu {

    protected static boolean isParticipanteInscritoEmPalestra(Evento evento, String tituloPalestra, int numeroDeMatricula) {
        ArrayList<String> participantePalestra = new ArrayList<String>();
        participantePalestra = listandoParticipanteNaPalestra(evento, numeroDeMatricula);
        int lenVetor = participantePalestra.size();

        if (lenVetor > 0) {
            for (int i = 0;  i < lenVetor; i++) {
                if (Objects.equals(participantePalestra.get(i), tituloPalestra)) {
                    return true;
                }
            }
        }

        return false;
    }

    protected static ArrayList<String> listandoParticipanteNaPalestra(Evento evento, int numeroDeMatricula) { //busca o participante em todas as palestras e imprime todas as palestras que ele esta
        ArrayList<Palestra> palestras = evento.getPalestras();

        ArrayList<String> participantePalestra = new ArrayList<String>();

        for (int i = 0;  i < palestras.size(); i++) {
            ArrayList<Participante> participantes = palestras.get(i).getParticipantes();

            for (int j = 0; j < participantes.size() ;j++)
                if (participantes.get(j).getNumeroDaMatricula() == numeroDeMatricula) {
                    participantePalestra.add(palestras.get(i).getTitulo());
                }
        }
        imprimindoParticipantePalestrasInscritas(numeroDeMatricula, participantePalestra);
        return participantePalestra;
    }

    protected static void imprimindoParticipantePalestrasInscritas(int numeroDeMatricula, ArrayList<String> tituloPalestras) {
        int lenVetor = tituloPalestras.size();
        System.out.println("PARTICIPANTE COM NUMERO DE MATRICULA " + numeroDeMatricula);
        if (lenVetor > 0) {
            System.out.println("======================= PALESTRAS ========================");
            for (int i = 0;  i < lenVetor; i++) {
                if (tituloPalestras.get(i) != null) {
                    System.out.printf("PALESTRA [%d] | TITULO %s\n", i+1,  tituloPalestras.get(i));
                }
            }
        } else {
            System.out.println("O PARTICIPANTE NAO SE INSCREVEU EM NENHUMA PALESTRA");
        }
    }

}
