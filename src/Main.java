import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {

        ArrayList<Member> memberArrayList = Member.createMemberList();

        ArrayList<CompetitionDataCollector> compDiscList = DisciplineManager.collectDisciplineList(memberArrayList, "butterfly");


        for (int i = 0; i < compDiscList.size(); i++){
            System.out.print(compDiscList.get(i).id + " ");
            System.out.print(compDiscList.get(i).disciplin + " ");
            System.out.print(compDiscList.get(i).tid + " ");
            System.out.println(compDiscList.get(i).staevne);
        }

        for (int i = 0; i < memberArrayList.size(); i++){
            System.out.println(memberArrayList.get(i).id + " " + memberArrayList.get(i).name + " " + memberArrayList.get(i).age);
        }

        ArrayList<CompetitionDataCollector> disclist = CompetitionDataCollector.competitionCollector(5, "butterfly");

        System.out.println(disclist.get(0).disciplin);
        System.out.println(disclist.get(0).tid);
        System.out.println(disclist.get(1).disciplin);
        System.out.println(disclist.get(1).tid);

    }
}
