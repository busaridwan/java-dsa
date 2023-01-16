package collection;

import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import static org.testng.Assert.assertTrue;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(300);
        set.add(721);
        set.add(450);
        set.add(300); // no duplicate
        System.out.println(set);

        Set<String> words = new TreeSet<>(Comparator.comparing(String::length));
        words.add("tiger");
        words.add("giraffe");
        words.add("bear");
        System.out.println(words);
        words.add("wolf"); // not include because it has same length has bear
        System.out.println(words);
        words.remove("giraffe");
        System.out.println(words);

    }
    public static Set addItemToTreeSet(Set x, int y){
        x.add(y);
        return x;
    }
    @Test
    public void testAddElementToTreeSet(){
        Set<Integer> num = new TreeSet<>();
        num.add(5);
        num.add(7);
        addItemToTreeSet(num, 98);
        assertTrue(num.contains(98));
    }

}
