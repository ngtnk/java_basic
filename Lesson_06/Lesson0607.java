public class Lesson0607 {
    public static void main(String[] args) {
        int point = 65;
        String str = "成績";

        // if文による条件分岐
        /*
         * if (point >= 80) {
         * str += "優秀";
         * } else if (point >= 60) {
         * str += "普通";
         * } else {
         * str += "不合格";
         * }
         */

        // 三項演算子による条件分岐
        str += point >= 80 ? "優秀" : point >= 60 ? "普通" : "不合格";
    }
}
