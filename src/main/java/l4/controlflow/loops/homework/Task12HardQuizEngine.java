package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task12HardQuizEngine {

    private static final String[] questions = {
            "1) Which keyword in Java is used to prevent a class from being subclassed?",
            "2) What is the default value of an uninitialized boolean field in a Java class?",
            "3) Which of the following collections in Java maintains insertion order?",
            "4) What happens if you call wait() on an object without holding its monitor lock?",
            "5) Which of the following is NOT a valid functional interface in java.util.function?"
    };

    private static final String[][] options = {
            {"A) sealed", "B) static", "C) abstract", "D) final", "E) const"},
            {"A) true", "B) false", "C) null", "D) 0", "E) undefined"},
            {"A) HashSet", "B) TreeSet", "C) HashMap", "D) PriorityQueue", "E) LinkedHashSet"},
            {"A) IllegalMonitorStateException", "B) InterruptedException", "C) Deadlock", "D) Nothing happens", "E) RuntimeException"},
            {"A) Predicate", "B) Supplier", "C) Comparator", "D) Consumer", "E) Function"}
    };

    private static final char[] correctAnswers = {'D', 'B', 'E', 'A', 'C'};

    private static final Scanner sc = new Scanner(System.in);

    private static int score;

    public static void main(String[] args) {
        startQuiz();
    }

    static void startQuiz(){
        char choice = ' ';
        askQuestion();
        while(choice != 'N'){
            System.out.println("Do you want to restart? (Y/N)");
            choice = sc.nextLine().trim().toUpperCase().charAt(0);
            if(choice == 'Y'){
                score = 0;
                askQuestion();
            }else if(choice == 'N'){
                sc.close();
                System.out.println("Exiting ...");
            }else{
                System.out.println("Invalid choice.");
            }
        }
    }

    static void askQuestion(){
        char answer = 'A';
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < options.length; j++) {
                System.out.println(options[i][j]);
            }
            System.out.println("----------------------------------------------------------------------------------");
            while(true){
                System.out.println("Your answer: (A-E)");
                answer = sc.nextLine().trim().toUpperCase().charAt(0);
                if(answer >= 'A' && answer <= 'E'){
                    break;
                }else{
                    System.out.println("Invalid answer.");
                }
            }
            System.out.println("----------------------------------------------------------------------------------");
            if(isCorrectAnswer(String.valueOf(answer), String.valueOf(correctAnswers[i]))){
                score+=20;
            }else{
                score-=5;
            }
        }
        printFinalReport();
    }

    static boolean isCorrectAnswer(String answer, String correctAnswer){
        return answer.equalsIgnoreCase(correctAnswer);
    }

    static void printFinalReport(){
        System.out.println("Final Score: " + score);
        if(score >= 0 && score <= 20){
            System.out.println("Your Grade is: E");
        }else if(score >= 20 && score <= 40){
            System.out.println("Your Grade is: D");
        }else if(score >= 40 && score <= 60){
            System.out.println("Your Grade is: C");
        }else if(score >= 60 && score <= 80){
            System.out.println("Your Grade is: B");
        }else if(score >= 80 && score <= 100){
            System.out.println("Your Grade is: A");
        }else{
            System.out.println("Your Grade is: F");
        }
    }

}
