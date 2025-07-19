import java.util.ArrayList;
import java.util.List;

public class groupProblem {

    
    public static List<List<Integer>> groupFunction(int[] arr){
                            
         List<List<Integer>> groups = new ArrayList<>();
        List<Integer> currentGroup = new ArrayList<>();

        int sum = 0;
        int counter = 1;
        for(int i = 0; i <= arr.length -1 ; i++){

            System.out.println("i = " + i + ", sum = " + sum);
            if(sum + arr[i]<= 10 ){
                currentGroup.add(arr[i]);
                System.out.println("group count "+ counter);
                  sum += arr[i] ;
            }
            else{
                 groups.add(new ArrayList<>(currentGroup));
                currentGroup.clear();
                sum = 0;
                counter++;
                i--;
            }

        }


     if (!currentGroup.isEmpty()) {
        groups.add(currentGroup);
    }

    return groups;
    }


    public static void main(String[] args){
        int[] arr = {3,4,5,6,3,2,8,4,7};
      List<List<Integer>> grp = groupFunction(arr);

        for (int i = 0; i < grp.size(); i++) {
            System.out.println(grp.get(i));
        }

    }   


}
