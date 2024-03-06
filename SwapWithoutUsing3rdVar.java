import java.util.Scanner;

public class SwapWithoutUsing3rdVar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("enter the value a");
         a=sc.nextInt();
        System.out.println("enter the value b");
         b=sc.nextInt();
         int x=Swap(a,b);
         int y=Swapb(a,b);
         System.out.println(x+""+y);

        
    }
    static int Swap(int a ,int b){
        
        return b;
    }
    static int Swapb(int a,int b){
        
        return a;
    }
}
