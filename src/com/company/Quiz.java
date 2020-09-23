package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> listOfQuestions;
    private int correctAnswers;

    public Quiz() {
        this.listOfQuestions = new ArrayList<>();
        this.correctAnswers = 0;
    }

    public void addQuestions(Question newQuestion) {
        listOfQuestions.add(newQuestion);
    }

    public void runQuiz() {

        Scanner in = new Scanner(System.in);

        for (Question currentQ : listOfQuestions) {
            currentQ.displayQuestion();
            String input = in.nextLine();
            boolean guess = currentQ.isCorrect(input);
            if (guess) {
                System.out.println("correct\n");
                this.correctAnswers += 1;
            } else {
                System.out.println("incorrect\n");
            }
        }

        System.out.println("Score: " + this.correctAnswers + "/" + this.listOfQuestions.size());

    }


}
