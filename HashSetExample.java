import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<String>();
        // Add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");// Duplicate element
        System.out.println("HashSet elements: " + fruits);
        // Check if an element exists
        boolean conatinsBanana = fruits.contains("Banana");
        System.out.println("Contains Banana: " + conatinsBanana);
        // Remove an element
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);
    }
    
}
