package com.example.makharij_app;

public class QuestionLibrary {
    private String mQuestions [] = {
            "One side of the tongue touching the molar teeth?",
            "Which one is Tarfiyah?",
            "Which one is Nit-eeyah",
            "Which one is Lisaveyah"

    };


    private String mChoices [][] = {
            {"ض", "ن", "ع"},
            {"ن", "ل", "ع"},
            {"ل", "ط", "ض"},
            {"ل", "ض", "ظ"}
    };



    private String mCorrectAnswers[] = {"ض", "ل", "ط", "ظ"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
