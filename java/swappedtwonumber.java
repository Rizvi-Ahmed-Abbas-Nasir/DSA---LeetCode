import java.util.Arrays; 

public class swappedtwonumber {

    public static int[] swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[] result = swap(10, 4);
        System.out.println(Arrays.toString(result)); 
    }
}