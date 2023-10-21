package olechka.labs.lab2.pokemons;


import olechka.labs.lab2.attacks.IceBeamMove;
import olechka.labs.lab2.attacks.SleepTalkMove;
import olechka.labs.lab2.attacks.SynthesisMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class BronzorPokemon extends Pokemon {
    public BronzorPokemon(int level) {
        super("Bronzor", level);
        setStats(57, 24, 86, 24, 86, 23);
        setType(Type.STEEL, Type.PSYCHIC);
        IceBeamMove iceBeamMove = new IceBeamMove();
        addMove(iceBeamMove);
        SleepTalkMove sleepTalkMove = new SleepTalkMove();
        addMove(sleepTalkMove);
        SynthesisMove synthesis = new SynthesisMove();
        addMove(synthesis);
    }
}
