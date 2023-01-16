package collection;

import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LinkedListExample {


    public static void main(String[] args) {
        LinkedList<String> books = new LinkedList<>();
        books.add("The Outliers");
        books.add("The Art of War");
        books.add("Atomic habits");
        System.out.println(books);
        books.add(1,"Learning Java");
        System.out.println(books);

        books.removeFirst();
        System.out.println(books);

        //LinkedList are not synchronized
        List<String> synchronizedBooks = Collections.synchronizedList(books); // Thread safe
        LinkedList<Integer> number = new LinkedList<>(Arrays.asList(9,8,7,6,5,4));
        addZeroToStartLinkedList(number);
        System.out.println(number);


    }

    static void addZeroToStartLinkedList(LinkedList<Integer> numbers){
        numbers.addFirst(0);
    }


    @Test
    public void testAddZeroToStart(){
        LinkedList<Integer> num = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        addZeroToStartLinkedList(num);
        assertEquals(Integer.valueOf(0), num.getFirst());
    }


}
