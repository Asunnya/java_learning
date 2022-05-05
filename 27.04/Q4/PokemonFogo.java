package Q4;

public class PokemonFogo extends Pokemon{

    private int attackEspecialFogo;

    @Override
    public void ataqueEspecial (Pokemon atacante, Pokemon defensor) {
        defensor.hitPoints -= ((PokemonFogo) atacante).attackEspecialFogo;
        System.out.println("O Pokemon "+ defensor.nome + " foi atacado por "+ atacante.nome +" e perdeu " + atacante.attack + "pontos de vida");
    }

    @Override
    public void evoluirPokemon() {
        super.evoluirPokemon();
        attackEspecialFogo += 10;
    }
}
