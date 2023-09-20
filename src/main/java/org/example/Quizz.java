package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Quizz {

   // class variables
private ArrayList<Question> questions = new ArrayList<Question>();
private int correctAnswersPoints = 0;

private Scanner scanner = new Scanner(System.in);


//constructor
public Quizz() {

}
//methods
   public void addQuestion(Question question) {
    this.questions.add(question);
   }

   public void runQuiz(){

    for (Question question: questions) {

        System.out.println(question.getTheQuestion());

        String userAnswer = this.getUserAnswers();

        boolean userGotCorrectAnswer = question.checkAnswer(userAnswer);

        if (userGotCorrectAnswer){
            correctAnswersPoints++;
        }

        double percentageCorrect =((double) this.correctAnswersPoints / this.questions.size()) * 100;
        System.out.println("User grade " + percentageCorrect + "%");

   }


}

    private String getUserAnswers() {

        String userAnswer = scanner.nextLine();
        return userAnswer;
    }
    }
