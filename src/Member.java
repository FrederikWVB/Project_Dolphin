import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*Konkurrencetider som parameter til member*/
public class Member {
    int id;
    String name;
    int age;
    boolean active;
    boolean competitive;

    public Member(int id, String name, int age, boolean active, boolean competitive) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.active = active;
        this.competitive = competitive;
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

                int id = Integer.parseInt(lineAsArray[0].strip());
                String name = lineAsArray[1].strip();
                int age = Integer.parseInt(lineAsArray[2].strip());
                boolean active = Boolean.parseBoolean(lineAsArray[3].strip());
                boolean competitive = Boolean.parseBoolean(lineAsArray[4].strip());


                Member tempMember = new Member(id, name, age, active, competitive);
                memberArrayList.add(tempMember);
            }

            return memberArrayList;
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
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
