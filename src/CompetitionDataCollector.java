import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CompetitionDataCollector implements Comparable<CompetitionDataCollector> {
    int id;
    String disciplin;
    double tid;
    int placering;
    String dato;
    String staevne;
    int age;

    public CompetitionDataCollector(int id, String disciplin, double tid, int placering, String dato, String staevne, int age) {
        this.id = id;
        this.disciplin = disciplin;
        this.tid = tid;
        this.placering = placering;
        this.dato = dato;
        this.staevne = staevne;
        this.age = age;
    }


    @Override
    public int compareTo(CompetitionDataCollector other){
        if(this.tid < other.tid){
           return -1;
        }
        else if (this.tid > other.tid){
            return 1;
        }
        else {
            return 0;
        }
    }

    /*importere konkurrencetid textfile*/

    public static ArrayList<CompetitionDataCollector> competitionCollector(int id, int age, String reqDiscipline) {
        try {
            File competitionFile = new File("resources/CompetitionTime/" + id + ".csv");
            Scanner fileScanner = new Scanner(competitionFile);
            fileScanner.nextLine();

            ArrayList<CompetitionDataCollector> disciplineList = new ArrayList<>();

            while (fileScanner.hasNext()) {

                String currentLine = fileScanner.nextLine();
                String[] lineAsArray = currentLine.split(";");

                if (lineAsArray[0].strip().equalsIgnoreCase(reqDiscipline)){
                    //disciplin;tid;placering;dato;stævne

                    String discipline = lineAsArray[0].strip();
                    double time = Double.parseDouble(lineAsArray[1].strip());
                    int placement = Integer.parseInt(lineAsArray[2].strip());
                    String date = lineAsArray[3].strip();
                    String convention = lineAsArray[4].strip();

                    CompetitionDataCollector tempDiscipline = new CompetitionDataCollector(id, discipline, time, placement, date, convention, age);
                    disciplineList.add(tempDiscipline);
                }
            }

            return disciplineList;
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("File Not Found");
            return new ArrayList<CompetitionDataCollector>();
        }
    }
    }

