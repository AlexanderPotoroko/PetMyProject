package Project_Pet;
import Project_Pet.Animal.Wool;
import Project_Pet.Answers;
import java.util.Scanner;

public class Animal_4_paws {
    public void infoPaws() {
        Answers answers = new Answers(); //класс где прописаны все ответы
        String yes = answers.yes();
        String no =answers.no();
        String weelDone = answers.weelDone();
        String ifNo = answers.ifNo();
        String dontKnow =answers.dontKnow();
        Wool wool = new Wool();

        System.out.println("У твоего животного есть шерсть?");
        Scanner scanner = new Scanner(System.in);
        String ifWool = scanner.nextLine();
        if (ifWool.equalsIgnoreCase(yes)){
            System.out.println(weelDone);
            infoWool(wool);
        } else if(ifWool.equalsIgnoreCase(no)){
            System.out.println(ifNo);
        }else {
            System.out.println(dontKnow);
            System.out.println();
        }
    }
    public static void infoWool(Wool wool) {wool.infoWool();}

}
