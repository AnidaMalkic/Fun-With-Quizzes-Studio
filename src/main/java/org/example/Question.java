package org.example;

public abstract class Question {



    // class variables
 private final String theQuestion;

    private final String theAnswer;

 //constructor

    public Question(String question, String answer){
        this.theQuestion = question;
        this.theAnswer = answer;
    }


public String getTheQuestion() {
    return theQuestion;
}

    public String getTheAnswer() {
        return theAnswer;
    }
    //methods

 public abstract boolean checkAnswer(String answer);



}
