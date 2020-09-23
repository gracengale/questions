package com.company;

import java.util.ArrayList;

public abstract class Question {

    private String prompt;
    private final ArrayList<String> options;
    private final String answer;

    public Question(String prompt, String answer) {
        this.prompt = prompt;
        this.answer = answer;
        this.options = new ArrayList<>();
    }

    public String getPrompt() {
        return this.prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void addOption(String option) {
        options.add(option);
    }

    public String getAnswer() {
        return this.answer;
    }

    public void displayQuestion() {

        System.out.println(this.prompt + ":");

        for (String option : this.options) {
            System.out.println(option);
        }

    }

    public boolean isCorrect(String input) {
        String caseAnswer = (this.getAnswer()).toLowerCase();
        String caseInput = input.toLowerCase();
        return caseInput.equals(caseAnswer);
    }

}
