import java.util.Scanner;

public class QuestionService {
 
    Question[] questions = new Question[5];
    
    String[] selectedAnswers = new String[5];

    public QuestionService() {
        
        questions[0] = new Question(1, "What is the capital of France?", "Paris", "London", "Paris", "Madrid", "Rome");
        
        questions[1] = new Question(2, "What is 2 + 2?", "4", "3", "5", "4", "7");
        
        questions[2] = new Question(3, "What is the largest planet in our solar system?", "Jupiter", "Jupiter", "Mars", "Saturn", "Venus");
       
        questions[3] = new Question(4, "Who wrote 'Hamlet'?", "Shakespeare", "Dante", "Shakespeare", "Goethe", "Homer");
        
        questions[4] = new Question(5, "What is the boiling point of water?", "100°C", "90°C", "80°C", "110°C", "100°C");
    }
     

    public void displayQuestions() {
        
        int i = 0;
        for (Question q : questions) {
            System.out.println("Q" + q.getId() + ": " + q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your answer: ");
            selectedAnswers[i] = scanner.nextLine();
            i++;
        }
    }

    public void printScore(){
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
        String correctAnswer = questions[i].getAnswer();
        String userAnswer = selectedAnswers[i];
        if (correctAnswer.equals(userAnswer)) {
            score++;
        }
       }
       System.out.print("Total Score: " + score + " out of " + questions.length);
    }

}
