package Accounting;

import Member.Member;

import java.util.ArrayList;
/**
 * @author Frederik Wandall von Benzon
 */
public class MembershipCalculation {

    public static double calculateMembershipFee (Member member){

        double passiveFee = 500;
        double juniorFee = 1000;
        double seniorFee = 1600;
        double over60Fee = 1600 * 0.75;


        if (!member.isActive()){
            return passiveFee;
        }
        else if (member.getAge() < 18){
            return juniorFee;
        }
        else if (member.getAge() >= 18 && member.getAge() < 60){
            return seniorFee;
        }
        else return over60Fee;
    }

    public static void printMembersFee(ArrayList<Member> memberArrayList){

        double memberFee;
        double total = 0;

        for (int i = 0; i < memberArrayList.size(); i++){
            memberFee = calculateMembershipFee(memberArrayList.get(i));
            System.out.print(memberArrayList.get(i).getId() + " " + memberArrayList.get(i).getName() + ": ");
            System.out.println(memberFee + "kr.");
            total = total + memberFee;
        }
        System.out.println("Total membership fee income:");
        System.out.println(total + "kr.");
    }
}