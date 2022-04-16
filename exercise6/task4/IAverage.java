package exercise6.task4;

public interface IAverage {
    
    default double getMean(double[] numbers) {
        return calculateMean(numbers);
    }

    private double calculateMean(double[] numbers) {
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

    public double getAverage(double[] numbers);

}
