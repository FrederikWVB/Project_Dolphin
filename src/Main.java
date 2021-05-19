import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {

        ArrayList<Member> memberArrayList = Member.createMemberList();


        for (int i = 0; i < memberArrayList.size(); i++){
            System.out.println(memberArrayList.get(i).name + " " + memberArrayList.get(i).age);
        }

        ArrayList<CompetitionDataManager> disclist = CompetitionDataManager.competitionCollector(5, "butterfly");

        System.out.println(disclist.get(0).disciplin);
        System.out.println(disclist.get(0).tid);
        System.out.println(disclist.get(1).disciplin);
        System.out.println(disclist.get(1).tid);





    }
}
