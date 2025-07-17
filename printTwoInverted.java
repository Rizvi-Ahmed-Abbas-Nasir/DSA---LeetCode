class printTwoInverted {
    
    public static void PrintStars(){
        
        int row = 6;
        
         for(int i = row; i>=1; i--){
            
            for(int j = i; j < row; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <=i; k++){
                System.out.print("* ");
            }
            
            System.out.println();

        }
        
        for(int i = 2; i<=row; i++){
            
            for(int j = i; j < row; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <=i; k++){
                System.out.print("* ");
            }
            
                          System.out.println();

        }
      
    }
    
    
    public static void main(String[] args) {
       PrintStars();
      
    }
}