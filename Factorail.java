import java.util.Scanner;

public class Factorail {
    public static void main(String[] args) {
        System.out.println("Enter the value");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
    
        int val=fact(num);
        System.out.println(val);
    
    
    }
  public static int fact(int num){
    int n=num;
    if (num==1){
        return  1;
    }

return num*fact(num-1);
    
   

  }
}
