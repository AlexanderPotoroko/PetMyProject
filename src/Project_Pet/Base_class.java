package Project_Pet;

public class Base_class{

    public static void main(String[] args) {
        // Еще можно добавить красивую картинку на вход.
        Answers answers = new Answers(); //класс где прописаны все ответы
        String yes = answers.yes();
        String no =answers.no();
        String weelDone = answers.weelDone();
        String ifNo = answers.ifNo();
        String dontKnow =answers.dontKnow();
        String welcome = answers.welcome();
        String picture = answers.picture();
        //Я могу как-то объеденить все эти объявленные объекты, что бы вовдить одним стагом?
        Animal_4_paws paws = new Animal_4_paws();
        Animal_wings wings = new Animal_wings();


        System.out.println(picture);
        System.out.println(welcome);
        String namePet = answers.showNamePet();

        /*не могу передать имя в другие классы. В мэйн передаю методом, через интерфейс, но значение, которое вводится тут
        не могу перехватить. Пробовал  через геттер и передать  через наследование, далее оно отображается как null.
         */

        System.out.println("Отлично, теперь давай узнаем какое животное "+ namePet+ "\n" +
                "Твое домашнее животное ходит на Четырех лапах?: ");
        String answer = answers.answer();
        if (answer.equalsIgnoreCase(yes)){
            System.out.println(weelDone);
            infoPaws(paws);
        }else if(answer.equalsIgnoreCase(no)){
            System.out.println(ifNo);
            infoWings(wings);
        } else {
            System.out.println(dontKnow);
            answers.answer();
        }return ; // Тут возвращает, но не туда куда нужно, повторно вводится ответ, но цикл if не перезапускается.
    }
    public static void infoPaws(Animal_4_paws paws) {paws.infoPaws();}
    public static void infoWings(Animal_wings wings) {wings.infoWings();}

}
