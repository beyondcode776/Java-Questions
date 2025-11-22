import java.util.*;
public class uniqueWords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String line = sc.nextLine();
        String[] words = line.toLowerCase().split("//w+");
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Unique words");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
