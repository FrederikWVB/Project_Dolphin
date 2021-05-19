import java.util.ArrayList;

public class DisciplineManager {

    public static ArrayList<CompetitionDataCollector> collectDisciplineList (String discipline){

        ArrayList<CompetitionDataCollector> completeDisciplineList = new ArrayList<>();

        for (int i = 0; i < Main.memberArrayList.size(); i++){
            if (Main.memberArrayList.get(i).competitive){
                completeDisciplineList.addAll(CompetitionDataCollector.competitionCollector(Main.memberArrayList.get(i).id, discipline));
            }
        }

        return completeDisciplineList;
    }

    public static ArrayList<CompetitionDataCollector> sortedDisciplineList (String discipline){
        ArrayList<CompetitionDataCollector> sortedList = collectDisciplineList(discipline);

        //Sorteringsalgoritme der sorterer ArrayList elementer i forhold til tid

        return sortedList;

    }

}
