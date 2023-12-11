import Task1.*;
import Task2.*;
import Task3.*;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
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
        System.out.println("\n");
        Builder builder1 = new Builder();
        builder1.outputBuilder();
        builder1.work();

        // тест sailor
        System.out.println("\n");
        Sailor sailor = new Sailor();
        sailor.outputSailor();
        sailor.sail();

        // тест Pilot
        System.out.println("\n");
        Pilot pilot = new Pilot();
        pilot.outputPilot();
        pilot.fly();

        //тест Animal
        System.out.println("\n");
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Слон");
        animal1.outputAnimal();
        animal2.outputAnimal();

        //test Tiger
        System.out.println("\n");
        Tiger tiger = new Tiger("Бенгальский тигр","Черные полоски");
        tiger.outputTiger();
        tiger.makeASound();
        tiger.hunt();

        //test Crocodile
        System.out.println("\n");
        Crocodile crocodile = new Crocodile("Нильский крокодил", 3);
        crocodile.OutputCrocodile();
        crocodile.makeASound();
        crocodile.swimToRiver();

        // test Kangaroo
        System.out.println("\n");
        Kangaroo kangaroo = new Kangaroo("Исполиинский кенгуру",12);
        kangaroo.outputKangaroo();
        kangaroo.makeASound();
        kangaroo.jump();
        */

        // test Device
        System.out.println("\n");
        Device device = new Device();
        device.Desc();
        device.Show();
        device.Sound();

        //test Kettle
        System.out.println("\n");
        Kettle kettle = new Kettle();
        kettle.Desc();
        kettle.Show();
        kettle.Sound();

        //test Microwave
        System.out.println("\n");
        Microwave microwave = new Microwave();
        microwave.Show();
        microwave.Desc();
        microwave.Sound();

        //test Car
        System.out.println("\n");
        Car car = new Car();
        car.Show();
        car.Desc();
        car.Sound();

        //test Steamboat
        System.out.println("\n");
        Steamboat steamboat = new Steamboat();
        steamboat.Show();
        steamboat.Desc();
        steamboat.Sound();


    }

}