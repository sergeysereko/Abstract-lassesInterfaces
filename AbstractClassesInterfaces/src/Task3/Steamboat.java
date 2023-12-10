package Task3;

public class Steamboat extends Device{
    private int speed;
    private double width;
    private double lenght;
    private double height;
    private int passengers;


    public Steamboat(String name, int speed, double width, double lenght, double height, int passengers) {
        super(name);
        this.speed = speed;
        this.width = width;
        this.lenght = lenght;
        this.height = height;
        this.passengers = passengers;
    }

    public Steamboat(String name, int speed, double width, double lenght, double height) {
        this(name, speed, width, lenght,height,500);
    }

    public Steamboat(String name, int speed, double width, double lenght) {
        this(name, speed, width, lenght,25.5);
    }

    public Steamboat(String name, int speed, double width) {
        this(name, speed, width, 120);
    }

    public Steamboat(String name, int speed) {
        this(name, speed,25.5);
    }

    public Steamboat(String name) {
        this(name, 60);
    }

    public Steamboat() {
        this("Сен-Филибер");
    }



    @Override
    public void Desc() {
        System.out.println("Описание парохода " + getName() + "\nСкорость - " + this.speed + " узлов" +
                "Ширина - " + this.speed + " метров" + "\nДлина - " + this.lenght + " метров" +
                "\nВысота - " + this.height + " метров" + "Количество пассажиров - " + this.passengers);
    }

    @Override
    public void Sound() {
        System.out.println("Издает гудок");
    }

    @Override
    public void Show() {
        System.out.println("Название парохода " + getName());
    }

    @Override
    public String toString() {
        return "Steamboat{" +
                "speed=" + speed +
                ", width=" + width +
                ", lenght=" + lenght +
                ", height=" + height +
                ", passengers=" + passengers +
                '}';
    }

    public int getSpeed() {
        return speed;
    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public double getHeight() {
        return height;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
