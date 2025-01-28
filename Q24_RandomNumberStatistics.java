public class Q24_RandomNumberStatistics {

    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        for (int num : numbers) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        RandomNumberStatistics stats = new RandomNumberStatistics();

        int[] randomNumbers = stats.generate4DigitRandomArray(5);

        double[] results = stats.findAverageMinMax(randomNumbers);

        System.out.println("Generated Random Numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }

        System.out.println("\nAverage: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
