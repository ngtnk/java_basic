import java.util.ArrayList;

public class Main1302 {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();

        lst.add("Java");
        lst.add("Python");
        lst.add("C++");
        lst.add(1, "Ruby");

        System.out.println("リストのサイズ: " + lst.size());
        System.out.print("ArrayListの内容: ");
        for (String s : lst) {
            System.out.print(s + " ");
        }
        System.out.println();

        lst.remove(2);

        System.out.println("リストのサイズ: " + lst.size());
        System.out.print("要素削除後のArrayListの内容: ");
        for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i) + " ");
        }
    }
}
