import java.util.Scanner;

public class RemoveAllOccurence {
    public static void main(String[] args) {

        System.out.println("Enter the String");
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Enter the character");
        char txt=sc.next().charAt(0);

        String ResultStr=str.replace(txt, 'j');
        System.out.println(ResultStr);
    }
}
