package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import lotr.kickStrategy.KickStrategy;

import static java.lang.Math.max;

@Getter
@Setter
@AllArgsConstructor
public abstract class Character {

    private int hp;
    private int power;
    private KickStrategy kickStrategy;


    public void kick(Character whoIsKicked) {
        kickStrategy.kick(this, whoIsKicked);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int hp) {
        this.hp = max(0, hp);
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }


}
