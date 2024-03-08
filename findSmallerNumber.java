public class findSmallerNumber {
    public static void main(String[] args) {
        int array[]={1,3,5,2,8};
        int lenArr=array.length;
        int smallerNum=array[0];
        for (int i=1;i<lenArr;i++){
            
            System.out.println(smallerNum);
            if (array[i-1]>array[i]){
                smallerNum=array[i-1];

            }
            else{
                smallerNum=array[i];
            }

        }
        System.out.println(smallerNum+"this is our smallest number");
    }
}
