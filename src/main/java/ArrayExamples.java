import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class ArrayExamples {

    public static void main(String[] args) {
        String[] words = new String[7];
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (String day : weekdays
             ) {
            System.out.println("Week day: " + day);
        }
        // Make changes to element inside Array
        for (int i = 0; i < weekdays.length; i++) {
            weekdays[i] = weekdays[i].toUpperCase();
        }
        System.out.println(Arrays.toString(weekdays));

        int[] numbers = new int[7];
        System.out.println(Arrays.toString(incrementArray(numbers)));

    }

    public static int[] incrementArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
        return arr;
    }
    @Test
    public void testIncrementArray(){
        int[] input = {1,2,3,4};
        incrementArray(input);
        assertArrayEquals(new int[]{2,3,4,5}, input);
    }
}
