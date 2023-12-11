package Task4;

public class Product {
    private String name;
    private Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }
    public Product(String name) {
        this(name,new Money(10, 50));
    }

    public Product() {
        this("Хлеб");
    }

    // Метод для уменьшения цены на заданное число
    public void reducePrice(int amount) {
        int currentFractionalPart = price.getFractionalPart() - amount;

        // Проверка и коррекция дробной части, чтобы она оставалась положительной
        while (currentFractionalPart < 0) {
            currentFractionalPart += 100; //если используются копейки
            price.setWholePart(price.getWholePart() - 1);
        }

        price.setFractionalPart(currentFractionalPart);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }


}
