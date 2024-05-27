import java.util.HashSet;
import java.util.TreeSet;

public class Main1305 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(100);
        hs.add(2000);
        hs.add(3);
        System.out.println("HashSet: " + hs);

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(100);
        ts.add(2000);
        ts.add(3);
        System.out.println("TreeSet: " + ts);
    }
}
