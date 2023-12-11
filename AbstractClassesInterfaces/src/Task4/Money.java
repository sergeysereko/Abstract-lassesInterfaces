package Task4;
import java.text.DecimalFormat;
public class Money {
    private int wholePart;
    private int fractionalPart;

    public Money(int wholePart, int fractionalPart) {
        this.wholePart = wholePart;
        this.fractionalPart = fractionalPart;
    }
    public Money(int wholePart) {
        this(wholePart,50);
    }

    public Money() {
        this(10);
    }



    public void printAmount() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Сумма: " + wholePart + "." + df.format(fractionalPart));
    }

    @Override
    public String toString() {
        return "Money{" +
                "wholePart=" + wholePart +
                ", fractionalPart=" + fractionalPart +
                '}';
    }

    public int getWholePart() {
        return wholePart;
    }

    public void setWholePart(int wholePart) {
        this.wholePart = wholePart;
    }

    public int getFractionalPart() {
        return fractionalPart;
    }

    public void setFractionalPart(int fractionalPart) {
        this.fractionalPart = fractionalPart;
    }


}
