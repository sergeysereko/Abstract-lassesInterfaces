package Task6;

public class Array implements IMath {
    private int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    @Override
    public int Max() {
        if (array.length == 0) {
            System.out.println("Массив пуст");
        }
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    @Override
    public int Min() {
        if (array.length == 0) {
            System.out.println("Массив пуст");
        }

        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    @Override
    public double Avg() {
        if (array.length == 0) {
            System.out.println("Массив пуст");
        }

        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }
}
