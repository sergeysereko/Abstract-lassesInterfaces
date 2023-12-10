package Task3;
public class Device {
    private String name;

    public Device(String name) {
        this.name = name;
    }

    public Device() {
        this("Тестовое устройство");
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                '}';
    }


    public void Sound() {
        System.out.println("Устройство издает какой-то звук");
    }

    public void Show() {
        System.out.println("Название устройства: " + name);
    }

    public void Desc() {
        System.out.println("Описание устройства: Общее устройство");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
