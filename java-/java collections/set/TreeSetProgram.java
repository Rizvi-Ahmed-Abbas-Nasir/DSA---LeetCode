import java.util.TreeSet;

public class TreeSetProgram {
        public static void main(String[] args) {
            TreeSet<Integer> tree = new TreeSet<>();
            
            tree.add(40);
            tree.add(5);

            tree.forEach(t -> System.out.println(t));

            System.out.println(tree);
        }    



}
