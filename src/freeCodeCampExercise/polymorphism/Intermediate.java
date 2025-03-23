package freeCodeCampExercise.polymorphism;

abstract class PaymentMethod {
    abstract void pay();

}
class CreditCard extends PaymentMethod {

    @Override
    void pay() {
        System.out.println("paying using CreditCard");
    }
}

class Visa extends PaymentMethod {

    @Override
    void pay() {
        System.out.println("paying using Visa");
    }
}

public class Intermediate {
    public static void main(String[] args) {
        PaymentMethod c = new CreditCard();
        c.pay();
        PaymentMethod v = new Visa();
        v.pay();
       // PaymentMethod p = new PaymentMethod(); abstract method can't be instantiated

    }
}
