import mydomain.second.Dog;
import mydomain.second.Doge;
import mydomain.second.Duck;
import mydomain.second.Pet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static mydomain.Main.makePets;
import static mydomain.Main.voice;

public class Test4_petsMass {

    @Test
    public void test_mass_1(){
        Pet duck = new Duck("Дональд", "белый");
        Pet doge = new Doge("Качок Доге", "рыжий");
        Pet dog = new Dog("Крипто", "молочный");
        Pet[] arrayPets = {duck, doge, dog};
        Assertions.assertEquals(3, arrayPets.length);
    }
    @Test
    public void test_mass_2(){
        Pet duck = new Duck("Дональд", "белый");
        Pet doge = new Doge("Качок Доге", "рыжий");
        Pet dog = new Dog("Крипто", "молочный");
        Pet[] arrayPets = {duck, doge, dog};
        Assertions.assertNotEquals(0, arrayPets.length);
    }

    @Test
    public void test_mass_3(){
    var pets = makePets();
    Pet duck = new Duck("Дональд", "белый");
    Pet doge = new Doge("Качок Доге", "рыжий");
    Pet dog = new Dog("Крипто", "молочный");
    Pet[] arrayPets = {duck, doge, dog};
    Assertions.assertArrayEquals(pets, arrayPets);
    }

    @Test
    public void test_mass_4(){
        var pets = makePets();voice(pets);
        Pet duck = new Duck("Дональд", "белый");
        Pet doge = new Doge("Качок Доге", "рыжий");
        Pet dog = new Dog("Крипто", "молочный");
        Pet[] arrayPets = {duck, doge, dog};
        Assertions.assertNotEquals(0, voice(pets).length);

    }


}
