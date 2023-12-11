package Task5;

public class Trombone extends MusicalInstrument {
    private int numberOfValves; // количество клапанов

    public Trombone(String name, int numberOfValves) {
        super(name);
        this.numberOfValves = numberOfValves;
    }

    @Override
    public void Desc() {
        System.out.println("Описание тромбона " + getName() + ": Количество клапанов - " + numberOfValves);
    }

    @Override
    public void History() {
        System.out.println("История создания тромбона: Старинный духовой инструмент");
    }

    @Override
    public void Sound() {
        System.out.println("Издает характерный звук тромбона");
    }

    @Override
    public void Show() {
        System.out.println("Название инструмента " + getName());
    }

    @Override
    public String toString() {
        return "Trombone{" +
                "numberOfValves=" + numberOfValves +
                '}';
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }
}
