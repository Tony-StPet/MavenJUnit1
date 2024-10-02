package mydomain.second;

import java.util.Objects;

public abstract class Pet {
    String name;
    String color;

    public Pet(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    abstract public String makeSound();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(name, pet.name) && Objects.equals(color, pet.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }
}
