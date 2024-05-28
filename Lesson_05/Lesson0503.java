public class Lesson0503 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        int num1 = a++;
        int num2 = ++b;

        System.out.println("aの値: " + a);
        System.out.println("num1の値: " + num1);

        System.out.println("bの値: " + b);
        System.out.println("num2の値: " + num2);
    }
}
