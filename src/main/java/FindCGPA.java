import java.util.Scanner;

public class FindCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.30, 3.32, 3.43, 3.48, 3.50, 3.52, 3.60, 3.63, 3.75, 3.86};

        Scanner sc = new Scanner(System.in);
        System.out.print("\nNow, Enter a CGPA to Find: ");
        double CGPA = sc.nextDouble();

        int result = binarySearch(cgpa, CGPA);

        if (result != -1) {
            System.out.println("CGPA: " + CGPA + " found");
        } else {
            System.out.println("CGPA: " + CGPA + " not found");
        }
        sc.close();
    }

    public static int binarySearch(double[] cgpa, double CGPA) {
        int left = 0;
        int right = cgpa.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (cgpa[mid] == CGPA) {
                return mid;
            }
            if (cgpa[mid] < CGPA) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
