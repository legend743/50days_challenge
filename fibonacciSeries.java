import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for (int i=0;i<=num;i++){
            sum=sum+i;
            System.out.print(sum+",");

        }
        System.out.println("");
        System.out.println("your fibonacci series sum is:"+sum);

    }
    
}
