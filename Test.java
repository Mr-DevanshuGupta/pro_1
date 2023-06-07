abstract class Animal {
    public abstract void makeSound();

    public void intro() {
        System.out.println("I am Animal");
    }

}

class Dog extends Animal {

    public void makeSound() {
        System.out.println("I make sound of bark bark");
    }
}

class Cat extends Animal {

    public void makeSound() {
        System.out.println("I make sound of meow meow");
    }

    public void eat(){
        System.out.println("I eat mouse");
    }
}

class Mouse extends Animal{
    public void makeSound(){
        System.out.println("I make sound of che che");
    }
}

public class Test {

    public static void main(String args[]) {
        Dog d1 = new Dog();
        d1.intro();
        d1.makeSound();
        Cat c1 = new Cat();
        c1.intro();
        c1.makeSound();
        c1.eat();

        Mouse m1 = new Mouse();
        m1.intro();
        m1.makeSound();
    }
}
