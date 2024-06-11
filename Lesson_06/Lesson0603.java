public class Lesson0603 {
    public static void main(String[] args) {
        int point = 65;
        String str = "成績";
        if (point >= 80) {
            str += "優秀";
        } else if (point >= 60) {
            str += "普通";
        } else {
            str += "不合格";
        }
    }
}
