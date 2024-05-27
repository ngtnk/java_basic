public class Main1502 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        try {
            int num = numbers[5];
            System.out.println("Number: " + num);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("配列の範囲外にアクセスしました。");
        } finally {
            System.out.println("finallyブロックが実行されました。");
        }
    }
}
