package lotr;

public class GameManager {
    void fight(Character c1, Character c2) {
        System.out.println("Fight.");

        System.out.println("Players situation: " + c1 + " " + c2);

        boolean ind = true;
        while (c1.getHp() > 0 && c2.getHp() > 0) {
            if (ind) {
                System.out.print("Player 1 hits player 2 - ");
                c1.kick(c2);
                System.out.println("Players situation: " + c1 + " " + c2);
            } else {
                System.out.print("Player 2 hits player 1 - ");
                c2.kick(c1);
                System.out.println("Players situation: " + c1 + " " + c2);
            }
            ind = !ind;
        }

        if (c1.getHp() > c2.getHp()) {
            System.out.println("Player 1 wins. Fitality.");
        } else if (c1.getHp() < c2.getHp()) {
            System.out.println("Player 2 wins. Fitality.");
        } else {
            System.out.println("Draw.");
        }
    }
}
