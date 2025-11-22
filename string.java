//Write a programme to implement following string functions : length(), charAt(),indexof(),lastindexof(),substring(),lowercase(),uppercase(),append(),replace()
//blic class string {
// public static void main(String[] args) {
//     String str = "Hello kishlay kumar";
//     System.out.println(str.length());
//     System.out.println(str.charAt(4));
//     System.out.println(str.indexOf('o'));
//     System.out.println(str.lastIndexOf('r'));
//     System.out.println(str.toLowerCase());
//     System.out.println(str.toUpperCase());
//     StringBuilder str1 = new StringBuilder("luci");
//     System.out.println(str1.append("java"));
//     String replaced = str.replace("kumar", "Java");
//     System.out.println(replaced);
// }
//}
//append various function
//public class string {
//    public static void main(String[] args) {
//        StringBuilder str1 = new StringBuilder("luci");
//        StringBuilder str2 = str1.append("fer");
//        System.out.println(str2);
//    }
//}
public class string {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("hello");
        StringBuilder str2 =new StringBuilder("world");
        System.out.print(str1.length() + str2.length());
        System.out.print(str1.toString().toUpperCase().charAt(0));
    }
}