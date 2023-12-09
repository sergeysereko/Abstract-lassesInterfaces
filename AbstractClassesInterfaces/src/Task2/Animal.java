package Task2;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        this("Волк");
    }

    public void InputAnimal(String name) {
        if(name == null)
        {
            System.out.print("Все параметры должны быть не null");
            return;
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public void outputAnimal(){
        System.out.println("Имя - " + this.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeASound() {
        System.out.println("Животное издает какой-то звук");
    }
}
