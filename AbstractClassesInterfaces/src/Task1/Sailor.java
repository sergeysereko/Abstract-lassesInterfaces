package Task1;
public class Sailor extends Human {
    private String rank;
    public Sailor(String name, int age, String gender, String rank) {
        super(name, age, gender);
        this.rank = rank;
    }

    public Sailor() {
        super();
        this.rank = "Мичман";
    }


    public void outputSailor(){
        System.out.println("Имя - " + this.getName());
        System.out.println("Возраст - " + this.getAge());
        System.out.println("Пол - " + this.getGender());
        System.out.println("Ранг - " + this.rank);
    }

    public void inputSailor(String name, int age, String gender, String rank) {

        if (name == null || age == 0 || gender == null || rank == null) {
            System.out.print("Все параметры должны быть не null");
            return;
        }
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
        this.rank = rank;
    }

    public void sail() {
        System.out.println(getName() + " служит на корабле в ранге " + rank);
    }

    @Override
    public String toString() {
        return "Sailor{" +
                "rank='" + rank + '\'' +
                '}';
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }


}