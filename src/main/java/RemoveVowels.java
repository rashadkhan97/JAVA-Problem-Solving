public class RemoveVowels {
    public static void main(String[] args) {

        String input = "I am a SQA Engineer";

        String lowercase = input.toLowerCase();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < lowercase.length(); i++) {
            char ch = lowercase.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                output.append(ch);
            }
        }

        String finalOutput = output.toString().replaceAll(" +", " ").trim();

        System.out.println("Input: "+input);
        System.out.println("Output: " + finalOutput);

    }
}