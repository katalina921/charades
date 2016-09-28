package com.academy.app.charades;

public class Questions {

    private static Questions questions;
    private String[] answers;

    private Questions() {
        answers = new String[] {
                "Brushing your teeth.",
                "Singing"

        };
    }
    public static Questions get(){
        if(questions == null){
            questions = new Questions();
        }
         return questions;
    }

    public String getQuestion(){
        return answers[1];
    }
}
