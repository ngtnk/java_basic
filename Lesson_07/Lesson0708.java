public class Lesson0708 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("ループ" + (i + 1) + "回目をスキップする");
                continue;
            }
            System.out.println("ループ" + (i + 1) + "回目");
        }
    }
}
