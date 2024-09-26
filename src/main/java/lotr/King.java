package lotr;

import lotr.kickStrategy.KingKick;

import java.util.Random;

public class King extends Character {
    public King() {
        super((new Random()).nextInt(10) + 5, (new Random()).nextInt(10) + 5, new KingKick());

    }
}
