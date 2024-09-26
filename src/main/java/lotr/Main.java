package lotr;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        CharacterFactory characterFactory = new CharacterFactory();
        Character test = characterFactory.createCharacter();
        System.out.println(test);
    }
}
