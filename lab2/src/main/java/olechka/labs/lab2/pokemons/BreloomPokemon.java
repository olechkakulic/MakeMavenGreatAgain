package olechka.labs.lab2.pokemons;


import olechka.labs.lab2.attacks.AeroblastMove;
import olechka.labs.lab2.attacks.IceBeamMove;
import olechka.labs.lab2.attacks.PoisonGasMove;
import olechka.labs.lab2.attacks.ThunderShockMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class BreloomPokemon extends Pokemon {
    public BreloomPokemon(int level) {
        super("Breloom", level);
        setStats(60, 130, 80, 60, 60, 70);
        setType(Type.GRASS, Type.FIGHTING);
        setMove(new IceBeamMove(), new ThunderShockMove(), new PoisonGasMove(), new AeroblastMove());
    }
}
