package lotr;

import lotr.kickStrategy.HobbitKick;

public class Hobbit extends Character {
    public Hobbit() {
        super(3, 0, new HobbitKick());
    }

    @Override
    public void kick(Character whoIsKicked) {
        System.out.println("Don't kick me pls");
    }

}
