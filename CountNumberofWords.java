import java.util.HashMap;
import java.util.Scanner;

class CountNumberofWords{
    public static void main(String[] args) {
        //by using simple method 
        // String para="This is my paragraph line";
        System.out.println("Enter the paragrapgith");
        Scanner sc=new Scanner(System.in);
        String para=sc.nextLine();

        String [] CountWordStr=para.split(" ");
        int lenStr=CountWordStr.length;
        System.out.println(CountWordStr.length);
        // This is for using Hashmap
        HashMap <String, Integer>map=new HashMap<>();
        int count=0;
        for (int i=0;i<lenStr;i++){
            
            map.put(CountWordStr[i],i);
            count=count+1;

        }
        System.out.println(map);
        System.out.println("Number of words present in paragraph "+count);
    }
}