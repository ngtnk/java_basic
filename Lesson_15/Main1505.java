import java.io.*;

class ParentClass {
    void performAction() throws IOException {}
}

class ChildA extends ParentClass {
    void performAction() {}
}

class ChildB extends ParentClass {
    void performAction() throws FileNotFoundException {}
}

class ChildC extends ParentClass {
    // void performAction() throws Exception {}
}

class ChildD extends ParentClass {
    // void performAction() throws ClassNotFoundException {}
}

class ChildE extends ParentClass {
    void performAction() throws RuntimeException {}
}