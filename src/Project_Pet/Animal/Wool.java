package Project_Pet.Animal;
import Project_Pet.Answers;
import Project_Pet.Meat;

import java.util.Scanner;

public class Wool {
    public void infoWool(){
        Answers answers = new Answers(); //класс где прописаны все ответы
        String yes = answers.yes();
        String no =answers.no();
        String weelDone = answers.weelDone();
        String great = answers.great();
        String dontKnow =answers.dontKnow();
        Meat meat = new Meat();
        Humster humster = new Humster();

        System.out.println("Твое домашнее живное любит мясо? ");
        Scanner scanner = new Scanner(System.in);
        String ifMeat = scanner.nextLine();
        if (ifMeat.equalsIgnoreCase(yes)){
            System.out.println(weelDone);
            infoMeat(meat);
        }else if(ifMeat.equalsIgnoreCase(no)) {
            System.out.println(great);
            infoHuster(humster);
        }else {
            System.out.println(dontKnow);
        }
    }
    public static void infoMeat(Meat meat) {meat.infoMeat();}
    public static void infoHuster(Humster humster){humster.InfoHumster();}


}
