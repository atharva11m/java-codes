package codingpoblems.array;

//In this program we are finding Second largest in an array.

public class SecondLargestElementInAnArray {
    public static void main(String[] args){
        int arr[]={11,22,33,99,88,77,44,55,66};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }
            else if(num>secondLargest && num!=largest){
                secondLargest=num;
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            System.out.println("No Largest Element");
        }
        else{
            System.out.println("Second Largest Element : "+ secondLargest);
        }
    }
}
