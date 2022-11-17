package SetHashSet;
import javax.sound.midi.Soundbank;
import java.util.*;

public class SetMain{
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i = 1; i <= 100; i++){
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes");

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements");

        for(int i : intersection){
            System.out.println(i + " is square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();

        String[] arrayNatureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        String[] arrayDivineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};

        nature.addAll(Arrays.asList(arrayNatureWords));
        divine.addAll(Arrays.asList(arrayDivineWords));

        System.out.println("nature - divine: ");
        Set<String> difference1 = new HashSet<>(nature);
        difference1.removeAll(divine);
        printSet(difference1);

        System.out.println("divine - nature: ");
        Set<String> difference2 = new HashSet<>(divine);
        difference2.removeAll(nature);
        printSet(difference1);

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);

        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);

        System.out.println("Symmetric difference: ");
        unionTest.removeAll(intersectionTest);
        printSet(intersectionTest);

        if(nature.containsAll(divine))
            System.out.println("divine is a subset of nature");

        if(nature.containsAll(intersectionTest))
            System.out.println("intersectionTest is subset of nature");

    }

    public static void printSet(Set<String> set){
        for(String word : set)
            System.out.println(word);
    }
}
