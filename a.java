/*class BankAcc {
    double balance = 1000;
    void deposit(int amount){
        balance += amount;
        showbalance();
    }
    void withdraw(int amount){
        balance -= amount;
        showbalance();
    }
    void showbalance(){
        System.out.println(balance);
    }
}

public class a {
    public static void main(String[] args) {
        BankAcc acc = new BankAcc();
        acc.deposit(500);
        acc.withdraw(200);
    }
}
/* 
user 1 deposits 500 and withdraws 200
user 2 deposits 100 and withdraws 2500
user 3 deposits 1200 and withdraws 600
print the balance after each transcaction*/
class BankAccount {
    int balance = 1000; 

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited" + amount);
        System.out.println( "New Balance" + balance);
    }

    void withdraw(int amount) {
      if (amount > balance) {
            System.out.println("Insufficient balance! Cannot withdraw " + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", Remaining Balance: " + balance);
        }
    }
}
public class a{
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();
        System.out.println("User 1 details");
        user1.deposit(500);
        user1.withdraw(200);
        System.out.println();
        BankAccount user2 = new BankAccount();
        System.out.println("User 2 details");
        user2.deposit(100);
        user2.withdraw(2500);
        System.out.println();
        BankAccount user3 = new BankAccount();
        System.out.println("User 3 ");
        user3.deposit(1200);
        user3.withdraw(600);
    }
}