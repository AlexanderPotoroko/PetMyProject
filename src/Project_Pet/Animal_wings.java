package Project_Pet;
import Project_Pet.Animal.Fish;
import Project_Pet.Animal.Parrot;

import java.util.Scanner;

public class Animal_wings {
    public void infoWings(){
        Answers answers = new Answers(); //класс где прописаны все ответы
        String yes = answers.yes();
        String no =answers.no();
        String great = answers.great();
        String ifNo = answers.ifNo();
        String dontKnow =answers.dontKnow();
        Parrot parrot = new Parrot();
        Fish fish = new Fish();
        System.out.println("У твоего животного есть крылья?");
        Scanner scanner = new Scanner(System.in);
        String ifWings = scanner.nextLine();
        if(ifWings.equalsIgnoreCase(yes)){
            System.out.println(great);
            infoParrot(parrot);
        } else if (ifWings.equalsIgnoreCase(no)) {
            System.out.println(ifNo);
            infoFish(fish);
        }else{
            System.out.println(dontKnow);
        }
    }
    public static void infoParrot (Parrot parrot){parrot.InfoParrot();}
    public static void infoFish (Fish fish){fish.infoFish();}
}
