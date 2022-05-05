package Q4;

public class Pokemon {
        protected String nome;
        protected int hitPoints;
        protected int attack;
        protected int defense;
        protected int specialAttack;
        protected int specialDefense;
        protected int speed;
        protected int nivel;
        protected int nivelNecessarioParaEvoluir;

        public void evoluirPokemon() {
                if (nivel == nivelNecessarioParaEvoluir) {
                        System.out.println("Pokemon Evoluiu"); //Aqui aumentaria os status do pokemon
                }
        }
        public void ataqueNormal(Pokemon atacante, Pokemon defensor) {
                defensor.hitPoints -= atacante.attack;
                System.out.println("O Pokemon "+ defensor.nome + " foi atacado por "+ atacante.nome +" e perdeu " + atacante.attack + "pontos de vida");
        }

        public void ataqueEspecial (Pokemon atacante, Pokemon defensor) {
                defensor.hitPoints -= atacante.attack;
                System.out.println("O Pokemon "+ defensor.nome + " foi atacado por "+ atacante.nome +" e perdeu " + atacante.attack + "pontos de vida");
        }

        public void ataqueCondicoesNegativa (Pokemon atacante, Pokemon defensor) {
                defensor.hitPoints -= atacante.attack;
                System.out.println("O Pokemon "+ defensor.nome + " foi atacado por "+ atacante.nome +" e perdeu " + atacante.attack + "pontos de vida");
        }

}

//Nesse exercicio eu fiquei meio sem ideia do que fazer