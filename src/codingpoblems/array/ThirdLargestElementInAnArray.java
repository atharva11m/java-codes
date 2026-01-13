package codingpoblems.array;

public class ThirdLargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {11, 22, 99, 77, 88, 66, 55, 44, 44, 33, 33, 33, 36, 36};
        Integer result=findthirdLargest(arr);

        if(result==null){
            System.out.println("No Third Largest Number");
        }
        else{
            System.out.println("Third Largest Number : " + result);
        }
    }
    public static Integer findthirdLargest(int[] arr){
        if(arr.length<3) return null;

        int first=Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third= Integer.MIN_VALUE;

        for(int num:arr){
            if(num>first){
              third=second;
              second=first;
              first=num;
            }
            else if(num>second && num!=first){
                third=second;
                second=num;
            }
            else if(num>third && num!=second && num!=first){
                third=num;

            }
        }
        if(third==Integer.MIN_VALUE){
            return null;
        }
        return third;
    }
}
