public class naturalnumber {
    public static void main(String[] args) {
        int n = 10;
        int sum = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }

    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
//create a class  to demonstarte the usage staic and  instance var and use constructor to intilialise the var
//print the object state and feilds using the regular method