public class InteviewTest {
    static void my(){
        System.out.println(2222);
        mx();
        System.out.println(3333);
    }
   void mx(){
        System.out.println(1111);
    }
    public static void main(String[] args) {
        InteviewTest.my();
    }
}
// here m is not static method hence it will give compilation error because static method cannot call non static method