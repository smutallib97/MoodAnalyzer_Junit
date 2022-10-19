package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    private String Mood;

    public MoodAnalyzer(){
    }
    public MoodAnalyzer(String Mood){
        this.Mood = Mood;
    }
    public String analyseMood(){
        try{
            if(this.Mood.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException e){
            return "HAPPY";
        }
    }
}
