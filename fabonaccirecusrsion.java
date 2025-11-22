public class fabonaccirecusrsion {
    public static int fabonaccirecusrsion (int num)
    {
        if(num==0 || num==1)
        {
            return num;
        }
        else
        {
            return fabonaccirecusrsion(num-1)+fabonaccirecusrsion(num-2);
        }
    }
    public static void main (String[] args){
        System.out.println("Fabonacci series using recursion:" + fabonaccirecusrsion(8));
    }
}
