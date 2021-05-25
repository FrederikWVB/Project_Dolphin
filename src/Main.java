import Member.Member;
import Accounting.MembershipCalculation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    static final ArrayList<Member> memberArrayList = Member.createMemberList();

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        boolean runProgram = true;


        while (runProgram){
            UI.showMainMenu();

            switch (userInput.nextInt()) {
                case 1:
                    System.out.println("View memberlist");
                    for (int i = 0; i < memberArrayList.size(); i++){
                        System.out.println(memberArrayList.get(i).getId() + " " + memberArrayList.get(i).getName() + " " + memberArrayList.get(i).getAge());
                    }
                    break;

                case 2:
                    System.out.println("Skriv discipline");
                    switch (userInput.nextInt()) {
                        case 1:
                            System.out.println("View ButterflyList");
                            DisciplineManager.collectDisciplineList("butterfly");
                            break;
                        case 2:
                            System.out.println("View Crawl");
                            DisciplineManager.collectDisciplineList("Crawl");
                            break;
                        case 3:
                            System.out.println("View Backstroke");
                            DisciplineManager.collectDisciplineList("Backstroke");
                            break;
                        case 4:
                            System.out.println("View Breaststroke");
                            DisciplineManager.collectDisciplineList("Breaststroke");
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

        //ArrayList<CompetitionDataCollector> disclist = CompetitionDataCollector.competitionCollector(5, "butterfly");


    }
}
