package Task5;

public class Ukulele extends MusicalInstrument{
    private String housingMaterial; // материал корпуса

    public Ukulele(String name, String housingMaterial) {
        super(name);
        this.housingMaterial = housingMaterial;
    }
    public Ukulele(String name) {
        this(name,"Красное дерево");
    }

    public Ukulele() {
        this("Укулеле - Waterman");
    }
    @Override
    public void Desc() {
        System.out.println("Описание укулеле " + getName() + ": Материал корпуса - " + housingMaterial);
    }

    @Override
    public void History() {
        System.out.println("История создания укулеле: Традиционный струнный инструмент Гавайев");
    }

    @Override
    public void Sound() {
        System.out.println("Издает характерный звук укулеле");
    }

    @Override
    public void Show() {
        System.out.println("Название " + this.getName());
    }

    @Override
    public String toString() {
        return "Ukulele{" +
                "housingMaterial='" + housingMaterial + '\'' +
                '}';
    }

    public String getHousingMaterial() {
        return housingMaterial;
    }

    public void setHousingMaterial(String housingMaterial) {
        this.housingMaterial = housingMaterial;
    }
}
