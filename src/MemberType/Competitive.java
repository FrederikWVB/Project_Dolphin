package MemberType;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Competitive {
    /*Printwriter, filewriter ()
    en klassem der kan læse og skrive til fil*/

    //Attributes
    private double time;
    private double result;
    private int date;
    private String convention;
    private int place;

    public Competitive(double time, double result, int date, String convention, int place) {
        this.time = time;
        this.result = result;
        this.date = date;
        this.convention = convention;
        this.place = place;
    }

    public double getTime() {
        return time;
    }

    public double getResult() {
        return result;
    }

    public int getDate() {
        return date;
    }

    public String getConvention() {
        return convention;
    }

    public int getPlace() {
        return place;
    }


    public static void Compreader() {
        try {
            File text = new File("src/MemberType/Competitive");
            Scanner readFile = new Scanner(text);

            readFile.nextLine();

            ArrayList<String> list = new ArrayList<>();

            while (readFile.hasNext()) {

                String currentline = readFile.nextLine();
                String[] stringArray = currentline.split(";");

                double time = tryParse(stringArray[1]);
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }
    }

        public static double tryParse (String text){
            try {
                return Double.parseDouble(text);

            } catch (NumberFormatException e) {
                return 0.0;
            }
        }
    }

