package Exercises.MadLibs;

import java.util.Scanner;

public class MadLibVacation {
    public static void main(String[] args) {
        VacationStory();
    }

    public static void VacationStory() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a(n) 'adjective': ");
        String adj1 = scan.nextLine();
        System.out.print("Enter a(n) 'adjective': ");
        String adj2 = scan.nextLine();
        System.out.print("Enter a(n) 'noun': ");
        String noun1 = scan.nextLine();
        System.out.print("Enter a(n) 'noun': ");
        String noun2 = scan.nextLine();
        System.out.print("Enter a(n) 'plural noun': ");
        String pluralNoun = scan.nextLine();
        System.out.print("Enter a(n) 'game': ");
        String game = scan.nextLine();
        System.out.print("Enter a(n) 'plural noun': ");
        String pluralNoun2 = scan.nextLine();

        System.out.println();

        String combined = "A vacation is when you take a trip to some " + adj1 + " place\n" +
                "with your " + adj2 + " family. Usually you go to some place\n" +
                "that is near a/an " + noun1 + " or up on a/an " + noun2 + ".\n" +
                "A good vacation place is one where you can ride " + pluralNoun + "\n" +
                "or play " + game + " or go hunting for " + pluralNoun2 + ".";

        System.out.println("Here is your finished story! Hope you enjoy: ");
        System.out.println();
        System.out.println(combined);
    }
}
