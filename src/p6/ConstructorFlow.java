package p6;

class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
    Parent(int x) {
        System.out.println("Parent Constructor printing x = "+x);
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }
    Child(int x) {
        super(x);
        System.out.println("Child Constructor printing x = "+x);
    }
}

public class ConstructorFlow {
    public static void main(String[] args) {
        Child obj = new Child(5);
    }
}
