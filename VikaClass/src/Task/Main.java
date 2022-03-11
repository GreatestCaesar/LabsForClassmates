package Task;

class A{
    A(){
        System.out.println("Вы в классе А");
    }
}

class B extends A{
    B(){
        System.out.println("Вы в классе В");
    }
}

class C extends B{
    C(){
        System.out.println("Вы в классе С");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        System.out.println();
        B b = new B();
        System.out.println();
        C c = new C();
    }
}
