public class Lesson05 {
    public static void main(String[] args) {
        int num1 = 1 + 2; // 3
        int num2 = 3 * (4 + 5); // 27

        double triangle1 = 3 * 5 / 2; // 7.0
        double triangle2 = 3.0 * 5 / 2; // 7.5
        double triangle3 = (double) 3 * 5 / 2; // 7.5
        double triangle4 = (double) (3 * 5 / 2); // 7.0

        // int circle1 = 5 * 5 * 3.14; // 右辺がdouble型のため
        int circle2 = (int) (5 * 5 * 3.14); // 78

        System.out.println("私は、" + 20 + 2 + "歳"); // 私は、202歳
        System.out.println("私は、" + (20 + 2) + "歳"); // 私は、22歳
    }
}
