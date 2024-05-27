import java.util.HashSet;

public class Main1303 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Ruby");

        System.out.println("セットのサイズ: " + set.size());
        System.out.print("HashSetの内容: ");
        for (String element : set) {
            System.out.print(element + " ");
        }
        System.out.println();

        set.add("Java");

        System.out.println("要素Javaを追加後のサイズ: " + set.size());
        System.out.print("追加後のHashSetの内容: ");
        for (String element : set) {
            System.out.print(element + " ");
        }
    }
}
