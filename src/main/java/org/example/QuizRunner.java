package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class QuizRunner {
    public static void main(String[] args) {

        Quizz theQuiz = new Quizz();

        MultipleChoice theMultiChoiceQuiz = new MultipleChoice("how many states does the USA have? \na: 40 \nb: 50 \nc: 60 the answer should be a single letter", "b");
        theQuiz.addQuestion(theMultiChoiceQuiz);


        CheckBox theCheckBoxQuiz = new CheckBox("Which animals can fly? \nA: bears, \nB:birds, \nC: crocodiles", "B");
        theQuiz.addQuestion(theCheckBoxQuiz);

        TrueOrFalse theTrueFalseQuiz = new TrueOrFalse("sharks are the most dangerous mamals \n True or False", "false");
        theQuiz.addQuestion(theTrueFalseQuiz);

        theQuiz.runQuiz();

    }
}