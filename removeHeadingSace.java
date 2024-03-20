import java.util.Scanner;

public class removeHeadingSace {
    public static void main(String[] args){

        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String Str=sc.nextLine();
        //trim is used for removing heading and trailing space from string
        String RemSpace=Str.trim();
        System.out.println(RemSpace);
        String trailingSace=Str.replace("\\s+", " ");
        System.out.println(trailingSace);
        String headingSpace=Str.replace("+s\\", " ");
        System.out.println(headingSpace);


    }
    
}
