package org.example;

import java.util.HashMap;

public class MultipleChoice extends Question {


    public MultipleChoice(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        String correctAnswer = this.getTheAnswer();
        if (answer.equalsIgnoreCase(correctAnswer)) {
            return true;
        } else {
            return false;
        }
    }
}
