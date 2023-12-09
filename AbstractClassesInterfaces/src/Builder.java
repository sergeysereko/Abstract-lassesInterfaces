public class Builder extends Human{
    private String specialization;

    public Builder(String name, int age, String gender, String specialization) {
        super(name, age, gender);
        this.specialization = specialization;
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
