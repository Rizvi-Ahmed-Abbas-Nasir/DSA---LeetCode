import java.util.*;

public class TwoSumOPT{
    
    
    public static int[] TwoSumBruteForce(int[] num, int target){
        Map<Integer, Integer> num_map = new HashMap<>(); 

        for(int i = 0; i < num.length; i++){
            int complement = target - num[i];
            if(num_map.containsKey(complement)){
                return new int[]{num_map.get(complement), i};
            }
            num_map.put(num[i], i);
        }

        return new int[]{};
    }

    
    public static void main(String[] args){
        int num[] = {2,7,11,15};
        int target = 9;
        int[] ret = TwoSumBruteForce(num, target);
        for(int i = 0; i<ret.length; i++){
            System.out.println(ret[i]);
        }
    }
}