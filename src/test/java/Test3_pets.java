import mydomain.geometry.Point;
import mydomain.geometry.Triangle;
import mydomain.second.Doge;
import mydomain.second.Duck;
import mydomain.second.Pet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test3_pets {
    @Test
    public void testPet_1_Duck(){
        Duck duck = new Duck("Дональд", "белый");
        Assertions.assertEquals("кря-кря-кря", duck.makeSound());
    }
    @Test
    public void testPet_12_Duck(){
        Pet duck = new Duck("Дональд", "белый");
        Assertions.assertEquals("Дональд", duck.getName());
    }
    @Test
    public void testPet_13_Duck(){
        Duck duck = new Duck("Дональд", "белый");
        Assertions.assertEquals("Дональд", duck.getName());
    }

    @Test
    public void testPet_2_Duck(){
        Duck duck = new Duck("Дональд", "белый");
        Pet pet = new Doge("Дружок", "серый");
        Assertions.assertNotEquals(pet.makeSound(), duck.makeSound());
    }

    @Test
    public void testPet_3_Doge(){
        Doge doge = new Doge("Качок Доге", "рыжий");
        Assertions.assertEquals("Доге и Чимс", doge.makeSound());
    }
    @Test
    public void testPet_4_Doge(){
        Doge doge = new Doge("Качок Доге", "рыжий");
        Pet pet = new Duck("Дружок", "серый");
        Assertions.assertNotEquals(pet.makeSound(), doge.makeSound());
    }
    @Test
    public void testPet_5_sameVoice(){
        Duck duck = new Duck("Дональд", "белый");
        Duck duck1 = new Duck("Dilly", "рябой");
        Assertions.assertEquals(duck1.makeSound(), duck.makeSound());
    }
    @Test
    public void testPet_6_sameVoice(){
        Doge doge = new Doge("Качок Доге", "рыжий");
        Doge doge2 = new Doge("Чимс", "желтый");
        Assertions.assertEquals(doge.makeSound(), doge2.makeSound());
    }
}
