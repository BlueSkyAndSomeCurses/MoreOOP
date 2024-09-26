package lotr.kickStrategy;

import lotr.Character;

public class HobbitKick implements KickStrategy {

    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        System.out.println("Hobbit Kick");
    }
}
