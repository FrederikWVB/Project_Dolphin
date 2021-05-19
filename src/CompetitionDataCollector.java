import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CompetitionDataCollector {
    int id;
    String disciplin;
    double tid;
    int placering;
    String dato;
    String staevne;

    public CompetitionDataCollector(int id, String disciplin, double tid, int placering, String dato, String staevne) {
        this.id = id;
        this.disciplin = disciplin;
        this.tid = tid;
        this.placering = placering;
        this.dato = dato;
        this.staevne = staevne;
    }

    /*importere konkurrencetid textfile*/

    public static ArrayList<CompetitionDataCollector> competitionCollector(int id, String reqDiscipline) {
        try {
            File competitionFile = new File("resources/CompetitionTime/" + id + ".csv");
            Scanner fileScanner = new Scanner(competitionFile);
            fileScanner.nextLine();

            ArrayList<CompetitionDataCollector> disciplineList = new ArrayList<>();

            while (fileScanner.hasNext()) {

                String currentLine = fileScanner.nextLine();
                String[] lineAsArray = currentLine.split(";");

                if (lineAsArray[0].strip().equals(reqDiscipline)){
                    //disciplin;tid;placering;dato;stævne

                    String discipline = lineAsArray[0].strip();
                    double time = Double.parseDouble(lineAsArray[1].strip());
                    int placement = Integer.parseInt(lineAsArray[2].strip());
                    String date = lineAsArray[3].strip();
                    String convention = lineAsArray[4].strip();

                    CompetitionDataCollector tempDiscipline = new CompetitionDataCollector(id, discipline, time, placement, date, convention);
                    disciplineList.add(tempDiscipline);
                }
            }

            return disciplineList;
        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found");
            return new ArrayList<CompetitionDataCollector>();
        }
    }
    }

