package mydomain;

import mydomain.second.Dog;
import mydomain.second.Doge;
import mydomain.second.Duck;
import mydomain.second.Pet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        var pets = makePets();
    System.out.println(Arrays.toString(pets));

        System.out.println(Arrays.toString(voice(pets)));


    }

    public static Pet[] makePets(){

        Pet duck = new Duck("Дональд", "белый");
        Pet doge = new Doge("Качок Доге", "рыжий");
        Pet dog = new Dog("Крипто", "молочный");
        Pet[] arrayPets = {duck, doge, dog};
        return arrayPets;
    }

    public static String[] voice(Pet[] name){
        String[] arr = new String[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = name[i].makeSound();
        }
//        String[] arr = {name[0].makeSound(), name[1].makeSound(), name[2].makeSound()};
        return arr;
    }
}