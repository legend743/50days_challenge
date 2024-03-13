import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckOddNumber {
    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);


        boolean isEnter=true;
        while(isEnter){
            System.err.println("Enter the number to add to the list:");
            int num = sc.nextInt();
            myList.add(num);
            System.out.println("Want to add more? Enter true or false:");
            isEnter = sc.nextBoolean() ;
        }
        System.out.println(myList);
        int m=myList.size();
        // for (int index = 0; index < List.; index++) {
            
        // }

        System.out.println(m);
        System.out.println(myList.get(m-1));
        for (int i = 0; i < m; i++) {
           int val= myList.get(i);
           
            if (val%2==0){
                System.out.println("This is not odd number");
            }
            else{
                System.out.println("Odd Number");
            }
        }
    }


    
    
}
