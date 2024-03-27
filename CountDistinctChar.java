import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CountDistinctChar {
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        String Str1=sc.nextLine();
         

        DistinctElement dst=new DistinctElement();
        List<Character> str=dst.distinctChar(Str1);
        System.out.println(str);
    

    }

    static class DistinctElement{
        public static List<Character> distinctChar(String str){
            List<Character> distinct=new ArrayList<>();
            for(char ch :str.toCharArray()){
                if(!distinct.contains(ch)){
                    distinct.add(ch);
                   
                }
                
            }
            return distinct;

        }
    }
    }

    
