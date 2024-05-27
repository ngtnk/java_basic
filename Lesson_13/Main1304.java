import java.util.HashMap;

public class Main1304 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");

        map.put(102, "Ruby");

        map.put(104, "Java");

        System.out.println("マップのサイズ: " + map.size());

        int keyToGet = 103;
        System.out.print("キー" + keyToGet + "の値: " + map.get(keyToGet));
        System.out.println();

        System.out.print("キーセット: ");
        for (Integer key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println("");

        System.out.print("値のリスト: ");
        for (String value : map.values()) {
            System.out.print(value + " ");
        }
    }
}
