class PrintPattern {
    
    public static void PrintStars(){
        
        int row = 6;
        

        
        
        for(int i = 1; i<=row; i++){
            
              for (int s = 1; s <= row - i; s++) {
                System.out.print("  "); 
            }

            for (int j = i; j >= 2; j--) {
                System.out.print(j + " ");
            }
            for(int k = 1; k <=i; k++){
                System.out.print(k+" ");
            }
            
                          System.out.println();

        }
      
    }
    
    
    public static void main(String[] args) {
       PrintStars();
      
    }
}