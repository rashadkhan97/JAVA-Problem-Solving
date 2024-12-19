import java.util.Arrays;

public class DigitExtractFromParagraph {
    public static void main(String[] args) {

        String str = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk." +
                "If I buy the laptop and 1 piece mouse," +
                "what will be my total cost after giving 15% discount?";
        str = str.replaceAll("\\D", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] paraArr = str.split(" ");
        System.out.println("Digits after extraction: " + Arrays.toString(paraArr));

        int laptopPrice = 85000;
        int mousePrice = 2500;
        int mouseQuantity = 1;
        int totalPrice = laptopPrice + (mousePrice * mouseQuantity);

        double discount = 0.15;
        double priceAfterDiscount = totalPrice - (totalPrice * discount);

        System.out.println("Final price is: " + priceAfterDiscount + " bdt");

    }
}
