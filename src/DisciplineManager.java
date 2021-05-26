import java.util.ArrayList;
import java.util.Collections;

public class DisciplineManager {

    public static void collectDisciplineList (String discipline){

        ArrayList<CompetitionDataCollector> completeDisciplineList = new ArrayList<>();

        ArrayList<CompetitionDataCollector> juniorList = new ArrayList<>();
        ArrayList<CompetitionDataCollector> seniorList = new ArrayList<>();

        for (int i = 0; i < Main.memberArrayList.size(); i++){
            if(!Main.memberArrayList.get(i).isCompetitive()){
                continue;
            }
            else if (Main.memberArrayList.get(i).getAge() < 18){
                juniorList.addAll(CompetitionDataCollector.competitionCollector(Main.memberArrayList.get(i).getId(), Main.memberArrayList.get(i).getAge(), discipline));
            }
            else if(Main.memberArrayList.get(i).getAge() >= 18){
                seniorList.addAll(CompetitionDataCollector.competitionCollector(Main.memberArrayList.get(i).getId(), Main.memberArrayList.get(i).getAge(), discipline));
            }
        }

        Collections.sort(completeDisciplineList);

        int JCounter =0;
        int SCounter=0;

        /*
        for (int i = 0; i < completeDisciplineList.size(); i++){
            if(isMemberBelowEighteenAndCounterBelowFive(completeDisciplineList.get(i).age, JCounter)) {
                juniorList.add(completeDisciplineList.get(i));
                JCounter++;

            }
            else if (completeDisciplineList.get(i).age > 18 && SCounter < 5) {
                seniorList.add(completeDisciplineList.get(i));
                SCounter++;
            }
        }*/

        System.out.println("JuniorList: ");
        for (int i = 0; i < juniorList.size(); i++){
            System.out.println(juniorList.get(i).id + " " + juniorList.get(i).time);
        }

        System.out.println("SeniorList:");
        for (int i = 0; i < seniorList.size(); i++){
            System.out.println(seniorList.get(i).id + " " + seniorList.get(i).time);
        }
    }
}
