import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
public class set{
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for (int i = 1; i < 6; i++) {
            int num= sc.nextInt();
            numbers.add(num);
        }
        List<Integer> numList = new ArrayList<>(numbers);
        Collections.sort(numList);// Sorting the list
        System.out.println("\nSorted unique numbers: " + numList);
        for (int n : numList) {
            System.out.println(n + " ");
        }
        sc.close();
    }
}