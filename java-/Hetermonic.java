class Main {
    
    public static void Hetermonic(int n){
        boolean Hetermonic = false;
        for(int i =0; i <= n; i++){
            
            if(i*(i+1) == n){
                Hetermonic = true;
              
            }
            
        }
        
        if(Hetermonic){
            System.out.println("it is Hetermonic");
        }
        else{
            System.out.println("it is not Hetermonic");
        }
    }
    
    
    public static void main(String[] args) {
       Hetermonic(30);
      
    }
}