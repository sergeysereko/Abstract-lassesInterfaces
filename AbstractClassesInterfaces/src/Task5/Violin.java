package Task5;

public class Violin extends MusicalInstrument{
    private String typeViolin;

    public Violin(String name, String typeViolin) {
        super(name);
        this.typeViolin = typeViolin;
    }

    public Violin(String name) {
      this(name, "Четыре четверти");
    }

    public Violin() {
        this("Амати");
    }
    @Override
    public void Desc() {
        System.out.println("Описание скрипки " + getName() + ": Тип - " + typeViolin);
    }

    @Override
    public void History() {
        System.out.println("История создания скрипки: Древнейший струнный инструмент");
    }

    @Override
    public void Sound() {
        System.out.println("Издает характерный звук скрипки");
    }

    @Override
    public void Show() {
        System.out.println("Название скрипки " + this.typeViolin);
    }

    @Override
    public String toString() {
        return "Violin{" +
                "typeViolin='" + typeViolin + '\'' +
                '}';
    }

    public String getTypeViolin() {
        return typeViolin;
    }

    public void setTypeViolin(String typeViolin) {
        this.typeViolin = typeViolin;
    }
}
