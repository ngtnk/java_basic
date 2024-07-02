import java.util.Arrays;

public class Lesson08 {
    public static void main(String[] args) {
        int[] a = new int[5];

        int[] b = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < a.length; i++) {
            a[i] = i * 10;
        }

        int sum = 0;
        for (int n : a) {
            sum += n;
        }
        System.out.println("合計: " + sum + ", 平均: " + (double) sum / a.length);

        int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int[] r : m) {
            for (int n : r) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        Arrays.sort(b);
        System.out.println("ソート後: " + Arrays.toString(b));

        int[] o = { 1, 2, 3 };
        int[] c = o;
        c[0] = 100;
        System.out.println("参照渡し後: " + o[0]);
    }
}
