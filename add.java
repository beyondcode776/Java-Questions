//private void add(int a, int b){
//System.out.println(a+b); 
//} 

(int a , int b) -> {System.out.println(a+b); }
(long a, long b) -> {System.out.println(a-b); }
(int a, int b) -> {System.out.println(a*b); }
//private int getStringLength(String str) 
//{ 
//return str.length(); 
//} 
(String str) -> {return str.length(); }
(String str) -> {return str.charAt(0); }