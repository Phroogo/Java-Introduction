package net.adam;

import java.util.Scanner;

public class TriviaGame {

    public static void main(String[] args) {
        int score = 0;

        String[] que = new String[3];
        que[0] = "How many States does the USA have?";
        que[1] = "What is the Capital of the United Kingdom";
        que[2] = "What is the chemical symbol for Iron";
        que[3] = "How High is Mount Everest? (Answer in km)";
        que[4] = "What is the Answer to Life, the Universe and Everything?";

        String[] ans = new String[3];
        ans[0] = "50";
        ans[1] = "london";
        ans[2] = "fe";
        ans[3] = "8848";
        ans[4] = "42";

        triviaGame(que, ans, score);

        while(wantsToContinue()){
            triviaGame(que, ans, score);
            score = 0;
        }

    }

    public static void triviaGame(String[] questions, String[] answers, int score) {
        System.out.println("Welcome to the trivia game!");
        System.out.println("");

        for(int i = 0; i < questions.length; i++){
            int t = i + 1;
            System.out.println(questions[i]);
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            input = input.toLowerCase();
            if(i == questions.length - 1 && input.equals(answers[i])) {
                score = scoreIncrease(score);
                System.out.println("That is correct! Your final score is " + score + "/" + t + " points. If you'd like to play again type 'continue'");
                break;
            } else if(i == questions.length - 1 && !input.equals(answers[i])){
                System.out.println("That is incorrect, the answer was " + answers[i] + ". Your final score is " + score + "/" + t + " point/s. If you'd like to continue type 'continue'");
                break;
            }

            if(input.equals(answers[i])) {
                score = scoreIncrease(score);
                System.out.println("That is correct! Your current score is " +  score + "/" + t + " points. On to the next question!");
                System.out.println("");
            } else{
                System.out.println("That is incorrect, the answer was " + answers[i] + ". Your current score is " +  score + "/" + t + " points. On to the next question!");
                System.out.println("");
            }
        }
    }
    public static boolean wantsToContinue() {
        boolean wantsToContinue;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        input = input.toLowerCase();
        wantsToContinue = input.equals("continue");
        return wantsToContinue;
    }
    public static int scoreIncrease(int score) {
        return score + 1;
    }
}
