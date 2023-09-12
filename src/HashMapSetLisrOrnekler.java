import java.util.*;

public class HashMapSetLisrOrnekler {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(10); // Yinelemeli eklemeye izin vermez

        System.out.println("Numbers Set:");
        for (int number : numbers) {
            System.out.println(number);
        }
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Elma", 10);
        myMap.put("Armut", 5);
        myMap.put("Tugce", 10); // Anahtarlar benzersiz olmalıdır
        System.out.println("Harita: " + myMap);

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
