package mydomain.second;

public class Dog extends Pet{

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeSound() {
        return "who let the dogs out:: woof-woof-woof";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
