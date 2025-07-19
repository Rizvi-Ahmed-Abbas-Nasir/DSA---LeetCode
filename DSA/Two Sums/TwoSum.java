public class TwoSum{
    
    
    public static int[] TwoSumBruteForce(int[] num, int target){
        for(int i = 0; i < num.length; i++ ){
            for(int j =0; j < num.length; j++){
                int complement = target - num[i];

                if(num[j] ==  complement){
                    return new int []{i, j};
                }
            }
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