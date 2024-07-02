public class Lesson0707 {
    public static void main(String[] args) {
        for (int i = 0;; i++) {
            if (i == 5) {
                System.out.println("ループ" + (i + 1) + "回目で無限ループから抜ける");
                break;
            }
            System.out.println("ループ" + (i + 1) + "回目");
        }
    }
}
