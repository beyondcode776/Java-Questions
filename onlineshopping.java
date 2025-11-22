import java.util.Scanner;

class OutOfStockException extends Exception{
    public OutOfStockException(String message){
        super(message);
    }
}
public class onlineshopping {
    public static void purchase(int quantity) throws OutOfStockException {
        
        int stock = 5; 
        if(quantity > stock){
            throw new OutOfStockException("Requested quantity exceeds available stock.");
        } else {
            System.out.println(quantity);
        }
    }
    public static void main(String[] args) {
        
        try{
            purchase( 10);
        }
        catch(OutOfStockException e){
            System.out.println("Error:" + e.getMessage());
        }
    }
}