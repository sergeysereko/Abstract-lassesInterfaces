package Task1;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // тест класса Human
        Human human1 = new Human();
        Human human2 = new Human("Игорь",35,"Муж.");
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите пол: ");
        String gender = scanner.nextLine();
        Human human3 = new Human(name,age,gender);
        human1.outputHuman();
        human2.outputHuman();
        human3.outputHuman();
       // тест builder

        //Builder builder1 = new Builder();

    }

}