public class Main1202 {
    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println("最初のstr1: " + str1);

        System.out.println("最初のstr1のオブジェクト参照値: " + System.identityHashCode(str1));

        str1 = "World";
        System.out.println("新しいstr1: " + str1);

        System.out.println("新しいstr1のオブジェクト参照値: " + System.identityHashCode(str1));
    }
}
