package Project_Pet;

import java.util.Scanner;

public class Answers implements InterfaceAnswer {
    private String namePet;
    private String weelDone;
    private String ifNo;
    private String dontKnow;
    private String yes;
    private String no;
    private String answer;
    private String welcome;
    private String picture;
    private String great;
    public Answers (){
        String namePet1;
        namePet1 = null;
        namePet = namePet1;
        weelDone = "Отлично, тогда следующий вопрос";
        ifNo = "Хм, тогда ответь на другой вопрос";
        dontKnow = "Ответ непонятен, повтори еще раз";
        yes = "Да";
        no = "Нет";
        great = "Отлично, значит у тебя дома: ";
        welcome = " Добро пожаловать в игру \"Угадай питомца\" \n " +
                "Вам необходимо отвечать на вопрос, только словами ДА\\НЕТ\n " +
                "Но сначала напишите имя вашего домашнего животного: ";
        picture ="      ▄▀▄     ▄▀▄\n" +
                "     ▄█  ▀▀▀▀▀  █▄\n" +
                " ▄▄  █           █  ▄▄\n" +
                "█▄▄█ █  ▀  ┬  ▀  █ █▄▄█";

    }
    @Override
    public  String great(){return great;}
    @Override
    public String picture(){return picture;}
    @Override
    public String welcome (){return welcome;}

    @Override
    public String showNamePet() {
        Scanner scanner = new Scanner(System.in);
        this.namePet = scanner.nextLine();
        return namePet;
    }
    @Override
    public String answer() {
        Scanner scanner = new Scanner(System.in);
        this.answer = scanner.nextLine();
        return answer;
    }
    @Override
    public String weelDone(){
        return weelDone;
    }
    @Override
    public String ifNo(){
        return ifNo;
    }
    @Override
    public String dontKnow(){
        return dontKnow;
    }

    @Override
    public String yes(){
        return yes;
    }
    @Override
    public String no(){
        return no;
    }
}
