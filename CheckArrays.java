import java.util.Scanner;

public class CheckArrays {
    public static void main(String[] args) {
        System.out.println("Enter String 1");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println("Enter String 1");
        String str2=sc.nextLine();

        if(str1.toLowerCase().equals(str2.toLowerCase())){
            System.out.println("Given String are equal");



        }
        else{
            System.out.println("Given String are not equal");

        }

        

    }
}
