package org.example;

public class TrueOrFalse extends Question {


        TrueOrFalse(String question, String answer) {
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
