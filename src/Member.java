import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Member {
    String name;
    int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static ArrayList<Member> createMemberList() throws FileNotFoundException {
        File memberfile = new File("resources/medlemsliste.csv");
        Scanner fileScanner = new Scanner(memberfile);

        ArrayList<Member> memberArrayList = new ArrayList<>();

        fileScanner.nextLine();


        while (fileScanner.hasNext()){
            String currentLine = fileScanner.nextLine();
            String[] lineAsArray = currentLine.split(";");

            String name = lineAsArray[0];
            int age = tryParse(lineAsArray[1]);

            Member tempMember = new Member(name,age);

            memberArrayList.add(tempMember);
        }

        return memberArrayList;
    }

    public static int tryParse(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
