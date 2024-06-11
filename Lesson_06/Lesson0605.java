public class Lesson0605 {
    public static void main(String[] args) {
        int requiredUnit = 36;
        int totalUnit = 130;
        String str;
        if (requiredUnit >= 40 && totalUnit >= 128) {
            str = "卒業";
        } else if (requiredUnit < 40 && totalUnit >= 128) {
            str = "必修単位、あと" + (40 - requiredUnit);
        } else if (requiredUnit >= 40) {
            str = "合計単位、あと" + (128 - totalUnit);
        } else {
            str = "必修単位も合計単位も足りていません";
        }
    }
}
