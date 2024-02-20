package Project_Pet.Animal;

import java.util.Scanner;

public class Turtle{
    public void InfoTeurtle(){
        String yes = "Да";

        System.out.println(" Тогда самый последний вопрос: \n У твоего домашнего животного есть панцирь?");
        Scanner scanner = new Scanner(System.in);
        String qestTurt = scanner.nextLine();
        if (qestTurt.equalsIgnoreCase(yes)){
            System.out.println("Твое домашнее животное это Черепаха");
        } else{
            System.out.println(" Увы. Я не могу определить твое домашнее животное");
        }

    }
}
