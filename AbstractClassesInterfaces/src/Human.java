class Human {
    private String name;
    private int age;
    private String gender;


    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Human(String name, int age) {
        this(name,age,"муж.");
    }
    public Human(String name) {
        this(name,30);
    }

    public Human() {
        this("Олег");
    }

    public void inputHuman(String name, int age, String gender){
        if(name == null || age == 0 || gender == null){
            System.out.print("Все параметры должны быть не null");
            return;
        }
        this.name = name;
        this.age = age;
        this.gender = gender;

    }


    public void outputHuman(){
        System.out.println("Имя - " + this.name);
        System.out.println("Возраст - " + this.age);
        System.out.println("Пол - " + this.gender);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}