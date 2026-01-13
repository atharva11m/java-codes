package codingpoblems.array;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        reverse(arr);
        for(int num:arr){
            System.out.print(num+",");
        }

    }
    public static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
