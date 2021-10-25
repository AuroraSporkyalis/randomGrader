package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controllers.Grade;

public class fileInput {

    public static List<String> name = new ArrayList<String>();
    public static String[] names;

    private int score;
    private String grade;

    public int studentCount;
    private String fileName;
    

    public fileInput(String fileTitle) throws Exception {
        this.fileName = fileTitle;

        java.io.File file = new java.io.File(fileName);
        Scanner input = new Scanner(file);

        while(input.hasNext()) {
            name.add(input.nextLine());
            studentCount++;
        }
        names = name.toArray(new String[name.size()]);
        input.close();
    }

    public int getScore() {
        this.score = (int)(Math.random() * 100);
        return score;
    }
    

    public String getGrade() {
        this.grade = Grade.getLetterGrade(score);
        return grade;
    }

    public String getNames(int i) {
        return names[i];
    }

}