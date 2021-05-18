package Discpline;
import MemberType.Competitive;

public class Butterfly extends Competitive {

    private String seniorTop5;
    private String juniorTop5;

    public Butterfly(double time, double result, int date, String convention, int place, String seniorTop5, String juniorTop5) {
        super(time, result, date, convention, place);
        this.seniorTop5 = seniorTop5;
        this.juniorTop5 = juniorTop5;
    }




}
