import java.util.Scanner;

public class primenumber {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; (long) i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void printPrimesUpTo(int n) {
        if (n < 2) {
            System.out.println("No primes <= " + n);
            return;
        }
        System.out.println("Primes up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int n = -1;
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                
            }
        }
        if (n < 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            try {
                n = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input");
                sc.close();
                return;
            }
            sc.close();
        }
        printPrimesUpTo(n);
    }
}
