package lotr.kickStrategy;

import lotr.Character;

import java.util.Random;

public class KingKick implements KickStrategy {

    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        whoIsKicked.setHp(whoIsKicked.getHp() - (new Random().nextInt(whoKick.getPower())));
    }
}
