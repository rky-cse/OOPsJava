package freeCodeCampExercise.polymorphism;



class Animal {
    Animal() {
        System.out.println("I am animal");
    }
}

class Dog extends Animal {
    Dog(){
        System.out.println("I am dog");
    }
}
class Cat extends Animal {
    Cat(){
        System.out.println("I am cat");
    }
}




public class Basic {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println("========");
        Cat c = new Cat();
        System.out.println("========");
        Animal a = new Animal();
        System.out.println("========");
        Animal ad = new Dog();
        System.out.println("========");
        Animal ac=new Cat();
        System.out.println("========");



    }
}
