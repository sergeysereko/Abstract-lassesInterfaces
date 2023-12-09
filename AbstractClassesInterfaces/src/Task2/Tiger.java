package Task2;

public class Tiger extends Animal {
    private String colorStripes ;

    public Tiger(String name, String colorStripes) {
        super(name);
        this.colorStripes = colorStripes;
    }

    public Tiger() {
        super();
        this.colorStripes = "Черные полоски";
    }


    public void inputTiger(String name, String colorStripes){
        if(name == null || colorStripes == null){
            System.out.print("Все параметры должны быть не null");
            return;
        }
        super.setName(name);
        this.colorStripes = colorStripes;
    }

    public void outputTiger(){
        System.out.println("Вид животного  - " + this.getName());
        System.out.println("Цвет полосок - " + this.colorStripes);
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "colorStripes='" + colorStripes + '\'' +
                '}';
    }

    public String getСolorStripes() {
        return colorStripes;
    }

    public void setСolorStripes(String colorStripes) {
        this.colorStripes = colorStripes;
    }


    @Override
    public void makeASound() {
        System.out.println(getName() + " рычит");
    }

    public void hunt() {
        System.out.println(getName() + " охотится на дичь");
    }
}
