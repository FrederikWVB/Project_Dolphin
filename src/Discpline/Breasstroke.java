package Discpline;
import MemberType.Competitive;

public class Breasstroke extends Competitive {

    public Breasstroke(double time, double result, int date, String convention, int place, String seniorTop5, String juniorTop5) {
        super(time, result, date, convention, place);
        this.seniorTop5 = seniorTop5;
        this.juniorTop5 = juniorTop5;
    }

    private String seniorTop5;
    private String juniorTop5;

}
