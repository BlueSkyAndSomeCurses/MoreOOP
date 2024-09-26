package lotr;

import lotr.kickStrategy.KingKick;

import java.util.Random;

public class Knight extends Character {
    public Knight() {
        super((new Random()).nextInt(10) + 2, (new Random()).nextInt(10) + 2, new KingKick());
    }


}
