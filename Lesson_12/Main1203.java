public class Main1203 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = new String("Hello");
        String str4 = " Hello World ";

        System.out.println("CharAt: " + str1.charAt(1));

        System.out.println("Substring: " + str1.substring(1, 4));

        System.out.println("str1 equals Hello: " + str1.equals("Hello"));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1 equals str3: " + str1.equals(str3));

        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        System.out.println("Trimmed: " + str4.trim());
    }
}
