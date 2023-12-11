package Task3;

public class Microwave extends Device {
    private int power;
    private String color;

    public Microwave(String name, int power, String color) {
        super(name);
        this.power = power;
        this.color = color;
    }
    public Microwave(String name, int power) {
      this(name,power,"Серебристый");
    }

    public Microwave(String name) {
        this(name,2500);
    }

    public Microwave() {
        this("Sumsung");
    }

    @Override
    public void Desc() {
        System.out.println("Описание микроволновки " + getName() + "\nМощность - " + this.power + " Вт" +
                "\nЦвет - " + this.color);
    }

    @Override
    public void Sound() {
        System.out.println("Издает характерный звук работы микроволновки");
    }

    @Override
    public void Show() {
        System.out.println("Название -" + getName());
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "power=" + power +
                ", color='" + color + '\'' +
                '}';
    }

    public int getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
