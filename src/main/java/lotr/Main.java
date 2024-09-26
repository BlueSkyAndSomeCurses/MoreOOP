package lotr;

import lombok.SneakyThrows;

import java.lang.reflect.InvocationTargetException;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        Character test = characterFactory.createCharacter();
        Character test2 = characterFactory.createCharacter();
        GameManager gameManager = new GameManager();
        gameManager.fight(test, test2);
    }
}
