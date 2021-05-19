import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*Konkurrencetider som parameter til member*/
public class Member {
    String name;
    int age;
    boolean active;
    boolean competitive;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;

    }


    public static ArrayList<Member> createMemberList() {
        try {
            File memberFile = new File("resources/medlemsliste.csv");
            Scanner fileScanner = new Scanner(memberFile);
            fileScanner.nextLine();

            ArrayList<Member> memberArrayList = new ArrayList<>();

            while (fileScanner.hasNext()) {
                String currentLine = fileScanner.nextLine();
                String[] lineAsArray = currentLine.split(";");

                String name = lineAsArray[0].strip();
                int age = tryParse(lineAsArray[1].strip());

                Member tempMember = new Member(name, age);
                memberArrayList.add(tempMember);
            }

            return memberArrayList;
        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found");
            return new ArrayList<Member>();
        }
    }

    public static int tryParse(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
