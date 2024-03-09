import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);
        if (num==1 || num==0){
            System.out.println("Not a prime Number");
        }
        // if(num==2){
        //     System.out.println("Its a prime Number");
        // }
        boolean isprime=true;
        for (int i=2;i<num;i++){
            if (num%i==0){
                isprime= false;
                break;
            }
        
        }
        if (isprime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");

        }
    }
}
