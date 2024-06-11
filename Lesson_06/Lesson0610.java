public class Lesson0610 {
    public static void main(String[] args) {
        double height = 172.5 / 100;
        double weight = 63.5;
        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("低体重(やせ型)");
        } else if (bmi < 25) {
            System.out.println("普通体重");
        } else if (bmi < 30) {
            System.out.println("肥満(1度)");
        } else if (bmi < 35) {
            System.out.println("肥満(2度)");
        } else if (bmi < 40) {
            System.out.println("肥満(3度)");
        } else {
            System.out.println("肥満(4度)");
        }
    }
}
