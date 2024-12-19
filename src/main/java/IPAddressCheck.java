import java.util.Scanner;

public class IPAddressCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid IP address: ");
        String ipAdd = sc.next();

        if (CheckIP(ipAdd)) {
            System.out.println("Valid IP");
        } else {
            System.out.println("Invalid IP");
        }
        sc.close();

    }

    public static boolean CheckIP(String ipAdd) {

        String[] parts = ipAdd.split("\\.");
        if (parts.length != 4) {
            return false;
        }

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];

            int value;
            try {
                value = Integer.parseInt(part);
            } catch (NumberFormatException e) {
                return false;
            }

            if (value < 0 || value > 255) {
                return false;
            }
            if (i == 0 && (value == 0 || part.length() == 1)) {
                return false;
            }
        }
        return true;

    }
}
