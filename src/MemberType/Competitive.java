package MemberType;

import java.util.ArrayList;

public class Competitive {

    //Attributes
    private double time;
    private double result;
    private int date;
    private String convention;

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

    private int place;

}

public static void top5(){

    ArrayList<String> list = new ArrayList<>();
    

}
