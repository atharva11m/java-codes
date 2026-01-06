package codingpoblems.array;

public class LargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr={11,22,99,88,77,44,33,66,77,88,55};
        int largest= Integer.MIN_VALUE;
        for(int num:arr){
            if(largest<num){
                largest=num;
            }

        }
        System.out.println("Largest Number in an Array : "+ largest);
    }
}
//In this program we are finding largest number in array.