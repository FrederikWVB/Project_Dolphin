package Member;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Frederik Wandall von Benzon
 * @author Jens Christian Lund Jørgensen
 */

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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isCompetitive() {
        return competitive;
    }

    public static ArrayList<Member> createMemberList() {
        try {
            File memberFile = new File("resources/MemberList.csv");
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

    public static void printMemberlist(ArrayList<Member> memberArrayList){
        for (int i = 0; i < memberArrayList.size(); i++){
            System.out.print("ID: " + memberArrayList.get(i).getId() + " - ");
            System.out.print("Age: " + memberArrayList.get(i).getAge() + " - ");
            System.out.print("Name: " + memberArrayList.get(i).getName() + " ");
            if (memberArrayList.get(i).isCompetitive()){
                System.out.print(" ⭐ ");
            }
            System.out.println(" ");
        }
    }
}
