public class evenodd {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        int n = sc.nextInt();
        System.out.println(n + " is " + (n % 2 == 0 ? "even" : "odd"));
    }
}
