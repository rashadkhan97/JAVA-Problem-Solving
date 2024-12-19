public class TransactionIdExtract {
    public static void main(String[] args) {

        String str = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Transactions</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div>\n" +
                "        <div class=\"button\">\n" +
                "            <p>Transaction Id: TXN1234</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";

        int Index = str.indexOf("Transaction Id: ");
        if (Index != -1) {
            int LastIndex = str.indexOf("</p>", Index);
            String TrnxId = str.substring(Index, LastIndex).trim();
            System.out.println(TrnxId);
        } else {
            System.out.println("Transaction Id not found");
        }

    }
}
