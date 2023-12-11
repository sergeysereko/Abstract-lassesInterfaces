package Task5;

public class MusicalInstrument {
    private String name;

    public MusicalInstrument(String name) {
        this.name = name;
    }
    public MusicalInstrument() {
        this("Электрогитара");
    }

    public void Sound() {
        System.out.println("Инструмент издает какой-то звук");
    }

    public void Show() {
        System.out.println("Название инструмента: " + name);
    }

    public void Desc() {
        System.out.println("Описание инструмента: Общий музыкальный инструмент");
    }

    public void History() {
        System.out.println("История создания инструмента: Неизвестно");
    }

    @Override
    public String toString() {
        return "MusicalInstrument{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
