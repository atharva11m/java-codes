package codingpoblems.array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyArray {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,44,44,33,22,11,11,11,11,22,33};
        findFreq(arr);
    }
    static void findFreq(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }
}
