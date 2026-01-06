package codingpoblems.array;

public class ThirdLargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr={11,22,99,77,88,66,55,44,44,33,33,33,36,36};
         int largest=Integer.MIN_VALUE;
         int secondlargest=Integer.MIN_VALUE;
         int thirdLargest=Integer.MIN_VALUE;

         for(int num:arr){
             if(num>largest){
                 thirdLargest=secondlargest;
                 secondlargest=largest;
                 largest=num;
             }
             else if(num>secondlargest && num!=largest){
                 thirdLargest=secondlargest;
                 secondlargest=num;
             }
             else if(num>thirdLargest && num!=secondlargest){
                 thirdLargest=num;
             }
         }
         System.out.println("Third Largest Element in an Array : " +thirdLargest);
    }
}
