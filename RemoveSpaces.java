import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String StrVar=sc.nextLine();

        String Result=StrVar.replaceAll(" ","");
        System.out.println(Result);
        String result2=StrVar.trim();
        System.out.println(result2);
        String result3=StrVar.replaceAll("\\s+"," ");
        System.out.println(result3);
    }
}
