import java.util.Scanner;

public class CheckReverseString {

    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String Val=sc.next();
        String check_reverse="";
        System.out.println(Val+ "your entered string");
        int lenStr=Val.length();
        for (int i=0;i<lenStr;i++){
            check_reverse=Val.charAt(i)+check_reverse;
        }
        System.out.println(check_reverse+" this is your reversed string");
    }
}