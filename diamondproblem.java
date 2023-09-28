interface A {
    default void show() {
        System.out.println("A's show method");
    }
}

interface B extends A {
    default void show() {
        System.out.println("B's show method");
    }
}

interface C extends A {
    default void show() {
        System.out.println("C's show method");
    }
}

class D implements B, C {

    @Override
    public void show() {
        B.super.show();
        C.super.show();
    }
}

public class diamondproblem {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}
