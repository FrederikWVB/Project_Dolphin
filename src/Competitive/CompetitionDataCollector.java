package Competitive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Frederik Wandall Von Benzon
 */

public class CompetitionDataCollector {



    public static ArrayList<Competitor> competitionCollector(int id, int age, String swimDiscipline) {
        try {
            File competitionFile = new File("resources/CompetitionTime/" + id + ".csv");
            Scanner fileScanner = new Scanner(competitionFile);
            fileScanner.nextLine();

            ArrayList<Competitor> disciplineList = new ArrayList<>();

            while (fileScanner.hasNext()) {

                String currentLine = fileScanner.nextLine();
                String[] lineAsArray = currentLine.split(";");

                if (lineAsArray[0].strip().equalsIgnoreCase(swimDiscipline)){
                    //disciplin;tid;placering;dato;stævne

                    String discipline = lineAsArray[0].strip();
                    double time = Double.parseDouble(lineAsArray[1].strip());
                    int place = Integer.parseInt(lineAsArray[2].strip());
                    String date = lineAsArray[3].strip();
                    String convention = lineAsArray[4].strip();

                    Competitor tempDiscipline = new Competitor(id, discipline, time, place, date, convention, age);
                    disciplineList.add(tempDiscipline);
                }
            }

            return disciplineList;
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("File Not Found");
            return new ArrayList<Competitor>();
        }
    }
}
