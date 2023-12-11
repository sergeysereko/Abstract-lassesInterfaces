package Task5;

public class Cello extends MusicalInstrument {
    private double lengthNeck; // длина грифа

    public Cello(String name, double lengthNeck) {
        super(name);
        this.lengthNeck = lengthNeck;
    }

    public Cello(String name) {
       this(name, 255.0);
    }

    public Cello() {
        this("Виолончель Rafaga XS-C050");
    }
    @Override
    public void Desc() {
        System.out.println("Описание виолончели " + getName() + ": Длина грифа - " + lengthNeck);
    }

    @Override
    public void History() {
        System.out.println("История создания виолончели: Струнный инструмент с богатой историей");
    }

    @Override
    public void Sound() {
        System.out.println("Издает характерный звук виолончели");
    }

    @Override
    public void Show() {
        System.out.println("Название " + getName());
    }

    @Override
    public String toString() {
        return "Cello{" +
                "lengthNeck=" + lengthNeck +
                '}';
    }

    public double getLengthNeck() {
        return lengthNeck;
    }

    public void setLengthNeck(double lengthNeck) {
        this.lengthNeck = lengthNeck;
    }
}
