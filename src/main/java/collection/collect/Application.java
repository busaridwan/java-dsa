package collection.collect;

import collection.collect.interfaceExample.Contract;
import collection.collect.interfaceExample.Implementation;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
    lagos.setPetFriendly(true);


    Collection<Room> removeRooms = new ArrayList<>();

        for (Room room : rooms) {
            if (room.isPetFriendly()){
                removeRooms.add(room);
            }
        }

        rooms.removeAll(removeRooms);

        while (iterator.hasNext()){
            Room room = iterator.next();

        }
        // ::: USING STREAM
        rooms.stream()
                .filter(new Predicate<Room>() {
                    @Override
                    public boolean test(Room room) {
                        return room.isPetFriendly();
                    }
                }).forEach(new Consumer<Room>() {
                    @Override
                    public void accept(Room room) {
                        System.out.println(room.getName());
                    }
                });

        // ::: USING LAMBDA
        rooms.stream().filter(room -> room.isPetFriendly()).forEach(room -> System.out.println(room.getName()));
        // ::: METHOD REFERENCE
        rooms.stream().filter(Room::isPetFriendly).forEach(room -> System.out.println(room.getName()));
        // ::: COLLECTION AS LIST
        Collection<Room> petFriendlyRooms = rooms.stream().filter(Room::isPetFriendly).collect(Collectors.toList());
        petFriendlyRooms.stream().map(r -> r.getName()).forEach(System.out::println);

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
