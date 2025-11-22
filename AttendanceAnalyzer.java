import java.util.Scanner;
public class AttendanceAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr [i] = sc.nextInt();
        }

        int present = 0;

        for (int i = 0; i<n ; i++){
            if (arr[i]== 1){
                present++;
            }
            else{
                System.out.print("absentess" + (i+1));
            }
        
        System.out.println("present" + present);
        }
    }
}
