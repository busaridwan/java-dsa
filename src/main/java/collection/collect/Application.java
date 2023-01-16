package collection.collect;

import collection.collect.interfaceExample.Contract;
import collection.collect.interfaceExample.Implementation;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Room lagos = new Room("Lagos", "Premiere Room", 4, 175.00);
        Room kano = new Room("Kano", "Suite", 5, 250.00);
        Room kwara = new Room("Kwara", "Guest Room", 3, 125.00);

        Collection<Room> rooms = List.of(lagos,kano,kwara);
//        double total = getPotentialRevenue(lagos, kano);
        double total = getPotentialRevenue(rooms);
        System.out.println(total);

        Implementation implementation = new Implementation();
        printTerms(implementation);

        // ::: COLLECTION - LIST, QUEUE, SET
        Collection<String> c = new ArrayList<>();
        List<String> l = new LinkedList<>();
        Queue<String> q = new LinkedList<>();
        Set<String> s = new TreeSet<>();

        // ::: ITERATOR
        Collection<Room> roomz = new ArrayList<>(Arrays.asList(lagos,kano,kwara));
        Iterator<Room> iterator = roomz.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }

        for (Room room : roomz) {
            
        }


    }
//    static double getPotentialRevenue(Room room1, Room room2){
//        return room1.getRate() + room2.getRate();
//    }
    static double getPotentialRevenue(Collection<Room> rooms){
       return rooms.stream()
                .mapToDouble(r -> r.getRate())
                .sum();
    }

    private static void printTerms(Contract contract){
        contract.term1();
        contract.term2();
    }
}
