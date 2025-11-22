//21/8// CharityCoins.java
// This program calculates the sum of squares of the first n natural numbers
// where n is provided by the user.
import java.util.Scanner;

public class CharityCoins {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        
        
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i * i;  
        }
        
        
        System.out.println(total);
        sc.close();
    }
}
