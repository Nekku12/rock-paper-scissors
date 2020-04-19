
package fi.company;

/*public class Main {
    public static void main(String [] args) {
        System.out.println("hei maailma");
    }
} */

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        Scanner syote = new Scanner(System.in);

        String [] kone = {"kivi","paperi","sakset"};

        for(int i = 0; i < 3; i++) {
            System.out.println("Anna kivi, paperi tai sakset");
            String otos1 = syote.nextLine();

            // number holds 0, 1 or 2.
            int number = (int) (Math.random() * 3);
            String otos2 = kone[number];

            if (otos1.equals(otos2)) {
                System.out.println("tasapeli");
            } else if (((otos1.equals("sakset")) && (otos2.equals("kivi"))) ||
                    ((otos1.equals("paperi")) && (otos2.equals("sakset"))) ||
                    ((otos1.equals("kivi")) && (otos2.equals("paperi")))) {
                System.out.println("Tietokone voitti");
            } else if (((otos1.equals("kivi")) && (otos2.equals("sakset"))) ||
                    ((otos1.equals("sakset")) && (otos2.equals("paperi"))) ||
                    ((otos1.equals("paperi")) && (otos2.equals("kivi")))) {
                System.out.println("Pelaaja voitti");
            }
        }
    }
}