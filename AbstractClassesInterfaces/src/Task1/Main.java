package Task1;

import Task2.Animal;
import Task2.Crocodile;
import Task2.Kangaroo;
import Task2.Tiger;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // тест класса Human
       /* Human human1 = new Human();
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
        Builder builder1 = new Builder();
        builder1.outputBuilder();
        builder1.work();

        // тест sailor
        Sailor sailor = new Sailor();
        sailor.outputSailor();
        sailor.sail();

        // тест Pilot
        Pilot pilot = new Pilot();
        pilot.outputPilot();
        pilot.fly();
        */
        //тест Animal
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Слон");
        animal1.outputAnimal();
        animal2.outputAnimal();

        //test Tiger
        Tiger tiger = new Tiger("Бенгальский тигр","Черные полоски");
        tiger.outputTiger();
        tiger.makeASound();
        tiger.hunt();

        //test Crocodile
        Crocodile crocodile = new Crocodile("Нильский крокодил", 3);
        crocodile.OutputCrocodile();
        crocodile.makeASound();
        crocodile.swimToRiver();

        // test Kangaroo
        Kangaroo kangaroo = new Kangaroo("Исполиинский кенгуру",12);
        kangaroo.outputKangaroo();
        kangaroo.makeASound();
        kangaroo.jump();
    }

}