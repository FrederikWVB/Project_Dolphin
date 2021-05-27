package Competitive;

import java.util.ArrayList;
import java.util.Collections;

import Main.Main;
/**
 * @author Jens Christian Lund Jørgensen
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



        int topFiveCounter = 0;

        System.out.println("JuniorList " + discipline + ":");
        for (int i = 0; i < juniorList.size(); i++){
            if (topFiveCounter < 5){
                System.out.println(juniorList.get(i).id + " " + juniorList.get(i).time);
                topFiveCounter++;
            }
        }

        topFiveCounter = 0;

        System.out.println("SeniorList " + discipline + ":");
        for (int i = 0; i < seniorList.size(); i++){
            if (topFiveCounter < 5){
                System.out.println(seniorList.get(i).id + " " + seniorList.get(i).time);
                topFiveCounter++;
            }
        }
    }
}
