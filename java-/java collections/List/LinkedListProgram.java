import java.util.*;

public class LinkedListProgram {
    /**
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        List<Integer> NodeList = new LinkedList<>();

        NodeList.add(5);
        NodeList.add(3);
        NodeList.add(15);
        NodeList.add(3);
        NodeList.add(01);
        NodeList.add(37);
        NodeList.add(33);


       int node = NodeList.get(0);

       System.out.println(node);
       System.out.println(NodeList);
       NodeList.forEach(v -> System.out.println(v));

       names.add("abbas");
    }
}
