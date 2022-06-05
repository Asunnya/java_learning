package Q1;

import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.println("Digite a frase");
		String frase = str.nextLine();
		Map<Integer, String> mapaFrase = insereFraseInMap(frase);
		Map<String, Integer> frases = funcaoOcorrenciaPalavras(frase);
		System.out.println("A quantidade de palavras encontradas foram "+ mapaFrase.size());
		frases.forEach((k, v) -> System.out.println(String.format("Palavra: %s\tOcorrencias: %s", k, v)));

	}
	//Duvida pq o map n aceita tipos primitivos
	public static Map insereFraseInMap(String frase) {
		Map <Integer, String> mapPhrase = new HashMap<>();
		String[] frase_v = frase.split(" ");
		for (int i = 0; i < frase_v.length; i++) {
			mapPhrase.put(i, frase_v[i]);

		}
		return mapPhrase;
	}
	public static Map funcaoOcorrenciaPalavras(String frase) {
		Map<String, Integer> frases = new HashMap<>();
		String[] frase_v = frase.split(" ");
		for (int i = 0; i < frase_v.length; i++) {
			String palavra = frase_v[i];
			if (frases.containsKey(palavra)) {
				int valor = 1 + frases.get(palavra);
				frases.replace(palavra, valor);
			} else {
				frases.put(palavra, 1);
			}
		}
		return frases;
	}




}
