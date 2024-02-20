package Project_Pet.Animal;
import java.util.Scanner;

public class Fish {
    public void infoFish(){
        String yes = "Да";//тут не получается сослаться на Base_class
        String no = "Нет";
        Turtle turtle = new Turtle();

        System.out.println(" Значит у тебя животное, которое живет в воде. \n Давай уточним, у домашнего животного есть плавники?");
        Scanner scanner = new Scanner(System.in);
        String ifFish = scanner.nextLine();
        if (ifFish.equalsIgnoreCase(yes)){
            System.out.println(" Твое домашнее животное это рыбка!");
        } else if (ifFish.equalsIgnoreCase(no)){
            System.out.println(" Интересно, возможно я уже знаю ответ, но есть последнее уточнение.");
            infoTurtle(turtle);
        }
    }
    public static void infoTurtle (Turtle turtle) {turtle.InfoTeurtle();}
}

