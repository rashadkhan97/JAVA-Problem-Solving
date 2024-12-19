import java.util.Random;

public class MaxMinFromRandom {
    public static void main(String[] args) {
        int[] arr = randomValueGenerate(10, 1, 100);
        printArray(arr);

        int max = findMax(arr);
        int min =findMin(arr);

        System.out.println("Max value: "+max);
        System.out.println("Min value: "+min);


    }

    public static int[] randomValueGenerate(int number, int lowestNumber, int highestNumber) {
        Random random = new Random();
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(highestNumber - lowestNumber + 1) + lowestNumber;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.print("Generated Numbers: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}