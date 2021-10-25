package controllers;

public class Grade {
    private static String letterGrade;

    public static String getLetterGrade(int score) {
        if (score >= 90) {
            letterGrade = "A";
        }
        else if (score >= 80) {
            letterGrade = "B";
        }
        else if (score >= 70) {
            letterGrade = "C";
        }
        else if (score >= 60) {
            letterGrade = "D";
        }
        else {
            letterGrade = "F";
        }

        return letterGrade;
    }
}
