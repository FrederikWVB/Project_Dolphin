import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {

        ArrayList<Member> memberArrayList = Member.createMemberList();


        for (int i = 0; i < memberArrayList.size(); i++){
            System.out.println(memberArrayList.get(i).name + " " + memberArrayList.get(i).age);
        }

    }
}
