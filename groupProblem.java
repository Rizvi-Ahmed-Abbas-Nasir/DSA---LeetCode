public class groupProblem {

    
    public static int[] groupFunction(int[] arr){
                            
        int sum = 0;
        int counter = 1;
        int[] newgrp = new int[arr.length]; 
        for(int i = 0; i <= arr.length -1; i++){

             sum += arr[i] ;
            System.out.println("i = " + i + ", sum = " + sum);
            if(sum <= 10 ){
                newgrp[i] = arr[i];
                System.out.println("group count "+ counter);
            }
            else{
                sum = 0;
                counter++;
                i--;
            }

        }


        return newgrp;
    }


    public static void main(String[] args){
        int[] arr = {3,4,5,6,3,2,8,4,7};
       int[] grp = groupFunction(arr);
       for( int i = 0;  i <= grp.length-1; i++){
            System.out.println(grp[i]);
       }
    }   


}
