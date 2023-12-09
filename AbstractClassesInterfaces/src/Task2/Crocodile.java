package Task2;

public class Crocodile extends Animal {
    private double lengthTail ;
    public Crocodile(String name, int lengthTail) {
        super(name);
        this.lengthTail = lengthTail;
    }

    public Crocodile() {
        super();
        this.lengthTail = 1.8;
    }


    public void inputCrocodile(String name, double lengthTail){
        if(name == null || lengthTail == 0){
            System.out.print("Все параметры должны быть не null");
            return;
        }

        super.setName(name);
        this.lengthTail = lengthTail;
    }

    public void Output(){
        System.out.println("Вид животного  - " + this.getName());
        System.out.println("Длина хвоста - " + this.lengthTail);
    }

    @Override
    public String toString() {
        return "Crocodile{" +
                "lengthTail=" + lengthTail +
                '}';
    }

    public double getLengthTail() {
        return lengthTail;
    }

    public void setLengthTail(double lengthTail) {
        this.lengthTail = lengthTail;
    }


    @Override
    public void makeASound() {
        System.out.println(getName() + " издает характерный звук");
    }


    public void swimToRiver() {
        System.out.println(getName() + " плывёт по реке");
    }
}
