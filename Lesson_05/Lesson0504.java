public class Lesson0504 {
    public static void main(String[] args) {
        byte bnum = 24;
        short snum = bnum;
        int inum = snum;
        char c = 'A';
        inum = c;
        long lnum = inum;
        float fnum = lnum;
        double dnum = fnum;

        int num = (int) dnum;
    }
}
