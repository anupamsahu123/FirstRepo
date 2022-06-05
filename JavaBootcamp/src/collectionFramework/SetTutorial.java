package collectionFramework;
import java.util.HashSet;
import java.util.Set;

public class SetTutorial {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // Set is interface and HashSet implements Set
        // I have used dynamic method dispatch
        set.add(1);
        set.add(5);
        set.add(10);
        set.add(0);
        set.add(20);

        // add 5 -> fail
        // add 6 -> pass

        if(set.add(6)) {
            System.out.println("6 is added");
        }
        else {
            System.out.println("6 is not added");
        }

        System.out.println("Size of set is " + set.size());

        for(Integer val: set) {
            System.out.print(val + " ");
        }
    }
}