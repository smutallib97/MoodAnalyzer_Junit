package com.bridgelabz.moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerTest {

        @Test
        public void givenMood_NullMood_ShouldReturnHAPPY(){

            MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
            String mood = moodAnalyzer.analyseMood();
            Assertions.assertEquals("HAPPY", "HAPPY");

        }
        @Test
        public void givenMood_NullMood_ShouldReturnSAD(){

            MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
            String mood = moodAnalyzer.analyseMood();
            Assertions.assertEquals("SAD", "SAD");

    }
}