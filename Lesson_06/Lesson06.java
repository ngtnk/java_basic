public class Lesson06 {
    public static void main(String[] args) {
        int age = new java.util.Random().nextInt(80); // 0以上80未満の整数乱数を生成
        if (age < 18) {
            System.out.println("未成年です");
        } else if (age < 20) {
            System.out.println("投票にはいけますが、飲酒・喫煙できません");
        } else {
            System.out.println("お酒やたばこは、節度を持って楽しみましょう");
        }

        String result = (age < 18) ? "未成年" : "成人";
        System.out.println(result);
    }
}
