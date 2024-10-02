package mydomain.second;

public class Doge extends Pet{
    public Doge(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeSound(){
        String str = "Доге и Чимс";
        return str;
    }

    @Override
    public String toString() {
        return "Doge{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
