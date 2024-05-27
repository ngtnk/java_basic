public class Main1201 {
    public static void main(String[] args) {
        Object[] objs = new Object[3];
        objs[0] = "Hello";
        objs[1] = 42;
        objs[2] = new MyCls("Bye!");

        for (Object o : objs) {
            System.out.println("toString: " + o);
            System.out.println("getClass: " + o.getClass().getName());
            System.out.println("hashCode: " + o.hashCode());
            System.out.println("equals: " + o.equals(o));
            System.out.println();
        }
    }
}

class MyCls {
    private String msg;

    public MyCls(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}
