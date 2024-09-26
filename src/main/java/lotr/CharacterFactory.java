package lotr;

import org.reflections.Reflections;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {
    Character createCharacter() throws InstantiationException, IllegalAccessException, IllegalArgumentException, java.lang.reflect.InvocationTargetException, NoSuchMethodException {

        // typical usage: scan package with the default scanners SubTypes, TypesAnnotated
        Reflections reflections = new Reflections(
                new ConfigurationBuilder()
                        .forPackage("lotr")
                        .filterInputsBy(new FilterBuilder().includePackage("lotr")));

        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);

        Character ret_val = null;
        int rand = new Random().nextInt(subTypes.size() - 1);
        int i = 0;

        for (Class<? extends Character> obj : subTypes) {
            if (i == rand) {
                ret_val = obj.getDeclaredConstructor().newInstance();
                break;
            }
            ++i;

        }

        return ret_val;
    }
}
