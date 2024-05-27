public class Lesson0501 {
    int num1 = 5;
    int num2 = 7;
    int num3 = 5;
    boolean b1, b2, b3, b4, b5, b6;
    
    public Lesson0501() {
        b1 = num1 < num2; // true
        b2 = num1 > num2; // false
        b3 = num2 <= num3; // false
        b4 = num2 >= num3; // true
        b5 = num1 == num3; // true
        b6 = num1 != num3; // false
    }
}
