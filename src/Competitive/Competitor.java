package Competitive;

/**
 * @author Andrea Brinkbøl
 * @author Frederik Wandall von Benzon
 */

public class Competitor implements Comparable<Competitor> {
    int id;
    String discipline;
    double time;
    int place;
    String date;
    String convention;
    int age;

    public Competitor(int id, String discipline, double time, int place, String date, String convention, int age) {
        this.id = id;
        this.discipline = discipline;
        this.time = time;
        this.place = place;
        this.date = date;
        this.convention = convention;
        this.age = age;
    }

    @Override
    public int compareTo(Competitor other){
        if(this.time < other.time){
           return -1;
        }
        else if (this.time > other.time){
            return 1;
        }
        else {
            return 0;
        }
    }
}
