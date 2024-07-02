public class Lesson07 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "回目のループ");
        }

        int j = 0;
        while (j < 5) {
            System.out.println((j + 1) + "回目のループ");
            j++;
        }

        int k = 0;
        do {
            System.out.println((k + 1) + "回目のループ");
            k++;
        } while (k < 5);
    }
}