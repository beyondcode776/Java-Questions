import java.util.*;
public class CollectionCrude {
    public static void main(String[] args) {
        ArrayList<String> Fruit = new ArrayList<>();
        // Add elements
        Fruit.add("Apple");
        Fruit.add("Banana");  
        Fruit.add("Orange");
        Fruit.add("Grapes");  
        System.out.println("Original Fruit List: " + Fruit);
        // Acess element
        System.out.println("Element at index 2: " + Fruit.get(2));

        // Update element
        Fruit.set(1, "Kiwi");
        System.out.println("Updated Fruit List: " + Fruit);

        //Insert element at specific index
        Fruit.add(2,"Guava");
        System.out.println("List of fruit after adding/insert" + Fruit);

        // Remove element
        Fruit.remove(3);
        System.out.println("List of fruit after removing/deleting" + Fruit);
        Fruit.remove("Apple");
        System.out.println("List of fruit after removing/deleting" + Fruit);

        //check if element exists
        System.out.println("Is Orange present? " + Fruit.contains("Orange"));

        // Size of the ArrayList
        System.out.println("Size of the Fruit List: " + Fruit.size());

        // Sort the ArrayList
        Collections.sort(Fruit);
        System.out.println("Sorted Fruit List: " + Fruit);

        // Iterate in ArrayList - 1
        for(String fruit : Fruit) {
            System.out.println(Fruit);
        }

        // Iterate in ArrayList - 2(using Iterator/iterator method)
        System.out.println("Iterating using Iterator:");
        Iterator<String> it = Fruit.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        //Clear elements from List
        Fruit.clear();
        System.out.println("Fruit List after clearing: " + Fruit);

        //Check if ArrayList is empty
        System.out.println("Is the Fruit List empty? " + Fruit.isEmpty());
    
    }

}
// maximum linkedlist se questiion aayenge
