public class BabiesHeight {
    public static void main(String[] args) {
        int[] height = {56, 48, 52, 60, 45, 50, 49, 55, 47, 53};

        int[] result = measureHeight(height);
        System.out.println("The two lowest heights are:");
        System.out.println("1st Lowest: " + result[0] + " cm");
        System.out.println("2nd Lowest: " + result[1] + " cm");
    }

    public static int[] measureHeight(int[] height) {
        int lowest = height[0];
        int secondLowest = height[0];

        for (int i = 0; i < height.length; i++) {
            if (height[i] < lowest) {
                secondLowest = lowest;
                lowest = height[i];
            } else if (height[i] < secondLowest && height[i] > lowest) {
                secondLowest = height[i];
            }
        }

        return new int[]{lowest, secondLowest};
    }
}

