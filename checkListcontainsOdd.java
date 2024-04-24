import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class checkListcontainsOdd {
    public static void main(String[] args) {
        List<Integer> oddlist=new ArrayList<>();
        oddlist.add(10);
        Scanner sc=new Scanner(System.in);
        boolean n=true;
        while(n){
            System.out.println("Enter the number which you want to add in list");
            int val=sc.nextInt();
            if(val!=0){
            oddlist.add(val);
            }
            else{
                n=false;
            }
            
            
        }
        for(int   l :oddlist){
            if(l%2==1){
                System.out.println("the odd number list are:"+l);

            }
           

        }

      

        
    }
    
}
