public class QuestionPaperMark {
    public static void main(String[] args) {
        int totalMarks = 100;
        int totalQuestions = 15;

        for (int i = 0; i <= totalQuestions; i++) {
            int j = totalQuestions - i;
            if ((5 * i + 10 * j) == totalMarks) {
                System.out.println("5 marks question is " + i);
                System.out.println("10 marks question is " + j);
                break;
            }
        }

    }
}
