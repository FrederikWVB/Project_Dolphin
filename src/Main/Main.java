package Main;

import Competitive.TopFiveCompetitive;
import Member.Member;
import Accounting.MembershipCalculation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Frederik Wandall von Benzon
 * @author Iqra Aliya Abbasi
 * @author Isabel Patulski Nielsen
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


        while (runProgram){
            UI.showMainMenu();

            switch (userInput.nextInt()) {
                case 1:
                    //TODO: Lav toString metode (evt. i Member class)
                    for (int i = 0; i < memberArrayList.size(); i++){
                        System.out.println(memberArrayList.get(i).getId() + " " + memberArrayList.get(i).getName() + " " + memberArrayList.get(i).getAge());
                    }
                    break;

                case 2:
                    UI.showDisciplineList();
                    switch (userInput.nextInt()) {
                        case 1:
                            TopFiveCompetitive.disciplineList("Butterfly");
                            break;
                        case 2:
                            TopFiveCompetitive.disciplineList("Crawl");
                            break;
                        case 3:
                            TopFiveCompetitive.disciplineList("Breaststroke");
                            break;
                        case 4:
                            TopFiveCompetitive.disciplineList("Backstroke");
                            break;
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
