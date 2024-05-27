public class Main1503 {
    public static void main(String[] args) {
        try {
            validate(5);
            validate(-3);
        } catch (IllegalArgumentException e) {
            System.err.println("エラー: " + e.getMessage());
        }
    }

    public static void validate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("負の数です: " + n);
        }
        System.out.println("正の数: " + n);
    }
}
