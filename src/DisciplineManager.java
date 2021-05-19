import java.util.ArrayList;

public class DisciplineManager {

    public static ArrayList<CompetitionDataCollector> collectDisciplineList (ArrayList<Member> memberList, String discipline){

        ArrayList<CompetitionDataCollector> completeDisciplineList = new ArrayList<>();

        for (int i = 0; i < memberList.size(); i++){
            if (memberList.get(i).competitive){
                completeDisciplineList.addAll(CompetitionDataCollector.competitionCollector(memberList.get(i).id, discipline));
            }
        }

        return completeDisciplineList;
    }

}
