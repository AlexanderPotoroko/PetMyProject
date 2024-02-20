package Project_Pet;

import Project_Pet.Animal.Cat;
import Project_Pet.Animal.Dog;
import Project_Pet.Animal.Parrot;

import java.util.Scanner;

public class Meat {
    public void infoMeat(){
        Answers answers = new Answers(); //класс где прописаны все ответы
        String yes = answers.yes();
        String no =answers.no();
        String great = answers.great();
        String dontKnow =answers.dontKnow();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Твой домашний питомец говорит\"ГАВ\"? ");
        Scanner scanner = new Scanner(System.in);
        String ifMeat = scanner.nextLine();
        if (ifMeat.equalsIgnoreCase(yes)){
            System.out.println(great);
            infoDog(dog);
        }else if(ifMeat.equalsIgnoreCase(no)) {
            System.out.println(great);
            infoCat(cat);
        }else {
            System.out.println(dontKnow);
        }
    }
    public static void infoDog (Dog dog){dog.InfoDog();}
    public static void infoCat (Cat cat){cat.InfoCat();}
}
