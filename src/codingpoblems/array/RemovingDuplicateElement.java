package codingpoblems.array;

import java.util.HashSet;

public class RemovingDuplicateElement {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55,66,55,44,55};
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);

        }
        System.out.println(set);
    }
}
