package Q3;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		Karaoke karaokeTikTok = new Karaoke();
		int i = 0;
		for (Musica music: gerarMusicas(3)) {
			karaokeTikTok.addMusicas(music);
			i++;
		}
		karaokeTikTok.setQuantidadeMusicas(i);

		Musica musicBuscada = karaokeTikTok.buscarMusica("Artista1");
		Musica musicBuscada2 = karaokeTikTok.buscarMusica("Musica3");
		Musica musicBuscada3 = karaokeTikTok.buscarMusica("Artista2");

		mostrarMusicaBuscada(musicBuscada);
		mostrarMusicaBuscada(musicBuscada2);

		karaokeTikTok.addMusicasInQueue(musicBuscada);
		karaokeTikTok.addMusicasInQueue(musicBuscada3);

		System.out.println("Tocando a primeira música ...");
		mostrarMusicaBuscada(karaokeTikTok.tocarMusicaProximaMusica());
		System.out.println("Tocando a segunda música ...");
		mostrarMusicaBuscada(karaokeTikTok.tocarMusicaProximaMusica());

	}
	public static ArrayList<Musica> gerarMusicas(int qtd) {
		ArrayList<Musica> musicas = new ArrayList<Musica>();
		for (int i = 0; i <qtd; i++) {
			String dl = +i+"/"+i+"/20"+i;
			String artista = "Artista"+i;
			String nMusic = "Musica"+i;
			Musica music = new Musica(dl, artista, nMusic);
			music.setKeyIntMusic(i);
			musicas.add(music);
		}
		return musicas;
	}
	public static void mostrarMusicaBuscada(Musica musica) {
		if (musica != null) {
			System.out.println(musica.toString());
		} else  {
			System.out.println("Música não encontrada");
		}
	}

}
