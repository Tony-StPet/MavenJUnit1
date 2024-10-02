package mydomain.second;

public class Duck extends Pet{


    public Duck(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeSound(){
        String str = "кря-кря-кря";
        return str;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
