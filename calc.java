class calc {
    static int result; 

    static void add(int a, int b) {
        result = a + b;
        System.out.println("Addition: " + result);
    }

   
    

    static void multiply(int a, int b) {
        result = a * b;
        System.out.println("Multiplication: " + result);
    }

    static void divide(int a, int b) {
        if (b == 0) {
            System.out.println();
        } else {
            result = a / b;
            System.out.println("Division: " + result);
        }
    }



    public static void main(String[] args) {
        
        
        calc.add(10, 5);
        
        calc.multiply(10, 5);
        calc.divide(10, 5);
        calc.divide(10, 0); 
    }
}
