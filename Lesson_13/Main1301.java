import java.util.ArrayList;

public class Main1301 {
    public static void main(String[] args) {
        ArrayList<Integer> iList = new ArrayList<>();

        iList.add(1);
        iList.add(2);
        iList.add(3);
        // iList.add("文字列");

        for (Integer i : iList) {
            int dNum = i * 2;
            System.out.println(dNum);
        }
    }
}
