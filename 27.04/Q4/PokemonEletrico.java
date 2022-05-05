package Q4;

public class PokemonEletrico extends Pokemon {
    private int attackEspecialEletrico;

    @Override
    public void ataqueEspecial (Pokemon atacante, Pokemon defensor) {
        defensor.hitPoints -= ((PokemonEletrico) atacante).attackEspecialEletrico;
        System.out.println("O Pokemon "+ defensor.nome + " foi atacado por "+ atacante.nome +" e perdeu " + atacante.attack + "pontos de vida");
    }

    @Override
    public void evoluirPokemon() {
        super.evoluirPokemon();
        attackEspecialEletrico += 10;
    }

}
