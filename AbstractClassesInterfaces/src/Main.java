import Task1.*;
import Task2.*;
import Task3.*;
import Task4.*;
import Task5.Cello;
import Task5.Trombone;
import Task5.Ukulele;
import Task5.Violin;
import Task6.Array;
import Task7.ArrayForSort;

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


        // test Money & Product
        System.out.println("\n");
        Money money = new Money(15, 50);
        money.printAmount();


        Product product = new Product("Кофе", new Money(5, 75));
        System.out.println("Исходная цена " + product.getName() + ":");
        product.getPrice().printAmount();

        // Уменьшаем цену на 3
        product.reducePrice(3);
        System.out.println("Цена " + product.getName() + " после уменьшения:");
        product.getPrice().printAmount();

        Product product2 = new Product("Яйца", new Money(1, -25));
        System.out.println("Исходная цена " + product2.getName() + ":");
        product2.getPrice().printAmount();

        product2.reducePrice(0);
        System.out.println("Цена " + product2.getName() + " после корректировки:");
        product2.getPrice().printAmount();



        // test Cello
        System.out.println("\n");
        Cello cello = new Cello();
        cello.Show();
        cello.Desc();
        cello.History();
        cello.Sound();

        // test Trombone
        System.out.println("\n");
        Trombone trombone = new Trombone();
        trombone.Show();
        trombone.Desc();
        trombone.History();
        trombone.Sound();

        //test Violin
        System.out.println("\n");
        Violin violin = new Violin();
        violin.Show();
        violin.Desc();
        violin.History();
        violin.Sound();

        //test Ukulele
        System.out.println("\n");
        Ukulele ukulele = new Ukulele();
        ukulele.Show();
        ukulele.Desc();
        ukulele.History();
        ukulele.Sound();



        System.out.println("\n");
        int[] values = {10, 5, 8, 2, 7};
        Array array = new Array(values);
        System.out.println("Максимум: " + array.Max());
        System.out.println("Минимум: " + array.Min());
        System.out.println("Среднее: " + array.Avg());


        System.out.println("\n");
        int[] values2 = {10, 5, 8, 2, 7};
        ArrayForSort array2 = new ArrayForSort(values2);
        System.out.println("Исходный массив:");
        array2.printArray();
        System.out.println("Сортировка по возрастанию:");
        array2.SortAsc();
        array2.printArray();
        System.out.println("Сортировка по убыванию:");
        array2.SortDesc();
        array2.printArray();
    }

}