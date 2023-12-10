package Task3;

public class Kettle extends Device{

    private double volume;
    private String color;
    private int power;

    public Kettle(String name, double volume, String color, int power) {
        super(name);
        this.volume = volume;
        this.color = color;
        this.power = power;
    }

    public Kettle(String name, double volume, String color) {
        this(name, volume, color, 1800);
    }

    public Kettle(String name, double volume) {
        this(name, volume, "Белый");
    }

    public Kettle(String name) {
        this(name, 2);
    }

    public Kettle() {
        this("Чайник Tefal");
    }


    @Override
    public void Desc() {
        System.out.println("Описание чайника " + getName() + "\nОбъем - " + this.volume + " литров " +
                "\nЦвет - " + this.color + "\nМощность - " + this.power);
    }

    @Override
    public void Sound() {
        System.out.println("Издает характерный звук закипающего чайника");
    }

    @Override
    public void Show() {
        System.out.println("Название - " + getName());
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "volume=" + volume +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }

    public double getVolume() {
        return volume;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
