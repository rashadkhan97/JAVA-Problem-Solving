public class CountNote {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int amount = 546;
        countNotes(notes, amount);
    }

    public static void countNotes(int[] notes, int amount) {
        System.out.println("Breakdown of the amount: " + amount);

        for (int note : notes) {
            if (amount >= note) {
                int count = amount / note;
                amount = amount % note;
                System.out.println(note + " " + count);
            }
        }
    }
}

