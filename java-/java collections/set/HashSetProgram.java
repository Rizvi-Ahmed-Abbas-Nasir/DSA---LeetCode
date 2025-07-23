import java.util.*;

public class HashSetProgram {
    public static void main(String[] args) {
        HashSet<Integer> newset = new HashSet<>();
        Set<Integer> newset2 = new HashSet<>();


        newset.add(12);
        newset.add(40);
        newset.add(60);

        newset.forEach(t -> System.out.println(t));


    }
}
