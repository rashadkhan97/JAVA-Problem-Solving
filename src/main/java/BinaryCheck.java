import java.util.Scanner;

public class BinaryCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to determine if it's binary: ");
        String str = scanner.next();
        boolean status = true;

        for (int i = 0; i < str.length(); i++) {
            char chars = str.charAt(i);
            if (chars != '0' && chars != '1') {
                status = false;
                break;
            }
        }
        if (status) {
            System.out.println(str + " is a binary number");
        } else {
            System.out.println(str + " is not a binary number");
        }
        scanner.close();
    }
}
