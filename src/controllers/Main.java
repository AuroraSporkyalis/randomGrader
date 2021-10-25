package controllers;

import views.CmdLineView;
import models.fileInput;

public class Main {

    public static void main(String[] args) throws Exception {
        CmdLineView view = new CmdLineView();
        fileInput students = new fileInput("src/students.txt");

        view.start();

        String cont = "y";

        while(cont == "y" || cont == "Y") {
            for(int i = 0; i < students.studentCount; i++) {
                view.printGrade((students.getNames(i)), students.getScore(), students.getGrade());
            }
            view.getInput();
        }
    }
}
