package exercise6.task4;

public class Runner {
    
    public static void main(String[] args) {
        double[] array = { 0.1, 2.9, 5.8, 2.4, 0.3, 7.4 };

        Mean test = new Mean();
        System.out.println(test.getMean(array));


        IAverage average = (values) -> {
            var mean = 0.0;
            for(int i = 0; i < values.length; i++)
            {
                mean += values[i];
            }
            mean /= values.length;
            return mean;
        };
        System.out.println(average.getAverage(array));

    }

}
