package HashMap2021_JuneStackOverflow;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Map<Integer, Map<Integer, Map<Integer, Map<Integer, Character>>>>> PEOPLE = new HashMap<>();
        Map<Integer, Map<Integer, Map<Integer, Map<Integer, Character>>>> inner0 = new HashMap<>();
        Map<Integer, Map<Integer, Map<Integer, Character>>> inner1 = new HashMap<>();
        Map<Integer, Map<Integer, Character>> inner2 = new HashMap<>();
        Map<Integer, Character> inner3 = new HashMap<>();

        Character ALICE = new Character("Disciplined", "Meticulous", "Perfectionist");
        Character TYRONE = new Character("Strong", "Balanced", "Fair");
        Character MARIA = new Character("Mellow", "Artsy", "Passionate");
        Character JAOKIM = new Character("Intelligent", "Cool", "Delightful");
        Character ZEN = new Character("Smart", "Bubbly", "Chill");

        inner3.put(19000, ALICE);
        inner3.put(19001, TYRONE);
        inner3.put(19002, MARIA);
        inner3.put(19003, JAOKIM);
        inner3.put(19004, ZEN);

        inner2.put(18000, inner3);
        inner2.put(18001, inner3);
        inner2.put(18002, inner3);
        inner2.put(18003, inner3);
        inner2.put(18004, inner3);

        inner1.put(236642118, inner2);
        inner1.put(236642175, inner2);
        inner1.put(236642141, inner2);
        inner1.put(236642130, inner2);
        inner1.put(236642056, inner2);

        inner0.put(5, inner1);
        inner0.put(-1, inner1);
        inner0.put(33, inner1);
        inner0.put(22, inner1);
        inner0.put(8, inner1);

        PEOPLE.put("KEY_A", inner0);
        PEOPLE.put("KEY_B", inner0);
        PEOPLE.put("KEY_C", inner0);
        PEOPLE.put("KEY_D", inner0);
        PEOPLE.put("KEY_E", inner0);

        Profiler_Processor pp = new Profiler_Processor();

        System.out.println(pp.inner0_Processor(PEOPLE, "KEY_A"));

    }

}
