import java.util.Scanner;
import java.util.Stack;

public class StringPallindrom {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        // Character n=sc.next().charAt(0);
        String input=sc.nextLine();
        if(isPallindrom(input)){
            System.out.println("The string is pallindrome");
        }
        else{
            System.out.println("Not a pallindrome");
        }
    }

        public static boolean isPallindrom(String str){
            int left=0;
            int right =str.length()-1;
            //while loop untill left index is less than right 
            while (left<right) {
                //ignore non alphanumeric character from left
                while (left<right&& !Character.isLetterOrDigit(str.charAt(left))) {
                    left++;

                    
                }
                while (left<right && !Character.isLetterOrDigit(str.charAt(right))) {
                    right--;
                }
                //check if character at left and right are equal and not
                if(Character.toLowerCase(str.charAt(left))!=Character.toLowerCase(str.charAt(right))){
                    return false;

                }
                left++;

                right--;
                
            }
            return true;
            
        }





    }

