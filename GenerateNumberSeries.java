import java.util.Scanner;

public class GenerateNumberSeries {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        System.out.println("This is your series of 5");
        for (int i=0;i<=val;i++){
            
            System.out.println(5*i);

        }

    }
}
