
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}


interface Sound {
    void makeSound();
}

class Dog implements Sound {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Sound {
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();

        Sound dog = new Dog();
        Sound cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
