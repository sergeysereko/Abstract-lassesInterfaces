package Task1;

public class Pilot extends Human {
    private String licenseType;

    public Pilot(String name, int age, String gender, String licenseType) {
        super(name, age, gender);
        this.licenseType = licenseType;
    }


    public Pilot() {
        super();
        this.licenseType = "Частный пилот";
    }


    public void outputPilot(){
        System.out.println("Имя - " + this.getName());
        System.out.println("Возраст - " + this.getAge());
        System.out.println("Пол - " + this.getGender());
        System.out.println("Тип лицензии - " + this.licenseType);
    }

    public void inputPilot(String name, int age, String gender, String licenseType) {

        if (name == null || age == 0 || gender == null || licenseType == null) {
            System.out.print("Все параметры должны быть не null");
            return;
        }
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
        this.licenseType = licenseType;
    }

    public void fly() {
        System.out.println(getName() + " летает по лицензии " + licenseType);
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "licenseType='" + licenseType + '\'' +
                '}';
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }



}