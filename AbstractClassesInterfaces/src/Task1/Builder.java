package Task1;

public class Builder extends Human {
    private String specialization;

    public Builder(String name, int age, String gender, String specialization) {
        super(name, age, gender);
        this.specialization = specialization;
    }

    public void outputBuilder(){
        System.out.println("Имя - " + this.getName());
        System.out.println("Возраст - " + this.getAge());
        System.out.println("Пол - " + this.getGender());
        System.out.println("Специализация - " + this.specialization);
    }

    public void inputDataHuman(String name, int age, String gender, String specialization) {

        if (name == null || age == 0 || gender == null || specialization == null) {
            System.out.print("Все параметры должны быть не null");
            return;
        }
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
        this.specialization = specialization;
    }



    @Override
    public String toString() {
        return "Builder{" +
                "specialization='" + specialization + '\'' +
                '}';
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void work() {
        System.out.println(getName() + " работает строитель по специализации " + specialization);
    }
}
