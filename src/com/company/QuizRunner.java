package com.company;

public class QuizRunner {

    public static void main(String[] args) {

        MultipleChoice first = new MultipleChoice("What is my first name?", "Catherine");
        first.addOption("Catherine");
        first.addOption("Grace");
        first.addOption("Annie");

        Checkbox second = new Checkbox("What are the names of my cats?", "Dot and Artie");
        second.addOption("Gilbert and Sullivan");
        second.addOption("Doc and Marty");
        second.addOption("Dot and Artie");

        TrueFalse third = new TrueFalse("True or False: My eyes are brown", "True");
        third.addOption("True");
        third.addOption("False");

        Quiz firstQuiz = new Quiz();
        firstQuiz.addQuestions(first);
        firstQuiz.addQuestions(second);
        firstQuiz.addQuestions(third);

        firstQuiz.runQuiz();

    }

}
