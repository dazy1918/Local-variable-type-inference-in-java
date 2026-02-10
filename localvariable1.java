class Test2 {
    Test2() {
        var x = 23;   // local variable in constructor
        System.out.println("constructor value is " + x);
    }

    void check() {
        var s = "hello";   // local variable in method
        System.out.println(s);
    }
}

public class localvariable1 {
    public static void main(String[] args) {
        Test2 t = new Test2(); 
        t.check();            // method call
    }
}
