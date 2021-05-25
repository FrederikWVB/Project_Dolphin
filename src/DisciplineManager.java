import java.util.ArrayList;
import java.util.Collections;

import Member.*;

public class DisciplineManager {

    public static void collectDisciplineList (String discipline){

        ArrayList<CompetitionDataCollector> completeDisciplineList = new ArrayList<>();

        ArrayList<CompetitionDataCollector> juniorList = new ArrayList<>();
        ArrayList<CompetitionDataCollector> seniorList = new ArrayList<>();

        for (int i = 0; i < Main.memberArrayList.size(); i++){
            if (Main.memberArrayList.get(i).isCompetitive()){
                completeDisciplineList.addAll(CompetitionDataCollector.competitionCollector(Main.memberArrayList.get(i).getId(), Main.memberArrayList.get(i).getAge(), discipline));
            }

        }

        Collections.sort(completeDisciplineList);

        int JCounter =0;
        int SCounter=0;


        for (int i = 0; i < completeDisciplineList.size(); i++){
            if(completeDisciplineList.get(i).age < 18 && JCounter < 5) {
                juniorList.add(completeDisciplineList.get(i));
                JCounter++;

            }
            else if (completeDisciplineList.get(i).age > 18 && SCounter < 5) {
                seniorList.add(completeDisciplineList.get(i));
                SCounter++;
            }
        }

        System.out.println("JuniorList: ");
        for (int i = 0; i < juniorList.size(); i++){
            System.out.println(juniorList.get(i).id + " " + juniorList.get(i).tid);
        }

        System.out.println("Seniorliste:");
        for (int i = 0; i < seniorList.size(); i++){
            System.out.println(seniorList.get(i).id + " " + seniorList.get(i).tid);
        }

    }
}
