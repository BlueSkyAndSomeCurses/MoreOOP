package lotr;

import lotr.kickStrategy.ElfKick;

public class Elf extends Character {
    public Elf() {
        super(10, 10, new ElfKick());
    }

}
