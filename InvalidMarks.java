//import java.io.FileReader;
//public class Exception{
//    public static void main(String[] args) {
//        String str=null;
//        System.out.println(str.toUpperCase());
//        }
//    
//
//    String s = null;
//    try{
//        System.out.println(s.toUpperCase());
//        System.out.println("try block");
//
//    }
//    catch(ArthematicException e){
//        System.out.println("String is currently empty" + e.getmessage());
//    }
//    catch(NullPointerException e){
//        System.out.println("String is currently empty" + e.getmessage());
//    }
//    catch(Exception e){
//        System.out.println(e.getmessage());
//    }
//}
import java.io.FileReader;
class InvalidMarksException extends Exception{
    public InvalidMarksException(String message){
        super(message);
    }
}
public class InvalidMarks{
public static void calculateGrade(int marks) throws InvalidMarksException
{
        if(marks<0 || marks>100)
{
throw new InvalidMarksException("Marks should be between 0 and 100");
        }
        else if(marks>=90){
            System.out.println("Grade: A");
        }
        else if(marks>=80){
            System.out.println("Grade: B");
        }
        else if(marks>=70){
            System.out.println("Grade: C");
        }
        else if(marks>=60){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }
    }
    public static void main(String[] args) {
        try{
    calculateGrade(90);
    calculateGrade(67);
        }
        catch(InvalidMarksException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}