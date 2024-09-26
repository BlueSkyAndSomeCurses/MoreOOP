package lotr.kickStrategy;

import lotr.Character;

import java.util.Random;

public class KnightKick implements KickStrategy {

    @Override
    public void kick(lotr.Character whoKick, Character whoIsKicked) {
        whoIsKicked.setHp(whoIsKicked.getHp() - (new Random().nextInt(whoKick.getPower())));
    }
}
