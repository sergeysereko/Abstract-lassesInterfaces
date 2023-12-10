package Task3;

public class Car extends Device{
    private String model;
    private String color;
    private int power;
    private double volume;
    private String transmission;


    public Car(String name, String model, String color, int power, double volume, String transmission) {

        super(name);
        this.model = model;
        this.color = color;
        this.power = power;
        this.volume = volume;
        this.transmission = transmission;
    }

    public Car(String name, String model, String color, int power, double volume) {

        this(name,model,color,power,volume,"Механическая");
    }

    public Car(String name, String model, String color, int power) {

        this(name,model,color,power,2.2);
    }

    public Car(String name, String model, String color) {

        this(name,model,color,82);
    }

    public Car(String name, String model) {

        this(name,model,"Белый");
    }

    public Car(String name) {

        this(name,"Vito 638");
    }

    public Car() {

        this("MERCEDES-BENZ");
    }



    @Override
    public void Desc() {
        System.out.println("Описание автомобиля " + getName() + "\nМодель - " + this.model +
                "\nЦвет - " + this.color + "\nМощность - " + this.power + "\nОбъем - " + this.volume +
                "\nКоробка передач - " + this.transmission);
    }

    @Override
    public void Sound() {
        System.out.println("Издает характерный звук работающего двигателя");
    }

    @Override
    public void Show() {
        System.out.println("Название автомобиля " + getName());
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                ", volume=" + volume +
                ", transmission='" + transmission + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public double getVolume() {
        return volume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
