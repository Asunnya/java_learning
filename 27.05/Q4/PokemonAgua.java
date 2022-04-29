public class PokemonAgua extends Pokemon {
    private int attackEspecialAgua;
    private int attaqueCondicaoEspecial;

    @Override
    public void ataqueEspecial (Pokemon atacante, Pokemon defensor) {
        defensor.hitPoints -= ((PokemonAgua) atacante).attackEspecialAgua;
        System.out.println("O Pokemon "+ defensor.nome + " foi atacado por "+ atacante.nome +" e perdeu " + atacante.attack + "pontos de vida");
    }

    @Override
    public void evoluirPokemon() {
        super.evoluirPokemon();
        attackEspecialAgua += 10;
    }
    @Override
    public void ataqueCondicoesNegativa (Pokemon atacante, Pokemon defensor) {
        int pontosPerdidos = ((PokemonAgua) atacante).attaqueCondicaoEspecial;
        defensor.hitPoints -= pontosPerdidos;
        System.out.println("O pokemon "+ defensor.nome + "foi queimado por " + atacante.nome + "e perdeu " + pontosPerdidos);

    }
}
