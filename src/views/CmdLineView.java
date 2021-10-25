package views;

import java.util.Scanner;

public class CmdLineView {

    public CmdLineView() {

    }

    public void start() {
        System.out.println("This program gets student names from a file and automatically asigns a random grade.");
        System.out.println("------------------------------------------------------------------------------------\n\n");
    }

    public void printGrade(String name, int score, String grade) {
        System.out.println(name + ": Score: " + score + " Grade: " + grade);
        System.out.println("------------------------------------------------------------------------------------\n");
        //System.out.println();
    }

    public String getInput() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }
}
