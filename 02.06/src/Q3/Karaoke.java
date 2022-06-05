package Q3;

import java.util.*;

public class Karaoke {
	private List<Musica> musicasDisponiveis = new ArrayList<>();
	private int quantidadeMusicas;
	private Queue<Musica> filaMusicas = new LinkedList<>();

	protected void setQuantidadeMusicas(int quantidadeMusicas) {
		this.quantidadeMusicas = quantidadeMusicas;
	}

	public void addMusicas(Musica music) {
		musicasDisponiveis.add(music);
	}
	public Musica buscarMusica(String n) {
		for (Musica music : musicasDisponiveis) {
			if (Objects.equals(music.getNomeArtista(), n) || Objects.equals(music.getNomeDaMusica(), n)) {
				return music;
			}
		}
		return null;
	}
	public void addMusicasInQueue(Musica music) {
		filaMusicas.add(music);
	}

	public Musica tocarMusicaProximaMusica() {
		return filaMusicas.poll();
	}

}
