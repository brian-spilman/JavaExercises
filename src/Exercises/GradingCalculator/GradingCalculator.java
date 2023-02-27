package Exercises.GradingCalculator;

import java.util.Scanner;

public class GradingCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade;
        boolean flag;
        char check;
        do {
            System.out.print("Input grade percentage: ");
            grade = scan.nextInt();
            Grader(grade);
            System.out.print("Continue grading? (y/n): ");
            check = scan.next().charAt(0);
            if(check == 'y') flag = true;
            else flag = false;

        } while(flag);
    }

    public static void Grader(int grade) {
        if(grade >= 93) System.out.println("A");
        else if(grade >= 90) System.out.println("A-");
        else if(grade >= 87) System.out.println("B+");
        else if(grade >= 83) System.out.println("B");
        else if(grade >= 81) System.out.println("B-");
        else if(grade >= 77) System.out.println("C+");
        else if(grade >= 73) System.out.println("C");
        else if(grade >= 70) System.out.println("C-");
        else if(grade >= 65) System.out.println("D");
        else System.out.println("F");
    }
}
