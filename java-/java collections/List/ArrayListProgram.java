import java.util.List;
public class ArrayListProgram {
    
    public static void main(String[] args) {
        
        List<Integer> array = new java.util.ArrayList<>();

        array.add(4);
        array.add(3);
        array.add(2);
        array.add(4);
        array.add(10);

        System.out.println(array);

        for(int n : array){
            System.out.println(n);
        }

        array.forEach(t -> System.out.println(t) );

        for(int i = 0; i <= array.size() -1 ; i++){
            System.out.println(array.get(i));
        }
    }
}
