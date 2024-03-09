import java.util.Scanner;
public class CheckVowel {
    public static void main(String[] args) {
        char[] AlphaArray={'a','e','i','o','u'};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        char val=sc.next().charAt(0);       
       for (int i=0 ;i<=4; i++){
        // if (AlphaArray[i] == 'a' || AlphaArray[i] == 'e' || AlphaArray[i] == 'i' || AlphaArray[i] == 'o' || AlphaArray[i] == 'u'){
            if (val==AlphaArray[i] ){
            System.out.println("Its vowel");
            }
            
        }
        System.out.println("entered value is not vowel");
       }
    }
    
