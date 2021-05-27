package Main;

import Competitive.TopFiveCompetitive;
import Member.Member;
import Accounting.MembershipCalculation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Frederik Wandall von Benzon
 * @author Andrea Brinkbøl
 * @author Iqra Aliya Abbasi
 * @author Isabel Patulski Nielsen
 * @author Jens Christian Lund Jørgensen
 */

public class Main
{
    private static final ArrayList<Member> memberArrayList = Member.createMemberList();

    public static ArrayList<Member> getMemberArrayList() {
        return memberArrayList;
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        boolean runProgram = true;

        UI.programBanner();

        while (runProgram){
            UI.showMainMenu();

            switch (userInput.nextInt()) {
                case 1:
                    Member.printMemberlist(memberArrayList);
                    break;

                case 2:
                    UI.showDisciplineList();
                    switch (userInput.nextInt()) {
                        case 1 -> TopFiveCompetitive.disciplineList("Butterfly");
                        case 2 -> TopFiveCompetitive.disciplineList("Crawl");
                        case 3 -> TopFiveCompetitive.disciplineList("Breaststroke");
                        case 4 -> TopFiveCompetitive.disciplineList("Backstroke");
                    }
                    break;

                case 3: //Print kontingentpriser for medlemmer
                    MembershipCalculation.printMembersFee(memberArrayList);
                    break;

                case 10:
                    runProgram = false;
                    break;
            }
        }
    }
}
