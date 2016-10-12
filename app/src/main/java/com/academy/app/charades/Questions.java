package com.academy.app.charades;

import java.util.Random;

public class Questions {

    private static Questions questions;
    private String[] answers;
    public Random rand = new Random();
    public int randInt = 0;


    private Questions() {
        answers = new String[] {
                "Brushing your teeth.",
                "Singing",
                "DO A BARREL ROLL",
                "Fishing",
                "Dancing",
                "The Robot",
                "The Macorena",
                "Sleeping"

        };
    }
    public static Questions get(){
        if(questions == null){
            questions = new Questions();
        }
         return questions;
    }

    public String getQuestion(){
        randInt = rand.nextInt(answers.length);
        return answers[randInt];
    }
}
