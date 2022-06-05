package Q3;

public class Musica {
	private String dataLancamento;
	private String nomeArtista;
	private String nomeDaMusica;
	private int keyIntMusic;

	protected void setKeyIntMusic(int keyIntMusic) {
		this.keyIntMusic = keyIntMusic;
	}

	public Musica(String dL, String nomeArtista, String nomeMusica) {
		this.dataLancamento = dL;
		this.nomeArtista = nomeArtista;
		this.nomeDaMusica = nomeMusica;
	}
	protected String getDataLancamento() {
		return dataLancamento;
	}

	protected String getNomeArtista() {
		return nomeArtista;
	}

	protected String getNomeDaMusica() {
		return nomeDaMusica;
	}

	@Override
	public String toString() {
		return "Musica{" +
				"dataLancamento='" + dataLancamento + '\'' +
				", nomeArtista='" + nomeArtista + '\'' +
				", nomeDaMusica='" + nomeDaMusica + '\'' +
				", keyIntMusic=" + keyIntMusic +
				'}';
	}
}
