package org.example;

import java.util.ArrayList;

public class CheckBox extends Question {

    CheckBox(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        String correctAnswer = this.getTheAnswer();

        if (answer.equalsIgnoreCase(correctAnswer)) {
return true;
        }else
        { return false;
        }
    }
}
