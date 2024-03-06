import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        // int a;
        // int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values ");
        int a=sc.nextInt();
       int  b=sc.nextInt();
        int temp;
      temp=a;
      a=b;
      b=temp;
      System.out.println(a+"first value");
      System.out.println(b+"second value");



    }
    
}
