package olechka.labs.lab2.pokemons;

import olechka.labs.lab2.attacks.IceBeamMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class SilcoonPokemon extends Pokemon {

    //    пишем конструктор. Он должен называться, как имя класса обязательно. Конструктор от метода отличается тем, что там нет
//    void. То есть конструктор никогда ничего не ВОЗВРАЩАЕТ.
//    если у нас класс наследуется от другого класса. То обязательно для нашего конструктора унаследуется конструктор вида БЕЗ АРГУМЕНТОВ РОДИТЕЛЬСКОГО КЛАССА
//    конструктор класса всегда вызывает конструктор родительского класса без аргументов, если не указано иное. Если у родительского класса нет такого конструктора, то
//    тебя явно вызвать конструктор родительского класса с аргументом через слово super.
    public SilcoonPokemon(int level) {
//        super мы исподьзуем для того чтобы в наследуемом классе вызвать в конструкторе конструктор родительского класса
//        у нас унаследуется в любом случае конструктор ТОЛЬКО БЕЗ АРГУМЕНТОВ
        super("Silicoon", level);
//        добавили характеристики покемона вызвав в конструкторе метод из наследуемого класса. Вызываем
//        этот метод именно в конструкторе потому что тут исполняется код лол...............

//        НОВЫЕ КОММЫ НОВОЙ ОЛИ
//        я могла как бы вот если я захотела 10 раз создать объект класса SilconPokempn я бы в месте вызова могла 10 раз прописать метол, но
//        ЛОЛ ГЛУПО ТУПО НЕНАУЧНО поэтому сделаем это в конструкторе. Чтобы при создании объекта у него сразу же стояли эти харакетристики у метода
        setStats(50, 35, 55, 25, 25, 15);
//        добавили тип покемона через хуйню которая назыввается enum. Это как бы нахуй класс, но там можно только определенные объеты
//        юзать И ВСЕ.
        setType(Type.BUG);
//        в метод передаю объект класса Ice ice бейби я буду тебя любить даже если я буду на небе
        IceBeamMove iceBeamMove = new IceBeamMove();

//      покемому мы передаем в качестве объекта какую-то атаку
//        мы хотим выделить сущность атаки
        addMove(iceBeamMove);

    }

}
