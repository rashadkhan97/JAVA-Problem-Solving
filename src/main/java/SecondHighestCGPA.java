public class SecondHighestCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double second_max = findSecondMax(cgpa);
        System.out.println("The Second Max CGPA is: " + second_max);
    }

    public static double findSecondMax(double[] cgpa) {
        double max = cgpa[0];
        double second_max = cgpa[0];
        for (int i = 0; i < cgpa.length; i++) {
            if (cgpa[i] > max) {
                second_max = max; // previous max [0], so now max is current second_max & max will be cgpa
                max = cgpa[i];
            } else if (cgpa[i] > second_max && cgpa[i] < max) {
                second_max = cgpa[i];
            }
        }
        return second_max;
    }
}