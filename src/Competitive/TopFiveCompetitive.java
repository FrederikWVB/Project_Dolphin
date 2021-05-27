package Competitive;

import java.util.ArrayList;
import java.util.Collections;

import Main.Main;
/**
 * @author Frederik Wandall von Benzon
 * @author Andrea Brinkbøl
 */

public class TopFiveCompetitive {

    public static void disciplineList(String discipline){

        //ArrayList<Competitive.CompetitionDataCollector> completeDisciplineList = new ArrayList<>();

        ArrayList<Competitor> juniorList = new ArrayList<>();
        ArrayList<Competitor> seniorList = new ArrayList<>();

        for (int i = 0; i < Main.getMemberArrayList().size(); i++){
            if(!Main.getMemberArrayList().get(i).isCompetitive()){
                continue;
            }
            else if (Main.getMemberArrayList().get(i).getAge() < 18){
                juniorList.addAll(CompetitionDataCollector.competitionCollector(Main.getMemberArrayList().get(i).getId(), Main.getMemberArrayList().get(i).getAge(), discipline));
            }
            else if(Main.getMemberArrayList().get(i).getAge() >= 18){
                seniorList.addAll(CompetitionDataCollector.competitionCollector(Main.getMemberArrayList().get(i).getId(), Main.getMemberArrayList().get(i).getAge(), discipline));
            }
        }

        Collections.sort(juniorList);
        Collections.sort(seniorList);

        printTopFiveList(juniorList, discipline, "Junior");
        printTopFiveList(seniorList, discipline, "Senior");
    }

    private static void printTopFiveList(ArrayList<Competitor> compList, String discipline, String ageBracket){
        int topFiveCounter = 0;
        String intro = "┌─────── Top Five " + ageBracket + " List for " + discipline + " ";
        String outtro = "└──────────────────────────────────────────────────";
        System.out.println(padding(intro, outtro));

        for (int i = 0; i < compList.size(); i++){
            if (topFiveCounter < 5){
                System.out.print("│Swimmer ID: " + compList.get(i).id);
                System.out.print(" - Time: " + compList.get(i).time);
                System.out.println(" - Competition rank: " + compList.get(i).place);
                topFiveCounter++;
            }
        }
        System.out.println(outtro);
    }

    private static String padding(String intro, String outtro){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < outtro.length(); i++) {
            sb.append('─');
        }
        return intro + sb.substring(intro.length());
    }
}
