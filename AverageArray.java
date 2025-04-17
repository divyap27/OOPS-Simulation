public class AverageArray {
    public static void main(String[] args) {
        double[] arr = {3.5, 7.2, 4.8, 9.0};
        double sum = 0;

        for (double num : arr) {
            sum += num;
        }

        double average = sum / arr.length;
        System.out.println("Average value: " + average);
    } 
}
