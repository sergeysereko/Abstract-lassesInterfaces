package Task2;

public class Kangaroo extends Animal {
    private int lengthJump;

    public Kangaroo(String name, int lengthJump) {
        super(name);
        this.lengthJump = lengthJump;
    }
    public Kangaroo() {
        super();
        this.lengthJump = 12;
    }

    public void inputKangaroo(String name, int lengthJump){
        if(name == null || lengthJump == 0){
            System.out.print("Все параметры должны быть не null");
            return;
        }
        super.setName(name);
        this.lengthJump = lengthJump;
    }

    public void outputKangaroo(){
        System.out.println("Вид животного  - " + this.getName());
        System.out.println("Длина прыжка - " + this.lengthJump);
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "lengthJump=" + lengthJump +
                '}';
    }

    public int getLengthJump() {
        return lengthJump;
    }

    public void setLengthJump(int lengthJump) {
        this.lengthJump = lengthJump;
    }


    @Override
    public void makeASound() {
        System.out.println(getName() + " издает харктерные звуки кенгуру");
    }


    public void jump() {
        System.out.println(getName() + " прыгает");
    }
}
